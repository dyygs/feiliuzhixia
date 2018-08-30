package com.dy.service;

import com.dy.bean.City;
import com.dy.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dy on 2018/8/10.
 */
@Service
public class CityService {

    @Autowired
    CityMapper cityMapper;

    /**
     * 根据省名称获取城市
     * @param provinceName
     * @return
     */
    public List<City> getCitysByProvinceName(String provinceName){
        List<City> cityList = new ArrayList<>();
        if (provinceName != null && !provinceName.isEmpty()) {
            return cityMapper.getCitysByProvinceName(provinceName);
        }

        return cityList;
    }
}
