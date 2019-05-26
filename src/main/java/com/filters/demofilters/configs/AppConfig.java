package com.filters.demofilters.configs;

import com.filters.demofilters.Interceptor.MyFirstInterceptor;
import com.filters.demofilters.Interceptor.MySecondInterceptor;
import com.filters.demofilters.filters.MySecondServletFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Bean
    public FilterRegistrationBean<MySecondServletFilter> registerMySecondFilter(){
        FilterRegistrationBean<MySecondServletFilter> registrationBean
                = new FilterRegistrationBean<>();
        registrationBean.setFilter(new MySecondServletFilter());
        registrationBean.addUrlPatterns("/myController");
        return registrationBean;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyFirstInterceptor());
        registry.addInterceptor(new MySecondInterceptor())
        .addPathPatterns("/myController")
        .addPathPatterns("/throwEx");
    }
}
