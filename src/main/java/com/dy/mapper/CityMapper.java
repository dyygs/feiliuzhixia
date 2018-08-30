package com.dy.mapper;

import com.dy.bean.City;

import java.util.List;

/**
 * Created by dy on 2018/8/10.
 */
public interface CityMapper {

    /**
     * 根据省名称获取所有市
     * @param provinceName 省名称
     * @return 市列表
     */
    List<City> getCitysByProvinceName(String provinceName);
}
