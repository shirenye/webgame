package com.webgame.common.core.entity.system;


import com.webgame.common.core.annotation.Excel;
import com.webgame.common.core.annotation.Excel.ColumnType;
import com.webgame.common.core.entity.BaseEntity;
/**
 * 字典类型表 sys_dict_type
 * 
 * @author cdw
 * @date 2021-03-29
 */
public class SysDictType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 字典主键 */
    @Excel(name = "字典主键", cellType = ColumnType.NUMERIC)
    private Long dictId;

    /** 字典名称 */
    @Excel(name = "字典名称")
    private String dictName;

    /** 字典类型 */
    @Excel(name = "字典类型")
    private String dictType;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

}
