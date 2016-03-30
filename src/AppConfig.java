import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.ss.repository.CustomerRepository;
import com.ss.repository.HibernateCustomerRepositoryImpl;
import com.ss.service.CustomerServiceImpl;
import com.ss.service.CustomreService;

@Configuration
@ComponentScan({"com.ss"})
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceHolderConf(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean(name="customerService")
	@Scope("prototype")
	public CustomreService getCustService(){
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		//customerService.setCustRepo(getCustomerRepository());
		return customerService;
	}
	
//	@Bean(name="customerRepository")
//	public CustomerRepository getCustomerRepository(){
//		return new HibernateCustomerRepositoryImpl();
//	}
	

}
