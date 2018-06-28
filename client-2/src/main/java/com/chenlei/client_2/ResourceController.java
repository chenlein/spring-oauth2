package com.chenlei.client_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestOperations;

import java.io.PrintWriter;

/**
 * @Author: 陈磊
 * @Date: 2018/6/22
 * @Description:
 */

@Controller
@RequestMapping("/resource")
public class ResourceController {

    @Autowired
    private RestOperations restTemplate;

    @RequestMapping(value = "/")
    public void getResource(PrintWriter printWriter) {
        System.out.println("====");
        ResponseEntity<String> forEntity = this.restTemplate.getForEntity("http://localhost:8081/resource/", String.class);
        System.out.println(forEntity.getBody());
        printWriter.write("I am client-2!!!");
    }

}
