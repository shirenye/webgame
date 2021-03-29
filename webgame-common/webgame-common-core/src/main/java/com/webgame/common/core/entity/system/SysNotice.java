package com.webgame.common.core.entity.system;

import com.webgame.common.core.entity.BaseEntity;

/**
 * 通知公告表 sys_notice
 * 
 * @author cdw
 * @date 2021-03-29
 */
public class SysNotice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 公告ID */
    private Long noticeId;

    /** 公告标题 */
    private String noticeTitle;

    /** 公告类型（1通知 2公告） */
    private String noticeType;

    /** 公告内容 */
    private String noticeContent;

    /** 公告状态（0正常 1关闭） */
    private String status;


}
