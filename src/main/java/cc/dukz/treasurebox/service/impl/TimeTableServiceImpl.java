package cc.dukz.treasurebox.service.impl;

import cc.dukz.treasurebox.constant.TimetableConsts;
import cc.dukz.treasurebox.enumeration.WeekEnum;
import cc.dukz.treasurebox.service.TimetableService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * timetable service
 *
 * @ClassName TimeTableServiceImpl
 * @Author dukz
 * @Date 2023/5/9
 * @Version 1.0
 */
@Service
@Slf4j
public class TimeTableServiceImpl implements TimetableService {
    @Override
    public String getTimetable() {
        LocalDate localDate = LocalDate.now();
        String code = String.valueOf(localDate.getDayOfWeek());
        WeekEnum week = WeekEnum.getEnumByCode(code);
        String res = TimetableConsts.TIMETABLE.get(week);
        return res;
    }
}
