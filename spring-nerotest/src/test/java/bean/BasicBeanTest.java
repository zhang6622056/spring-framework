package bean;



import beans.UserService;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


/***
 *
 * 基础bean test
 * @author Nero
 * @date 2019-09-03
 * *@param: null
 * @return 
 */
public class BasicBeanTest {



	@Test
	public void testLoadByXmlBean(){

		//- 加载资源
		Resource resource = new ClassPathResource("/nero/bean.xml");

		//-
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
		UserService userService = (UserService) xmlBeanFactory.getBean("userService");
		System.out.println(userService.getUserName());
	}



}
