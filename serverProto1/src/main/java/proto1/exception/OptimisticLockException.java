package proto1.exception;

import proto1.base.message.Message;
import proto1.common.Constants;

/**
 * 楽観ロックエラー用例外クラスです。
 *
 * @author exasys
 *
 */
public class OptimisticLockException extends CheckedException {

    /**
     * 定数
     */
    private static final long serialVersionUID = -1598985159408659444L;
    private static String ERROR_MESSAGE = "他のユーザによってデータが変更されたため、更新出来ませんでした。";

    /**
     * コンストラクタ
     */
    public OptimisticLockException() {
        super(ERROR_MESSAGE);
        Message message = new Message();
        message.setMessage(ERROR_MESSAGE);
        message.setMessageType(Constants.MESSAGE_TYPE_ERROR);
        message.setCode("");
        setFusionMessage(message);
    }

    /**
     * メッセージと例外クラスをもとにOptimisticLockExceptionを生成します。
     *
     * @param message メッセージ
     * @param cause 例外
     */
    public OptimisticLockException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * メッセージを設定してOptimisticLockExceptionを生成します。
     *
     * @param message メッセージ
     */
    public OptimisticLockException(String message) {
        super(message);
    }

    /**
     * 例外クラスをもとにOptimisticLockExceptionを生成します。
     *
     * @param cause 例外
     */
    public OptimisticLockException(Throwable cause) {
        super(cause);
    }

    /**
     * メッセージクラスを設定してOptimisticLockExceptionを生成します。
     *
     * @param message メッセージ
     */
    public OptimisticLockException(Message message) {
        super(message);
    }

}
