package proto1.domain.master;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import proto1.base.util.FxpUtil;
import proto1.domain.parameter.HeaderData;
import proto1.domain.parameter.RowData;

/**
 * DataWindow�̒l�������߂�Bean�N���X�ł��B ������HeaderData��RowData���g�p���܂��B
 */
public class DataSet implements Serializable {
    private static final long serialVersionUID = -6494719684995435817L;

    /** �w�b�_��ێ����郊�X�g */
    private HeaderDataList headers = new HeaderDataList();

    /** �s�f�[�^��ێ����郊�X�g */
    private List<RowData> rows = new ArrayList<RowData>();

    /** �s�f�[�^��rowoid���L�[�ɂ��ĕێ�����Map */
    private Map rowMap = new HashMap();

    /** RowData��id������U�邽�߂̃J�E���^ */
    private int nextRowOid = 1;

    /** dddw�̕\���p�f�[�^ */
    private Map dddwValues = new HashMap();

/**
     * �f�t�H���g�R���X�g���N�^
     *
     */
    public DataSet() {
    }

/**
     * �J���������w�肵���R���X�g���N�^�B
     * �v���O�������ŃJ�������𒼐ڎw�肵��DataSet��
     * ���Ƃ��Ɏg�p����B
     *
     * @param columnNames �J�������̔z��
     */
    public DataSet(String[] columnNames) {
        for (int i = 0; i < columnNames.length; i++) {
            HeaderData header = new HeaderData();
            header.setClmNm(columnNames[i]);
            header.setType("");
            addHeader(header);
        }
    }

    /**
     * �w�b�_���P�ǉ����܂��B DataSet�̏������Ŏg�p���܂��B
     *
     * @param header �p�����[�^
     */
    public void addHeader(HeaderData header) {
        headers.add(header);
    }

    /**
     * ��s���P�s�ǉ����܂��B
     *
     * @return �ǉ������s�̍s�ԍ�
     */
    public int addRow() {
        RowData row = new RowData(headers);
        row.setRowoid(nextRowOid++);
        rows.add(row);
        rowMap.put(Integer.valueOf(row.getRowoid()), row);

        return rows.size();
    }

    /**
     * �w�肵���s�A�J�����ɒl���Z�b�g���܂��B �s�ƃJ�����̃X�e�[�^�X���X�V����܂��B
     *
     * @param col �p�����[�^
     * @param row �p�����[�^
     * @param value �p�����[�^
     */
    public void setValue(String col, int row, Object value) {
        RowData rowData = (RowData) rows.get(row - 1);
        rowData.setValue(col, value);
    }

    /**
     * �w�肵���s�A�J�����̒l���擾���܂��B
     *
     * @param col �J������
     * @param row �s�ԍ��i�P�ȏ�j
     *
     * @return �l
     */
    public Object getValue(String col, int row) {
        RowData rowData = (RowData) rows.get(row - 1);

        return rowData.getValue(col);
    }

    /**
     * �w�肵���s�A�J�����̒l�𕶎���Ŏ擾���܂��B
     *
     * @param col �J������
     * @param row �s�ԍ��i�P�ȏ�j
     *
     * @return �l�iString�^�j
     */
    public String getStrValue(String col, int row) {
        RowData rowData = (RowData) rows.get(row - 1);

        return rowData.getStrValue(col);
    }

    /**
     * �w�肵���s�ɍ폜�t���O���Z�b�g���܂��B
     *
     * @param row �s�ԍ�
     */
    public void delete(int row) {
        RowData rowData = (RowData) rows.get(row - 1);
        rowData.setDelete(true);
    }

    /**
     * �����l�̍s�f�[�^��ǉ����܂��B DB����ǂݍ��񂾒l�ōs��V�K�쐬����Ƃ��Ɏg���܂��B
     *
     * @param row �p�����[�^
     *
     * @return �ǉ������s�̍s�ԍ�
     */
    public int addInitialRow(RowData row) {
        row.setRowoid(nextRowOid++);
        //row.clearStatus();
        row.setInitialStatus();
        rows.add(row);
        rowMap.put(Integer.valueOf(row.getRowoid()), row);

        return rows.size();
    }

    /**
     * �w�b�_�̃��X�g���擾���܂��B
     *
     * @return �ԋp�l
     */
    public List getHeaders() {
        return headers;
    }

    /**
     * ���ׂĂ̍s�f�[�^���擾���܂��B
     *
     * @return �ԋp�l
     */
    public List<RowData> getRows() {
        return rows;
    }

    /**
     * �w�肵���s�̃f�[�^���擾���܂��B
     *
     * @param row �s���i1�ȏ�j
     *
     * @return RowData
     */
    public RowData getRow(int row) {
        return (RowData) rows.get(row - 1);
    }

    /**
     * oid�Ŏw�肵���s�f�[�^���擾���܂��B
     *
     * @param rowoid oid
     *
     * @return RowData
     */
    public RowData getRowByOid(int rowoid) {
        return (RowData) rowMap.get(Integer.valueOf(rowoid));
    }

    /**
     * oid�Ŏw�肵���sRowData�̍s�ԍ����擾���܂��B ���݂��Ȃ��ꍇ�A0��Ԃ��܂��B
     * �����Ӂ@�����Ō����u�s�ԍ��v�Ƃ́ADw�ɕ\������Ă��鏇�Ԃł�<b>�Ȃ�</b>�Arows���X�g�̃C���f�b�N�X��+1�����ԍ��̂��Ƃł��B
     * @param rowoid oid
     *
     * @return �s�ԍ�
     */
    public int getRowNumber(int rowoid) {
        int row = 0;

        for (int i = 0; i < rows.size(); i++) {
            RowData rowData = (RowData) rows.get(i);

            if (rowData.getRowoid() == rowoid) {
                return i + 1;
            }
        }

        return row;
    }

    /**
     * �X�V���ꂽ�s���擾���܂��B �ǉ��A�폜�A�X�V�s�S�Ċ܂܂�܂��B
     *
     * @return �X�V�s�̃��X�g
     */
    public List<RowData> getModifiedRows() {
        List<RowData> modifiedRows = new ArrayList<RowData>();
        Iterator<RowData> it = rows.iterator();

        while (it.hasNext()) {
            RowData row = it.next();

            if (row.isDelete()) {
                if (!RowData.NEW.equals(row.getRowStatus())
                        && !RowData.NEW_MODIFIED.equals(row.getRowStatus())) {
                    // �폜�t���Otrue�ŁA�V�K�s�łȂ����DELETE�Ώ�
                    modifiedRows.add(row);
                }
            } else if (RowData.DATA_MODIFIED.equals(row.getRowStatus())
                    || RowData.NEW_MODIFIED.equals(row.getRowStatus())) {
                // �폜�t���Ofalse�̍X�V�s��INSERT�AUPDATE�Ώ�
                modifiedRows.add(row);
            }
        }

        return modifiedRows;
    }

    /**
     * �N���C�A���g���ł̍X�V�`�F�b�N�ΏۂƂȂ�s���擾���܂��B �ǉ��A�X�V���ꂽ�s���擾���܂��B
     *
     * @return �X�V�`�F�b�N�Ώۍs
     */
    public List<RowData> getCheckedRows() {
        List<RowData> modifiedRows = new ArrayList<RowData>();
        Iterator<RowData> it = rows.iterator();

        while (it.hasNext()) {
            RowData row = it.next();

            if (!row.isDelete()) {
                if (RowData.NEW.equals(row.getRowStatus())
                        || RowData.DATA_MODIFIED.equals(row.getRowStatus())
                        || RowData.NEW_MODIFIED.equals(row.getRowStatus())) {
                    modifiedRows.add(row);
                }
            }
        }

        return modifiedRows;
    }

    /**
     * DELETE�����s�̑Ώۍs�ƂȂ�A�폜���ꂽ�s���擾���܂��B
     *
     * @return �폜�s�̃��X�g
     */
    public List<RowData> getDeletedRows() {
        List<RowData> deletedRows = new ArrayList<RowData>();
        Iterator<RowData> it = rows.iterator();

        while (it.hasNext()) {
            RowData row = it.next();

            if (row.isDelete()) {
                if (!RowData.NEW.equals(row.getRowStatus())
                        && !RowData.NEW_MODIFIED.equals(row.getRowStatus())) {
                    // �폜�t���Otrue�ŁA�V�K�s�łȂ����DELETE�Ώ�
                    deletedRows.add(row);
                }
            }
        }

        return deletedRows;
    }

    /**
     * INSERT�����s�̑ΏۂƂȂ�A�V�K�ǉ����ꂽ�s���擾���܂��B
     *
     * @return �ǉ����ꂽ�s�̃��X�g
     */
    public List<RowData> getInsertedRows() {
        List<RowData> insertedRows = new ArrayList<RowData>();
        Iterator<RowData> it = rows.iterator();

        while (it.hasNext()) {
            RowData row = it.next();

            if (!row.isDelete()
                    && RowData.NEW_MODIFIED.equals(row.getRowStatus())) {
                insertedRows.add(row);
            }
        }

        return insertedRows;
    }

    /**
     * UPDATE�����s�̑ΏۂƂȂ�A�X�V���ꂽ�s���擾���܂��B
     *
     * @return �X�V���ꂽ�s�̃��X�g
     */
    public List<RowData> getUpdatedRows() {
        List<RowData> updatedRows = new ArrayList<RowData>();
        Iterator<RowData> it = rows.iterator();

        while (it.hasNext()) {
            RowData row = it.next();

            if (!row.isDelete()
                    && RowData.DATA_MODIFIED.equals(row.getRowStatus())) {
                updatedRows.add(row);
            }
        }

        return updatedRows;
    }

    /**
     * DataSet�̍s�����擾���܂��B
     *
     * @return �s��
     */
    public int size() {
        return rows.size();
    }

    /**
     * �w�肵���J�����̎w�肵�������������RowData��
     * rowOid��Ԃ��܂��B�������A�폜�t���O�������Ă���s�͌����ΏۂƂ��܂���B
     *
     * @param clmName - ��������J������
     * @param arg - �������镶����
     *
     * @return �ŏ��Ɍ�������RowData��rowOid ������Ȃ������ꍇ��0
     */
    public int find(String clmName, Object arg) {
        return find(clmName, arg, 0);
    }

    /**
     * �w�肵���J�����̎w�肵�������������RowData��
     * rowOid��Ԃ��܂��B�������A�폜�t���O�������Ă���s�͌����ΏۂƂ��܂���B
     *
     * @param clmName - ��������J������
     * @param arg - �������镶����
     * @param startIndex - �������J�n����index(0����n�܂�)
     *
     * @return �ŏ��Ɍ�������RowData��rowOid<br>
 *  ������Ȃ������ꍇ��0
     */
    public int find(String clmName, Object arg, int startIndex) {
        int index = findIndex(clmName, arg, startIndex);

        if (index > -1) {
            return this.getRow(index + 1).getRowoid();
        } else {
            return 0;
        }
    }

    /**
     * �w�肵���J�����̎w�肵�������������RowData��
     * index��Ԃ��܂��B�������A�폜�t���O�������Ă���s�͌����ΏۂƂ��܂���B DataSet�N���X���Ŏg�p���܂��B
     *
     * @param clmName - ��������J������
     * @param arg - �������镶����
     * @param startIndex - �������J�n����index(0����n�܂�)
     *
     * @return �ŏ��Ɍ�������RowData��index<br>
 *  ������Ȃ������ꍇ��-1
     */
    private int findIndex(String clmName, Object arg, int startIndex) {
        List<RowData> list = getRows();

        for (int i = startIndex; i < list.size(); i++) {
            RowData row = list.get(i);

            if (row.isDelete()) {
                continue;
            }

            Object value = row.getValue(clmName);

            if (FxpUtil.isEmpty(value) && FxpUtil.isEmpty(arg)) {
                return i;
            } else if (!FxpUtil.isEmpty(value) && !FxpUtil.isEmpty(arg)) {

                if (findEquals(value, arg)) {
                    return i;
                }

            }

            /*if (!FxpUtil.isEmpty(value)) {
                if (value.equals(arg)) {
                    return i;
                }
            } else {
                if (FxpUtil.isEmpty(arg)) {
                    return i;
                }
            }*/
        }

        return -1;
    }

    /**
     * find���\�b�h���Ŏg�p�����r���\�b�h
     * @param arg0
     * @param arg1
     * @return �������ꍇtrue �������Ȃ��ꍇfalse
     */
    private boolean findEquals(Object arg0, Object arg1) {

        String a = "";
        String b = "";

        if (arg0 instanceof BigDecimal) {
            a = ((BigDecimal) arg0).toPlainString();

        } else {
            a = arg0.toString();
        }

        if (arg1 instanceof BigDecimal) {
            b = ((BigDecimal) arg1).toPlainString();
        } else {
            b = arg1.toString();
        }

        return a.equals(b);
    }


    /**
     * �w�肵���J�����̎w�肵�������������RowData��
     * rowOid��Ԃ��܂��B�������A�폜�t���O�������Ă���s�͌����ΏۂƂ��܂���B (���������w��\)
     *
     * @param clmNames - ��������J������
     * @param args - �������镶����
     * @param startIndex - �������J�n����index(0����n�܂�)
     *
     * @return �ŏ��Ɍ�������RowData��rowOid<br>
 *  ������Ȃ������ꍇ��0
     */
    public int find(String[] clmNames, Object[] args, int startIndex) {
        int i = startIndex;

        while (true) {
            // ��ԍŏ��̏����Ō���
            int j = findIndex(clmNames[0], args[0], i);

            if (j == -1) {
                // ������Ȃ�����
                return 0;
            } else {
                boolean flag = true;

                // ��Ԗڈȍ~�̏����Ɉ�v���邩���ׂ�
                for (int k = 1; k < clmNames.length; k++) {
                    if (FxpUtil.isEmpty(args[k])
                            && FxpUtil.isEmpty(this.getValue(clmNames[k], j + 1))) {
                        // ��v�i�����Ƃ���j
                        // ���̏�����
                        continue;
                    } else if (FxpUtil.isEmpty(args[k])
                            || FxpUtil.isEmpty(this.getValue(clmNames[k], j + 1))) {
                        // ��v���Ȃ� (�ǂ��炩����)
                        flag = false;

                        break;
                    //} else if (args[k].equals(this.getValue(clmNames[k], j + 1))) {
                    } else if (findEquals(args[k], this.getValue(clmNames[k], j + 1))) {
                        // ��v����
                        // ���̏�����
                        continue;
                    } else {
                        // ��v���Ȃ�
                        flag = false;

                        break;
                    }
                }

                if (flag) {
                    // �S�Ă̍��ڂ���v
                    return this.getRow(j + 1).getRowoid();
                }
            }

            // DataSet�ɒ��ׂĂȂ��f�[�^�����邩
            if ((j + 1) < this.size()) {
                i = j + 1;
            } else {
                return 0;
            }
        }
    }

    /**
     * DataSet�̍X�V�X�e�[�^�X�����Z�b�g���܂��B
     */
    public void resetUpdate() {
        if (rows != null) {
            for (int i = 0; i < rows.size(); i++) {
                RowData row = (RowData) rows.get(i);
                row.clearStatus();
            }
        }
    }

    /**
     * �h���b�v�_�E���f�[�^�E�C���h�E�̒��g���擾���܂��B
     *
     * @return �ԋp�l
     */
    public Map getDddwValues() {
        return dddwValues;
    }

    /**
     * �h���b�v�_�E���f�[�^�E�C���h�E�̒��g��ݒ肵�܂��B
     *
     * @param dddwValues �p�����[�^
     */
    public void setDddwValues(Map dddwValues) {
        this.dddwValues = dddwValues;
    }

/**
     * DB�ւ̍X�V������AFW���g�p���܂��B
     *
     */

    /*public void initStatus() {
        if (rows != null) {
            for (int i = 0;i < rows.size();i++) {
                RowData row = (RowData) rows.get(i);

                if (row.getRowStatus().equals(RowData.NEW)) {
                    // �폜
                } else if (row.getRowStatus().equals(RowData.NEW_MODIFIED)) {
                    row.setRowStatus(RowData.NOT_MODIFIED);
                } else if (row.getRowStatus().equals(RowData.DATA_MODIFIED)) {
                    row.setRowStatus(RowData.NOT_MODIFIED);
                } else if (row.getRowStatus().equals(RowData.NOT_MODIFIED)) {
                    // �Ȃɂ����Ȃ�
                }
            }
        }
    }*/
}
