package cc.dukz.treasurebox.controller;

import cc.dukz.treasurebox.service.TimetableService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

    @GetMapping("/timetable")
    public String getTimetable(){
        return timetableService.getTimetable();
    }
}
