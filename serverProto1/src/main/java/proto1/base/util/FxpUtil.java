package proto1.base.util;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import proto1.domain.master.DataSet;

public class FxpUtil {
    /** EUC画面の「出力名称」に使用できない文字を定義しています。 */
    public static final String[] FORBIDDEN_CHAR =
    {
        ",", ".", "･", "@", ":", ";", "_", "[", "]", "(", ")", "{", "}", "!",
        "?", "&", "%", "#", "$", "\\", "|", "+", "-", "*", "/", "=", "<",
        ">", "^", "`", "'", "\"", " "
    };

    /**
     * null または "" の判定を行う。 null または "" の時、trueを返す。
     *
     * @param str パラメータ
     *
     * @return true or false
     */
    public static boolean isEmpty(String str) {
        return (str == null) || (str.equals(""));
    }

    /**
     * 引数が空であるかを調べます。
     * 引数が null または "" の時、trueを返します。
     *
     * @param obj パラメータ
     *
     * @return nullまたは""の場合true そうでない場合false
     */
    public static boolean isEmpty(Object obj) {
        if (obj instanceof String) {
            return isEmpty((String) obj);
        } else {
            return obj == null;
        }
    }

    /**
     * 引数のDataSetが空であるかを調べます。
     * 引数がnullか、<b>サイズが0の場合</b>trueを返します。
     * 実装者は、引数のDataSetのサイズが0の場合
     * このメソッドがtrueを返すことに注意してください。
     *
     * @param ds パラメータ
     *
     * @return 引数がnullまたはサイズ0の場合true そうでない場合false
     */
    public static boolean isEmpty(DataSet ds) {
        if ((ds == null) || (ds.size() == 0)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 引数からカンマを除去した文字列を返します。
     *
     * @param value 値
     *
     * @return カンマを除去した文字列
     */
    public static String getReplacedValue(String value) {
        if (value == null) {
            return value;
        } else {
            return value.replaceAll(",", "");
        }
    }

    /**
     * 文字列の取得を行います。もし文字列がnullの場合、空文字("")を返します。
     *
     * @param value 文字列
     *
     * @return 文字列
     */
    public static String getString(String value) {
        String val = value;
        if (val == null) {
            val = "";
        }

        return val;
    }

    /**
     * 引数の日付型文字列をTimestamp型にして返します。
     * このメソッドでは引数のフォーマットチェックをしていません。
     * nullや日付型以外の文字列を渡すとjava.lang.IllegalArgumentExceptionが
     * throwされます。
     *
     * @param value 日付型文字列
     *
     * @return Timestamp型の日付
     */
    public static Timestamp getTimeStamp(String value) {
        return Timestamp.valueOf(value);
    }

    /**
     * 引数のの日付を一ヶ月前の日付に変換して返します。
     * このメソッドでは引数のフォーマットチェックをしていません。
     * nullや日付型以外の文字列を渡すとjava.lang.IllegalArgumentExceptionが
     * throwされます。
     *
     * @param date 文字列
     *
     * @return 変換した文字列
     */
    public static String getZengetsu(String date) {
        return addYmd(Calendar.MONTH, date, -1);
        /*int year = 0;
        int mon = 0;
        String day = "0";
        String zengetsu = null;

        year = Integer.parseInt(date.substring(0, 4));
        mon = Integer.parseInt(date.substring(5, 7));
        day = date.substring(8, 10);

        mon = mon - 1;

        if (mon < 1) {
            year = year - 1;
            mon = 12;
        }

        String month = String.valueOf(mon);

        if (month.length() == 1) {
            month = "0" + month;
        }

        zengetsu = String.valueOf(year) + "/" + month + "/" + day;

        return zengetsu;*/
    }

    /**
     * 引数のの日付を一ヶ月後の日付に変換して返します。
     * このメソッドでは引数のフォーマットチェックをしていません。
     * nullや日付型以外の文字列を渡すとjava.lang.IllegalArgumentExceptionが
     * throwされます。
     *
     * @param date 文字列
     *
     * @return 変換した文字列
     */
    public static String getYokugetsu(String date) {
        return addYmd(Calendar.MONTH, date, 1);
        /*int year = 0;
        int mon = 0;
        String day = "0";
        String yokugetsu = null;

        year = Integer.parseInt(date.substring(0, 4));
        mon = Integer.parseInt(date.substring(5, 7));
        day = date.substring(8, 10);

        mon = mon + 1;

        if (mon > 12) {
            year = year + 1;
            mon = 1;
        }

        String month = String.valueOf(mon);

        if (month.length() == 1) {
            month = "0" + month;
        }

        yokugetsu = String.valueOf(year) + "/" + month + "/" + day;

        return yokugetsu;*/
    }

    /**
     * 引数の日付を月初にして返します。 引数が年度の場合は、その年度の1月1日を返します。<br>
     * 引数が「2006」の場合、「2006/01/01」を返します。<br>
     * 引数が「2006/02」の場合、「2006/02/01」を返します。<br>
     * 引数が「2006/02/25」の場合、「2006/02/01」を返します。
     *
     * @param ymd (YYYY or YYYY/MM or YYYY/MM/DD 型の)日付
     *
     * @return 変換された日付 (yyyy/MM/dd 型)
     */
    public static String getFirstDay(String ymd) {
        int year;
        int month = 0;
        int day = 1;

        Calendar cal = Calendar.getInstance();
        cal.clear();

        if (ymd.length() == 4) {
            year = Integer.parseInt(ymd.substring(0, 4));
        } else if ((ymd.length() == 7) || (ymd.length() == 10)) {
            year = Integer.parseInt(ymd.substring(0, 4));
            month = Integer.parseInt(ymd.substring(5, 7)) - 1;
        } else {
            //throw new SystemException("getFirstDayでエラー 引数が正しくありません");
            return null;
        }

        cal.set(year, month, day);

        if (ymd.length() == 4) {
            cal.set(year, cal.getActualMinimum(Calendar.MONTH),
                cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        } else {
            cal.set(year, month, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        }

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");

        return fmt.format(cal.getTime());
    }

    /**
     * 引数の日付を末日にして返します。 引数が年度の場合は、その年度の12月31日を返します。<br>
     * 引数が「2006」の場合、「2006/12/31」を返します。<br>
     * 引数が「2006/02」の場合、「2006/02/28」を返します。<br>
     * 引数が「2006/02/25」の場合、「2006/02/28」を返します。
     *
     * @param ymd - (yyyy or yyyy/MM or yyyy/MM/dd 型の)日付
     *
     * @return 変換された日付 (yyyy/MM/dd 型)
     */
    public static String getLastDay(String ymd) {
        int year;
        int month = 0;
        int day = 1;

        Calendar cal = Calendar.getInstance();
        cal.clear();

        if (ymd.length() == 4) {
            year = Integer.parseInt(ymd.substring(0, 4));
        } else if ((ymd.length() == 7) || (ymd.length() == 10)) {
            year = Integer.parseInt(ymd.substring(0, 4));
            month = Integer.parseInt(ymd.substring(5, 7)) - 1;
        } else {
            //throw new SystemException("getLastDayでエラー 引数が正しくありません");
            return null;
        }

        cal.set(year, month, day);

        if (ymd.length() == 4) {
            cal.set(Calendar.MONTH, cal.getActualMaximum(Calendar.MONTH));
            cal.set(Calendar.DAY_OF_MONTH,
                cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        } else {
            cal.set(Calendar.DAY_OF_MONTH,
                cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        }

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");

        return fmt.format(cal.getTime());
    }

    /**
     * 引数の文字列が日付フォーマットであるかチェックします。
     * このメソッドではyyyy型、yyyy/MM型、yyyy/MM/dd型の文字列を
     * 日付フォーマットであると見なします。
     *
     * @param ymd チェックする文字列 (yyyy型、yyyy/MM型、yyyy/MM/dd型)
     *
     * @return boolean 日付型であればtrue 日付型ではない場合false
     */
    public static boolean isDate(String ymd) {
        String[] wkYmd;
        String[] ckYmd = new String[3];

        wkYmd = ymd.split("/");

        if (wkYmd.length == 1) {
            ckYmd[0] = wkYmd[0];
            ckYmd[1] = "1";
            ckYmd[2] = "1";
        } else if (wkYmd.length == 2) {
            ckYmd[0] = wkYmd[0];
            ckYmd[1] = wkYmd[1];
            ckYmd[2] = "1";
        } else if (wkYmd.length == 3) {
            ckYmd = wkYmd;
        } else {
            return false;
        }

        try {
            Calendar cal = new GregorianCalendar();
            cal.setLenient(false);
            cal.set(Integer.parseInt(ckYmd[0]), Integer.parseInt(ckYmd[1]) - 1,
                Integer.parseInt(ckYmd[2]));

            Date date = cal.getTime();
        } catch (IllegalArgumentException e) {
            return false;
        }

        return true;
    }

    /**
     * 引数の文字列が半角かどうかをチェックします。
     *
     * @param text チェックする文字列
     *
     * @return 文字列が全て半角であればtrue それ以外はfalse
     */
    public static boolean checkHankaku(String text) {
        byte[] wkByte = text.getBytes();

        if (wkByte.length == text.length()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 引数の文字列が全角かどうかをチェックします。
     *
     * @param text チェックする文字列
     *
     * @return 文字列が全て全角であればtrue それ以外はfalse
     */
    public static boolean checkZenkaku(String text) {
        byte[] wkByte = text.getBytes();

        if (wkByte.length == (text.length() * 2)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 引数の値が数値型であるかをチェックします。半角・全角は問いません。
     *
     * @param value チェックする値
     *
     * @return 文字列が数値型であればtrue 数値型でなければfalse
     */
    public static boolean isNumber(Object value) {
        try {
            BigDecimal decimal = new BigDecimal(value.toString());
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    /**
     * 引数の値が、指定したフォーマットの時刻型であるかをチェックします。
     * 引数の値が空の場合、trueを返します。
     *
     * @param pattern 指定するフォーマット（HHmmなど）
     * @param value チェックする値
     * @return 指定したフォーマットの時刻であるならばtrue そうでなければfalse
     */
    public static boolean isTime(String pattern, String value) {

        if (FxpUtil.isEmpty(value)) {
            return true;
        }

        SimpleDateFormat df = new SimpleDateFormat(pattern);
        df.setLenient(false);

        try {
            Date date = df.parse(value);
        } catch (ParseException e) {
            return false;
        }

        return true;
    }



    /**
     * 使用できない文字が含まれていないかチェックします。
     *
     * @param text チェックする文字列
     *
     * @return 使用できない文字が含まれていた場合、その使用できない文字 含まれていない場合は、空の文字列
     */
    public static String forbiddenCharacterCheck(String text) {
        for (int i = 0; i < FORBIDDEN_CHAR.length; i++) {
            if (text.indexOf(FORBIDDEN_CHAR[i]) > -1) {
                return FORBIDDEN_CHAR[i];
            }
        }

        return "";
    }

    /**
     * 文字列データの比較します。nullと空文字を同値に扱います。
     *
     * @param source チェックする文字列
     * @param target 比較対象文字列
     *
     * @return 同じであればtrue 違っていればfalse
     */
    public static boolean compareStringValue(String source, String target) {

        String s = source;
        String t = target;

        if (s == null) {
            s = "";
        }

        if (t == null) {
            t = "";
        }

        return s.equals(t);
    }

    /**
     * 調べたい年月期間が、既存の年月期間の範囲内と重複するかチェックする
     *
     * @param startDate 既存の開始日(YYYY/MM/DD)
     * @param endDate 既存の終了日(YYYY/MM/DD)
     * @param startDateDif 入力した開始日(YYYY/MM/DD)
     * @param endDateDif 入力した終了日(YYYY/MM/DD)
     *
     * @return 重複する場合true しない場合false
     */
    public static boolean betweenFromTo(String startDate, String endDate,
        String startDateDif, String endDateDif) {
        /* "/"を取り除く */
        String sDate = startDate.replaceAll("/", "");
        String eDate = endDate.replaceAll("/", "");
        String sDateDif = startDateDif.replaceAll("/", "");
        String eDateDif = endDateDif.replaceAll("/", "");

        /* 数値に置き換える */
        int startDateInt = Integer.parseInt(sDate);
        int endDateInt = Integer.parseInt(eDate);
        int startDateDifInt = Integer.parseInt(sDateDif);
        int endDateDifInt = Integer.parseInt(eDateDif);

        /* 既存の値の範囲チェック */
        if (startDateInt > endDateInt) {
            return true;
        }

        /* 入力値の範囲チェック */
        if (startDateDifInt > endDateDifInt) {
            return true;
        }

        /* 既存値と入力値の範囲チェック */
        if (startDateDifInt < startDateInt) { // 入力値開始日が既存値開始日より前の場合

            if (endDateDifInt < startDateInt) { // 入力値終了日が既存値開始日より前の場合

                /* 範囲外 */
                return false;
            } else {
                /* 範囲内 */
                return true;
            }
        } else {
            if (startDateDifInt > endDateInt) { // 入力値開始日が既存終了日より後の場合

                /* 範囲外 */
                return false;
            } else {
                /* 範囲内 */
                return true;
            }
        }
    }

    /**
     * S_JISコードで渡された引数がJISコードに変換可能でない場合「""」を返す。 ○ＳＪＩＳ有効文字範囲
     * 上位バイト：0x81～0x9F or 0xE0～0xFC 下位バイト：0x40～0x7E or 0x80～0xFC ○ＪＩＳ第一水準漢字
     * 上位:88/下位:9f (0x889f) ～ 上位:98/下位:72 (0x9872) 但し、以下の文字は変換不可(社会保険媒体仕様書による)
     * 尭(0x8bc4) / 槙(0x968a) / 遥(0x9779) ○ＪＩＳ第二水準漢字 上位:98/下位:9f (0x989f) ～
     * 上位:ea/下位:a2 (0xeaa2) 但し、以下の文字は変換不可(社会保険媒体仕様書による) 瑶(0xe0f4) ○英数字／記号
     * 上位:81/下位:40 (0x8140) ～ 上位:81/下位:ac (0x81ac) 上位:82/下位:4f (0x824f) ～
     * 上位:82/下位:58 (0x8258) 上位:82/下位:60 (0x8260) ～ 上位:82/下位:79 (0x8279)
     * 上位:82/下位:81 (0x8281) ～ 上位:82/下位:9a (0x829a) ○かな／カナ 上位:82/下位:9f (0x829f)
     * ～ 上位:82/下位:f1 (0x82f1) 上位:83/下位:40 (0x8340) ～ 上位:83/下位:96 (0x8396)
     * ○ギリシャ文字 上位:83/下位:9f (0x839f) ～ 上位:83/下位:b6 (0x83b6) 上位:83/下位:bf
     * (0x83bf) ～ 上位:83/下位:d6 (0x83d6) ○ロシア文字 上位:84/下位:40 (0x8440) ～
     * 上位:84/下位:60 (0x8460) 上位:84/下位:70 (0x8470) ～ 上位:84/下位:91 (0x8491)
     *
     * @param checkStr 検査対象文字列
     *
     * @return String checkStr：正常終了(検査対象文字列を返却) String ""      ：範囲対象外
     */
    public static String jisCheck(String checkStr) {
        for (int cnt = 0; cnt < checkStr.length(); cnt++) {
            int beginIndex = cnt;
            int endIndex = cnt + 1;
            String word = null;
            int i_sts = 0;

            word = checkStr.substring(beginIndex, endIndex);

            if (FxpUtil.checkZenkaku(word)) {
                byte[] bbb = word.getBytes();

                //int bbb_1 = (int)bbb[0];
                //int bbb_2 = (int)bbb[1];
                int b_high = new Integer((bbb[0] & 0xFF)).intValue();
                int b_low = new Integer((bbb[1] & 0xFF)).intValue();

                //                    変換対象チェック
                // ＳＪＩＳ文字範囲チェック
                // --上位バイトのチェック
                if ((b_high >= 129) || (b_high <= 159)) {
                    i_sts = 0;
                } else if ((b_high >= 224) || (b_high <= 252)) {
                    i_sts = 0;
                } else {
                    return "";
                }

                // --下位バイトのチェック
                if ((b_low >= 64) && (b_low <= 126)) {
                    i_sts = 0;
                } else if ((b_low >= 128) && (b_low <= 252)) {
                    i_sts = 0;
                } else {
                    return "";
                }

                // 使用可能文字判定
                int i_chk = 0;
                int b_wk = (b_high * 256) + b_low;

                // 英数字／記号
                if (((b_wk >= 33088) && (b_wk <= 33196))
                        || ((b_wk >= 33359) && (b_wk <= 33368))
                        || ((b_wk >= 33376) && (b_wk <= 33401))
                        || ((b_wk >= 33409) && (b_wk <= 33434))) {
                    i_chk = 1;
                } else if (((b_wk >= 33439) && (b_wk <= 33521))
                        || ((b_wk >= 33600) && (b_wk <= 33686))) { // かな／カナ
                    i_chk = 1;
                }
                // ギリシャ文字
                else if (((b_wk >= 33695) && (b_wk <= 33702))
                        || ((b_wk >= 33727) && (b_wk <= 33750))) {
                    i_chk = 1;
                }
                // ロシア文字
                else if (((b_wk >= 33856) && (b_wk <= 33888))
                        || ((b_wk >= 33904) && (b_wk <= 33937))) {
                    i_chk = 1;
                }

                //禁止文字チェックロジックの改訂_#4305によりチェック解除_20170419
                // ＪＩＳ漢字第一水準
                else if ((b_wk >= 34975) && (b_wk <= 39026)) {
                    if (b_wk == 35780) { // 尭(0x8bc4)の場合
                        //i_chk = 0;
                        i_chk = 1;
                    } else if (b_wk == 38538) { // 槙(0x968a)の場合
                        //i_chk = 0;
                        i_chk = 1;
                    } else if (b_wk == 38777) { // 遥(0x9779)の場合
                        //i_chk = 0;
                        i_chk = 1;
                    } else {
                        i_chk = 1;
                    }
                }
                // ＪＩＳ漢字第二水準
                else if ((b_wk >= 39071) && (b_wk <= 60066)) {
                    if (b_wk == 57588) { // 瑶(0xe0f4)の場合
                        //i_chk = 0;
                        i_chk = 1;
                    } else {
                        i_chk = 1;
                    }
                }

                // 使用不可文字の場合には処理を終了
                if (i_chk == 0) {
                    return "";
                }
            }
        }

        return checkStr;
    }

    /**
     * 引数で渡された日付文字列を、引数year分だけ年を加算、または減算した
     * 日付文字列を戻します。
     * <p>
     * （例）<br>
     * 引数 date : "2005/01/01"、year : 2 の場合の戻り値 : "2007/01/01"<br>
     * 引数 date : "2007/08/05"、year : -2 の場合の戻り値 : "2005/08/05"<br>
     * 引数 date : "2008/02/29"、year : -2 の場合の戻り値 : "2006/02/28"
     * </p>
     *
     * @param date 対象日付文字列
     * @param year 加算、または減算する量（年）
     * @return 変更された日付文字列（yyyy/MM/dd形式）
     */
    public static String addYear(String date, int year) {
        return addYmd(Calendar.YEAR, date, year);
    }

    /**
     * date の日付に対して、数ヶ月ずらすことができる。 date = 2006/11/01 tsuki = 3 →
     * 2007/02/01 date = 2006/11/01 tsuki = -3 → 2006/08/01
     *
     * @param date 日付　yyyy/MM/dd
     * @param tsuki 月数 プラスの場合 1,2,3 マイナスの場合 -1,-2,-3
     *
     * @return 変更された日付 yyyy/MM/dd
     */
    public static String getTsuki(String date, int tsuki) {
        return addYmd(Calendar.MONTH, date, tsuki);
    }

    /**
     * date の日付に対して、数日ずらすことができる。
     *
     * @param date 日付　yyyy/MM/dd
     * @param dd 日数 プラスの場合 1,2,3 マイナスの場合 -1,-2,-3
     *
     * @return 変更された日付 yyyy/MM/dd
     */
    public static String addDay(String date, int dd) {
        return addYmd(Calendar.DATE, date, dd);
    }

    /**
     * dateの日付に対し指定フィールドを＋－する
     *
     * @param field Calendar.DATE : 日、 Calendar.MONTH ：月、Calendar.YEAR ：年
     * @param date 日付　yyyy/MM/dd
     * @param dd 加減数 プラスの場合 1,2,3 マイナスの場合 -1,-2,-3
     *
     * @return 変更された日付 yyyy/MM/dd
     */
    private static String addYmd(int field, String date, int dd) {
        int year = 0;
        int mon = 0;
        int day = 0;

        Calendar cal = Calendar.getInstance();
        cal.clear();

        year = Integer.parseInt(date.substring(0, 4));
        mon = Integer.parseInt(date.substring(5, 7)) - 1;
        day = Integer.parseInt(date.substring(8, 10));

        cal.set(year, mon, day);

        // 変換前の日付が月末の場合は、差し引きした結果も月末になるようにする。（年または月の加減の場合。）
        if (cal.getActualMaximum(Calendar.DAY_OF_MONTH) == day
                        && (field == Calendar.YEAR || field == Calendar.MONTH)) {
            cal.add(field, dd);
            cal.set(Calendar.DAY_OF_MONTH,
                cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        } else {
            cal.add(field, dd);
        }

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");

        return fmt.format(cal.getTime());
    }

    /**
     * PB.カラムグループコード「DATE_HOUR」のマスクを使用した
     * 入力項目から「時」を削除し、Timestamp型で返却します。
     *
     * @param arg ：画面入力値「yyyy/MM/dd hh時」
     *
     * @return 変換したTimestamp「yyyy-MM-dd hh:00:00.000000000」
     */
    public static Timestamp getTimeStampClmGpCdDATEHOUR(String arg) {
        String wkStr =
            (arg.replaceAll("時", ":00:00.000000000")).replaceAll("/", "-");
        Timestamp ts = getTimeStamp(wkStr);

        return ts;
    }

    /**
     * userIdからWebs用LoginCdを生成して返す。
     * ZZSTB004の検索に使用する。
     * compGpCd、compCd、userIdをそのまま連結した物を返す。
     * @param userId userId
     * @param compGpCd compGpCd
     * @param compCd compCd
     * @return compGpCd + compCd + userId
     */
    public static String getWebsLoginCd(String userId, String compGpCd, String compCd) {

        String loginCd = userId;

        if (loginCd.length() < 11) {
            loginCd = compGpCd + compCd + userId;
        }

        return loginCd;
    }

    /**
     * userIdからFusion用LoginCdを生成して返す。ZZSTB004の検索に使用する。
     * UserIdを１０ケタに0埋めして、compGpCd、compCdと連結した物を返す。
     *
     * @param userId userId
     * @param compGpCd compGpCD
     * @param compCd compCD
     * @return compGpCd + compCd + userId(10ケタに0埋め)
     */
    public static String getFusionLoginCd(String userId, String compGpCd, String compCd) {

        String loginCd = userId;

        if (loginCd.length() < 11) {
            while (loginCd.length() < 10) {
                loginCd = "0" + loginCd;
            }

            loginCd = compGpCd + compCd + loginCd;
        }

        return loginCd;
    }

}
