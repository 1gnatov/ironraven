package com.ironbank;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class IronConfiguration {

	@Bean
	@ConditionalOnProduction
	@ConditionalOnProperty("raven.destinations")
	public IronListener ironListener() {
		return new IronListener();
	}

}
