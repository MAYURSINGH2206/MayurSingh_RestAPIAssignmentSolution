package com.greatlearning.employeeManagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket EmployeeManagementAPI() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).groupName("Employee-Management-API").select()
				.apis(RequestHandlerSelectors.basePackage("com.greatlearning.employeeManagement.controller")).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Employee-Management-API")
				.description("Employee Management API for developers").termsOfServiceUrl("http:fakeemployee.com")
				.contact(new Contact("Employee-Management-API", "http:fakeemployee.com", "http:fakeemployee.com"))
				.license("employee license").licenseUrl("http:fakeemployee.com").version("1.0").build();
	}
}
