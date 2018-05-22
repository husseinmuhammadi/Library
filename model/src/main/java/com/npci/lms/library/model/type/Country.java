package com.npci.lms.library.model.type;

import com.npci.lms.library.model.exception.TypeNotFoundException;

import java.text.MessageFormat;

/**
 * This data represent filed 19 (country code)
 * TODO complete it with ISO 3166
 * TODO complete it as enums in MTI
 */
public enum Country {
    Afghanistan(4, "AF", "AFG", "Afghanistan"),
    Albania(8, "AL", "ALB", "Albania, People's Socialist Republic of"),
    Algeria(12, "DZ", "DZA", "Algeria, People's Democratic Republic of"),
    American_Samoa(16, "AS", "ASM", "American Samoa"),
    Andorra(20, "AD", "AND", "Andorra, Principality of"),
    Angola(24, "AO", "AGO", "Angola, Republic of"),
    Anguilla(660, "AI", "AIA", "Anguilla"),
    Antarctica_(10, "AQ", "ATA", "Antarctica (the territory South of 60 deg S)"),
    Antigua_and_Barbuda(28, "AG", "ATG", "Antigua and Barbuda"),
    Argentina(32, "AR", "ARG", "Argentina, Argentine Republic"),
    Armenia(51, "AM", "ARM", "Armenia"),
    Aruba(533, "AW", "ABW", "Aruba"),
    Australia(36, "AU", "AUS", "Australia, Commonwealth of"),
    Austria(40, "AT", "AUT", "Austria, Republic of"),
    Azerbaijan(31, "AZ", "AZE", "Azerbaijan, Republic of"),
    Bahamas(44, "BS", "BHS", "Bahamas, Commonwealth of the"),
    Bahrain(48, "BH", "BHR", "Bahrain, Kingdom of"),
    Bangladesh(50, "BD", "BGD", "Bangladesh, People's Republic of"),
    Barbados(52, "BB", "BRB", "Barbados"),
    Belarus(112, "BY", "BLR", "Belarus"),
    Belgium(56, "BE", "BEL", "Belgium, Kingdom of"),
    Belize(84, "BZ", "BLZ", "Belize"),
    Benin(204, "BJ", "BEN", "Benin, People's Republic of"),
    Bermuda(60, "BM", "BMU", "Bermuda"),
    Bhutan(64, "BT", "BTN", "Bhutan, Kingdom of"),
    Bolivia(68, "BO", "BOL", "Bolivia, Republic of"),
    Bosnia_and_Herzegovina(70, "BA", "BIH", "Bosnia and Herzegovina"),
    Botswana(72, "BW", "BWA", "Botswana, Republic of"),
    Bouvet_Island_(74, "BV", "BVT", "Bouvet Island (Bouvetoya)"),
    Brazil(76, "BR", "BRA", "Brazil, Federative Republic of"),
    British_Indian_Ocean_Territory_(86, "IO", "IOT", "British Indian Ocean Territory (Chagos Archipelago)"),
    British_Virgin_Islands(92, "VG", "VGB", "British Virgin Islands"),
    Brunei_Darussalam(96, "BN", "BRN", "Brunei Darussalam"),
    Bulgaria(100, "BG", "BGR", "Bulgaria, People's Republic of"),
    Burkina_Faso(854, "BF", "BFA", "Burkina Faso"),
    Burundi(108, "BI", "BDI", "Burundi, Republic of"),
    Cambodia(116, "KH", "KHM", "Cambodia, Kingdom of"),
    Cameroon(120, "CM", "CMR", "Cameroon, United Republic of"),
    Canada(124, "CA", "CAN", "Canada"),
    Cape_Verde(132, "CV", "CPV", "Cape Verde, Republic of"),
    Cayman_Islands(136, "KY", "CYM", "Cayman Islands"),
    Central_African_Republic(140, "CF", "CAF", "Central African Republic"),
    Chad(148, "TD", "TCD", "Chad, Republic of"),
    Chile(152, "CL", "CHL", "Chile, Republic of"),
    China(156, "CN", "CHN", "China, People's Republic of"),
    Christmas_Island(162, "CX", "CXR", "Christmas Island"),
    Cocos_(166, "CC", "CCK", "Cocos (Keeling) Islands"),
    Colombia(170, "CO", "COL", "Colombia, Republic of"),
    Comoros(174, "KM", "COM", "Comoros, Union of the"),
    Congo_Democratic_Republic_of_(180, "CD", "COD", "Congo, Democratic Republic of"),
    Congo_Peoples_Republic_of(178, "CG", "COG", "Congo, People's Republic of"),
    Cook_Islands(184, "CK", "COK", "Cook Islands"),
    Costa_Rica(188, "CR", "CRI", "Costa Rica, Republic of"),
    Cote_DIvoire(384, "CI", "CIV", "Cote D'Ivoire, Ivory Coast, Republic of the"),
    Cuba(192, "CU", "CUB", "Cuba, Republic of"),
    Cyprus(196, "CY", "CYP", "Cyprus, Republic of"),
    Czech_Republic(203, "CZ", "CZE", "Czech Republic"),
    Denmark(208, "DK", "DNK", "Denmark, Kingdom of"),
    Djibouti(262, "DJ", "DJI", "Djibouti, Republic of"),
    Dominica(212, "DM", "DMA", "Dominica, Commonwealth of"),
    Dominican_Republic(214, "DO", "DOM", "Dominican Republic"),
    Ecuador(218, "EC", "ECU", "Ecuador, Republic of"),
    Egypt(818, "EG", "EGY", "Egypt, Arab Republic of"),
    El_Salvador(222, "SV", "SLV", "El Salvador, Republic of"),
    Equatorial_Guinea(226, "GQ", "GNQ", "Equatorial Guinea, Republic of"),
    Eritrea(232, "ER", "ERI", "Eritrea"),
    Estonia(233, "EE", "EST", "Estonia"),
    Ethiopia(231, "ET", "ETH", "Ethiopia"),
    Faeroe_Islands(234, "FO", "FRO", "Faeroe Islands"),
    Falkland_Islands_(238, "FK", "FLK", "Falkland Islands (Malvinas)"),
    Fiji(242, "FJ", "FJI", "Fiji, Republic of the Fiji Islands"),
    Finland(246, "FI", "FIN", "Finland, Republic of"),
    France(250, "FR", "FRA", "France, French Republic"),
    French_Guiana(254, "GF", "GUF", "French Guiana"),
    French_Polynesia(258, "PF", "PYF", "French Polynesia"),
    French_Southern_Territories(260, "TF", "ATF", "French Southern Territories"),
    Gabon(266, "GA", "GAB", "Gabon, Gabonese Republic"),
    Gambia(270, "GM", "GMB", "Gambia, Republic of the"),
    Georgia(268, "GE", "GEO", "Georgia"),
    Germany(276, "DE", "DEU", "Germany"),
    Ghana(288, "GH", "GHA", "Ghana, Republic of"),
    Gibraltar(292, "GI", "GIB", "Gibraltar"),
    Greece(300, "GR", "GRC", "Greece, Hellenic Republic"),
    Greenland(304, "GL", "GRL", "Greenland"),
    Grenada(308, "GD", "GRD", "Grenada"),
    Guadaloupe(312, "GP", "GLP", "Guadaloupe"),
    Guam(316, "GU", "GUM", "Guam"),
    Guatemala(320, "GT", "GTM", "Guatemala, Republic of"),
    Guinea(324, "GN", "GIN", "Guinea, Revolutionary People's Rep'c of"),
    Guinea_Bissau(624, "GW", "GNB", "Guinea-Bissau, Republic of"),
    Guyana(328, "GY", "GUY", "Guyana, Republic of"),
    Haiti(332, "HT", "HTI", "Haiti, Republic of"),
    Heard_and_McDonald_Islands(334, "HM", "HMD", "Heard and McDonald Islands"),
    Holy_See_(336, "VA", "VAT", "Holy See (Vatican City State)"),
    Honduras(340, "HN", "HND", "Honduras, Republic of"),
    Hong_Kong(344, "HK", "HKG", "Hong Kong, Special Administrative Region of China"),
    Hrvatska_(191, "HR", "HRV", "Hrvatska (Croatia)"),
    Hungary(348, "HU", "HUN", "Hungary, Hungarian People's Republic"),
    Iceland(352, "IS", "ISL", "Iceland, Republic of"),
    India(356, "IN", "IND", "India, Republic of"),
    Indonesia(360, "ID", "IDN", "Indonesia, Republic of"),
    Iran(364, "IR", "IRN", "Iran, Islamic Republic of"),
    Iraq(368, "IQ", "IRQ", "Iraq, Republic of"),
    Ireland(372, "IE", "IRL", "Ireland"),
    Israel(376, "IL", "ISR", "Israel, State of"),
    Italy(380, "IT", "ITA", "Italy, Italian Republic"),
    Jamaica(388, "JM", "JAM", "Jamaica"),
    Japan(392, "JP", "JPN", "Japan"),
    Jordan(400, "JO", "JOR", "Jordan, Hashemite Kingdom of"),
    Kazakhstan(398, "KZ", "KAZ", "Kazakhstan, Republic of"),
    Kenya(404, "KE", "KEN", "Kenya, Republic of"),
    Kiribati(296, "KI", "KIR", "Kiribati, Republic of"),
    Korea_Democratic_Peoples_Republic_of(408, "KP", "PRK", "Korea, Democratic People's Republic of"),
    Korea_Republic_of(410, "KR", "KOR", "Korea, Republic of"),
    Kuwait(414, "KW", "KWT", "Kuwait, State of"),
    Kyrgyz_Republic(417, "KG", "KGZ", "Kyrgyz Republic"),
    Lao_Peoples_Democratic_Republic(418, "LA", "LAO", "Lao People's Democratic Republic"),
    Latvia(428, "LV", "LVA", "Latvia"),
    Lebanon(422, "LB", "LBN", "Lebanon, Lebanese Republic"),
    Lesotho(426, "LS", "LSO", "Lesotho, Kingdom of"),
    Liberia(430, "LR", "LBR", "Liberia, Republic of"),
    Libyan_Arab_Jamahiriya(434, "LY", "LBY", "Libyan Arab Jamahiriya"),
    Liechtenstein(438, "LI", "LIE", "Liechtenstein, Principality of"),
    Lithuania(440, "LT", "LTU", "Lithuania"),
    Luxembourg(442, "LU", "LUX", "Luxembourg, Grand Duchy of"),
    Macao(446, "MO", "MAC", "Macao, Special Administrative Region of China"),
    Macedonia(807, "MK", "MKD", "Macedonia, the former Yugoslav Republic of"),
    Madagascar(450, "MG", "MDG", "Madagascar, Republic of"),
    Malawi(454, "MW", "MWI", "Malawi, Republic of"),
    Malaysia(458, "MY", "MYS", "Malaysia"),
    Maldives(462, "MV", "MDV", "Maldives, Republic of"),
    Mali(466, "ML", "MLI", "Mali, Republic of"),
    Malta(470, "MT", "MLT", "Malta, Republic of"),
    Marshall_Islands(584, "MH", "MHL", "Marshall Islands"),
    Martinique(474, "MQ", "MTQ", "Martinique"),
    Mauritania(478, "MR", "MRT", "Mauritania, Islamic Republic of"),
    Mauritius(480, "MU", "MUS", "Mauritius"),
    Mayotte(175, "YT", "MYT", "Mayotte"),
    Mexico(484, "MX", "MEX", "Mexico, United Mexican States"),
    Micronesia(583, "FM", "FSM", "Micronesia, Federated States of"),
    Moldova(498, "MD", "MDA", "Moldova, Republic of"),
    Monaco(492, "MC", "MCO", "Monaco, Principality of"),
    Mongolia(496, "MN", "MNG", "Mongolia, Mongolian People's Republic"),
    Montserrat(500, "MS", "MSR", "Montserrat"),
    Morocco(504, "MA", "MAR", "Morocco, Kingdom of"),
    Mozambique(508, "MZ", "MOZ", "Mozambique, People's Republic of"),
    Myanmar(104, "MM", "MMR", "Myanmar"),
    Namibia(516, "NA", "NAM", "Namibia"),
    Nauru(520, "NR", "NRU", "Nauru, Republic of"),
    Nepal(524, "NP", "NPL", "Nepal, Kingdom of"),
    Netherlands_Antilles(530, "AN", "ANT", "Netherlands Antilles"),
    Netherlands(528, "NL", "NLD", "Netherlands, Kingdom of the"),
    New_Caledonia(540, "NC", "NCL", "New Caledonia"),
    New_Zealand(554, "NZ", "NZL", "New Zealand"),
    Nicaragua(558, "NI", "NIC", "Nicaragua, Republic of"),
    Niger(562, "NE", "NER", "Niger, Republic of the"),
    Nigeria(566, "NG", "NGA", "Nigeria, Federal Republic of"),
    Niue(570, "NU", "NIU", "Niue, Republic of"),
    Norfolk_Island(574, "NF", "NFK", "Norfolk Island"),
    Northern_Mariana_Islands(580, "MP", "MNP", "Northern Mariana Islands"),
    Norway(578, "NO", "NOR", "Norway, Kingdom of"),
    Oman(512, "OM", "OMN", "Oman, Sultanate of"),
    Pakistan(586, "PK", "PAK", "Pakistan, Islamic Republic of"),
    Palau(585, "PW", "PLW", "Palau"),
    Palestinian_Territory(275, "PS", "PSE", "Palestinian Territory, Occupied"),
    Panama(591, "PA", "PAN", "Panama, Republic of"),
    Papua_New_Guinea(598, "PG", "PNG", "Papua New Guinea"),
    Paraguay(600, "PY", "PRY", "Paraguay, Republic of"),
    Peru(604, "PE", "PER", "Peru, Republic of"),
    Philippines(608, "PH", "PHL", "Philippines, Republic of the"),
    Pitcairn_Island(612, "PN", "PCN", "Pitcairn Island"),
    Poland(616, "PL", "POL", "Poland, Polish People's Republic"),
    Portugal(620, "PT", "PRT", "Portugal, Portuguese Republic"),
    Puerto_Rico(630, "PR", "PRI", "Puerto Rico"),
    Qatar(634, "QA", "QAT", "Qatar, State of"),
    Reunion(638, "RE", "REU", "Reunion"),
    Romania(642, "RO", "ROU", "Romania, Socialist Republic of"),
    Russian_Federation(643, "RU", "RUS", "Russian Federation"),
    Rwanda(646, "RW", "RWA", "Rwanda, Rwandese Republic"),
    St_Helena(654, "SH", "SHN", "St. Helena"),
    St_Kitts_and_Nevis(659, "KN", "KNA", "St. Kitts and Nevis"),
    St_Lucia(662, "LC", "LCA", "St. Lucia"),
    St_Pierre_and_Miquelon(666, "PM", "SPM", "St. Pierre and Miquelon"),
    St_Vincent_and_the_Grenadines(670, "VC", "VCT", "St. Vincent and the Grenadines"),
    Samoa(882, "WS", "WSM", "Samoa, Independent State of"),
    San_Marino(674, "SM", "SMR", "San Marino, Republic of"),
    Sao_Tome_and_Principe(678, "ST", "STP", "Sao Tome and Principe, Democratic Republic of"),
    Saudi_Arabia(682, "SA", "SAU", "Saudi Arabia, Kingdom of"),
    Senegal(686, "SN", "SEN", "Senegal, Republic of"),
    Serbia_and_Montenegro(891, "CS", "SCG", "Serbia and Montenegro"),
    Seychelles(690, "SC", "SYC", "Seychelles, Republic of"),
    Sierra_Leone(694, "SL", "SLE", "Sierra Leone, Republic of"),
    Singapore(702, "SG", "SGP", "Singapore, Republic of"),
    Slovakia_(703, "SK", "SVK", "Slovakia (Slovak Republic)"),
    Slovenia(705, "SI", "SVN", "Slovenia"),
    Solomon_Islands(90, "SB", "SLB", "Solomon Islands"),
    Somalia(706, "SO", "SOM", "Somalia, Somali Republic"),
    South_Africa(710, "ZA", "ZAF", "South Africa, Republic of"),
    South_Georgia_and_the_South_Sandwich_Islands(239, "GS", "SGS", "South Georgia and the South Sandwich Islands"),
    Spain(724, "ES", "ESP", "Spain, Spanish State"),
    Sri_Lanka(144, "LK", "LKA", "Sri Lanka, Democratic Socialist Republic of"),
    Sudan(736, "SD", "SDN", "Sudan, Democratic Republic of the"),
    Suriname(740, "SR", "SUR", "Suriname, Republic of"),
    Svalbard__Jan_Mayen_Islands(744, "SJ", "SJM", "Svalbard & Jan Mayen Islands"),
    Swaziland(748, "SZ", "SWZ", "Swaziland, Kingdom of"),
    Sweden(752, "SE", "SWE", "Sweden, Kingdom of"),
    Switzerland(756, "CH", "CHE", "Switzerland, Swiss Confederation"),
    Syrian_Arab_Republic(760, "SY", "SYR", "Syrian Arab Republic"),
    Taiwan(158, "TW", "TWN", "Taiwan, Province of China"),
    Tajikistan(762, "TJ", "TJK", "Tajikistan"),
    Tanzania(834, "TZ", "TZA", "Tanzania, United Republic of"),
    Thailand(764, "TH", "THA", "Thailand, Kingdom of"),
    Timor_Leste(626, "TL", "TLS", "Timor-Leste, Democratic Republic of"),
    Togo(768, "TG", "TGO", "Togo, Togolese Republic"),
    Tokelau_(772, "TK", "TKL", "Tokelau (Tokelau Islands)"),
    Tonga(776, "TO", "TON", "Tonga, Kingdom of"),
    Trinidad_and_Tobago(780, "TT", "TTO", "Trinidad and Tobago, Republic of"),
    Tunisia(788, "TN", "TUN", "Tunisia, Republic of"),
    Turkey(792, "TR", "TUR", "Turkey, Republic of"),
    Turkmenistan(795, "TM", "TKM", "Turkmenistan"),
    Turks_and_Caicos_Islands(796, "TC", "TCA", "Turks and Caicos Islands"),
    Tuvalu(798, "TV", "TUV", "Tuvalu"),
    US_Virgin_Islands(850, "VI", "VIR", "US Virgin Islands"),
    Uganda(800, "UG", "UGA", "Uganda, Republic of"),
    Ukraine(804, "UA", "UKR", "Ukraine"),
    United_Arab_Emirates(784, "AE", "ARE", "United Arab Emirates"),
    United_Kingdom_of_Great_Britain__N_Ireland(826, "GB", "GBR", "United Kingdom of Great Britain & N. Ireland"),
    United_States_Minor_Outlying_Islands(581, "UM", "UMI", "United States Minor Outlying Islands"),
    United_States_of_America(840, "US", "USA", "United States of America"),
    Uruguay(858, "UY", "URY", "Uruguay, Eastern Republic of"),
    Uzbekistan(860, "UZ", "UZB", "Uzbekistan"),
    Vanuatu(548, "VU", "VUT", "Vanuatu"),
    Venezuela(862, "VE", "VEN", "Venezuela, Bolivarian Republic of"),
    Viet_Nam(704, "VN", "VNM", "Viet Nam, Socialist Republic of"),
    Wallis_and_Futuna_Islands(876, "WF", "WLF", "Wallis and Futuna Islands"),
    Western_Sahara(732, "EH", "ESH", "Western Sahara"),
    Yemen(887, "YE", "YEM", "Yemen"),
    Zambia(894, "ZM", "ZMB", "Zambia, Republic of"),
    Zimbabwe(716, "ZW", "ZWE", "Zimbabwe"),;

    private final int value;
    private final String alpha2;
    private final String alpha3;
    private final String description;
    private final int length = 3;

    Country(int value, String alpha2, String alpha3, String description) {
        this.value = value;
        this.alpha2 = alpha2;
        this.alpha3 = alpha3;
        this.description = description;
        // this.length = 3;
    }

    public static Country getInstance(int value) {
        for (Country countryCode : values())
            if (countryCode.getValue() == value)
                return countryCode;

        throw new TypeNotFoundException(MessageFormat.format("Could not create {0} for [{1}]", Country.class.getName(), value));
    }

    public static Country getInstanceAlpha2(String value) {
        if (value == null || value.isEmpty())
            return null;

        for (Country country : values())
            if (country.getAlpha2().equals(value))
                return country;

        throw new TypeNotFoundException(MessageFormat.format("Could not create {0} for [{1}]", Country.class.getName(), value));
    }

    public int getValue() {
        return value;
    }

    public int getInteger() {
        return value;
    }

    public String getAlpha2() {
        return alpha2;
    }

    public String getAlpha3() {
        return alpha3;
    }

    public String getString() {
        // return ISOUtil.zeropad(value, length);
        return String.format("%03d", value);
    }

    public String getDescription() {
        return description;
    }
}

