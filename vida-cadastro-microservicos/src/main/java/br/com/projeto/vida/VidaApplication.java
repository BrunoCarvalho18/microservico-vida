package br.com.projeto.vida;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.projeto.vida*"})
@EnableSpringDataWebSupport
@EnableAutoConfiguration
@EnableSwagger2
public class VidaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VidaApplication.class, args);
	}

}
