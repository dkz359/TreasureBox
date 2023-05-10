package cc.dukz.treasurebox.service.impl;

import cc.dukz.treasurebox.constant.SystemConsts;
import cc.dukz.treasurebox.service.DailyService;
import cc.dukz.treasurebox.util.DateUtil;
import cn.hutool.core.map.MapUtil;
import cn.hutool.core.text.UnicodeUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.StringJoiner;

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

    @Override
    public String getNextHoliday() {
        String resJson = HttpUtil.get(SystemConsts.NEXT_HOLIDAY_URL);
        JSONObject jsonObject = JSONUtil.parseObj(resJson);
        JSONObject holiday = jsonObject.getJSONObject("holiday");
        String name = holiday.getStr("name");
        String date = holiday.getStr("date");
        Integer rest = holiday.getInt("rest");
        StringJoiner joiner = new StringJoiner("");
        joiner.add("距离");
        joiner.add(name);
        joiner.add("还有【");
        joiner.add(""+rest);
        joiner.add("】天。");
        String message = MapUtil.getStr(SystemConsts.HOLIDAY_BLESSING_MESSAGE, name);
        if (StringUtils.isNotEmpty(message)){
            joiner.add(message);
        }
        return joiner.toString();
    }
}
