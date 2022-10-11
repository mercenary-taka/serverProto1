package proto1.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import proto1.domain.master.DwColumnBean;
import proto1.domain.master.ObjectControlBean;
import proto1.domain.master.StatusBean;
import proto1.domain.parameter.ComponentProperty;
import proto1.domain.parameter.FPO;
import proto1.domain.parameter.WPO;

public class GeneralResponse implements Serializable {

	/** ValueにDDDWのDataSetを入れるときのキー名 */
	public static final String VALUE_DDDW = "dddw";

	/** ValueにSYSDATEの値を入れるときのキー名 */
	public static final String VALUE_SYSDATE = "sysdate";

	/** Valueにメッセージのリストを入れるときのキー名 */
	public static final String VALUE_MESSAGE_LIST = "messageList";
	private static final long serialVersionUID = -3618874178484914646L;

	/** WPO */
	private WPO wpo;

	/** オブジェクト制御Mのリスト */
	private List<ObjectControlBean> objectControlList;

	/** DwカラムプロパティMのリスト */
	private List<DwColumnBean> dwColumnList;

	/** ステータスの配列 */
	private StatusBean[] statusBean = new StatusBean[3];

	/** コンポーネントのプロパティ */
	private Map properties = new HashMap();

	/** 帳票に表示するデータ */
	private List reportData = new ArrayList();

	private String globalName;

	/** 非同期処理が完了したかを表すフラグ */
	private boolean asyncComplete = false;

	/** 非同期処理ID */
	private String asyncThreadUUID;

	/**
	 * 非同期処理IDを返します。
	 * 非同期処理ではない場合nullが返されます。
	 * @return asyncThreadUUID
	 */
	public String getAsyncThreadUUID() {
		return asyncThreadUUID;
	}

	/**
	 * 非同期処理IDを設定します。
	 * @param asyncThreadUUID セットする asyncThreadUUID
	 */
	public void setAsyncThreadUUID(String asyncThreadUUID) {
		this.asyncThreadUUID = asyncThreadUUID;
	}

	/**
	 * 非同期処理が完了しているかを返します。
	 * @return 完了している場合true。完了していないfalse。
	 */
	public boolean isAsyncComplete() {
		return asyncComplete;
	}

	/**
	 * 非同期処理が完了しているかを設定します。
	 * @param asyncComplete 完了している場合true。していない場合false
	 */
	public void setAsyncComplete(boolean asyncComplete) {
		this.asyncComplete = asyncComplete;
	}

	/**
	 * データウィンドウカラムプロパティ群を取得します。
	 *
	 * @return データウィンドウカラムプロパティ群
	 */
	public List getDwColumnList() {
		return dwColumnList;
	}

	/**
	 * データウィンドウカラムプロパティ群を設定します。
	 *
	 * @param dwColumnList データウィンドウカラムプロパティ群
	 */
	public void setDwColumnList(List dwColumnList) {
		this.dwColumnList = dwColumnList;
	}

	/**
	 * オブジェクト制御マスタ群を取得します。
	 *
	 * @return オブジェクト制御マスタ群
	 */
	public List getObjectControlList() {
		return objectControlList;
	}

	/**
	 * オブジェクト制御マスタ群を設定します。
	 *
	 * @param objectControlList オブジェクト制御マスタ群
	 */
	public void setObjectControlList(List objectControlList) {
		this.objectControlList = objectControlList;
	}

	/**
	 * プロパティを取得します。
	 *
	 * @return プロパティ
	 */
	public Map getProperties() {
		return properties;
	}

	/**
	 * プロパティを設定します。
	 *
	 * @param properties プロパティ
	 */
	public void setProperties(Map properties) {
		this.properties = properties;
	}

	/**
	 * ステータス情報を取得します。
	 *
	 * @return ステータス情報
	 */
	public StatusBean[] getStatusBean() {
		return statusBean;
	}

	/**
	 * ステータス情報を設定します。
	 *
	 * @param i 番号
	 * @param statusBean ステータス情報
	 */
	public void setStatusBean(int i, StatusBean statusBean) {
		this.statusBean[i] = statusBean;
	}

	/**
	 * WPOを取得します。
	 *
	 * @return WPO
	 */
	public WPO getWpo() {
		return wpo;
	}

	/**
	 * WPOを設定します。
	 *
	 * @param wpo WPO
	 */
	public void setWpo(WPO wpo) {
		this.wpo = wpo;
	}

	/**
	 * コンポーネントのプロパティを設定します。
	 *
	 * @param objectCd オブジェクトコード
	 * @param page ページ番号
	 * @param property コンポーネントのプロパティ
	 */
	public void setProperty(String objectCd, int page,
			ComponentProperty property) {
		properties.put(objectCd + ComponentProperty.KEY_SEPARATE + page, property);
	}

	/**
	 * コンポーネントのプロパティを取得します。
	 *
	 * @param objectCd オブジェクトコード
	 * @param page ページ番号
	 *
	 * @return コンポーネントのプロパティ
	 */
	public ComponentProperty getProperty(String objectCd, int page) {
		return (ComponentProperty) properties.get(objectCd + ComponentProperty.KEY_SEPARATE + page);
	}

	/**
	 * 値を設定します。
	 *
	 * @param objectCd オブジェクトコード
	 * @param page ページ番号
	 * @param value 値
	 */
	public void setValue(String objectCd, int page, Object value) {
		ComponentProperty property = getProperty(objectCd, page);

		if (property == null) {
			property = new ComponentProperty();
			setProperty(objectCd, page, property);
		}

		property.setValue(value);
	}

	/**
	 * 値を取得します。
	 *
	 * @param objectCd オブジェクトコード
	 * @param page ページ番号
	 *
	 * @return 値
	 */
	public Object getValue(String objectCd, int page) {
		ComponentProperty property = getProperty(objectCd, page);

		if (property != null) {
			return property.getValue();
		} else {
			return null;
		}
	}

	/**
	 * FPOを設定します。
	 *
	 * @param objectCd オブジェクトコード
	 * @param page ページ番号
	 * @param fpo FPO
	 */
	public void setFpo(String objectCd, int page, FPO fpo) {
		ComponentProperty property = getProperty(objectCd, page);

		if (property == null) {
			property = new ComponentProperty();
			setProperty(objectCd, page, property);
		}

		property.setFpo(fpo);
	}

	/**
	 * FPOを取得します。
	 *
	 * @param objectCd オブジェクトコード
	 * @param page ページ番号
	 *
	 * @return FPO
	 */
	public FPO getFpo(String objectCd, int page) {
		ComponentProperty property = getProperty(objectCd, page);

		if (property != null) {
			return property.getFpo();
		} else {
			return null;
		}
	}

	/**
	 * 帳票データを取得します。
	 *
	 * @return 帳票データ
	 */
	public List getReportData() {
		return reportData;
	}

	/**
	 * 帳票データを設定します。
	 *
	 * @param reportData 帳票データ
	 */
	public void setReportData(List reportData) {
		this.reportData = reportData;
	}

	/**
	 *
	 * @return the globalName
	 */
	public String getGlobalName() {
		return globalName;
	}

	/**
	 *
	 * @param globalName the globalName to set
	 */
	public void setGlobalName(String globalName) {
		this.globalName = globalName;
	}

	/**
	 * コンポーネントを一意に決めるためのキークラス
	 *
	 * @author harashima
	 */
	/*    private class Key implements Serializable {
	    private static final long serialVersionUID = 5792423349066459265L;
	    private String objectCd;
	    private int page;

	    *//**
			* Key のコンストラクタです。
			*
			* @param objectCd パラメータ
			* @param page パラメータ
			*/
	/*
	public Key(String objectCd, int page) {
	 this.objectCd = objectCd;
	 this.page = page;
	}

	*//**
		* {@inheritDoc}
		*/
	/*
	public boolean equals(Object arg0) {
	 if (arg0 instanceof Key) {
	     Key target = (Key) arg0;

	     if (objectCd.equals(target.objectCd) && (page == target.page)) {
	         return true;
	     }
	 }

	 return false;
	}

	*//**
		* {@inheritDoc}
		*//*
			public int hashCode() {
			 String key = objectCd + "@" + page;

			 return key.hashCode();
			}
			}
			*/
}
