package com.webgame.auth.service;

import com.webgame.common.core.exception.ValidateCodeException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author cdw
 * @date 2021-04-23
 */
public interface ValidateCodeService {

    /**
     * 生成验证码
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @throws IOException           IO异常
     * @throws ValidateCodeException 验证码异常
     */
    void create(HttpServletRequest request, HttpServletResponse response) throws IOException, ValidateCodeException;

    /**
     * 校验验证码
     *
     * @param key   前端上送 key
     * @param value 前端上送待校验值
     * @throws ValidateCodeException 验证码异常
     */
    void check(String key, String value) throws ValidateCodeException;
}

