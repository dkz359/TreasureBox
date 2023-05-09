package cc.dukz.treasurebox.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/timetable")
    public String getTimetable(){

        return "今天没有课，嗨起来！";
    }
}
