package proto1.domain.parameter;

import java.io.Serializable;

import proto1.domain.master.QueryConditionBean;


public class ComponentProperty implements Serializable {
    /**
     *
     */
	public static final String KEY_SEPARATE = "@";
    private static final long serialVersionUID = 1565117338486781368L;
    private QueryConditionBean queryCondition;
    private FPO fpo;
    private Object value;

    /**
     * FPOを返します。
     *
     * @return FPO
     */
    public FPO getFpo() {
        return fpo;
    }

    /**
     * FPOを設定します。
     *
     * @param fpo パラメータ
     */
    public void setFpo(FPO fpo) {
        this.fpo = fpo;
    }

    /**
     * パラメータを返します。
     *
     * @return 返却値
     */
    public Object getValue() {
        return value;
    }

    /**
     * パラメータを設定します。
     *
     * @param value パラメータ
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * 検索条件プロパティＭの値を返します。
     *
     * @return 検索条件プロパティＭの値
     */
    public QueryConditionBean getQueryCondition() {
        return queryCondition;
    }

    /**
     * 検索条件プロパティＭの値を設定します。
     *
     * @param queryCondition 検索条件プロパティＭの値
     */
    public void setQueryCondition(QueryConditionBean queryCondition) {
        this.queryCondition = queryCondition;
    }
}