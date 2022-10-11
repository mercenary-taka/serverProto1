package proto1.domain.parameter;

import java.io.Serializable;
import java.util.Arrays;

public class FPO implements Serializable {
    /** FPO番号の最大値 */
    public static final int MAX_FPO_NUMBER = 20;
    private static final long serialVersionUID = 8746160264593765254L;
    private String[] parameters = new String[MAX_FPO_NUMBER];

    /**
     * 引数で指定した番号の値を返します。
     *
     * @param i 取得するFPO番号
     *
     * @return 値
     */
    public String getParameter(int i) {
        return parameters[i - 1];
    }

    /**
     * 引数で指定した位置に値を設定します。
     *
     * @param i FPOに設定する位置
     * @param parameter パラメータ
     */
    public void setParameter(int i, String parameter) {
        this.parameters[i - 1] = parameter;
    }

    /**
     * FPOの値を配列型で全て返します。
     *
     * @return FPOの値
     */
    /*public String[] getAll() {
        return parameters;
    }*/

    /**
     * {@inheritDoc}
     */
    public String toString() {
        return Arrays.asList(parameters).toString();
    }

	public String[] getParameters() {
		return parameters;
	}

	public void setParameters(String[] parameters) {
		this.parameters = parameters;
	}


}
