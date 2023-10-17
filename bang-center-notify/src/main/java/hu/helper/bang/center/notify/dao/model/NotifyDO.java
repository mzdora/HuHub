package hu.helper.bang.center.notify.dao.model;

import lombok.Data;

import java.util.Date;

/**
 * 记录表DO
 *
 * @Author : Jiang XingKun
 * @Date : 2023/2/22
 * @Description :
 */
@Data
public class NotifyDO {
    /**
     * 主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 发送人ID
     */
    private Long senderId;

    /**
     * 发送人名称
     */
    private String senderName;

    /**
     * 发送人头像
     */
    private String senderPhoto;

    /**
     * 接收人ID->用户id
     */
    private Long receiverId;

    /**
     * 接收人名称
     */
    private String receiverName;

    /**
     * 状态（1未查看;2已查看;3已删除）
     */
    private Integer status;

    /**
     * 帖子id
     */
    private Long postId;

    /**
     * 标题
     */
    private String title;

    /**
     * 通知内容
     */
    private String content;

    /**
     * 通知类型（评论、点赞、回复、系统公告通知、活动变动）
     */
    private Integer notifyType;

    /**
     * 存minion图像地址，“;”分割
     */
    private String photos;
}
