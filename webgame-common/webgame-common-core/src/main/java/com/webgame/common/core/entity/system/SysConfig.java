package com.webgame.common.core.entity.system;

import com.webgame.common.core.annotation.Excel;
import com.webgame.common.core.annotation.Excel.ColumnType;
import com.webgame.common.core.entity.BaseEntity;

/**
 * 参数配置表 sys_config
 * 
 * @author cdw
 */
public class SysConfig extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 参数主键 */
    @Excel(name = "参数主键", cellType = ColumnType.NUMERIC)
    private Long configId;

    /** 参数名称 */
    @Excel(name = "参数名称")
    private String configName;

    /** 参数键名 */
    @Excel(name = "参数键名")
    private String configKey;

    /** 参数键值 */
    @Excel(name = "参数键值")
    private String configValue;

    /** 系统内置（Y是 N否） */
    @Excel(name = "系统内置", readConverterExp = "Y=是,N=否")
    private String configType;

}
