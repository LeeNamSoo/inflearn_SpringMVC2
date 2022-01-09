package hello.itemservice;

import hello.itemservice.web.validation.ItemValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ItemServiceApplication /* implements WebMvcConfigurer */{

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	//global validator설정 모든 컨트롤러에 @Validated Annotation으로 검증기를 적용할 수 있다.
//	@Override
//	public Validator getValidator() {
//		return new ItemValidator();
//	}
}
