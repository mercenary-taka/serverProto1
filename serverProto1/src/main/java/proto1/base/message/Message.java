package proto1.base.message;

/**
 * 画面に表示するメッセージを表すクラス
 *
 * @author exasys
 *
 */
public class Message {

    private String messageType;
    private String code;
    private String message;

    /**
     * メッセージタイプ（エラー・警告・情報など）を返す
     *
     * @return メッセージタイプ
     */
    public String getMessageType() {
        return this.messageType;
    }

    /**
     * メッセージタイプ（エラー・警告・情報など）を設定
     *
     * @param messageType メッセージタイプ
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * メッセージコードを返す
     *
     * @return メッセージコード
     */
    public String getCode() {
        return this.code;
    }

    /**
     * メッセージコードを設定
     *
     * @param code メッセージコード
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * メッセージ文言を返す
     *
     * @return メッセージ
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * メッセージ文言を設定
     *
     * @param message メッセージ
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
