package com.dpi.financial.ftcom.utility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by roohi on 5/25/14.
 * @since ver 2.1.1 modified by Hossein Mohammadi w.r.t Bug #11153 as on Sunday, March 08, 2015
 * @since ver-1.4.6 by chetan w.r.t Issue #5690 as on 28 June 2014
 */
public class UTF2AtmScreen {
    static String config="\u0627,204,205,205,204\n" +
            "\u0626,207,208,213,210\n" +
            "\u0622,211,211,211,211\n" +
            "\u0654,212,206,206,212\n" +
            "\u0628,214,215,216,217\n" +
            "\u067e,218,219,220,221\n" +
            "\u062a,222,223,224,225\n" +
            "\u062b,226,227,228,229\n" +
            "\u062c,230,231,232,233\n" +
            "\u0686,234,235,236,237\n" +
            "\u062d,238,239,240,241\n" +
            "\u062e,71,72,73,74\n" +
            "\u062f,75,76,76,75\n" +
            "\u0630,77,78,78,77\n" +
            "\u0631,79,80,80,79\n" +
            "\u0632,81,82,82,81\n" +
            "\u0698,83,84,84,83\n" +
            "\u0633,85,86,87,88\n" +
            "\u0634,89,90,91,92\n" +
            "\u0635,93,94,95,96\n" +
            "\u0636,97,98,99,100\n" +
            "\u0637,101,102,103,104\n" +
            "\u0638,105,106,107,108\n" +
            "\u0639,109,110,111,112\n" +
            "\u063a,113,114,115,116\n" +
            "\u0641,117,118,119,120\n" +
            "\u0642,121,122,123,124\n" +
            "\u06a9,174,175,176,177\n" +
            "\u06af,178,179,180,181\n" +
            "\u0644,182,183,184,185\n" +
            "\u0645,186,187,188,189\n" +
            "\u0646,190,191,192,193\n" +
            "\u0648,194,195,195,194\n" +
            "\u0647,196,197,198,199\n" +
            "\u064a,200,201,202,203\n" +
            "\u06cc,200,201,202,203";

    // Since ver 2.1.1 modified by Hossein Mohammadi w.r.t Bug #11153 as on Sunday, March 08, 2015
    static String othercfg="0,48\n" +
            "1,49\n" +
            "2,50\n" +
            "3,51\n" +
            "4,52\n" +
            "5,53\n" +
            "6,54\n" +
            "7,55\n" +
            "8,56\n" +
            "9,57\n" +
            "+,43\n" +
            "\u066a,37\n" +
            "/,47\n" +
            ",,44\n" +
            ".,46\n" +
            ":,58\n" +
            "*,42\n" +
            "-,45\n" +
            "\u060c,44\n" +
            "\u061f,42\n" +
            "\u0621,207\n";

    static Map<String,String[]> configMap=new HashMap<String,String[]>();
    static{
        String[] ss=config.split("\n");
        for (int i = 0; i < ss.length; i++) {
            String s = ss[i];
            String[] sss=s.split(",");
            configMap.put(sss[0],sss);
        }
    }
    static Map<String,String> otherConfigMap=new HashMap<String, String>();
    static{
        String[] ss=othercfg.split("\n");
        for (int i = 0; i < ss.length; i++) {
            String s = ss[i];
            String[] sss=s.split(",");
            otherConfigMap.put(sss[0],sss[1]);
        }
    }
    static String badiMichasbe="\u0628\u067e\u062a\u062b\u062c\u0686\u062d\u062e\u0633\u0634\u0635\u0636\u0637\u0638\u0639\u063a\u0641\u0642\u06a9\u06af\u0644\u0645\u0646\u0647\u06cc\u0626\u0643\u064a";
    static String ghabliMichasbe="\u0627\u0628\u067e\u062a\u062b\u062c\u0686\u062d\u062e\u062f\u0630\u0631\u0632\u0698\u0633\u0634\u0635\u0636\u0637\u0638\u0639\u063a\u0641\u0642\u06a9\u06af\u0644\u0645\u0646\u0648\u0647\u06cc\u0625\u064a\u0626\u0643";
    static boolean isBadiMichasbe(String s,int index,String str){
        if(
                s!=null &&
                        configMap.containsKey(s) &&
                        index<str.length()-1 &&
                        ghabliMichasbe.contains(String.valueOf(str.charAt(index + 1)))
                )
            return true;
        return false;
    }
    static boolean isGhabliMichasbe(String s,int index,String str){
        if(
                s!=null &&
                        configMap.containsKey(s) &&
                        index>0 &&
                        badiMichasbe.contains(String.valueOf(str.charAt(index-1)))
                )
            return true;
        return false;
    }
    public static String convert(String s){
        if(s==null || s.length()==0)
            return "";
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String chr= String.valueOf(s.charAt(i));
            boolean isBadiMichasbe=isBadiMichasbe(chr, i, s);
            boolean isGhabliMichasbe=isGhabliMichasbe(chr, i, s);

            if(configMap.containsKey(chr)) {
                if (isBadiMichasbe && isGhabliMichasbe)
                    res.append((char)Integer.parseInt(configMap.get(chr)[2]));
                else if (isBadiMichasbe && !isGhabliMichasbe)
                    res.append((char)Integer.parseInt(configMap.get(chr)[4]));
                else if (!isBadiMichasbe && isGhabliMichasbe)
                    res.append((char)Integer.parseInt(configMap.get(chr)[3]));
                else if (!isBadiMichasbe && !isGhabliMichasbe)
                    res.append((char)Integer.parseInt(configMap.get(chr)[1]));
            }else if(otherConfigMap.containsKey(chr))
                res.append((char)Integer.parseInt(otherConfigMap.get(chr)));
            else
                res.append("*");
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String c=convert("\u0633\u0644123\u0627\u0645 \u0645\u062c\u06cc\u062f \u062c\u0648\u0646");
        System.out.println(c);
    }

}
