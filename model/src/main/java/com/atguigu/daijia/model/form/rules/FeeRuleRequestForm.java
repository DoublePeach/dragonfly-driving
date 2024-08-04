package com.atguigu.daijia.model.form.rules;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 接收前端传来的预估订单价格的参数对象
 */
@Data
public class FeeRuleRequestForm {

    @Schema(description = "代驾里程")
    private BigDecimal distance;

    @Schema(description = "代驾时间")
    private Date startTime;

    @Schema(description = "等候分钟")
    private Integer waitMinute;

}
