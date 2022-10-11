package proto1.domain.master;

import java.io.Serializable;

/**
 * �R���{�{�b�N�X�̒l�����邽�߂�Bean�ł��B
 *
 */
public class ComboBean implements Serializable {
    private static final long serialVersionUID = 8428166174747070616L;
    private String key;
    private String value;

    /**
     * �L�[���擾���܂��B
     *
     * @return �L�[
     */
    public String getKey() {
        return key;
    }

    /**
     * �L�[��ݒ肵�܂��B
     *
     * @param key �L�[
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     *  �l���擾���܂��B
     *
     * @return �l
     */
    public String getValue() {
        return value;
    }

    /**
     * �l��ݒ肵�܂��B
     *
     * @param value �l
     */
    public void setValue(String value) {
        this.value = value;
    }
}
