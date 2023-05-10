package cc.dukz.treasurebox.constant;

import com.google.common.collect.ImmutableMap;

/**
 * @author Arvin Du
 * @version 1.0
 * @description system constants
 * @date 2023/05/10
 */
public class SystemConsts {

    /**
     * 获取每日诗词接口，来源：https://gushi.ci/
     */
    public static final String JINTISHICI_URL = "https://v1.jinrishici.com/all.json";

    /**
     * 金山词霸每日一句英语接口，来源：http://www.iciba.com/
     * 后面拼上日期：2023-05-01
     * 例如：https://sentence.iciba.com/index.php?c=dailysentence&m=getdetail&title=2023-05-01
     */
    public static final String ICIBA_DAILY_SENTENCE_URL = "http://sentence.iciba.com/index.php?c=dailysentence&m=getdetail&title=";

    /**
     * 获取下一个节假日url
     */
    public static final String NEXT_HOLIDAY_URL = "https://timor.tech/api/holiday/next";

    public static final ImmutableMap<String, String> HOLIDAY_BLESSING_MESSAGE = ImmutableMap.<String, String>builder()
            .put("元旦", "元旦快乐哦^_^")
            .put("除夕", "有压岁钱了哦^_^")
            .put("清明节", "放假啦^_^")
            .put("劳动节", "劳动最光荣^_^")
            .put("端午节", "记得吃粽子哦^_^")
            .put("中秋节", "记得吃月饼哦^_^")
            .put("国庆节", "国庆七天乐，嗨皮起来^_^")
            .build();
}
