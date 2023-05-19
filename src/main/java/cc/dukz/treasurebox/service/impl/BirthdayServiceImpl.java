/* Copyright (c) 2023, TD SYNNEX Corporation. All rights reserved */

package cc.dukz.treasurebox.service.impl;

import cc.dukz.treasurebox.constant.BusinessConsts;
import cc.dukz.treasurebox.service.BirthdayService;
import cc.dukz.treasurebox.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Arvin Du
 * @version 1.0
 * @description birthday service
 * @date 2023/05/19
 */
@Service
@Slf4j
public class BirthdayServiceImpl implements BirthdayService {
    @Override
    public String birthdayInterval() {
        List<String> birthMsg = BusinessConsts.BIRTHDAY_LIST.stream()
                .map(birthday -> {
                    LocalDate birth = birthday.getBirth();
                    Long interval = DateUtil.getBirthdayInterval(birth);
                    return "距离"+birthday.getName()+"生日还有"+interval+"天！";
                })
                .collect(Collectors.toList());
        return StringUtils.join(birthMsg, "\n");
    }
}
