package com.school053.journal.java.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.school053.journal")
public class WebConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/WEB-INF/**")
                .addResourceLocations("/WEB-INF/");
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
    }

    /*@Bean(name = "viewResolver")
    public InternalResourceViewResolver getViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/css/**");
        viewResolver.setSuffix(".css");
        return viewResolver;
    }*/

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".html");
        return viewResolver;
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("POST", "GET",  "PUT", "OPTIONS", "DELETE")
                .allowedHeaders("X-Auth-Token", "Content-Type")
                .exposedHeaders("custom-header1", "custom-header2")
                .allowCredentials(false)
                .maxAge(4800);
    }

}