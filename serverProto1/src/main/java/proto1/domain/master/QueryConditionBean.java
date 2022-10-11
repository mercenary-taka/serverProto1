package proto1.domain.master;

import java.io.Serializable;


public class QueryConditionBean implements Serializable {
    private static final long serialVersionUID = 6417152367677981086L;
    private static final String COMBO_SINGLE = "A1";
    private static final String COMBO_FROMTO = "A2";
    private static final String EDITMASK_SINGLE = "B1";
    private static final String EDITMASK_FROMTO = "B2";
    private static final String TEXTFIELD = "C1";
    private static final String POPUP_SINGLE = "D1";
    private static final String POPUP_FROMTO = "D2";
    private static final String HATSUREI_YMD = "E1";
    private static final String FROM_TO_TYPE = "2";
    private String compGpCd;
    private String compCd;
    private String jokenCd;
    private String jokenNm;
    private String displayKbn;
    private String clmGpCd;
    private String ymd;
    private String nameClm;
    private String[] key = new String[6];
    private String[] value = new String[20];
    private String parent;
    private String default1;
    private String default2;
    private ColumnGpBean clmGp;

    /**
     * メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getClmGpCd() {
        return clmGpCd;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param clmGpCd パラメータ
     */
    public void setClmGpCd(String clmGpCd) {
        this.clmGpCd = clmGpCd;
    }

    /**
     * メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param compCd パラメータ
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getCompGpCd() {
        return compGpCd;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param compGpCd パラメータ
     */
    public void setCompGpCd(String compGpCd) {
        this.compGpCd = compGpCd;
    }

    /**
     * メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getDefault1() {
        return default1;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param default1 パラメータ
     */
    public void setDefault1(String default1) {
        this.default1 = default1;
    }

    /**
     * メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getDefault2() {
        return default2;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param default2 パラメータ
     */
    public void setDefault2(String default2) {
        this.default2 = default2;
    }

    /**
     * メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getDisplayKbn() {
        return displayKbn;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param displayKbn パラメータ
     */
    public void setDisplayKbn(String displayKbn) {
        this.displayKbn = displayKbn;
    }

    /**
     * メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getJokenCd() {
        return jokenCd;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param jokenCd パラメータ
     */
    public void setJokenCd(String jokenCd) {
        this.jokenCd = jokenCd;
    }

    /**
     * メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getJokenNm() {
        return jokenNm;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param jokenNm パラメータ
     */
    public void setJokenNm(String jokenNm) {
        this.jokenNm = jokenNm;
    }

    /**
     * メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getNameClm() {
        return nameClm;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param nameClm パラメータ
     */
    public void setNameClm(String nameClm) {
        this.nameClm = nameClm;
    }

    /**
     * メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getParent() {
        return parent;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param parent パラメータ
     */
    public void setParent(String parent) {
        this.parent = parent;
    }

    /**
     * メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getYmd() {
        return ymd;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param ymd パラメータ
     */
    public void setYmd(String ymd) {
        this.ymd = ymd;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param no パラメータ
     *
     * @return 返却値
     */
    public String getKey(int no) {
        return key[no - 1];
    }

    /**
     * value1～20の条件を取得
     *
     * @param no パラメータ
     *
     * @return 返却値
     */
    public String getValue(int no) {
        return value[no - 1];
    }

    /**
     * メソッドのコメントを書く
     *
     * @param keystr パラメータ
     */
    public void setKey1(String keystr) {
        key[0] = keystr;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param keystr パラメータ
     */
    public void setKey2(String keystr) {
        key[1] = keystr;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param keystr パラメータ
     */
    public void setKey3(String keystr) {
        key[2] = keystr;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param keystr パラメータ
     */
    public void setKey4(String keystr) {
        key[3] = keystr;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param keystr パラメータ
     */
    public void setKey5(String keystr) {
        key[4] = keystr;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param keystr パラメータ
     */
    public void setKey6(String keystr) {
        key[5] = keystr;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param keystr パラメータ
     */
    public void setValue1(String keystr) {
        value[0] = keystr;
    }

    public void setValue2(String keystr) {
        value[1] = keystr;
    }

    public void setValue3(String keystr) {
        value[2] = keystr;
    }

    public void setValue4(String keystr) {
        value[3] = keystr;
    }

    public void setValue5(String keystr) {
        value[4] = keystr;
    }

    public void setValue6(String keystr) {
        value[5] = keystr;
    }

    public void setValue7(String keystr) {
        value[6] = keystr;
    }

    public void setValue8(String keystr) {
        value[7] = keystr;
    }

    public void setValue9(String keystr) {
        value[8] = keystr;
    }

    public void setValue10(String keystr) {
        value[9] = keystr;
    }

    public void setValue11(String keystr) {
        value[10] = keystr;
    }

    public void setValue12(String keystr) {
        value[11] = keystr;
    }

    public void setValue13(String keystr) {
        value[12] = keystr;
    }

    public void setValue14(String keystr) {
        value[13] = keystr;
    }

    public void setValue15(String keystr) {
        value[14] = keystr;
    }

    public void setValue16(String keystr) {
        value[15] = keystr;
    }

    public void setValue17(String keystr) {
        value[16] = keystr;
    }

    public void setValue18(String keystr) {
        value[17] = keystr;
    }

    public void setValue19(String keystr) {
        value[18] = keystr;
    }

    public void setValue20(String keystr) {
        value[19] = keystr;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @return 返却値
     */
    public ColumnGpBean getClmGp() {
        return clmGp;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @param clmGp パラメータ
     */
    public void setClmGp(ColumnGpBean clmGp) {
        this.clmGp = clmGp;
    }

    /**
     * コンボボックス形式であるかを調べます。
     * @return
     */
    public boolean isComboType() {
        if (displayKbn.equals(COMBO_SINGLE) || displayKbn.equals(COMBO_FROMTO)) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * エディットマスク設定可能なテキストフィールド形式であるかを調べます。
     * @return
     */
    public boolean isFormattedTextFieldType() {
        if (displayKbn.equals(EDITMASK_SINGLE) || displayKbn.equals(EDITMASK_FROMTO) || displayKbn.equals(HATSUREI_YMD)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * IME設定可能なテキストフィールド形式であるかを調べます。
     * @return
     */
    public boolean isTextFieldType() {
        if (displayKbn.equals(TEXTFIELD)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * マスターポップアップ検索ありの入力フィールド形式であるかを調べます。
     * @return
     */
    public boolean isMasterPopupType() {
        if (displayKbn.equals(POPUP_SINGLE) || displayKbn.equals(POPUP_FROMTO)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * FromTo形式であるかを調べます。
     * @return
     */
    public boolean isFromToType() {
        if (displayKbn.substring(1).equals(FROM_TO_TYPE)) {
            return true;
        } else {
            return false;
        }

    }

}

