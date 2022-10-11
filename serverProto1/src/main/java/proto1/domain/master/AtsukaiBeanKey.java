package proto1.domain.master;

/**
 * datawindow�J�����v���p�e�B�l�̃L�[�N���X�ł��B
 */
public class AtsukaiBeanKey {
    private String compGpCd;
    private String compCd;
    private String tantouCd;
    private String clmGpCd;

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
     * �S���҃R�[�h���擾���܂��B
     *
     * @return �S���҃R�[�h
     */
    public String getTantouCd() {
        return tantouCd;
    }

    /**
     * �S���҃R�[�h��ݒ肵�܂��B
     *
     * @param tantouCd �S���҃R�[�h
     */
    public void setTantouCd(String tantouCd) {
        this.tantouCd = tantouCd;
    }

    /**
     * {@inheritDoc}
     */
    public boolean equals(Object obj) {
        if (obj instanceof AtsukaiBeanKey) {
            AtsukaiBeanKey key = (AtsukaiBeanKey) obj;

            return key.compGpCd.equals(this.compGpCd)
            && key.compCd.equals(this.compCd)
            && key.tantouCd.equals(this.tantouCd)
            && key.clmGpCd.equals(this.clmGpCd);
        }

        return false;
    }

    /**
     * {@inheritDoc}
     */
    public int hashCode() {
        return tantouCd.hashCode();
    }

    /**
     * {@inheritDoc}
     */
    public String toString() {
        return "AtsukaiBeanKey[compGpCd=" + compGpCd + "," + "compCd=" + compCd
        + "," + "tantouCd=" + tantouCd + "," + "clmGpCd=" + clmGpCd + "]";
    }
}
