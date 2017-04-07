package factory;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import factory.com.zss.bean.UserBean;
import factory.com.zss.dao.IuserDao;
import factory.com.zss.service.UserService;

public class testMain {
	
	ApplicationContext  ac = null;
	
	@Before
	public void before(){
		ac= new ClassPathXmlApplicationContext("classpath*:spring.xml");
	}
	
	@Test
	public void test(){
		UserBean u = (UserBean)ac.getBean("user");
		IuserDao userDao = (IuserDao)ac.getBean("userDao");
		UserService userService = (UserService)ac.getBean("userService");
		
		userService.say(u);
	}

}
