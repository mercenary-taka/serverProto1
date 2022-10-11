package proto1.exception;

import proto1.common.Constants;

/**
 * システム例外クラス
 *
 * @author exasys
 *
 */
public class SystemException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = -7970890748611983340L;
    /** メッセージタイプ */
    private String messageType = Constants.MESSAGE_TYPE_ERROR;

    /**
     * メッセージを設定してSystemExceptionを生成します。
     *
     * @param message メッセージ
     */
    public SystemException(String message) {
        super(message);
    }

    /**
     * 例外クラスを設定してSystemExceptionを生成します。
     *
     * @param cause 例外
     */
    public SystemException(Throwable cause) {
        super(cause);
    }

    /**
     * メッセージと例外クラスを設定してSystemExceptionを生成します。
     *
     * @param message メッセージ
     * @param cause 例外
     */
    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @return messageType
     */
    public String getMessageType() {
        return this.messageType;
    }

    /**
     * @param messageType セットする messageType
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

}
