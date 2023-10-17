package hu.helper.bang.center.notify.controller.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author : Jiang XingKun
 * @Date : 2023/2/21
 * @Description : 通知详情查询请求类
 */
@Data
@ApiModel
public class NotifyDetailQueryRequest {
    @NotNull(message = "通知ID不能为空")
    private Long id;
    @NotNull(message = "通知类型不能为空")
    private Integer notifyType;
    private String targetTable;
}
