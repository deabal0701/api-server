package com.github.nettybook.ch9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ApiMain {
    public static void main(String[] args) {
        AbstractApplicationContext springContext = null;
        try {
            springContext = new AnnotationConfigApplicationContext(ApiServerConfig.class);
            springContext.registerShutdownHook();

            ApiServer server = springContext.getBean(ApiServer.class);
            server.start();
            //메인을 수정함.
            //메인을 수정함2.
            //메인을 수정함3.
            //메인을 수정함4.
            //메인을 수정함5.
            //메인을 체크아웃후 다시함.6
            //메인을 체크아웃후 다시함.6safsdf
        }
        finally {
            springContext.close();
        }
    }
}
