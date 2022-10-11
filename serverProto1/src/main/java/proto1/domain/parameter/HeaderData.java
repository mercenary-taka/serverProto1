package proto1.domain.parameter;

import java.io.Serializable;

/**
 * DataSetクラスのヘッダ情報を持つBeanです。
 */
public class HeaderData implements Serializable {
    private static final long serialVersionUID = 6171878772016154079L;
    private String clmNm; // DBカラム名
    private String type; // 型

    /**
     * メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getClmNm() {
        return clmNm;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param clmNm パラメータ
     */
    public void setClmNm(String clmNm) {
        this.clmNm = clmNm;
    }

    /**
     * メソッドのコメントを書く
     *
     * @return 返却値
     */
    public String getType() {
        return type;
    }

    /**
     * メソッドのコメントを書く
     *
     * @param type パラメータ
     */
    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return clmNm;
    }
}
