package com.ironbank;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@Slf4j
public class IronListener implements ApplicationListener<ContextRefreshedEvent> {
	private RavenProperties ravenProperties;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		ravenProperties.getDestinations().forEach(d -> log.info("Send raven to " + d));
	}

	@Autowired
	public void setRavenProperties(RavenProperties ravenProperties) {
		this.ravenProperties = ravenProperties;
	}
}
