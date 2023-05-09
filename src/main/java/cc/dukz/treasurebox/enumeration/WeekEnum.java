package cc.dukz.treasurebox.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * Week enum
 *
 * @ClassName Week
 * @Author dukz
 * @Date 2023/5/9
 * @Version 1.0
 */
@AllArgsConstructor
public enum WeekEnum {

    MONDAY("MONDAY",1,"星期一"),
    TUESDAY("TUESDAY",2,"星期二"),
    WEDNESDAY("WEDNESDAY",3,"星期三"),
    THURSDAY("THURSDAY",4,"星期四"),
    FRIDAY("FRIDAY",5,"星期五"),
    SATURDAY("SATURDAY",6,"星期六"),
    SUNDAY("SUNDAY",7,"星期天");

    @Getter
    private String code;
    @Getter
    private Integer weekDay;
    @Getter
    private String des;

    /**
     * 根据code 得到对应的 周（几）数字
     * @param code
     * @return
     */
    public static Integer getWeekDayByCode(String code) {
        Integer result = null;
        for (WeekEnum order : WeekEnum.values()) {
            if (StringUtils.equals(order.getCode(), code)) {
                result = order.getWeekDay();
                break;
            }
        }
        return result;
    }

    /**
     * 根据code 得到对应的 周（几）描述
     * @param code
     * @return
     */
    public static String getDesByCode(String code) {
        String result = null;
        for (WeekEnum order : WeekEnum.values()) {
            if (StringUtils.equals(order.getCode(),code)) {
                result = order.getDes();
                break;
            }
        }
        return result;
    }

    /**
     * 根据code 得到枚举
     * @param code
     * @return
     */
    public static WeekEnum getEnumByCode(String code) {
        if (StringUtils.isBlank(code)) {
            return null;
        }
        for (WeekEnum trans : values()) {
            if (StringUtils.equals(code,trans.getCode())) {
                return trans;
            }
        }
        return null;
    }

}
