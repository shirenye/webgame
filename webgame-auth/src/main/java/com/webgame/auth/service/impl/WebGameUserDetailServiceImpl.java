package com.webgame.auth.service.impl;

import com.webgame.auth.service.UserManagerService;
import com.webgame.common.core.constant.ParamsConstant;
import com.webgame.common.core.constant.UserConstant;
import com.webgame.common.core.dto.system.SysUserDto;
import com.webgame.common.core.entity.WebGameAuthUser;
import com.webgame.common.core.entity.system.SysUser;
import com.webgame.common.core.utils.WebGameUtil;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * spring security
 *
 * @author cdw
 * @date 2021-03-29
 */
@Service
@RequiredArgsConstructor
public class WebGameUserDetailServiceImpl implements UserDetailsService {

    private final PasswordEncoder passwordEncoder;

    private UserManagerService userManagerService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        HttpServletRequest httpServletRequest = WebGameUtil.getHttpServletRequest();
        SysUserDto sysUser = userManagerService.findByName(userName);
        if(sysUser != null) {
            String permissions = userManagerService.findUserPermissions(userName);
            boolean notLocked = false;
            if (StringUtils.equals(UserConstant.STATUS_LOCK, sysUser.getStatus())) {
                notLocked = true;
            }
            String password = sysUser.getPassword();
            String loginType = (String) httpServletRequest.getAttribute(ParamsConstant.LOGIN_TYPE);
            if(StringUtils.equals(loginType, Co)) {

            }
            WebGameAuthUser authUser = new WebGameAuthUser();
            BeanUtils.copyProperties(sysUser, authUser);
            return null;
        } else {
            throw  new UsernameNotFoundException("");
        }
    }
}
