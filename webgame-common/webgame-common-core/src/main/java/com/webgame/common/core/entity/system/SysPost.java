package com.webgame.common.core.entity.system;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.webgame.common.core.annotation.Excel;
import com.webgame.common.core.annotation.Excel.ColumnType;
import com.webgame.common.core.entity.BaseEntity;

/**
 * 岗位表 sys_post
 * 
 * @author cdw
 * @date 2021-03-29
 */
public class SysPost extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 岗位序号 */
    @Excel(name = "岗位序号", cellType = ColumnType.NUMERIC)
    private Long postId;

    /** 岗位编码 */
    @Excel(name = "岗位编码")
    private String postCode;

    /** 岗位名称 */
    @Excel(name = "岗位名称")
    private String postName;

    /** 岗位排序 */
    @Excel(name = "岗位排序")
    private String postSort;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 用户是否存在此岗位标识 默认不存在 */
    private boolean flag = false;


}
