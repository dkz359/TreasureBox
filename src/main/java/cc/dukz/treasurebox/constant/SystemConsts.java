package cc.dukz.treasurebox.constant;

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
}
