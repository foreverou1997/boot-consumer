package com.study.demo.bootconsumer.controller.feign;

import com.study.demo.bootconsumer.feign.FeignTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oulei
 */
@RestController
public class FeignTestController {

    @Autowired
    private  FeignTestService feignTestService;

    @RequestMapping("/feignTest")
    public String feignTest(){
       String res = feignTestService.test();
       return "feign调用返回:"+res;
    }

}
