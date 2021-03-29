package com.webgame.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.webgame.common.core.entity.system.SysRoleMenu;
import com.webgame.common.core.entity.system.SysUser;

import java.util.List;

public interface UserMapper extends BaseMapper<SysUser> {

    /**
     * 获取用户
     *
     * @param username 用户名
     * @return 用户
     */
    SysUser findByName(String username);

    /**
     * 获取用户数据权限
     *
     * @param userId 用户id
     * @return 数据权限
     */
    List<SysRoleMenu> findUserDataPermissions(Long userId);

}
