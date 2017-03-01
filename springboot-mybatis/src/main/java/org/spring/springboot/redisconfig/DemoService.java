package org.spring.springboot.redisconfig;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

	
	@Cacheable(value="citycache",)
	
}
