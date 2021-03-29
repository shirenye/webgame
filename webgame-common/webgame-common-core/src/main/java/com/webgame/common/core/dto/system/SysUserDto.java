package com.webgame.common.core.dto.system;

import com.webgame.common.core.entity.system.SysMenu;
import com.webgame.common.core.entity.system.SysRoleMenu;
import com.webgame.common.core.entity.system.SysUser;
import lombok.Data;

import java.util.List;

/**
 * 用户表dto
 *
 * @author cdw
 * @date 2021-03-29
 */
@Data
public class SysUserDto extends SysUser {

    /**
     * 用户权限
     */
    private List<SysMenu> menus;


}
