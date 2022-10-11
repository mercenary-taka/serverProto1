package proto1.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import proto1.domain.parameter.ComponentProperty;
import proto1.domain.parameter.FPO;
import proto1.domain.parameter.WPO;

/**
 * 共通リクエストクラスです。
 */
public class GeneralRequest implements Serializable {
	/** 検索 */
	public static final int SEARCH = 1;

	/** 更新 */
	public static final int UPDATE = 2;

	/** クリック */
	public static final int CLICK = 3;

	/** 画面起動 */
	public static final int OPENWINDOW = 4;

	/** ポップアップ起動 */
	public static final int OPENPOPUP = 5;

	/** ポップアップ内で実行 */
	public static final int POPUPEXEC = 6;

	/** ステータスチェック */
	public static final int STATUSCHECK = 7;

	/** SYSDATE取得 */
	public static final int SYSDATE = 8;

	/** DropDown取得 */
	public static final int OPEN_DROPDOWN = 9;

	/** メッセージ取得 */
	public static final int GET_MESSAGE = 10;

	/** キャッシュクリア */
	public static final int CLEAR_CACHE = 11;

	/** 帳票印刷 */
	public static final int PRINT = 12;

	/** PING */
	public static final int PING = 13;

	/** UoZZZ0001.ufDisplaySet2 */
	public static final int DISPLAYSET_2 = 14;

	/** メール送信要求 */
	public static final int MAIL = 15;

	/** 非同期処理の結果問い合わせ*/
	public static final int GET_ASYNC_RESULT = 16;

	/** ValueにOpenSheetParameterを入れるときのキー名 */
	public static final String VALUE_OPENSHEET = "opensheet";
	private static final long serialVersionUID = 1180494607810487848L;

	/** 実行するイベント */
	private int event;

	/** 会社コード */
	private String compCd;

	/** 仮想機能コード */
	private String pgmCd;

	/** 実画面CD */
	private String winCd;

	/** ポップアップ元がポップアップ画面の場合、その画面CD */
	private String parentPopWinCd;

	/** オブジェクトCD */
	private String objectCd;

	/** ページ番号 */
	private int page;

	/** 担当コード */
	private String tantouCd;

	/** ステータスコード */
	private String[] statusCd = new String[3];

	/** parameter */
	private String[] parameter = new String[5];

	/** WPO */
	private WPO wpo;

	/** コンポーネントのプロパティ */
	private Map properties = new HashMap();

	/** ポップアップ元がDwのときの、ポップアップ元カラム名 */
	private String popupFromDwClmNm;

	/** ポップアップ元がDwのときの、ポップアップ元rowoid */
	private int popupFromDwRowOid;

	/** ポップアップの実画面CD */
	private String popupWinCd;

	/** ポップアップ時のイベント発生元ObjectCd（ボタンなど） */
	private String popupObjectCd;

	/** 帳票No */
	private String reportNo;

	/** 業務区分 */
	private String gyomuKb;

	/** 非同期で通信を行うか */
	private boolean asynchronous;

	/** 非同期スレッドID */
	private String asyncThreadUUId;

	/**
	 * @return asyncThreadUUId
	 */
	public String getAsyncThreadUUId() {
		return asyncThreadUUId;
	}

	/**
	 * @param asyncThreadUUId セットする asyncThreadUUId
	 */
	public void setAsyncThreadUUId(String asyncThreadUUId) {
		this.asyncThreadUUId = asyncThreadUUId;
	}

	/**
	 * 非同期で通信を行うかを返します。
	 * @return　非同期通信の場合true　通常の通信の場合false
	 */
	public boolean isAsynchronous() {
		return asynchronous;
	}

	/**
	 * 通信方法を設定します。
	 * @param asynchronous　非同期で通信する場合true 通常の通信の場合false
	 */
	public void setAsynchronous(boolean asynchronous) {
		this.asynchronous = asynchronous;
	}

	/**
	 * 会社コードを取得します。
	 *
	 * @return 会社コード
	 */
	public String getCompCd() {
		return compCd;
	}

	/**
	 * 会社コードを設定します。
	 *
	 * @param compCd 会社コード
	 */
	public void setCompCd(String compCd) {
		this.compCd = compCd;
	}

	/**
	 * イベントコードを取得します。
	 *
	 * @return イベントコード
	 */
	public int getEvent() {
		return event;
	}

	/**
	 * イベントコードを設定します。
	 *
	 * @param event イベントコード
	 */
	public void setEvent(int event) {
		this.event = event;
	}

	/**
	 * オブジェクトコードを取得します。
	 *
	 * @return オブジェクトコード
	 */
	public String getObjectCd() {
		return objectCd;
	}

	/**
	 * オブジェクトコードを設定します。
	 *
	 * @param objectCd オブジェクトコード
	 */
	public void setObjectCd(String objectCd) {
		this.objectCd = objectCd;
	}

	/**
	 * ページ番号を取得します。
	 *
	 * @return ページ番号
	 */
	public int getPage() {
		return page;
	}

	/**
	 * ページ番号を設定します。
	 *
	 * @param page ページ番号
	 */
	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * プログラムコードを取得します。
	 *
	 * @return プログラムコード
	 */
	public String getPgmCd() {
		return pgmCd;
	}

	/**
	 * プログラムコードを設定します。
	 *
	 * @param pgmCd プログラムコード
	 */
	public void setPgmCd(String pgmCd) {
		this.pgmCd = pgmCd;
	}

	/**
	 * ポップアップ元がDwのときに、元となったカラム名を取得します。
	 *
	 * @return ポップアップ元のDwのカラム名称
	 */
	public String getPopupFromDwClmNm() {
		return popupFromDwClmNm;
	}

	/**
	 * ポップアップ元がDwのときに、元となったカラム名を設定します。
	 *
	 * @param popupFromDwClmNm ポップアップ元のDwのカラム名称
	 */
	public void setPopupFromDwClmNm(String popupFromDwClmNm) {
		this.popupFromDwClmNm = popupFromDwClmNm;
	}

	/**
	 * ポップアップ元がDwのときに、元となった行のRowOidを取得します。
	 *
	 * @return ポップアップ元の行Oid
	 */
	public int getPopupFromDwRowOid() {
		return popupFromDwRowOid;
	}

	/**
	 * ポップアップ元がDwのときに、元となった行のRowOidを設定します。
	 *
	 * @param popupFromDwRowOid ポップアップ元の行Oid
	 */
	public void setPopupFromDwRowOid(int popupFromDwRowOid) {
		this.popupFromDwRowOid = popupFromDwRowOid;
	}

	/**
	 * ポップアップ画面のWinCdを取得します。
	 *
	 * @return ポップアップ画面のWinCd
	 */
	public String getPopupWinCd() {
		return popupWinCd;
	}

	/**
	 * ポップアップ画面のWinCdを設定します。
	 *
	 * @param popupWinCd ポップアップ画面のWinCd
	 */
	public void setPopupWinCd(String popupWinCd) {
		this.popupWinCd = popupWinCd;
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
	 * ステータスコードを取得します。
	 *
	 * @return ステータスコード
	 */
	public String[] getStatusCd() {
		return statusCd;
	}

	/**
	 * ステータスコードを設定します。
	 *
	 * @param statusCd ステータスコード
	 */
	public void setStatusCd(String[] statusCd) {
		this.statusCd = statusCd;
	}

	/**
	 * パラメータを取得します。
	 *
	 * @return パラメータ
	 */
	public String[] getParameter() {
		return parameter;
	}

	/**
	 * パラメータを設定しています。
	 * @param parameter パラメータ
	 */
	public void setParameter(String[] parameter) {
		this.parameter = parameter;
	}

	/**
	 * ウィンドウコードを取得します。
	 *
	 * @return ウィンドウコード
	 */
	public String getWinCd() {
		return winCd;
	}

	/**
	 * ウィンドウコードを設定します。
	 *
	 * @param winCd ウィンドウコード
	 */
	public void setWinCd(String winCd) {
		this.winCd = winCd;
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
	 * 担当者コードを取得します。
	 *
	 * @return 担当者コード
	 */
	public String getTantouCd() {
		return tantouCd;
	}

	/**
	 * 担当者コードを設定します。
	 *
	 * @param tantouCd 担当者コード
	 */
	public void setTantouCd(String tantouCd) {
		this.tantouCd = tantouCd;
	}

	/**
	 * ポップアップ時のイベント発生元ObjectCd（ボタンなど）を取得します。
	 *
	 * @return ポップアップイベント発生元オブジェクトコード
	 */
	public String getPopupObjectCd() {
		return popupObjectCd;
	}

	/**
	 * ポップアップ時のイベント発生元ObjectCd（ボタンなど）を セットします。
	 *
	 * @param popupObjectCd ポップアップイベント発生元オブジェクトコード
	 */
	public void setPopupObjectCd(String popupObjectCd) {
		this.popupObjectCd = popupObjectCd;
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
	 * メソッドのコメントを書く
	 *
	 * @param objectCd パラメータ
	 * @param page パラメータ
	 *
	 * @return 返却値
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
	 * 業務区分を取得します。
	 *
	 * @return 業務区分
	 */
	public String getGyomuKb() {
		return gyomuKb;
	}

	/**
	 * 業務区分を設定します。
	 *
	 * @param gyomuKb 業務区分
	 */
	public void setGyomuKb(String gyomuKb) {
		this.gyomuKb = gyomuKb;
	}

	/**
	 * 帳票Noを取得します。
	 *
	 * @return 帳票No
	 */
	public String getReportNo() {
		return reportNo;
	}

	/**
	 * 帳票Noを設定します。
	 *
	 * @param reportNo 帳票No
	 */
	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	/**
	 * ポップアップ元のポップアップ画面CDを取得します。
	 * ポップアップ元が通常画面（GeneralFrame）の場合はnullです。
	 *
	 * @return ポップアップ画面CD
	 */
	public String getParentPopWinCd() {
		return parentPopWinCd;
	}

	/**
	 * ポップアップ元がポップアップ画面のとき、そのポップアプ画面CDを設定します。
	 * ポップアップ元が通常画面（GeneralFrame）の場合は設定しません。
	 *
	 * @param parentPopWinCd ポップアップ画面CD
	 */
	public void setParentPopWinCd(String parentPopWinCd) {
		this.parentPopWinCd = parentPopWinCd;
	}

	/**
	 * {@inheritDoc}
	 */
	public String toString() {
		return "Request[compCd=" + compCd + ",pgmCd=" + pgmCd + ",winCd="
				+ winCd + ",objectCd=" + objectCd + ",page=" + page + ",tantouCd="
				+ tantouCd + ",statusCd=" + statusCd[0] + "," + statusCd[1] + ","
				+ statusCd[2] + ",wpo=" + wpo + ",properties=" + properties
				+ ",popupFromDwClmNm=" + popupFromDwClmNm + ",popupFromDwRowOid="
				+ popupFromDwRowOid + ",popupWinCd="
				+ popupWinCd + ",popupObjectCd="
				+ popupObjectCd + ",parentPopWinCd=" + parentPopWinCd + "]";
	}

	/**
	 * コンポーネントを一意に決めるためのキークラスです。
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
			}*/
}
/*
 * イベントごとに必要な値 一覧
 *
 * SEARCH
 *  compCd, pgmCd, winCd, page, tantouCd, statusCd, WPO, properties
 *
 * UPDATE
 *  compCd, pgmCd, winCd, page, tantouCd, statusCd, WPO, properties
 *
 * CLICK
 *  compCd, pgmCd, winCd, objectCd, page, tantouCd, statusCd, WPO, properties
 *
 * OPENWINDOW 画面の表示
 *  compCd, pgmCd, winCd, tantouCd, statusCd
 *
 * OPENPOPUP ポップアップウィンドウの表示
 *  compCd, pgmCd, winCd, objectCd, page, tantouCd, statusCd, WPO, properties
 *  popupFromDwClmNm, popupFromDwRowOid, popupWinCd
 *
 * POPUPEXEC ポップアップウィンドウ内の各種動作
 *  compCd, pgmCd, winCd, objectCd, page, tantouCd, statusCd, WPO, properties
 *  popupFromDwClmNm, popupFromDwRowOid, popupWinCd, popupObjectCd
 *
 * STATUSCHECK
 *  compCd, pgmCd, statusCd
 *
 * SYSDATE
 *  なし
 *
 * OPEN_DROPDOWN DropDownを取得
 *  compCd, pgmCd, winCd, objectCd, page, tantouCd, statusCd, WPO, properties
 *  popupFromDwClmNm, popupFromDwRowOid
 *
 * GET_MESSAGE メッセージ取得
 *  compCd, pgmCd（「KAZ」など先頭3文字でよい）
 *
 * CLEAR_CACHE キャッシュクリア
 *  なし
 *
 * PRINT 帳票印刷
 *  compCd, tantouCd, statusCd, WPO, properties, reportNo, gyomuKb
 * PING 死活チェック
 * 　なし
 */
