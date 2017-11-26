package com.demoproject.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ss on 2017/11/25.
 */

@EnableAutoConfiguration
@RestController
@RequestMapping("/api")
public class API {

    private Gson gson = new GsonBuilder().create();

    @RequestMapping(value = "/cancel", method = RequestMethod.POST)
    private String cancelTrain(@RequestBody String body) {

        System.out.println(body);

        HelloBean messageBean = gson.fromJson(body, HelloBean.class);
        String message = messageBean.getHello();

        String returnMessage = MySQLUtils.getData(message);

        return returnMessage;
    }
}
