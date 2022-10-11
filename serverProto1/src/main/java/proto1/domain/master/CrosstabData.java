package proto1.domain.master;

/**
 * �N���X�^�u���[�ɓn��Bean�N���X�ł��B
  */
public class CrosstabData {
    private String row1;
    private String row2;
    private String row3;
    private String column1;
    private String column2;
    private String column3;
    private long value;

    /**
     * CrosstabData �̃R���X�g���N�^�ł��B
     *
     * @param row1 �p�����[�^
     * @param row2 �p�����[�^
     * @param row3 �p�����[�^
     * @param column1 �p�����[�^
     * @param column2 �p�����[�^
     * @param column3 �p�����[�^
     * @param value �p�����[�^
     */
    public CrosstabData(String row1, String row2, String row3, String column1,
        String column2, String column3, long value) {
        setRow1(row1);
        setRow2(row2);
        setRow3(row3);
        setColumn1(column1);
        setColumn2(column2);
        setColumn3(column3);
        setValue(value);
    }

    /**
     * TODO ���\�b�h�̃R�����g������
     *
     * @return �ԋp�l
     */
    public String getColumn1() {
        return column1;
    }

    /**
     * TODO ���\�b�h�̃R�����g������
     *
     * @param column1 �p�����[�^
     */
    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    /**
     * TODO ���\�b�h�̃R�����g������
     *
     * @return �ԋp�l
     */
    public String getColumn2() {
        return column2;
    }

    /**
     * TODO ���\�b�h�̃R�����g������
     *
     * @param column2 �p�����[�^
     */
    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    /**
     * TODO ���\�b�h�̃R�����g������
     *
     * @return �ԋp�l
     */
    public String getColumn3() {
        return column3;
    }

    /**
     * TODO ���\�b�h�̃R�����g������
     *
     * @param column3 �p�����[�^
     */
    public void setColumn3(String column3) {
        this.column3 = column3;
    }

    /**
     * TODO ���\�b�h�̃R�����g������
     *
     * @return �ԋp�l
     */
    public String getRow1() {
        return row1;
    }

    /**
     * TODO ���\�b�h�̃R�����g������
     *
     * @param row1 �p�����[�^
     */
    public void setRow1(String row1) {
        this.row1 = row1;
    }

    /**
     * TODO ���\�b�h�̃R�����g������
     *
     * @return �ԋp�l
     */
    public String getRow2() {
        return row2;
    }

    /**
     * TODO ���\�b�h�̃R�����g������
     *
     * @param row2 �p�����[�^
     */
    public void setRow2(String row2) {
        this.row2 = row2;
    }

    /**
     * TODO ���\�b�h�̃R�����g������
     *
     * @return �ԋp�l
     */
    public String getRow3() {
        return row3;
    }

    /**
     * TODO ���\�b�h�̃R�����g������
     *
     * @param row3 �p�����[�^
     */
    public void setRow3(String row3) {
        this.row3 = row3;
    }

    /**
     * TODO ���\�b�h�̃R�����g������
     *
     * @return �ԋp�l
     */
    public long getValue() {
        return value;
    }

    /**
     * TODO ���\�b�h�̃R�����g������
     *
     * @param value �p�����[�^
     */
    public void setValue(long value) {
        this.value = value;
    }
}
