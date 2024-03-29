package com.lhcygan.apigateway;

import com.lhcygan.apigateway.rpc.RpcDemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDubbo
public class ApiGatewayApplication {

//    @DubboReference
//    private RpcDemoService rpcDemoService;

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);

//        ConfigurableApplicationContext content = SpringApplication.run(ApiGatewayApplication.class, args);
//        ApiGatewayApplication apiGatewayApplication = content.getBean(ApiGatewayApplication.class);
//        String res1 = apiGatewayApplication.rpcDemoService.sayHello2("fff");
//        System.out.println(res1);
    }

}
