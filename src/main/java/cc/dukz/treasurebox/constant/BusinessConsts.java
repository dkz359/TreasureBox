package cc.dukz.treasurebox.constant;

import cc.dukz.treasurebox.enumeration.WeekEnum;
import cc.dukz.treasurebox.pojo.Birthday;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.time.LocalDate;
import java.util.List;

/**
 * @ClassName BusinessConsts
 * @Author dukz
 * @Date 2023/5/9
 * @Version 1.0
 */
public class BusinessConsts {

    public static final ImmutableMap<WeekEnum, String> TIMETABLE = ImmutableMap.<WeekEnum, String>builder()
            .put(WeekEnum.MONDAY, "今日课程【上午：大学生职业规划，大学物理】【下午：大学物理实验】")
            .put(WeekEnum.TUESDAY, "今日课程【上午：高等数学】【下午：思想道德与法治】【晚上：有机化学】")
            .put(WeekEnum.WEDNESDAY, "今日课程【上午：大学英语】【下午：影视鉴赏】")
            .put(WeekEnum.THURSDAY, "今日课程【上午：心理适应与保健】【晚上：高等数学】")
            .put(WeekEnum.FRIDAY, "今日课程【上午：大学英语，大学物理】就要放假了，坚持……")
            .put(WeekEnum.SATURDAY, "周六啦，嗨皮起来。")
            .put(WeekEnum.SUNDAY, "周日啦，嗨皮起来。")
            .build();

    public static final List<Birthday> BIRTHDAY_LIST = ImmutableList.of(
            Birthday.builder().name("老婆小宝贝").birth(LocalDate.of(2004,8,26)).build(),
            Birthday.builder().name("老公大宝贝").birth(LocalDate.of(1995,9,29)).build()
    );
}
