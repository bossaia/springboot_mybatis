package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;

/**
 * 城市 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);
    
    /*
     * 插入一个城市信息
     * 
     * */
    void insertById(City city);
    /*
     * 删除一个city信息
     * */
    void deleteById(long id);
    
    void updateCityById(City c);
}
