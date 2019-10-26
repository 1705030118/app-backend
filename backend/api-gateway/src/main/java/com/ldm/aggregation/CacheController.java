package com.ldm.aggregation;

import com.ldm.api.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cache")
@RestController
public class CacheController {
    @Autowired
    private CacheService cacheService;
    @RequestMapping("/info")
    public Object getCurrentInfo(){
        //安全对象拿到用户id
        return cacheService.get("ldm");
    }
}
