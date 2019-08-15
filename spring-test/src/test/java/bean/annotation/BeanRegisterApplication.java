package bean.annotation;

import beans.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanRegisterApplication {

	@Bean
	public UserService userService(){
		UserService userService = new UserService();
		return userService;
	}

}
