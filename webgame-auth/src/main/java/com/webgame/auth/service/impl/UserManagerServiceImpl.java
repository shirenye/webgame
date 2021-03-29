package com.webgame.auth.service.impl;

import com.webgame.auth.mapper.MenuMapper;
import com.webgame.auth.mapper.UserMapper;
import com.webgame.auth.service.UserManagerService;
import com.webgame.common.core.constant.StringConstant;
import com.webgame.common.core.dto.system.SysUserDto;
import com.webgame.common.core.entity.system.SysMenu;
import com.webgame.common.core.entity.system.SysUser;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cdw
 * @date 2021-03-29
 */
public class UserManagerServiceImpl implements UserManagerService {

    MenuMapper menuMapper;

    UserMapper userMapper;
    @Override
    public SysUserDto findByName(String userName) {
        SysUserDto sysUserDto = new SysUserDto();
        SysUser sysUser = userMapper.findByName(userName);
        if (sysUser != null) {
           BeanUtils.copyProperties(sysUser, sysUserDto);
           sysUserDto.setMenus(menuMapper.findUserPermissions(sysUserDto.getUserName()));
        }
        return sysUserDto;
    }

    @Override
    public String findUserPermissions(String userName) {
        List<SysMenu> listMenus = menuMapper.findUserPermissions(userName);
        return listMenus.stream().map(SysMenu :: getPerms).collect(Collectors.joining(StringConstant.COMMA));
    }
}
