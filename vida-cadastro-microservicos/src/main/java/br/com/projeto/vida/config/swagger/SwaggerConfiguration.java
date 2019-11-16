package br.com.projeto.vida.config.swagger;

import java.util.Arrays;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {

	public Docket vidaApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("br.com.projeto.vida")).paths(PathSelectors.ant("/**"))
				.build().globalOperationParameters(
						Arrays.asList(new ParameterBuilder().description("API para cadastrar os usuários").build()));

	}

}
