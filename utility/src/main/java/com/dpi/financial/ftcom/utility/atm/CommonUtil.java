package com.dpi.financial.ftcom.utility.atm;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author chetann
 */
public class CommonUtil /*extends Log*/ {

    // private Logger errorLogger = Logger.getLogger("errordetailslog");

    public static String hexStringToDecimalString(String hexString) {

        String decimalString = "";

        // First Split each 2 hex characters
        Pattern pattern = Pattern.compile("..");
        Matcher myMatcher = pattern.matcher(hexString);
        ArrayList allMatches = new ArrayList();
        while (myMatcher.find()) {
            allMatches.add(myMatcher.group());
        }
        Object[] data1 = allMatches.toArray();

        // convert each 2 hex character to decimal
        for (int i = 0; i < data1.length; i++) {
            decimalString = decimalString + String.format("%03d", hexToDecimal(data1[i].toString()));
        }
        return decimalString;
    }

    public static int hexToDecimal(String hexString) {
        return hexToDecimal(hexString, 0, hexString.length() - 1);
    }

    public static int hexToDecimal(String hexString, int end, int hexLength) {
        if (hexLength < end)
            return 0;
        else {
            int decValue;
            if (hexString.charAt(hexLength) == 'A')
                decValue = 10;
            else if (hexString.charAt(hexLength) == 'B')
                decValue = 11;
            else if (hexString.charAt(hexLength) == 'C')
                decValue = 12;
            else if (hexString.charAt(hexLength) == 'D')
                decValue = 13;
            else if (hexString.charAt(hexLength) == 'E')
                decValue = 14;
            else if (hexString.charAt(hexLength) == 'F')
                decValue = 15;
            else
                decValue = hexString.charAt(hexLength) - '0';

            return hexToDecimal(hexString, end, hexLength - 1) * 16 + decValue;
        }
    }

    public static String graphic2hex(String s) {
        String graphicDigits = "0123456789:;<=>?";
        String hexDigits = "0123456789ABCDEF";
        s = s.toUpperCase();
        String hexString = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = graphicDigits.indexOf(c);
            char val = hexDigits.charAt(d);
            hexString = hexString + val;
        }
        return hexString;
    }

    /**
     * Added by Chetan wrt Issue #4680, as on 11 Mar 2014
     * Parse Util Date
     *
     * @param strDate
     * @param format
     * @return
     * @throws Exception
     */
    private static java.util.Date parseUtilDate(String strDate, String format)
            throws Exception {
        java.util.Date retDt = null;
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        retDt = sdf.parse(strDate);
        return retDt;
    }

    /**
     * Added by Chetan wrt Bug #4999 as on 12 April 2014
     * Remove Track2 data start and end sentimental delimiter if present
     *
     * @param track2Data
     * @return
     */
    public static String getTrack2DataWithoutSentimental(String track2Data) {
        String newTrack2Data = "";
        boolean isStartsentimentalNumber = isNumeric(track2Data.substring(0, 1));
        boolean isEndsentimentalNumber = false;
        if (isStartsentimentalNumber) {
            newTrack2Data = track2Data;
        } else {
            newTrack2Data = track2Data.substring(1);
        }

        isEndsentimentalNumber = isNumeric(newTrack2Data.substring(newTrack2Data.length() - 1));
        if (!isEndsentimentalNumber) {
            newTrack2Data = newTrack2Data.substring(0, newTrack2Data.length() - 1);
        }

        return newTrack2Data;

    }

    /**
     * Added by Chetan wrt Bug #4999 as on 12 April 2014
     * Check isNumber
     *
     * @param str
     * @return
     */
    public static boolean isNumeric(String str) {
        try {
            int d = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
