package com.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan({"com"})
public class Configurationxml {
	@Bean
	public InternalResourceViewResolver viewResolver(){
		 InternalResourceViewResolver viewresolver=new  InternalResourceViewResolver();
		 viewresolver.setViewClass(JstlView.class );
		 viewresolver.setPrefix("/WEB-INF/view/");
		 viewresolver.setSuffix(".jsp");
		//return "viewResolver";
		return viewresolver;
	}


}
