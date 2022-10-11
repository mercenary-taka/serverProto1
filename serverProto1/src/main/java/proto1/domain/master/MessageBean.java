package proto1.domain.master;

import java.io.Serializable;

/**
 * メッセージのBeanクラスです。
 *
 */
public class MessageBean implements Serializable {
    private static final long serialVersionUID = -7740077831220847825L;
    private String compGpCd;
    private String compCd;
    private String domainCd;
    private String errorCd;
    private String msg;

    /**
     * 会社コードを取得します。
     *
     * @return 会社コード
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * 会社コードを設定します。
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
     * 会社グループコードを設定します。
     *
     * @param compGpCd 会社グループコード
     */
    public void setCompGpCd(String compGpCd) {
        this.compGpCd = compGpCd;
    }

    /**
     * ドメインコードを取得します。
     *
     * @return ドメインコード
     */
    public String getDomainCd() {
        return domainCd;
    }

    /**
     * ドメインコードを設定します。
     *
     * @param domainCd ドメインコード
     */
    public void setDomainCd(String domainCd) {
        this.domainCd = domainCd;
    }

    /**
     * エラーコードを取得します。
     *
     * @return エラーコード
     */
    public String getErrorCd() {
        return errorCd;
    }

    /**
     * エラーコードを設定します。
     *
     * @param errorCd エラーコード
     */
    public void setErrorCd(String errorCd) {
        this.errorCd = errorCd;
    }

    /**
     * メッセージを取得します。
     *
     * @return メッセージ
     */
    public String getMsg() {
        return msg;
    }

    /**
     * メッセージを設定します。
     *
     * @param msg メッセージ
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
