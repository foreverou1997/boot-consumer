package com.study.demo.bootconsumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author oulei
 */
@RestController
@Slf4j
public class TestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/test")
    public String test(){
        // 获取服务集合
        List<ServiceInstance> serverList = discoveryClient.getInstances("boot-producer");
        serverList.forEach(t->{
            Map<String, String> map = new HashMap<>(16);
            try {
                map = BeanUtils.describe(t);
            } catch (Exception e){
               log.info(e.getMessage());
            }
            for (String s : map.keySet()){
                System.out.println(s+"   ：   "+map.get(s));
            }
        });
        return "success";
    }

}
