package proto1.domain.parameter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import proto1.base.util.FxpUtil;
import proto1.domain.master.HeaderDataList;

/**
 * DataSetクラスの１行分のデータを表すBeanです。
 */
public class RowData implements Serializable {
    /** 新規の行を表すフラグです。 */
    public static final String NEW = "2";

    /** 新規作成し、更新された行を表すフラグです。 */
    public static final String NEW_MODIFIED = "3";

    /** 更新されていない行またはカラムを表すフラグです。 */
    public static final String NOT_MODIFIED = "0";

    /** 更新された行またはカラムを表すフラグです。 */
    public static final String DATA_MODIFIED = "1";

    /** プロテクト制御用カラム名です。 */
    public static final String PROTECT_COLUMN = "PROTECT";

    /** エラーチェック制御用カラム名です。 */
    public static final String ERROR_CHECK_COLUMN = "ERROR_CHECK";

    private static final long serialVersionUID = 1792636582174524155L;

    /** ヘッダのリスト */
    private HeaderDataList headers;

    /** 値を持つリスト。 */
    private List values = new ArrayList();

    /** キー項目のＤＢ保有値を持つマップ。キーはカラム名 UPDATE文発行時に使用する */
    private Map keyValues = new HashMap();

    /** カラムのステータスを持つリスト。 */
    private List<String> status = new ArrayList<String>();

    /** 行のステータス */
    private String rowStatus;

    /** 行削除フラグ */
    private boolean delete = false;

    /** DataSet内で一意のid。DataSetにaddしたときに割り当てられる */
    private int rowoid;




    /**
     * RowData のコンストラクタです。
     *
     * @param headers ヘッダのリスト
     */
    public RowData(List headers) {
        rowStatus = NEW;
        this.headers = (HeaderDataList) headers;

        Iterator it = headers.iterator();

        int index = 0;
        while (it.hasNext()) {
            HeaderData header = (HeaderData) it.next();
            // ヘッダーの数だけステータスと値Listを初期化する
            status.add(NOT_MODIFIED);
            values.add(null);
            this.headers.getColumnIndexMap().put(header.getClmNm(), Integer.valueOf(index));
            index++;
        }
    }

    /**
     * RowDataが持つ値のListを取得します。
     * @return 値のList
     */
    public List getValues() {
        return values;
    }

    /**
     * 指定したカラムの値を取得します。
     *
     * @param clmNm パラメータ
     *
     * @return 返却値
     */
    public Object getValue(String clmNm) {
        return values.get(getColumnIndex(clmNm));
    }



    /**
     * 指定したカラムの値を文字列で取得します。
     *
     * @param clmNm カラム名
     *
     * @return 値
     */
    public String getStrValue(String clmNm) {
        if (values.get(getColumnIndex(clmNm)) != null) {
            return values.get(getColumnIndex(clmNm)).toString();
        } else {
            return null;
        }
    }

    /**
     * 指定したカラムのステータスを取得します。
     *
     * @param clmNm パラメータ
     *
     * @return 返却値
     */
    public String getStatus(String clmNm) {
        int index = getColumnIndex(clmNm);
        return status.get(index);
    }


    private int getColumnIndex(String clmNm) {

        Integer index = headers.getColumnIndexMap().get(clmNm);
        if (index != null) {
            int i = index.intValue();
            if (headers.size() != status.size() || headers.size() != values.size()) {
                extend(i);
            }

            return i;
        }

        // カラムが見つからない場合、自動生成する
        HeaderData newHeader = new HeaderData();
        newHeader.setClmNm(clmNm);
        newHeader.setType("");
        headers.getColumnIndexMap().put(clmNm, Integer.valueOf(headers.size()));
        headers.add(newHeader);
        // 初期化
        status.add(null);
        values.add(null);

        return headers.size() - 1;
    }

    /**
     * 行ステータスを取得します。
     *
     * @return 返却値
     */
    public String getRowStatus() {
        return rowStatus;
    }

    /**
     * 行ステータスを設定します。
     * 手動で行ステータスを制御する場合に使用します。
     * @param rowStatus 行ステータス
     */
    public void setRowStatus(String rowStatus) {
        this.rowStatus = rowStatus;
    }

    /**
     * 指定したカラムに値をセットします。 カラムと行のステータスも更新されます。
     * ただし、PROTECTまたはERROR_CHECKカラムの場合は、ステータスを変更しません。
     * @param col パラメータ
     * @param value パラメータ
     */
    public void setValue(String col, Object value) {
        int index = getColumnIndex(col);
        values.set(index, value);


        // PROTECT,ERROR_CHECK カラムの場合は、ステータスを変更しない
        if (col.toUpperCase().equals(PROTECT_COLUMN) ||
                        col.toUpperCase().equals(ERROR_CHECK_COLUMN)) {
            return;
        }

        status.set(index, DATA_MODIFIED);

        if (rowStatus.equals(NEW)) {
            rowStatus = NEW_MODIFIED;
        } else if (rowStatus.equals(NOT_MODIFIED)) {
            rowStatus = DATA_MODIFIED;
        }

        // ステータスがNEW_MODIFIEDならそのまま
    }

    private void extend(int index) {

        for (int i = status.size() - 1; i < index; i++) {
            status.add(NOT_MODIFIED);
        }

        for (int i = values.size() - 1; i < index; i++) {
            values.add(null);
        }
    }

    /**
     * カラムと行のステータスをクリアします。
     */
    public void clearStatus() {
        if (rowStatus.equals(NEW_MODIFIED) || rowStatus.equals(NEW)) {
            rowStatus = NEW;
        } else {
            rowStatus = NOT_MODIFIED;
        }

        delete = false;

        Iterator it = headers.iterator();

        while (it.hasNext()) {
            HeaderData header = (HeaderData) it.next();
            status.set(getColumnIndex(header.getClmNm()), NOT_MODIFIED);
        }
    }

    /**
     * DBから検索した行にステータスを設定するのに使用します。FWが使用します。
     *
     */
    public void setInitialStatus() {

        rowStatus = NOT_MODIFIED;
        delete = false;

        Iterator it = headers.iterator();

        while (it.hasNext()) {
            HeaderData header = (HeaderData) it.next();
            status.set(getColumnIndex(header.getClmNm()), NOT_MODIFIED);
        }
    }


    /**
     * ステータスを更新せずに、指定したカラムに値をセットします。 DBから読み込んだ値で初期化するときに使います。
     *
     * @param clmNm パラメータ
     * @param value パラメータ
     */
    public void setInitialValue(String clmNm, Object value) {

        values.set(getColumnIndex(clmNm), value);

        // ステータスが空なら、NOT_MODIFIEDにする
        // ステータスがセットされているなら、変更しない
        if (FxpUtil.isEmpty(status.get(getColumnIndex(clmNm)))) {
            status.set(getColumnIndex(clmNm), NOT_MODIFIED);
        }
    }

    /**
     * 更新されたカラムを取得します
     *
     * @return 返却値
     */
    public List getModifiedCols() {
        List cols = new ArrayList();
        Iterator it = headers.iterator();

        while (it.hasNext()) {
            HeaderData header = (HeaderData) it.next();
            String clmNm = header.getClmNm();

            if (DATA_MODIFIED.equals(status.get(getColumnIndex(clmNm)))) {
                cols.add(clmNm);
            }

        }

        return cols;
    }

    /**
     * 全てのヘッダを取得します。
     *
     * @return 全てのHeaderData
     */
    public List getHeaders() {
        return headers;
    }

    /**
     * ヘッダクラスを返します。
     *
     * @param clmNm カラム名
     * @return ヘッダクラス
     */
    public HeaderData getHeader(String clmNm) {
        Iterator it = headers.iterator();
        while (it.hasNext()) {
            HeaderData h = (HeaderData) it.next();
            if (h.getClmNm().equals(clmNm)) {
                return h;
            }
        }
        return null;
    }

    /**
     * 削除フラグを取得します。
     *
     * @return 返却値
     */
    public boolean isDelete() {
        return delete;
    }

    /**
     * 削除フラグをセットします。
     *
     * @param deleteFlg パラメータ
     */
    public void setDelete(boolean deleteFlg) {
        this.delete = deleteFlg;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @return 返却値
     */
    public int getRowoid() {
        return rowoid;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @param rowoid パラメータ
     */
    public void setRowoid(int rowoid) {
        this.rowoid = rowoid;
    }

    /**
     * {@inheritDoc}
     */
    public String toString() {
        return "rowoid=" + rowoid + ", values=" + values.toString() +
            ", updateCols=" + getModifiedCols() +
            ", rowStatus=" + rowStatus2Str(rowStatus);
    }

    /**
     * ステータスの名称を返します。
     * ログ出力用です。

     * @param rowStatus ステータス
     * @return ステータス名称
     */
    private static String rowStatus2Str(String rowStatus) {
        if (rowStatus.equals(NOT_MODIFIED)) {
            return "NOT_MODIFIED";
        } else if (rowStatus.equals(DATA_MODIFIED)) {
            return "DATA_MODIFIED";
        } else if (rowStatus.equals(NEW)) {
            return "NEW";
        } else if (rowStatus.equals(NEW_MODIFIED)) {
            return "NEW_MODIFIED";
        } else {
            return "STATUS ERROR!";
        }
    }



    /**
     * キー項目のDB保有値を取得します。
     * @param clmNm カラム名
     * @return 値
     */
    public Object getKeyValue(String clmNm) {
        return keyValues.get(clmNm);
    }

    /**
     * キー項目のDB保有値を取得します。
     * @return Map
     */
    public Map getKeyValue() {
        return keyValues;
    }

    /**
     * キー項目のDB保有値を設定します。
     * @param keyValues キー項目のMap
     */
    public void setKeyValues(Map keyValues) {
        this.keyValues = keyValues;
    }




}
