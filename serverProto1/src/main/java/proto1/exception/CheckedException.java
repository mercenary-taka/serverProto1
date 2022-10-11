package proto1.exception;

import proto1.base.message.Message;

/**
 * アプリケーション例外の基底クラス
 *
 * @author exasys
 *
 */
public abstract class CheckedException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = -8444562776474681282L;
    /**
     * メッセージ
     */
    private Message fusionMessage;

    /**
     * コンストラクタ
     */
    public CheckedException() {
    }

    /**
     * メッセージを設定してChekedExceptionを生成します。
     *
     * @param message メッセージ
     */
    public CheckedException(String message) {
        super(message);
    }

    /**
     * 例外クラスをもとにCheckedExceptionを生成します。
     *
     * @param cause 例外
     */
    public CheckedException(Throwable cause) {
        super(cause);
    }

    /**
     * メッセージと例外クラスをもとにCheckedExceptionを生成します。
     *
     * @param message メッセージ
     * @param cause 例外
     */
    public CheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * メッセージクラスを設定してCheckedExceptionを生成します。
     *
     * @param message メッセージ
     */
    public CheckedException(Message message) {
        super(message.getMessage());
        this.fusionMessage = message;
    }

    /**
     * @return fusionMessage
     */
    public Message getFusionMessage() {
        return this.fusionMessage;
    }

    /**
     * @param fusionMessage セットする fusionMessage
     */
    public void setFusionMessage(Message fusionMessage) {
        this.fusionMessage = fusionMessage;
    }

}
