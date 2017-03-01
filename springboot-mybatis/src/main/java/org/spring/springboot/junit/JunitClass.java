package org.spring.springboot.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.springboot.Application;
import org.spring.springboot.dao.CityDao;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.impl.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class JunitClass {

	@Autowired
    private CityDao cityDao;
	
	///@Test
	public void TestApplication(){
		
		City c;
		c = cityDao.findByName("大慈溪");
		if(c==null){
			System.out.println("无法获取c对象");
		}
		else{
			System.out.println(c.getDescription());
		}
	}
	
	///@Test
	public void TestInsertCity(){
		
		City c = new City();
		c.setId((long)1231);
		c.setDescription("吉吉哈尔");
		c.setProvinceId((long)32);
		c.setCityName("吉吉哈尔市1");
		cityDao.insertById(c);
		
	}
	
	
	//	@Test
	public void TestDeleteCity(){
		
		cityDao.deleteById(123);
	}
	
	@Test
	public void UpdateCity(){
		City c = new City();
		c.setId((long)1);
		c.setDescription("坎墩人");
		c.setCityName("坎墩人");
		c.setProvinceId((long)1);
		cityDao.updateCityById(c);
	}
	
	
}
