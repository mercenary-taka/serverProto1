package proto1.domain.master;

import java.io.Serializable;

import proto1.base.util.FxpUtil;

/**
 * DataWindow�J�����v���p�e�BM�̃r���[�iZZWVW003�j�ɑΉ�����Bean�N���X�ł��B
 */
public class DwColumnBean implements Serializable {
    private static final long serialVersionUID = -6023942092702008866L;
    private String compGpCd;
    private String compCd;
    private String objectCd;
    private int no;
    private String visible;
    private String textNm;
    private String textAlias;
    private String clmNm;
    private String name1;
    private String name2;
    private String alignment;
    private String border;
    private String checkBox;
    private String visibleT;
    private String alignmentT;
    private String borderT;
    private String input;
    private String length;
    private String editmask;
    private String imeType;
    private int selectWpo1;
    private int selectWpo2;
    private String tableAlias;
    private String clmCd;
    private String clmType;
    private String updateKey;
    private String clmGpCd;
    private String masterCheck;
    private String nmClm1;
    private String nmClm2;
    private String popYmd;
    private String popShbetu;
    private String masterCdClm;
    private String masterCompGp;
    private String masterComp;
    private String masterNmClm1;
    private String masterNmClm2;
    private String[] popKey = new String[7];
    private String dddw;
    private String value;
    private String sparse;
    private String protect;
    //Form�^�̏ꍇ�f�[�^���x����ToolTip��\�����邩���Ȃ���

    private String formTooltipEnable;


    private int jX;
    private int jY;
    private int jWidth;
    private int jHeight;
    private int jXT;
    private int jYT;
    private int jWidthT;
    private int jHeightT;


    /** �G���[�`�F�b�N�p�J�����������J�������� */
    public static final String ERROR_CHECK_CLMNM = "ERROR_CHECK";
    /** �f�[�^�^���u�����v */
    public static final String TYPE_STRING = "1";
    /** �f�[�^�^���u���l�v */
    public static final String TYPE_NUMERIC = "2";
    /** �f�[�^�^���u���t�v */
    public static final String TYPE_DATE = "3";


    /**
     * ������̕\���ʒu���擾���܂��B
     *
     * @return ������̕\���ʒu
     */
    public String getAlignment() {
        return alignment;
    }

    /**
     * ������̕\���ʒu��ݒ肵�܂��B
     *
     * @param alignment ������̕\���ʒu
     */
    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    /**
     * �^�C�g��������̕\���ʒu���擾���܂��B
     *
     * @return �^�C�g��������̕\���ʒu
     */
    public String getAlignmentT() {
        return alignmentT;
    }

    /**
     * �^�C�g��������̕\���ʒu��ݒ肵�܂��B
     *
     * @param alignmentT �^�C�g��������̕\���ʒu
     */
    public void setAlignmentT(String alignmentT) {
        this.alignmentT = alignmentT;
    }

    /**
     * �`�F�b�N�{�b�N�X�ł��邩�ǂ����̃t���O���擾���܂��B
     *
     * @return �`�F�b�N�{�b�N�X�ł��邩�ǂ����̃t���O
     */
    public String getCheckBox() {
        return checkBox;
    }

    /**
     * �`�F�b�N�{�b�N�X�ł��邩�ǂ����̃t���O��ݒ肵�܂��B
     *
     * @param checkBox �`�F�b�N�{�b�N�X�ł��邩�ǂ����̃t���O
     */
    public void setCheckBox(String checkBox) {
        this.checkBox = checkBox;
    }

    /**
     * �J�������̂��擾���܂��B
     *
     * @return �J��������
     */
    public String getClmNm() {
        return clmNm;
    }

    /**
     * �J�������̂�ݒ肵�܂��B
     *
     * @param clmNm �J��������
     */
    public void setClmNm(String clmNm) {
        this.clmNm = clmNm;
    }

    /**
     * �}�X�N�����擾���܂��B
     *
     * @return �}�X�N���
     */
    public String getEditmask() {
        return editmask;
    }

    /**
     * �}�X�N����ݒ肵�܂��B
     *
     * @param editmask �}�X�N���
     */
    public void setEditmask(String editmask) {
        this.editmask = editmask;
    }

    /**
     * IME�^�C�v���擾���܂��B
     *
     * @return IME�^�C�v
     */
    public String getImeType() {
        return imeType;
    }

    /**
     * IME�^�C�v��ݒ肵�܂��B
     *
     * @param imeType IME�^�C�v
     */
    public void setImeType(String imeType) {
        this.imeType = imeType;
    }

    /**
     * ���͏�Ԃ̃t���O���擾���܂��B
     *
     * @return ���͏�Ԃ̃t���O
     */
    public String getInput() {
        return input;
    }

    /**
     * ���͏�Ԃ̃t���O��ݒ肵�܂��B
     *
     * @param input ���͏�Ԃ̃t���O
     */
    public void setInput(String input) {
        this.input = input;
    }

    /**
     * �������擾���܂��B
     *
     * @return ����
     */
    public String getLength() {
        return length;
    }

    /**
     * ������ݒ肵�܂��B
     *
     * @param length ����
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     * No���擾���܂��B
     *
     * @return No
     */
    public int getNo() {
        return no;
    }

    /**
     * No��ݒ肵�܂��B
     *
     * @param no No
     */
    public void setNo(int no) {
        this.no = no;
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
     * �e�L�X�g�̃G�C���A�X���擾���܂��B
     *
     * @return �e�L�X�g�̃G�C���A�X
     */
    public String getTextAlias() {
        return textAlias;
    }

    /**
     * �e�L�X�g�̃G�C���A�X��ݒ肵�܂��B
     *
     * @param textAlias �e�L�X�g�̃G�C���A�X
     */
    public void setTextAlias(String textAlias) {
        this.textAlias = textAlias;
    }

    /**
     * �e�L�X�g�̖��̂��擾���܂��B
     *
     * @return �e�L�X�g�̖���
     */
    public String getTextNm() {
        return textNm;
    }

    /**
     * �e�L�X�g�̖��̂�ݒ肵�܂��B
     *
     * @param textNm �e�L�X�g�̖���
     */
    public void setTextNm(String textNm) {
        this.textNm = textNm;
    }

    /**
     * �\���̉s���擾���܂��B
     *
     * @return �\���̉s��
     */
    public String getVisible() {
        return visible;
    }

    /**
     * �\���̉s��ݒ肵�܂��B
     *
     * @param visible �\���̉s��
     */
    public void setVisible(String visible) {
        this.visible = visible;
    }

    /**
     * �^�C�g���̕\���̉s���擾���܂��B
     *
     * @return �^�C�g���̕\���̉s��
     */
    public String getVisibleT() {
        return visibleT;
    }

    /**
     * �^�C�g���̕\���̉s��ݒ肵�܂��B
     *
     * @param visibleT �^�C�g���̕\���̉s��
     */
    public void setVisibleT(String visibleT) {
        this.visibleT = visibleT;
    }

    /**
     * ����WHERE��ƂȂ�WPO(FROM)���擾���܂��B
     *
     * @return ����WHERE��ƂȂ�WPO(FROM)
     */
    public int getSelectWpo1() {
        return selectWpo1;
    }

    /**
     * ����WHERE��ƂȂ�WPO(FROM)��ݒ肵�܂��B
     *
     * @param selectWpo1 ����WHERE��ƂȂ�WPO(FROM)
     */
    public void setSelectWpo1(int selectWpo1) {
        this.selectWpo1 = selectWpo1;
    }

    /**
     * ����WHERE��ƂȂ�WPO(TO)���擾���܂��B
     *
     * @return ����WHERE��ƂȂ�WPO(TO)
     */
    public int getSelectWpo2() {
        return selectWpo2;
    }

    /**
     * ����WHERE��ƂȂ�WPO(TO)��ݒ肵�܂��B
     *
     * @param selectWpo2 ����WHERE��ƂȂ�WPO(TO)
     */
    public void setSelectWpo2(int selectWpo2) {
        this.selectWpo2 = selectWpo2;
    }

    /**
     * ���o����e�[�u���̕ʏ̂��擾���܂��B
     *
     * @return ���o����e�[�u���̕ʏ�
     */
    public String getTableAlias() {
        return tableAlias;
    }

    /**
     * ���o����e�[�u���̕ʏ̂�ݒ肵�܂��B
     *
     * @param tableAlias ���o����e�[�u���̕ʏ�
     */
    public void setTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
    }

    /**
     * �J�����R�[�h���擾���܂��B
     *
     * @return �J�����R�[�h
     */
    public String getClmCd() {
        return clmCd;
    }

    /**
     * �J�����R�[�h��ݒ肵�܂��B
     *
     * @param clmCd �J�����R�[�h
     */
    public void setClmCd(String clmCd) {
        this.clmCd = clmCd;
    }

    /**
     * �J�����^�C�v���擾���܂��B
     *
     * @return �J�����^�C�v
     */
    public String getClmType() {
        return clmType;
    }

    /**
     * �J�����^�C�v��ݒ肵�܂��B
     *
     * @param clmType �J�����^�C�v
     */
    public void setClmType(String clmType) {
        this.clmType = clmType;
    }

    /**
     * ���̂P���擾���܂��B
     *
     * @return ���̂P
     */
    public String getName1() {
        return name1;
    }

    /**
     * ���̂P��ݒ肵�܂��B
     *
     * @param name1 ���̂P
     */
    public void setName1(String name1) {
        this.name1 = name1;
    }

    /**
     * ���̂Q���擾���܂��B
     *
     * @return ���̂Q
     */
    public String getName2() {
        return name2;
    }

    /**
     * ���̂Q��ݒ肵�܂��B
     *
     * @param name2 ���̂Q
     */
    public void setName2(String name2) {
        this.name2 = name2;
    }

    /**
     * �A�b�v�f�[�g�L�[���擾���܂��B
     *
     * @return �A�b�v�f�[�g�L�[
     */
    public String getUpdateKey() {
        return updateKey;
    }

    /**
     * �A�b�v�f�[�g�L�[��ݒ肵�܂��B
     *
     * @param updateKey �A�b�v�f�[�g�L�[
     */
    public void setUpdateKey(String updateKey) {
        this.updateKey = updateKey;
    }

    /**
     * �J�����O���[�v�R�[�h���擾���܂��B
     *
     * @return �J�����O���[�v�R�[�h
     */
    public String getClmGpCd() {
        return clmGpCd;
    }

    /**
     * �J�����O���[�v�R�[�h��ݒ肵�܂��B
     *
     * @param clmGpCd �J�����O���[�v�R�[�h
     */
    public void setClmGpCd(String clmGpCd) {
        this.clmGpCd = clmGpCd;
    }

    /**
     * �}�X�^�[�`�F�b�N���擾���܂��B
     *
     * @return �}�X�^�[�`�F�b�N
     */
    public String getMasterCheck() {
        return masterCheck;
    }

    /**
     * �}�X�^�[�`�F�b�N��ݒ肵�܂��B
     *
     * @param masterCheck �}�X�^�[�`�F�b�N
     */
    public void setMasterCheck(String masterCheck) {
        this.masterCheck = masterCheck;
    }

    /**
     * �J�������̂P���擾���܂��B
     *
     * @return �J�������̂P
     */
    public String getNmClm1() {
        return nmClm1;
    }

    /**
     * �J�������̂P��ݒ肵�܂��B
     *
     * @param nmClm1 �J�������̂P
     */
    public void setNmClm1(String nmClm1) {
        this.nmClm1 = nmClm1;
    }

    /**
     * �J�������̂Q���擾���܂��B
     *
     * @return �J�������̂Q
     */
    public String getNmClm2() {
        return nmClm2;
    }

    /**
     * �J�������̂Q��ݒ肵�܂��B
     *
     * @param nmClm2 �J�������̂Q
     */
    public void setNmClm2(String nmClm2) {
        this.nmClm2 = nmClm2;
    }

    /**
     * STM_XXX(�X�e�[�^�XCD) OR WPO_#(��ʂ�WPO)���擾���܂��B
     *
     * @return STM_XXX(�X�e�[�^�XCD) OR WPO_#(��ʂ�WPO)
     */
    public String getPopYmd() {
        return popYmd;
    }

    /**
     * STM_XXX(�X�e�[�^�XCD) OR WPO_#(��ʂ�WPO)��ݒ肵�܂��B
     *
     * @param popYmd STM_XXX(�X�e�[�^�XCD) OR WPO_#(��ʂ�WPO)
     */
    public void setPopYmd(String popYmd) {
        this.popYmd = popYmd;
    }

    /**
     * �Q��DB���ėp�l�ŊK�w�\���ł���ꍇ�A��ʊK�w��ėp�l��ʂ��g�p���邩�ǂ������擾���܂��B
     *
     * @return �Q��DB���ėp�l�ŊK�w�\���ł���ꍇ�A��ʊK�w��ėp�l��ʂ��g�p���邩�ǂ���
     */
    public String getPopShbetu() {
        return popShbetu;
    }

    /**
     * �Q��DB���ėp�l�ŊK�w�\���ł���ꍇ�A��ʊK�w��ėp�l��ʂ��g�p���邩�ǂ�����ݒ肵�܂��B
     *
     * @param popShbetu �Q��DB���ėp�l�ŊK�w�\���ł���ꍇ�A��ʊK�w��ėp�l��ʂ��g�p���邩�ǂ���
     */
    public void setPopShbetu(String popShbetu) {
        this.popShbetu = popShbetu;
    }

    /**
     * �}�X�^�[�R�[�h�J�������擾���܂��B
     *
     * @return �}�X�^�[�R�[�h�J����
     */
    public String getMasterCdClm() {
        return masterCdClm;
    }

    /**
     * �}�X�^�[�R�[�h�J������ݒ肵�܂��B
     *
     * @param masterCdClm �}�X�^�[�R�[�h�J����
     */
    public void setMasterCdClm(String masterCdClm) {
        this.masterCdClm = masterCdClm;
    }

    /**
     * CLM_XXX(�J������) OR WPO_#(��ʂ�WPO)��ݒ肵�܂��B
     *
     * @param popKey1 CLM_XXX(�J������) OR WPO_#(��ʂ�WPO)
     */
    public void setPopKey1(String popKey1) {
        this.popKey[0] = popKey1;
    }

    /**
     * CLM_XXX(�J������) OR WPO_#(��ʂ�WPO)��ݒ肵�܂��B
     *
     * @param popKey2 CLM_XXX(�J������) OR WPO_#(��ʂ�WPO)
     */
    public void setPopKey2(String popKey2) {
        this.popKey[1] = popKey2;
    }

    /**
     * CLM_XXX(�J������) OR WPO_#(��ʂ�WPO)��ݒ肵�܂��B
     *
     * @param popKey3 CLM_XXX(�J������) OR WPO_#(��ʂ�WPO)
     */
    public void setPopKey3(String popKey3) {
        this.popKey[2] = popKey3;
    }

    /**
     * CLM_XXX(�J������) OR WPO_#(��ʂ�WPO)��ݒ肵�܂��B
     *
     * @param popKey4 CLM_XXX(�J������) OR WPO_#(��ʂ�WPO)
     */
    public void setPopKey4(String popKey4) {
        this.popKey[3] = popKey4;
    }

    /**
     * CLM_XXX(�J������) OR WPO_#(��ʂ�WPO)��ݒ肵�܂��B
     *
     * @param popKey5 CLM_XXX(�J������) OR WPO_#(��ʂ�WPO)
     */
    public void setPopKey5(String popKey5) {
        this.popKey[4] = popKey5;
    }

    /**
     * CLM_XXX(�J������) OR WPO_#(��ʂ�WPO)��ݒ肵�܂��B
     *
     * @param popKey6 CLM_XXX(�J������) OR WPO_#(��ʂ�WPO)
     */
    public void setPopKey6(String popKey6) {
        this.popKey[5] = popKey6;
    }

    /**
     * CLM_XXX(�J������) OR WPO_#(��ʂ�WPO)��ݒ肵�܂��B
     *
     * @param popKey7 CLM_XXX(�J������) OR WPO_#(��ʂ�WPO)
     */
    public void setPopKey7(String popKey7) {
        this.popKey[6] = popKey7;
    }

    /**
     * CLM_XXX(�J������) OR WPO_#(��ʂ�WPO)���擾���܂��B
     *
     * @param no �ԍ�
     *
     * @return CLM_XXX(�J������) OR WPO_#(��ʂ�WPO)
     */
    public String getPopKey(int no) {
        return this.popKey[no - 1];
    }

    /**
     * �}�X�^�[��Ђ��擾���܂��B
     *
     * @return �}�X�^�[���
     */
    public String getMasterComp() {
        return masterComp;
    }

    /**
     * �}�X�^�[��Ђ�ݒ肵�܂��B
     *
     * @param masterComp �}�X�^�[���
     */
    public void setMasterComp(String masterComp) {
        this.masterComp = masterComp;
    }

    /**
     * �}�X�^�[��ЃO���[�v���擾���܂��B
     *
     * @return �}�X�^�[��ЃO���[�v
     */
    public String getMasterCompGp() {
        return masterCompGp;
    }

    /**
     * �}�X�^�[��ЃO���[�v��ݒ肵�܂��B
     *
     * @param masterCompGp �}�X�^�[��ЃO���[�v
     */
    public void setMasterCompGp(String masterCompGp) {
        this.masterCompGp = masterCompGp;
    }

    /**
     * �}�X�^���̃J�����P���擾���܂��B
     *
     * @return �}�X�^���̃J�����P
     */
    public String getMasterNmClm1() {
        return masterNmClm1;
    }

    /**
     * �}�X�^���̃J�����P��ݒ肵�܂��B
     *
     * @param masterNmClm1 �}�X�^���̃J�����P
     */
    public void setMasterNmClm1(String masterNmClm1) {
        this.masterNmClm1 = masterNmClm1;
    }

    /**
     * �}�X�^���̃J�����Q���擾���܂��B
     *
     * @return �}�X�^���̃J�����Q
     */
    public String getMasterNmClm2() {
        return masterNmClm2;
    }

    /**
     * �}�X�^���̃J�����Q��ݒ肵�܂��B
     *
     * @param masterNmClm2 �}�X�^���̃J�����Q
     */
    public void setMasterNmClm2(String masterNmClm2) {
        this.masterNmClm2 = masterNmClm2;
    }

    /**
     * ��ЃO���[�v�R�[�h���擾���܂��B
     *
     * @return ��ЃO���[�v�R�[�h
     */
    public String getCompGpCd() {
        return compGpCd;
    }

    /**
     * ��ЃO���[�v�R�[�h��ݒ肵�܂��B
     *
     * @param compGpCd ��ЃO���[�v�R�[�h
     */
    public void setCompGpCd(String compGpCd) {
        this.compGpCd = compGpCd;
    }

    /**
     * ��ЃR�[�h���擾���܂��B
     *
     * @return ��ЃR�[�h
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * ��ЃR�[�h��ݒ肵�܂��B
     *
     * @param compCd ��ЃR�[�h
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * �h���b�v�_�E�������擾���܂��B
     *
     * @return �h���b�v�_�E�����
     */
    public String getDddw() {
        return dddw;
    }

    /**
     * �h���b�v�_�E������ݒ肵�܂��B
     *
     * @param dddw �h���b�v�_�E�����
     */
    public void setDddw(String dddw) {
        this.dddw = dddw;
    }

    /**
     * no��String�ŕԂ��܂��B
     *
     * @return no
     */
    public String getNoStr() {
        return Integer.toString(no);
    }

    /**
     * TextNm�̒l�ɉ������\�������擾���܂��B
     *
     * @return �\����
     */
    public String getTextNmValue() {
        if (!FxpUtil.isEmpty(textAlias)) {
            return textAlias;
        } else if ((textNm == null) || textNm.equals("0")) {
            return " ";
        } else if (textNm.equals("1")) {
            return name1;
        } else if (textNm.equals("2")) {
            return name2;
        } else {
            return clmNm;
        }
    }

    /**
     * �l���擾���܂��B
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

    /**
     * {@inheritDoc}
     */
    public String toString() {
        return "objectCd=" + objectCd + ", clmNm=" + clmNm;
    }

    /**
     * �{�[�_���擾���܂��B
     *
     * @return �{�[�_
     */
    public String getBorder() {
        return border;
    }

    /**
     * �{�[�_��ݒ肵�܂��B
     *
     * @param border �{�[�_
     */
    public void setBorder(String border) {
        this.border = border;
    }

    /**
     * �^�C�g���̃{�[�_���擾���܂��B
     *
     * @return �^�C�g���̃{�[�_
     */
    public String getBorderT() {
        return borderT;
    }

    /**
     * �^�C�g���̃{�[�_��ݒ肵�܂��B
     *
     * @param borderT �^�C�g���̃{�[�_
     */
    public void setBorderT(String borderT) {
        this.borderT = borderT;
    }

    /**
     * �\���`�����擾���܂��B
     *
     * @return �\���`��
     */
    public String getSparse() {
        return sparse;
    }

    /**
     * �\���`����ݒ肵�܂��B
     *
     * @param sparce �\���`��
     */
    public void setSparse(String sparse) {
        this.sparse = sparse;
    }

    public String getProtect() {
        return protect;
    }

    public void setProtect(String protect) {
        this.protect = protect;
    }


    /**
     * ������ݒ肵�܂��B
     * @param height ����
     */
    public void setJHeight(int height) {
        jHeight = height;
    }


    /**
     * �^�C�g���̍�����ݒ肵�܂��B
     * @param heightT �^�C�g���̍���
     */
    public void setJHeightT(int heightT) {
        jHeightT = heightT;
    }



    /**
     * ������ݒ肵�܂��B
     * @param width ����
     */
    public void setJWidth(int width) {
        jWidth = width;
    }



    /**
     * ������ݒ肵�܂��B
     * @param widthT ����
     */
    public void setJWidthT(int widthT) {
        jWidthT = widthT;
    }



    /**
     * X���W��ݒ肵�܂��B
     * @param jX X���W
     */
    public void setJX(int jX) {
        this.jX = jX;
    }



    /**
     * �^�C�g����X���W��ݒ肵�܂��B
     * @param jxt X���W
     */
    public void setJXT(int jxt) {
        jXT = jxt;
    }



    /**
     * Y���W��ݒ肵�܂��B
     * @param jY Y���W
     */
    public void setJY(int jY) {
        this.jY = jY;
    }



    /**
     * �^�C�g����Y���W��ݒ肵�܂��B
     * @param jyt Y���W
     */
    public void setJYT(int jyt) {
        jYT = jyt;
    }

    public String[] getPopKey() {
        return popKey;
    }

    public void setPopKey(String[] popKey) {
        this.popKey = popKey;
    }

    /**
     * �f�[�^�^�������`���ł��邩���ׂ܂��B
     * @return �����`���̏ꍇtrue�A����ȊO��false
     */
    public boolean isStringType() {
        if (!FxpUtil.isEmpty(clmType)) {
            if (clmType.equals(TYPE_STRING)) {
                return true;
            }
        }

        return false;
    }

    /**
     * �f�[�^�^�����l�`���ł��邩���ׂ܂��B
     * @return ���l�`���̏ꍇtrue�A����ȊO��false
     */
    public boolean isNumericType() {
        if (!FxpUtil.isEmpty(clmType)) {
            if (clmType.equals(TYPE_NUMERIC)) {
                return true;
            }
        }

        return false;
    }

    /**
     * �f�[�^�^�����t�`���ł��邩���ׂ܂��B
     * @return ���t�`���̏ꍇtrue�A����ȊO��false
     */
    public boolean isDateType() {
        if (!FxpUtil.isEmpty(clmType)) {
            if (clmType.equals(TYPE_DATE)) {
                return true;
            }
        }

        return false;
    }

    /**
     * @return formTooltipEnable ��߂��܂��B
     */
    public String getFormTooltipEnable() {
        return formTooltipEnable;
    }

    /**
     * @param formTooltipEnable �ݒ肷�� formTooltipEnable�B
     */
    public void setFormTooltipEnable(String formTooltipEnable) {
        this.formTooltipEnable = formTooltipEnable;

    }
}


