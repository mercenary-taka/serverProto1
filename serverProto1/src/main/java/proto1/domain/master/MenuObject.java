package proto1.domain.master;

import java.io.Serializable;

/**
 * メニュー用Beanのスーパークラスです。
 *
 */
public abstract class MenuObject implements Serializable {
    private String name;
    private String id;

    /**
     * 名前を取得します。
     *
     * @return 名前
     */
    public String getName() {
        return name;
    }

    /**
     * 名前を設定します。
     *
     * @param name 名前
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * IDを取得します。
     *
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * IDを設定します。
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }
}
