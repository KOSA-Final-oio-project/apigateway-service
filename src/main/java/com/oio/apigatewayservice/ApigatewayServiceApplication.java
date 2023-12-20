package com.oio.apigatewayservice;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ApigatewayServiceApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ApigatewayServiceApplication.class)
				.web(WebApplicationType.REACTIVE) // .REACTIVE, .SERVLET
				.run(args);
	}

}