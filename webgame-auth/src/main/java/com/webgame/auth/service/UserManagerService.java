package com.webgame.auth.service;

import com.webgame.common.core.dto.system.SysUserDto;
import com.webgame.common.core.entity.system.SysUser;

/**
 * 用户管理
 *
 * @author cdw
 * @date 2021-03-29
 */
public interface UserManagerService {

    /**
     * 通过用户名获取用户
     *
     * @param userName 用户名
     * @return
     */
    SysUserDto findByName(String userName);

    /**
     * 通过用户名获取权限
     *
     * @param userName 用户名
     * @return
     */
    String findUserPermissions(String userName);
}
