package com.dpi.financial.ftcom.utility.expression;

import java.text.FieldPosition;
import java.text.MessageFormat;
import java.util.Locale;

/**
 * Created by h.mohammadi on 5/11/2017.
 */
public class MessageUtils {

    /**
     * http://stackoverflow.com/questions/10142892/how-to-customize-currency-formatting-in-messageformat-in-icu4j     *
     *
     * @param pattern
     * @param locale
     * @param args
     * @return
     */
    public static String format(String pattern, Locale locale, Object... args) {
        final String emptyPattern = "";
        final FieldPosition zero = new FieldPosition(0);
        MessageFormat fmt = new MessageFormat(emptyPattern, locale);
        StringBuffer buf = new StringBuffer(); // I just love it...

        fmt.applyPattern(pattern);
        fmt.format(args, buf, zero);

        return buf.toString();
    }

    /**
     * https://kodejava.org/how-do-i-format-a-message-that-contains-number-information/
     *
     * @param amount
     * @return
     */
    public static String formatCurrency(Double amount) {
        return MessageFormat.format("[{0,number,currency}]", amount);
    }
}
