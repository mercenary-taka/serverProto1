package proto1.exception;

import proto1.base.message.Message;

/**
 * アプリケーション例外の汎用クラス
 *
 * @author exasys
 *
 */
public class GeneralException extends CheckedException {

    /**
     *
     */
    private static final long serialVersionUID = -7459465431822967406L;

    /**
     * コンストラクタ
     */
    public GeneralException() {
        super();
    }

    /**
     * メッセージクラスを設定してGeneralExceptionを生成します。
     *
     * @param message メッセージ
     */
    public GeneralException(Message message) {
        super(message);
    }

    /**
     * メッセージクラスと例外クラスを設定してGeneralExceptionを生成します。
     *
     * @param message メッセージ
     * @param cause 例外
     */
    public GeneralException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * メッセージを設定してGeneralExceptionを生成します。
     *
     * @param message メッセージ
     */
    public GeneralException(String message) {
        super(message);
    }

    /**
     * 例外クラスを設定してGeneralExceptionを生成します。
     *
     * @param cause 例外
     */
    public GeneralException(Throwable cause) {
        super(cause);
    }

}
