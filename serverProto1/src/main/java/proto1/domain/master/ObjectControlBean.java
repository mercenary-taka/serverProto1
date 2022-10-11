package proto1.domain.master;

import java.io.Serializable;

public class ObjectControlBean implements Serializable {
    private static final long serialVersionUID = -8575477150519776975L;
    private String compCd;
    private String objectCd;
    private int page;
    private int flowNo;
    private String visible;
    private String textNm;
    private String textAlias;
    private String name1;
    private String name2;
    private String data1;
    private String data2;
    private String data3;
    private String data4;
    private String data5;
    private String data6;
    private String data7;
    private String data8;
    private String data9;
    private String data10;
    private int taborder;
    private String[] fpoWpo = new String[20];
    private int jX;
    private int jY;
    private int jWidth;
    private int jHeight;
    private String editMask;
    private String clmType;

    /**
     * ObjectControlData �̃R���X�g���N�^�ł��B
     */
    public ObjectControlBean() {
    }

    /**
     * ObjectControlData �̃R���X�g���N�^�ł��B
     *
     * @param objectCd �I�u�W�F�N�g�R�[�h
     * @param page �y�[�W�ԍ�
     * @param visible �\���s��
     * @param textNm �e�L�X�g��
     * @param textAlias �G�C���A�X
     * @param name1 ���̂P
     * @param name2 ���̂Q
     * @param clmNm �J��������
     * @param x �\���ʒuX
     * @param y �\���ʒuY
     * @param width ����
     * @param height ����
     * @param editMask�@�G�f�B�b�g�}�X�N
     */
    public ObjectControlBean(String objectCd, int page, String visible,
        String textNm, String textAlias, String name1, String name2, int x,
        int y, int width, int height,String editMask,String clmType) {
        this.objectCd = objectCd;
        this.page = page;
        this.visible = visible;
        this.textNm = textNm;
        this.textAlias = textAlias;
        this.name1 = name1;
        this.name2 = name2;
        this.jX = x;
        this.jY = y;
        this.jWidth = width;
        this.jHeight = height;
        this.editMask = editMask;
        this.clmType = clmType;
    }

    public int getFlowNo() {
        return flowNo;
    }

    public void setFlowNo(int flowNo) {
        this.flowNo = flowNo;
    }


    /**
     * �I�u�W�F�N�g�R�[�h���擾���܂��B
     *
     * @return �I�u�W�F�N�g�R�[�h
     */
    public String getObjectCd() {
        return objectCd;
    }

    /**
     * �I�u�W�F�N�g�R�[�h��ݒ肵�܂��B
     *
     * @param objectCd �I�u�W�F�N�g�R�[�h
     */
    public void setObjectCd(String objectCd) {
        this.objectCd = objectCd;
    }

    /**
     * �y�[�W�ԍ����擾���܂��B
     *
     * @return �y�[�W�ԍ�
     */
    public int getPage() {
        return page;
    }

    /**
     * �y�[�W�ԍ���ݒ肵�܂��B
     *
     * @param page �y�[�W�ԍ�
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * �e�L�X�g�G�C���A�X���擾���܂��B
     *
     * @return �e�L�X�g�G�C���A�X
     */
    public String getTextAlias() {
        return textAlias;
    }

    /**
     * �e�L�X�g�G�C���A�X��ݒ肵�܂��B
     *
     * @param textAlias �e�L�X�g�G�C���A�X
     */
    public void setTextAlias(String textAlias) {
        this.textAlias = textAlias;
    }

    /**
     * �e�L�X�g���̂��擾���܂��B
     *
     * @return �e�L�X�g����
     */
    public String getTextNm() {
        return textNm;
    }

    /**
     * �e�L�X�g���̂��擾���܂��B
     *
     * @param textNm �e�L�X�g����
     */
    public void setTextNm(String textNm) {
        this.textNm = textNm;
    }

    /**
     * �\���s���擾���܂��B
     *
     * @return �\���s��
     */
    public String getVisible() {
        return visible;
    }

    /**
     * �\���s��ݒ肵�܂��B
     *
     * @param visible �\���s��
     */
    public void setVisible(String visible) {
        this.visible = visible;
    }



    /**
     * Data1���擾���܂��B
     *
     * @return Data1
     */
    public String getData1() {
        return data1;
    }

    /**
     * Data1��ݒ肵�܂��B
     *
     * @param data1 Data1
     */
    public void setData1(String data1) {
        this.data1 = data1;
    }

    /**
     * Data2���擾���܂��B
     *
     * @return Data2
     */
    public String getData2() {
        return data2;
    }

    /**
     * Data2��ݒ肵�܂��B
     *
     * @param data2 Data2
     */
    public void setData2(String data2) {
        this.data2 = data2;
    }

    /**
     * Data3���擾���܂��B
     *
     * @return Data3
     */
    public String getData3() {
        return data3;
    }

    /**
     * Data3��ݒ肵�܂��B
     *
     * @param data3 Data3
     */
    public void setData3(String data3) {
        this.data3 = data3;
    }

    /**
     * Data4���擾���܂��B
     *
     * @return Data4
     */
    public String getData4() {
        return data4;
    }

    /**
     * Data4��ݒ肵�܂��B
     *
     * @param data4 Data4
     */
    public void setData4(String data4) {
        this.data4 = data4;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param no �p�����[�^
     *
     * @return �ԋp�l
     */
    public String getFpoWpo(int no) {
        return fpoWpo[no - 1];
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param no �p�����[�^
     * @param str �p�����[�^
     */
    public void setFpoWpo(int no, String str) {
        fpoWpo[no - 1] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo1Wpo(String str) {
        fpoWpo[0] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo2Wpo(String str) {
        fpoWpo[1] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo3Wpo(String str) {
        fpoWpo[2] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo4Wpo(String str) {
        fpoWpo[3] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo5Wpo(String str) {
        fpoWpo[4] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo6Wpo(String str) {
        fpoWpo[5] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo7Wpo(String str) {
        fpoWpo[6] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo8Wpo(String str) {
        fpoWpo[7] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo9Wpo(String str) {
        fpoWpo[8] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo10Wpo(String str) {
        fpoWpo[9] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo11Wpo(String str) {
        fpoWpo[10] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo12Wpo(String str) {
        fpoWpo[11] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo13Wpo(String str) {
        fpoWpo[12] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo14Wpo(String str) {
        fpoWpo[13] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo15Wpo(String str) {
        fpoWpo[14] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo16Wpo(String str) {
        fpoWpo[15] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo17Wpo(String str) {
        fpoWpo[16] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo18Wpo(String str) {
        fpoWpo[17] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo19Wpo(String str) {
        fpoWpo[18] = str;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @param str �p�����[�^
     */
    public void setFpo20Wpo(String str) {
        fpoWpo[19] = str;
    }

    /**
     * @return �ԋp�l
     */
    public String getData5() {
        return data5;
    }

    /**
     * @param data5 �p�����[�^
     */
    public void setData5(String data5) {
        this.data5 = data5;
    }

   /**
     * @return data6 ��߂��܂��B
     */
    public String getData6() {
        return data6;
    }

    /**
     * @param data6 �ݒ肷�� data6�B
     */
    public void setData6(String data6) {
        this.data6 = data6;
    }

    /**
     * @return data7 ��߂��܂��B
     */
    public String getData7() {
        return data7;
    }

    /**
     * @param data7 �ݒ肷�� data7�B
     */
    public void setData7(String data7) {
        this.data7 = data7;
    }

    /**
     * @return data8 ��߂��܂��B
     */
    public String getData8() {
        return data8;
    }

    /**
     * @param data8 �ݒ肷�� data8�B
     */
    public void setData8(String data8) {
        this.data8 = data8;
    }

    /**
     * @return data9 ��߂��܂��B
     */
    public String getData9() {
        return data9;
    }

    /**
     * @param data9 �ݒ肷�� data9�B
     */
    public void setData9(String data9) {
        this.data9 = data9;
    }

    /**
     * @return data10 ��߂��܂��B
     */
    public String getData10() {
        return data10;
    }

    /**
     * @param data10 �ݒ肷�� data10�B
     */
    public void setData10(String data10) {
        this.data10 = data10;
    }

    /**
     * NAME1���擾����
     *
     * @return �ԋp�l
     */
    public String getName1() {
        return name1;
    }

    /**
     * NAME1��ݒ肷��
     *
     * @param name1 �p�����[�^
     */
    public void setName1(String name1) {
        this.name1 = name1;
    }

    /**
     * NAME2���擾����
     *
     * @return �ԋp�l
     */
    public String getName2() {
        return name2;
    }

    /**
     * NAME2��ݒ肷��
     *
     * @param name2 �p�����[�^
     */
    public void setName2(String name2) {
        this.name2 = name2;
    }

    /**
     * ���\�b�h�̃R�����g������
     *
     * @return �ԋp�l
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * ��ЃR�[�h��ݒ肷��
     *
     * @param compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * ������ݒ肷��
     *
     * @param taborder
     */
    public void setTaborder(int taborder) {
        this.taborder = taborder;
    }

    /**
     * �������擾����
     *
     * @return
     */
    public int getTaborder() {
        return taborder;
    }



    /**
     * ������ݒ肵�܂��B
     * @param height ����
     */
    public void setJHeight(int height) {
        jHeight = height;
    }


    /**
     * ������ݒ肵�܂��B
     * @param width ����
     */
    public void setJWidth(int width) {
        jWidth = width;
    }



    /**
     * X���W��ݒ肵�܂��B
     * @param jX X���W
     */
    public void setJX(int jX) {
        this.jX = jX;
    }


    /**
     * Y���W��ݒ肵�܂��B
     * @param jY Y���W
     */
    public void setJY(int jY) {
        this.jY = jY;
    }


    /**
     * @return editMask
     */
    public String getEditMask() {
        return editMask;
    }

    /**
     * @param editMask �ݒ肷�� editMask
     */
    public void setEditMask(String editMask) {
        this.editMask = editMask;
    }

    /**
     * @return clmType
     */
    public String getClmType() {
        return clmType;
    }

    /**
     * @param clmType �ݒ肷�� clmType
     */
    public void setClmType(String clmType) {
        this.clmType = clmType;
    }
}
