package com.heikn;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author lwg
 * @Date: 2020/1/15 14:35
 */

@RestController
public class HealthController {

    @GetMapping("/health/nginx/status")
    public String nginx(){
        HashMap<String, Object> resutl = new HashMap<String, Object>();
        resutl.put("code",200);
        resutl.put("status","health");

        return JSON.toJSONString(resutl);
    }

    @GetMapping("/health/logstash/status")
    public String logstash(){
        HashMap<String, Object> resutl = new HashMap<String, Object>();
        resutl.put("code",200);
        resutl.put("status","health");

        return JSON.toJSONString(resutl);
    }
}
