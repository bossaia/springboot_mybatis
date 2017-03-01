package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        System.out.println("some one want to get cityName:"+cityName);
    	return cityService.findCityByName(cityName);
    }
    
    @RequestMapping(value="/api/getcity", method = RequestMethod.POST)
    public City getOneCity(@RequestBody City city){
    	
    	System.out.println("some one want to get City Description:"+city.getCityName());
    	return cityService.findCityByName(city.getCityName());
    	
    }
    
    @RequestMapping(value="/api/insertcity",method = RequestMethod.POST)
    public void insereOneCity(@RequestBody City city){
    	cityService.insertById(city);
    }
    
    @RequestMapping(value="/api/deletecity",method=RequestMethod.PUT)
    public void deleteOneCity(@RequestParam long id){
    	cityService.deleteById(id);
    }
    
    @RequestMapping(value="api/updatecity",method=RequestMethod.POST)
    public void updateOneCity(@RequestBody City c){
    	cityService.updateCityById(c);
    }
    
}
