package com.lhcygan.apigateway;

import com.lhcygan.apigateway.rpc.RpcDemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiGatewayApplicationTests {

    @DubboReference
    private RpcDemoService rpcDemoService;

    @Test
    void contextLoads() {
        System.out.println(rpcDemoService.sayHello("lhcygan"));
    }

}
