package proto1.domain.master;

import java.io.Serializable;

/**
 * �J�����O���[�v�������N���X�ł��B
 *
 * @author $author$
 * @version $Revision$
 */
public class ColumnGpBean implements Serializable {
    /** Clm_Type : ���� */
    public static final String CLM_TYPE_STRING = "1";
    /** Clm_Type : ���l */
    public static final String CLM_TYPE_NUMERIC = "2";
    /** Clm_Type : ���t */
    public static final String CLM_TYPE_DATE = "3";
    private static final long serialVersionUID = 1747392789357738256L;
    private String compGpCd;
    private String compCd;
    private String clmGpCd;
    private String clmType;
    private String length;
    private String editmask;
    private String masterCheck;
    private String masterCompGp;
    private String masterComp;
    private String masterCdClm;
    private String imeType;

    /**
     * �J�����O���[�v�R�[�h���擾���܂��B
     *
     * @return �J�����O���[�v�R�[�h
     */
    public String getClmGpCd() {
        return clmGpCd;
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
     * �J�����O���[�v�R�[�h��ݒ肵�܂��B
     *
     * @param clmGpCd �J�����O���[�v�R�[�h
     */
    public void setClmGpCd(String clmGpCd) {
        this.clmGpCd = clmGpCd;
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
     * �}�X�N�i#,###��)���擾���܂��B
     *
     * @return �}�X�N
     */
    public String getEditmask() {
        return editmask;
    }

    /**
     * �}�X�N�i#,###���j��ݒ肵�܂��B
     *
     * @param editmask �}�X�N
     */
    public void setEditmask(String editmask) {
        this.editmask = editmask;
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
     * �}�X�^�R�[�h�J�������擾���܂��B
     *
     * @return �}�X�^�R�[�h�J����
     */
    public String getMasterCdClm() {
        return masterCdClm;
    }

    /**
     * �}�X�^�R�[�h�J������ݒ肵�܂��B
     *
     * @param masterCdClm �}�X�^�R�[�h�J����
     */
    public void setMasterCdClm(String masterCdClm) {
        this.masterCdClm = masterCdClm;
    }

    /**
     * �}�X�^�`�F�b�N���擾���܂��B
     *
     * @return �}�X�^�`�F�b�N
     */
    public String getMasterCheck() {
        return masterCheck;
    }

    /**
     * �}�X�^�`�F�b�N���擾���܂��B
     *
     * @param masterCheck �}�X�^�`�F�b�N
     */
    public void setMasterCheck(String masterCheck) {
        this.masterCheck = masterCheck;
    }

    /**
     * �}�X�^��Ђ��擾���܂��B
     *
     * @return �}�X�^���
     */
    public String getMasterComp() {
        return masterComp;
    }

    /**
     * �}�X�^��Ђ�ݒ肵�܂��B
     *
     * @param masterComp �}�X�^���
     */
    public void setMasterComp(String masterComp) {
        this.masterComp = masterComp;
    }

    /**
     * �}�X�^��ЃO���[�v���擾���܂��B
     *
     * @return �}�X�^��ЃO���[�v
     */
    public String getMasterCompGp() {
        return masterCompGp;
    }

    /**
     * �}�X�^��ЃO���[�v��ݒ肵�܂��B
     *
     * @param masterCompGp �}�X�^��ЃO���[�v
     */
    public void setMasterCompGp(String masterCompGp) {
        this.masterCompGp = masterCompGp;
    }

    /**
     * �J�����^�C�v�̃f�[�^�^�������^���ǂ������ׂ܂��B
     *
     * @return
     */
    public boolean isStringType() {
        if (clmType.equals(CLM_TYPE_STRING)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * �J�����^�C�v�̃f�[�^�^�����l�^���ǂ������ׂ܂��B
     *
     * @return
     */
    public boolean isNumericType() {
        if (clmType.equals(CLM_TYPE_NUMERIC)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * �J�����^�C�v�̃f�[�^�^�����t�^���ǂ������ׂ܂��B
     *
     * @return
     */
    public boolean isDateType() {
        if (clmType.equals(CLM_TYPE_DATE)) {
            return true;
        } else {
            return false;
        }
    }
}
