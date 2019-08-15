package nero.bean;

import bean.annotation.BeanRegisterApplication;
import beans.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLoadTest {


	@Test
	public void loadByXml(){
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("nero/bean.xml");
		UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
		System.out.println(userService.getUserName());
	}




	@Test
	public void loadByAnnotation(){
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(BeanRegisterApplication.class);
		annotationConfigApplicationContext.refresh();
		UserService userService = (UserService) annotationConfigApplicationContext.getBean("userService");
		System.out.println(userService.getUserName());

	}











}
