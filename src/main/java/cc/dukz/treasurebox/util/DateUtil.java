package cc.dukz.treasurebox.util;

import cn.hutool.core.text.StrPool;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * date util
 */
@Slf4j
public class DateUtil {
    private static final String PARSE_ERR_MSG = "parse date fail, value is {}, pattern is {}";

    public static final String YYYY_MM_DD_T_HH_MM_SS_SSS = "yyyy-MM-dd'T'HH:mm:ss.SSS";
    public static final String YYYY_MM_DD_T_HH_MM_SS_SSS_Z = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static final String YYYY_MM_DD = "yyyy-MM-dd";
    public static final String YYYY__MM = "yyyy年MM月";
    public static final String YYYY__MM__DD = "yyyy年MM月dd日";
    public static final String YYYY__MM__DD_HH_MM_SS = "yyyy年MM月dd日 HH:mm:ss";
    public static final String MM_DD_YYYY = "MM/dd/yyyy";
    public static final String MM_DD_YYYY_HH_MM_SS_A = "MM/dd/yyyy hh:mm:ss aa";
    public static final String DD_MM_YYYY = "dd/MM/yyyy";
    public static final String DD_MM_YYYY_HH_MM_SS = "dd/MM/yyyy HH:mm:ss";
    public static final String MM_YYYY = "MM/yyyy";
    public static final String YYYY_MM = "yyyy-MM";
    public static final String YYYY = "yyyy";

    private DateUtil() {
    }


    /**
     * format LocalDate
     * @param date
     * @param pattern
     * @return
     */
    public static String formatLocalDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }

}
