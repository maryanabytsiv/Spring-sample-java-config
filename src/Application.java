import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ss.service.CustomreService;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//CustomreService service = new CustomerServiceImpl();
		
		CustomreService service = appContext.getBean("customerService", CustomreService.class);
		
		System.out.println(service);
		
		CustomreService service2 = appContext.getBean("customerService", CustomreService.class);
		System.out.println(service);
				
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
