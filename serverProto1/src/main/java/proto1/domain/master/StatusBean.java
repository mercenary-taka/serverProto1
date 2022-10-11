package proto1.domain.master;

import java.io.Serializable;
import java.sql.Timestamp;

public class StatusBean implements Serializable {
    private static final long serialVersionUID = 4683330182856574404L;
    private String name;
    private String flag;
    private Timestamp statusDate;

    /**
     * ステータス日付を取得します。
     *
     * @return ステータス日付
     */
    public Timestamp getStatusDate() {
        return statusDate;
    }

    /**
     *  ステータス日付を設定します。
     *
     * @param date ステータス日付
     */
    public void setStatusDate(Timestamp date) {
        this.statusDate = date;
    }

    /**
     * フラグを取得します。
     *
     * @return フラグ
     */
    public String getFlag() {
        return flag;
    }

    /**
     * フラグを設定します。
     *
     * @param flag フラグ
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * 名称を取得します。
     *
     * @return 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称を設定します。
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }
}
