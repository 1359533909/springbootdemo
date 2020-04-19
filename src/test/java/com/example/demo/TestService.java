package com.example.demo;

import com.example.demo.service.serviceImp.TestServieImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @RunWith:启动类，在启动测试类之前启动该注解里面的类
 * SpringRunner：让junit与spring整合
 * SpringBootTest:有两层含义
 * 1、表明下面的类为测试类
 * 2、加载springboot的启动类
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringdemoApplication.class)
public class TestService {
	@Autowired
	TestServieImp TestServieImp;
	@Test
	public void test(){
		String hello = TestServieImp.test();
		System.out.println(hello);
	}
}
