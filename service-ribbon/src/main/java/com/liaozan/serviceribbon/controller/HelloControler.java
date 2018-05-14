package com.liaozan.serviceribbon.controller;

import com.liaozan.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liaozan
 * @version 1.0.0
 * @since 2018/5/13
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi (@RequestParam String name) {
        return helloService.hiService(name);
    }

}
