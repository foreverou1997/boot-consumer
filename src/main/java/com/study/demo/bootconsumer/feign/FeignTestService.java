package com.study.demo.bootconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author oulei
 */
@FeignClient(name = "boot-producer")
public interface FeignTestService {

    @RequestMapping("/test")
    String  test();
}
