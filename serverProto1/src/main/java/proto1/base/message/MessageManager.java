package proto1.base.message;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import proto1.common.Constants;

/**
 * 画面共通メッセージ欄に表示するメッセージを扱うクラス
 *
 * @author exasys
 *
 */
public class MessageManager {

    /**
     * 共通メッセージ欄に表示するメッセージをリクエストに追加します。
     * 既にメッセージが追加されている場合、後ろに追加します。
     *
     * @param message 追加するメッセージ
     */
    public static void addMessage(Message message) {

        RequestAttributes attrs = RequestContextHolder.getRequestAttributes();
        List<Message> messages = (List<Message>) attrs.getAttribute(Constants.REQUEST_KEY_MESSAGE,
            RequestAttributes.SCOPE_REQUEST);

        if (messages == null) {
            messages = new ArrayList<Message>();
        }

        messages.add(message);
        attrs.setAttribute(Constants.REQUEST_KEY_MESSAGE, messages,
            RequestAttributes.SCOPE_REQUEST);
    }

    /**
     * 保持しているメッセージをすべてクリアします。
     */
    public static void clearMessage() {
        RequestAttributes attrs = RequestContextHolder.getRequestAttributes();
        attrs.removeAttribute(Constants.REQUEST_KEY_MESSAGE, RequestAttributes.SCOPE_REQUEST);
    }

    /**
     * メッセージタイプを返します。
     *
     * @param errCode エラーコード
     * @return メッセージタイプ
     */
    public static String getMessageType(String errCode) {

        if (errCode != null && errCode.length() > 1) {

            String type = errCode.substring(0, 1);

            if (type.equals(Constants.MESSAGE_TYPE_INFORMATION)
                || type.equals(Constants.MESSAGE_TYPE_WARNING)
                || type.equals(Constants.MESSAGE_TYPE_ERROR)) {
                return type;
            }

        }
        return null;
    }

}
