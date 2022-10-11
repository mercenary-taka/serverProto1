package proto1.domain.master;

import proto1.base.util.FxpUtil;

/**
 * メニュー一覧の末端の要素を表すBeanクラスです。
 *
 */
public class MenuEdge extends MenuObject {
    private static final long serialVersionUID = 5207211126987845333L;
    private String compCd;
    private String compNm;
    private String domainCd;
    private String virtualCd;
    private String virtualNm;
    private String pgmCd;
    private String winCd;
    private String winMenu;
    private String parameter1;
    private String parameter2;
    private String parameter3;
    private String parameter4;
    private String parameter5;
    private String statusCd1;
    private String statusCd2;
    private String statusCd3;
    private String bacth;
    private String tantouCd;
    private String changeingCheck;
    private String role;




    /**
     * @return parameter4 を戻します。
     */
    public String getParameter4() {
        return parameter4;
    }

    /**
     * @param parameter4 設定する parameter4。
     */
    public void setParameter4(String parameter4) {
        this.parameter4 = parameter4;
    }

    /**
     * @return parameter5 を戻します。
     */
    public String getParameter5() {
        return parameter5;
    }

    /**
     * @param parameter5 設定する parameter5。
     */
    public void setParameter5(String parameter5) {
        this.parameter5 = parameter5;
    }


    /**
     *  メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @param compCd パラメータ
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getCompNm() {
        return compNm;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @param compNm パラメータ
     */
    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getBacth() {
        return bacth;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @param bacth パラメータ
     */
    public void setBacth(String bacth) {
        this.bacth = bacth;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getDomainCd() {
        return domainCd;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @param domainCd パラメータ
     */
    public void setDomainCd(String domainCd) {
        this.domainCd = domainCd;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getParameter1() {
        return parameter1;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @param parameter1 パラメータ
     */
    public void setParameter1(String parameter1) {
        this.parameter1 = parameter1;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getParameter2() {
        return parameter2;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @param parameter2 パラメータ
     */
    public void setParameter2(String parameter2) {
        this.parameter2 = parameter2;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getParameter3() {
        return parameter3;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @param parameter3 パラメータ
     */
    public void setParameter3(String parameter3) {
        this.parameter3 = parameter3;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getPgmCd() {
        return pgmCd;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @param pgmCd パラメータ
     */
    public void setPgmCd(String pgmCd) {
        this.pgmCd = pgmCd;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getStatusCd1() {
        return statusCd1;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @param statusCd1 パラメータ
     */
    public void setStatusCd1(String statusCd1) {
        this.statusCd1 = statusCd1;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getStatusCd2() {
        return statusCd2;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @param statusCd2 パラメータ
     */
    public void setStatusCd2(String statusCd2) {
        this.statusCd2 = statusCd2;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getStatusCd3() {
        return statusCd3;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @param statusCd3 パラメータ
     */
    public void setStatusCd3(String statusCd3) {
        this.statusCd3 = statusCd3;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getTantouCd() {
        return tantouCd;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @param tantouCd パラメータ
     */
    public void setTantouCd(String tantouCd) {
        this.tantouCd = tantouCd;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getVirtualCd() {
        return virtualCd;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @param virtualCd パラメータ
     */
    public void setVirtualCd(String virtualCd) {
        this.virtualCd = virtualCd;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getVirtualNm() {
        return virtualNm;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @param virtualNm パラメータ
     */
    public void setVirtualNm(String virtualNm) {
        this.virtualNm = virtualNm;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getWinCd() {
        return winCd;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @param winCd パラメータ
     */
    public void setWinCd(String winCd) {
        this.winCd = winCd;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getWinMenu() {
        return winMenu;
    }

    /**
     *  メソッドのコメントを書く
     *
     * @param winMenu パラメータ
     */
    public void setWinMenu(String winMenu) {
        this.winMenu = winMenu;
    }

    /**
     * @return changeingCheck を戻します。
     */
    public String getChangeingCheck() {
        return changeingCheck;
    }

    public boolean isChangeingCheck() {

        if (!FxpUtil.isEmpty(changeingCheck) &&
                        changeingCheck.equals("1") ) {
            return true;
        }
        return false;

    }

    /**
     * @param changeingCheck 設定する changeingCheck。
     */
    public void setChangeingCheck(String changeingCheck) {
        this.changeingCheck = changeingCheck;
    }

    /**
     * @return role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role 設定する role
     */
    public void setRole(String role) {
        this.role = role;
    }

}
