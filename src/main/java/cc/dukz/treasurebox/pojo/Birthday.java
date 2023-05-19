/* Copyright (c) 2023, TD SYNNEX Corporation. All rights reserved */

package cc.dukz.treasurebox.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author Arvin Du
 * @version 1.0
 * @description birthday
 * @date 2023/05/19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Birthday implements Serializable {

    private static final long serialVersionUID = 4706940363249941080L;
    private String name;
    private LocalDate birth;
}
