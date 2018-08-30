package com.dy.controller;

import com.dy.bean.City;
import com.dy.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by dy on 2018/8/10.
 */
@RestController
@RequestMapping("/city")
public class CityController {

    private static Logger logger = LoggerFactory.getLogger(CityController.class);

    @Autowired
    CityService cityService;


    @RequestMapping(value = "/getCity", method = RequestMethod.GET)
    public List<City> getCitysByProvinceName(String provinceName) {
        logger.info("开始查询{}", provinceName);
        List<City> list = cityService.getCitysByProvinceName(provinceName);
        logger.info("查询结果{}", list);
        return list;
    }
}
