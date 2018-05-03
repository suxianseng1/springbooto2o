package com.imooc.o2o;

import com.imooc.o2o.cache.JedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class O2oApplicationTests {

	@Autowired
	JedisUtil.Keys key;
	@Test
	public void contextLoads() {
	}

}
