package com.lhcygan.apiinterface.client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.lhcygan.apiinterface.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

import static com.lhcygan.apiinterface.utils.SignUtils.getSign;

public class ApiClient {

    private static final String GATEWAY_HOST = "http://localhost:8090";

    private String accessKey;

    private String secretKey;

    public ApiClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    public String getNameByGet(String name) {
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
//        String result = HttpUtil.get("http://localhost:8121/api/name/", paramMap);
        String result = HttpUtil.get(GATEWAY_HOST + "/api/name/" + name);
        System.out.println(result);
        return result;
    }

    public String getNameByPost(@RequestParam String name) {
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result = HttpUtil.post("http://localhost:8121/api/name/", paramMap);
        System.out.println(result);
        return result;
    }

    private Map<String, String> getHeaders(String body) {
        Map<String, String> headers = new HashMap<>();
        headers.put("accessKey", accessKey);

        headers.put("nonce", RandomUtil.randomNumbers(100));
        headers.put("body", body);
        headers.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        headers.put("sign", getSign(body, secretKey));
//        headers.put("secretKey", secretKey);

        return headers;
    }

//    private String getSign(Map<String, String> hashMap, String secretKey) {
//        Digester md5 = new Digester(DigestAlgorithm.SHA256);
//        String content = hashMap.toString() + '.' + secretKey;
//        return md5.digestHex(content);
//    }

    public String getUsernameByPost(@RequestBody User user) {
        String json = JSONUtil.toJsonStr(user);
        HttpResponse httpResponse = HttpRequest.post("http://localhost:8121/api/name/user")
                .addHeaders(getHeaders(json))
                .body(json)
                .execute();
        System.out.println(httpResponse.getStatus());
        String result = httpResponse.body();
        System.out.println(result);
        return result;
    }

}
