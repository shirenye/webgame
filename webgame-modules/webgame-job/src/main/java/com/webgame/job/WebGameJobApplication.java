package com.webgame.job;

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
public class WebGameJobApplication {
    public static void main(String[] args){
        SpringApplication.run(WebGameJobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ webgame定时任务模块启动成功  └(^o^)┘└(^o^)┘");

    }
}
