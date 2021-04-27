package com.webgame.common.redis.propeties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * redis线程池配置类
 *
 * @author cdw
 * @date 2021-04-23
 */
@ConfigurationProperties(prefix = "webgame.lettuce.redis")
public class WebGameLettuceRedisProperties {
    /**
     * 是否开启Lettuce Redis
     */
    private Boolean enable = true;

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public String toString() {
        return "WebGameLettuceRedisProperties{" +
                "enable=" + enable +
                '}';
    }
}
