package com.webgame.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.webgame.common.core.entity.system.SysMenu;

import java.util.List;

/**
 * 菜单mapper类
 *
 * @author cdw
 * @date 2021-03-29
 */
public interface MenuMapper extends BaseMapper<SysMenu> {

    /**
     * 通过用户名获取菜单
     * @param userName 用户名
     * @return
     */
    List<SysMenu> findUserPermissions(String userName);
}
