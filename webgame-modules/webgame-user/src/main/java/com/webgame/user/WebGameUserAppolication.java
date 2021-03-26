package com.webgame.user;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 系统模块
 * @author cdw
 * @date 2020-03-21
 */
@EnableFeignClients
@SpringCloudApplication
public class WebGameUserAppolication {
    public static void main(String[] args){
        SpringApplication.run(WebGameUserAppolication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ webgame用户模块启动成功  └(^o^)┘└(^o^)┘");

    }
}
