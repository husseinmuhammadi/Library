package com.dpi.financial.ftcom.utility.atm;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;

/**
 * @author chetann
 */
public class AtmNdcEnv {

    private static final String BUNDLE_NAME = "com.en.datavsn.EFTswitch.config.atmndc";

    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

    private static final String STATE_LOAD_FILE = "state.load.file";

    private static final String SCREEN_LOAD_FILE = "screen.load.file";

    private static final String CONFIG_LOAD_FILE = "config.load.file";

    private static final String FIT_LOAD_FILE = "fit.load.file";

    private static final String HARDWARE_CONFIG = "hardware.config";

    private static final String ISO_REP_CODE_MAPPING = "iso.rep.code.mapping";

    private static final String TRANS_CODE_MAPPING = "trans.code.mapping";

    // Since ver 2.1.9 modified by Hossein w.r.t bug #13500 as on Saturday, January 14, 2017
    private static final String TERMINAL_CONFIGURATION_MANAGER = "terminal.configuration.manager";

    private static final String RECEIPT_HEADER = "receipt.header";

    private static final String RECEIPT_FOOTER = "receipt.footer";

    private static final String NDC_BASE_PATH = "ndc.base.path";

    //added by vikram wrt issue #5838 as on 11 June 2014
    private static final String ENH_CONFIG_LOAD_FILE = "enh.config.load.file";

    private static HashMap envHm_c;

    static {
        envHm_c = loadContextProperties();
    }

    private static HashMap loadContextProperties() {
        HashMap envHm = new HashMap();
        Enumeration keys = RESOURCE_BUNDLE.getKeys();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            key = key.trim();
            String value = RESOURCE_BUNDLE.getString(key);
            value = value.trim();
            envHm.put(key, value);
        }
        return envHm;
    }

    public static String getScreenLoadFile() {
        return (String) envHm_c.get(SCREEN_LOAD_FILE);
    }

    public static String getStateLoadFile() {
        return (String) envHm_c.get(STATE_LOAD_FILE);
    }

    public static String getConfigLoadFile() {
        return (String) envHm_c.get(CONFIG_LOAD_FILE);
    }

    public static String getFitLoadFile() {
        return (String) envHm_c.get(FIT_LOAD_FILE);
    }

    public static String getHardwareConigFile() {
        return (String) envHm_c.get(HARDWARE_CONFIG);
    }

    // Since ver 2.1.9 modified by Hossein w.r.t bug #13500 as on Saturday, January 14, 2017
    public static String getTerminalConfigurationManager() {
        return (String) envHm_c.get(TERMINAL_CONFIGURATION_MANAGER);
    }

    public static String getISOResCodeMappingFile() {
        return (String) envHm_c.get(ISO_REP_CODE_MAPPING);
    }

    public static String getTransCodeMappingFile() {
        return (String) envHm_c.get(TRANS_CODE_MAPPING);
    }

    public static String getReceiptFooter() {
        return (String) envHm_c.get(RECEIPT_FOOTER);
    }

    public static String getReceiptHeader() {
        return (String) envHm_c.get(RECEIPT_HEADER);
    }

    public static String getNdcBasePath() {
        return (String) envHm_c.get(NDC_BASE_PATH);
    }

    //added by vikram wrt issue #5838 as on 11 june 2014
    public static String getEnhConfigLoadFile() {
        return (String) envHm_c.get(ENH_CONFIG_LOAD_FILE);
    }
}
