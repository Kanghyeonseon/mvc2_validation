package hello.itemservice;

import hello.itemservice.web.validation.ItemValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

/* ItemValidator를 글로벌 설정 하는 방법이다.
	@Override // ItemServiceApplication이 WebMvcConfigurer를 implements 하면 사용할 수 있다.
	public Validator getValidator() {
		return new ItemValidator();
	}
*/

}
