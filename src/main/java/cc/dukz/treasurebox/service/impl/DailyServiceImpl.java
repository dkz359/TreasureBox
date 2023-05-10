package cc.dukz.treasurebox.service.impl;

import cc.dukz.treasurebox.constant.SystemConsts;
import cc.dukz.treasurebox.service.DailyService;
import cc.dukz.treasurebox.util.DateUtil;
import cn.hutool.core.text.UnicodeUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * @author Arvin Du
 * @version 1.0
 * @description daily service
 * @date 2023/05/10
 */
@Service
@Slf4j
public class DailyServiceImpl implements DailyService {
    @Override
    public String getDailyPoem() {
        String resJson = HttpUtil.get(SystemConsts.JINTISHICI_URL);
        JSONObject jsonObject = JSONUtil.parseObj(resJson);
        String poem = jsonObject.getStr("content");
        return "今日诗词推荐【"+poem+"】";
    }

    @Override
    public String getDailyEnglish() {
        String now = DateUtil.formatLocalDate(LocalDate.now(), DateUtil.YYYY_MM_DD);
        String url = SystemConsts.ICIBA_DAILY_SENTENCE_URL + now;
        String resJson = HttpUtil.get(url);
        JSONObject jsonObject = JSONUtil.parseObj(resJson);
        String content = jsonObject.getStr("content");
        String note = jsonObject.getStr("note");
        String translate = UnicodeUtil.toString(note);
        return "每日一句英文【"+content+"  "+translate+"】";
    }
}
