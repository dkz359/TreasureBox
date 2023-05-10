package cc.dukz.treasurebox.controller;

import cc.dukz.treasurebox.service.DailyService;
import cc.dukz.treasurebox.service.TimetableService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.StringJoiner;

/**
 * @author Arvin Du
 * @version 1.0
 * @description iphone shortcuts controller
 * @date 2023/05/09
 */
@RestController
@RequestMapping("/shortcuts")
@Slf4j
public class ShortcutsController {

    @Resource
    private TimetableService timetableService;
    @Resource
    private DailyService dailyService;

    @GetMapping("/daily")
    public String getDailyContent(){
        StringJoiner joiner = new StringJoiner("\n");
        String timetable = timetableService.getTimetable();
        String poem = dailyService.getDailyPoem();
        String english = dailyService.getDailyEnglish();
        String nextHoliday = dailyService.getNextHoliday();
        joiner.add(timetable);
        joiner.add(poem);
        joiner.add(english);
        joiner.add(nextHoliday);
        return joiner.toString();
    }
}
