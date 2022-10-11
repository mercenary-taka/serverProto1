package proto1.domain.master;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * メニュー一覧の要素を表すBeanクラスです。
 *
 */
public class MenuNode extends MenuObject {
    private static final long serialVersionUID = -6817058450965619062L;
    private String companyCode;
    private String companyGroupCode;
    private ArrayList children = new ArrayList();

    /**
     * 子を追加します。
     *
     * @param child 子
     */
    public void addChild(MenuObject child) {
        if (!contains(child.getId())) {
            children.add(child);
        }
    }

    /**
     * 子（複数）を追加します。
     *
     * @param children 子（複数）
     */
    public void addChildren(Collection children) {
        children.addAll(children);
    }

    /**
     * 子を取得します。
     *
     * @return 子
     */
    public Collection getChildren() {
        return children;
    }

    /**
     * 会社コードを取得します。
     *
     * @return 会社コード
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     *会社コードを設定します。
     *
     * @param companyCode 会社コード
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /**
     * 会社グループコードを取得します。
     *
     * @return 会社グループコード
     */
    public String getCompanyGroupCode() {
        return companyGroupCode;
    }

    /**
     * 会社グループコードを設定します。
     *
     * @param companyGroupCode 会社グループコード
     */
    public void setCompanyGroupCode(String companyGroupCode) {
        this.companyGroupCode = companyGroupCode;
    }

    /**
     * 子に指定したIdのものが含まれるか調べます。
     *
     * @param childId 子ID
     *
     * @return 含まれる場合true、含まれない場合false
     */
    public boolean contains(String childId) {
        Iterator iter = children.iterator();

        while (iter.hasNext()) {
            MenuObject sub = (MenuObject) iter.next();

            if (sub.getId().equals(childId)) {
                return true;
            }
        }

        return false;
    }

    /**
     * 指定したIDの子を取得します。
     *
     * @param childId 子ID
     *
     * @return 子メニュー
     */
    public MenuObject getChild(String childId) {
        Iterator iter = children.iterator();

        while (iter.hasNext()) {
            MenuObject sub = (MenuObject) iter.next();

            if (sub.getId().equals(childId)) {
                return sub;
            }
        }

        return null;
    }
}
