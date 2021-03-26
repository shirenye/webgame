package com.webgame.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 系统模块
 * @author cdw
 * @date 2020-03-21
 */
@EnableFeignClients
@SpringCloudApplication
public class WebGameSystemApplication {
    public static void main(String[] args){
        SpringApplication.run(WebGameSystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ webgame系统模块启动成功  └(^o^)┘└(^o^)┘");

    }
}
