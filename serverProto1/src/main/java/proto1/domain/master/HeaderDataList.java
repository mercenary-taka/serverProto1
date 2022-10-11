package proto1.domain.master;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import proto1.domain.parameter.HeaderData;

/**
 * DataSetのヘッダーをリストで保持するためのクラスです。
 * また、カラム名に対応する、RowDataが保持しているListのindexをMapで保持します。
 * @author exa89801
 *
 */
public class HeaderDataList extends ArrayList<HeaderData> {

    private static final long serialVersionUID = 2584972405003200715L;
    /** カラムとIndexのMap */
    private Map<String, Integer> columnIndexMap = new HashMap<String, Integer>();


    /**
     * RowDataにアクセスする際の、カラム名とindexのMapを返します。
     * この情報は内部で使用されます。
     * @return カラム名とインデックスのMap
     */
    public Map<String, Integer> getColumnIndexMap() {
        return columnIndexMap;
    }

    /**
     * RowDataにアクセスする際の、カラム名とindexのMapを設定します。
     * この情報は内部で使用されます。
     * @param columnIndexMap カラム名とインデックスのMap
     */
    public void setColumnIndexMap(Map<String, Integer> columnIndexMap) {
        this.columnIndexMap = columnIndexMap;
    }

}
