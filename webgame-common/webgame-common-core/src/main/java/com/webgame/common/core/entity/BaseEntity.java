package com.webgame.common.core.entity;

import java.util.Date;

/**
 * 实体类父类
 *
 * @author cdw
 * @date 2021-03-29
 */
public class BaseEntity {

    /**
     * 创建人
     */
    public Integer createBy;

    /**
     * 创建时间
     */
    public Date createTime;

    /**
     * 更新人
     */
    public Integer updateBy;

    /**
     * 更新时间
     */
    public Date updateTime;

    /**
     * 备注
     */
    public String remark;
}
