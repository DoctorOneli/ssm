package org.freedom.boot;

import org.freedom.boot.bean.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

	@Autowired
	RedisTemplate redisTemplate;
	
	@Autowired
	StringRedisTemplate stringRedisTemplate;
	
	@GetMapping("/redis")
	public Msg getRedis()
	{
		ValueOperations<String, String> operations=stringRedisTemplate.opsForValue();
		String valueA=operations.get("a");
		System.out.println("获得redis的键a对应的值");
		
		return Msg.success().add("data", valueA);
	}
	
}
