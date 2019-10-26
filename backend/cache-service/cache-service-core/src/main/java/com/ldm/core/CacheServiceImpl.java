package com.ldm.core;

import com.alibaba.fastjson.JSON;
import com.ldm.api.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class CacheServiceImpl implements CacheService {
    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public Object get(String key) {
        System.out.println(key);
        Object object=redisTemplate.opsForValue().get(key);
//        T objValue = stringToBean(strValue,Integer.class);
//        return objValue;
        return object;
    }
//
//    @Override
//    public <T> boolean set(String key, T value) {
//        return false;
//    }
//
//    @Override
//    public boolean exists(String key) {
//        return false;
//    }
//
//    @Override
//    public long incr(String key) {
//        return 0;
//    }
//
//    @Override
//    public long decr(String key) {
//        return 0;
//    }
//
//    @Override
//    public boolean delete(String key) {
//        return false;
//    }
    public static <T> String beanToString(T value) {
        if (value == null)
            return null;

        Class<?> clazz = value.getClass();
        /*首先对基本类型处理*/
        if (clazz == int.class || clazz == Integer.class)
            return "" + value;
        else if (clazz == long.class || clazz == Long.class)
            return "" + value;
        else if (clazz == String.class)
            return (String) value;
            /*然后对Object类型的对象处理*/
        else
            return JSON.toJSONString(value);
    }
    public static <T> T stringToBean(String strValue, Class<T> clazz) {

        if ((strValue == null) || (strValue.length() <= 0) || (clazz == null))
            return null;

        // int or Integer
        if ((clazz == int.class) || (clazz == Integer.class))
            return (T) Integer.valueOf(strValue);
            // long or Long
        else if ((clazz == long.class) || (clazz == Long.class))
            return (T) Long.valueOf(strValue);
            // String
        else if (clazz == String.class)
            return (T) strValue;
            // 对象类型
        else
            return JSON.toJavaObject(JSON.parseObject(strValue), clazz);
    }
}
