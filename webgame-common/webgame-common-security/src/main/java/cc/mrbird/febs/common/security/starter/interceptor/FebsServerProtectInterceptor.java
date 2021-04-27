package cc.mrbird.febs.common.security.starter.interceptor;

import cc.mrbird.febs.common.security.starter.properties.FebsCloudSecurityProperties;
import com.webgame.common.core.constant.WebGameConstant;
import com.webgame.common.core.entity.WebGameResponse;
import com.webgame.common.core.utils.WebGameUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.NonNull;
import org.springframework.util.Base64Utils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author MrBird
 */
public class FebsServerProtectInterceptor implements HandlerInterceptor {

    private FebsCloudSecurityProperties properties;

    @Override
    public boolean preHandle(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull Object handler) throws IOException {
        if (!properties.getOnlyFetchByGateway()) {
            return true;
        }
        String token = request.getHeader(WebGameConstant.GATEWAY_TOKEN_HEADER);
        String gatewayToken = new String(Base64Utils.encode(WebGameConstant.GATEWAY_TOKEN_VALUE.getBytes()));
        if (StringUtils.equals(gatewayToken, token)) {
            return true;
        } else {
            WebGameResponse febsResponse = new WebGameResponse();
            WebGameUtil.makeJsonResponse(response, HttpServletResponse.SC_FORBIDDEN, febsResponse.message("请通过网关获取资源"));
            return false;
        }
    }

    public void setProperties(FebsCloudSecurityProperties properties) {
        this.properties = properties;
    }
}
