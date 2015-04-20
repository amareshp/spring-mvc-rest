package com.visitamaresh.ws.config;  
  
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import com.visitamaresh.ws.component.HtmlPageService;
import com.visitamaresh.ws.component.IPersonService;
import com.visitamaresh.ws.component.PersonService;
  
@Configuration 
@ComponentScan("com.visitamaresh.ws") 
@EnableWebMvc   
public class AppConfig {  
	@Bean  
    public UrlBasedViewResolver setupViewResolver() {  
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();  
        resolver.setPrefix("/views/");  
        resolver.setSuffix(".jsp");  
        resolver.setViewClass(JstlView.class);  
        return resolver;  
    }
	
	@Bean  
    public IPersonService personService() {  
        return new PersonService();  
    }

    @Bean  
    public HtmlPageService pageService() {  
        return new HtmlPageService();  
    }
	
}  
 