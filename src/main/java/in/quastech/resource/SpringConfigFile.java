package in.quastech.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.quastech.bean.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	Student stdObj() {
		Student std=new Student();
		std.setRollno(101);
		std.setName("Quastech");
		std.setMarks(35.00);
		return std;
		
	}

}
