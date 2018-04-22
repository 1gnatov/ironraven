package com.ironbank;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@Slf4j
public class IronListener implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		log.info("Посылаем ворона....");
	}
}
