package com.lhcygan.apigateway.rpc;

import java.util.concurrent.CompletableFuture;

public interface RpcDemoService {

    String sayHello(String name);

    String sayHello2(String name);

    default CompletableFuture<String> sayHelloAsync(String name) {
        return CompletableFuture.completedFuture(sayHello(name));
    }
}
