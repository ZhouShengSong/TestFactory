package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import factory.com.zss.bean.UserBean;

public class testMain {

	public static void main(String[] args) {
		ApplicationContext  ac = null;
		ac= new ClassPathXmlApplicationContext("classpath*:spring.xml");
		
		UserBean u = (UserBean)ac.getBean("user");
		
		System.out.println(u.getUser_name());
	}
}
