package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CityDao;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

	@Override
	public void insertById(City city) {
		System.out.println("some one want to Insert one City");
		cityDao.insertById(city);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		System.out.println("some one want to Delete City");
		cityDao.deleteById(id);
	}

	@Override
	public void updateCityById(City c) {
		// TODO Auto-generated method stub
		System.out.println("some ont want to Update city");
		cityDao.updateCityById(c);
	}
	
}
