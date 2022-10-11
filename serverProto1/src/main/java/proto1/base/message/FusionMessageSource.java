package proto1.base.message;

import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import proto1.common.Constants;

/**
 *
 * メッセージを取得するためのクラスです。
 *
 * @author exasys
 *
 */
public class FusionMessageSource extends ReloadableResourceBundleMessageSource {

    /**
     * 定数の@@@
     */
    private static final String STR_3A = "@@@";

    /**
     * メッセージを取得します。引数のcompGpCd,compCdでメッセージが見つからない場合、"@@@"に置き換えて
     * 再度メッセージを探します。
     *
     * @param compGpCd ログインユーザのcompGpCd
     * @param compCd ログインユーザのcompCd
     * @param domainCd ドメインコード
     * @param errCode エラーコード
     * @param args プレースホルダーに渡す値
     * @return メッセージ
     */
    public String getMessageArg(String compGpCd, String compCd, String domainCd, String errCode,
        Object[] args) {

        try {

            return getMessage(compGpCd + Constants.STR_POINT + compCd + Constants.STR_POINT
                + domainCd + Constants.STR_POINT + errCode, args, null);

        } catch (NoSuchMessageException e) {

            try {

                return getMessage(compGpCd
                    + Constants.STR_POINT + STR_3A + Constants.STR_POINT
                    + domainCd + Constants.STR_POINT + errCode, args, null);

            } catch (NoSuchMessageException ee) {

                return getMessage("@@@" + Constants.STR_POINT + STR_3A + Constants.STR_POINT
                    + domainCd + Constants.STR_POINT + errCode, args, null);
            }
        }

    }

    /**
     * メッセージをMessageクラスで返します。
     *
     * @param compGpCd ログインユーザのcompGpCd
     * @param compCd ログインユーザのcompCd
     * @param domainCd ドメインコード
     * @param errCode エラーコード
     * @param args プレースホルダーに渡す値
     * @return メッセージ
     */
    public Message getMessage(String compGpCd, String compCd, String domainCd, String errCode,
        Object[] args) {

        String arg = getMessageArg(compGpCd, compCd, domainCd, errCode, args);

        Message message = new Message();
        message.setCode(errCode);
        message.setMessage(arg);
        message.setMessageType(MessageManager.getMessageType(errCode));

        return message;
    }

}
