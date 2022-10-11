package proto1.domain.master;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ZZSTB009 扱いデータMのBeanです。
 * ZZSPA002.FU001()で取得したデータを基にして作成します。
 *
 */
public class AtsukaiBean {
    private String compGpCd;
    private String compCd;
    private String tantouCd;
    private String clmGpCd;
    private List atsukaiData = new ArrayList();

    /**
     *  扱いデータを取得します。
     *
     * @return 扱いデータ
     */
    public List getAtsukaiData() {
        return atsukaiData;
    }

    /**
     *  扱いデータを追加します。
     *
     * @param str 扱いデータ
     */
    public void addAtsukaiData(String str) {
        this.atsukaiData.add(str);
    }

    /**
     *  扱いデータ（複数件）を追加します。
     *
     * @param str 扱いデータ
     */
    public void addAtsukaiData(String[] str) {
        this.atsukaiData.addAll(Arrays.asList(str));
    }

    /**
     *  カラムグループコードを取得します。
     *
     * @return カラムグループコード
     */
    public String getClmGpCd() {
        return clmGpCd;
    }

    /**
     *  カラムグループコードを設定します。
     *
     * @param clmGpCd カラムグループコード
     */
    public void setClmGpCd(String clmGpCd) {
        this.clmGpCd = clmGpCd;
    }

    /**
     *  会社コードを取得します。
     *
     * @return 会社コード
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     *  会社コードを設定します。
     *
     * @param compCd 会社コード
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * 会社グループコードを取得します。
     *
     * @return 会社グループコード
     */
    public String getCompGpCd() {
        return compGpCd;
    }

    /**
     *  会社グループコードを設定します。
     *
     * @param compGpCd 会社グループコード
     */
    public void setCompGpCd(String compGpCd) {
        this.compGpCd = compGpCd;
    }

    /**
     * 担当者コードを取得します。
     *
     * @return 担当者コード
     */
    public String getTantouCd() {
        return tantouCd;
    }

    /**
     * 担当者コードを設定します。
     *
     * @param tantouCd 担当者コード
     */
    public void setTantouCd(String tantouCd) {
        this.tantouCd = tantouCd;
    }
}