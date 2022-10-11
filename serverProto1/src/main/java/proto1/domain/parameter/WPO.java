package proto1.domain.parameter;

import java.io.Serializable;
import java.util.Arrays;

public class WPO implements Serializable {
    /** WPO番号の最大値 */
    public static final int MAX_WPO_NUMBER = 40;
    private static final long serialVersionUID = -2463591216723142861L;
    private String[] parameters = new String[MAX_WPO_NUMBER];
    /**
     * 引数で指定した番号の値を返します。
     * @param i 取得するWPO番号
     * @return 値
     */
    public String getParameter(int i) {
        return parameters[i - 1];
    }

    /**
     * 引数で指定した位置に値を設定します。
     * @param i WPOに設定する位置
     * @param parameter パラメータ
     */
    public void setParameter(int i, String parameter) {
        this.parameters[i - 1] = parameter;
    }

    /**
     * WPOの値を配列型で全て返します。
     *
     * @return WPO
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
