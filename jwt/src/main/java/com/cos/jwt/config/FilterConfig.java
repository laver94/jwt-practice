package com.cos.jwt.config;

import com.cos.jwt.filter.MyFilter1;
import com.cos.jwt.filter.MyFilter2;
import com.cos.jwt.filter.MyFilter3;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

  @Bean
  public FilterRegistrationBean<MyFilter3> filter3() {
    FilterRegistrationBean<MyFilter3> bean = new FilterRegistrationBean<>();
    bean.setFilter(new MyFilter3());
    bean.addUrlPatterns("/*");
    bean.setOrder(0);
    return bean;
  }

  @Bean
  public FilterRegistrationBean<MyFilter2> filter2() {
    FilterRegistrationBean<MyFilter2> bean = new FilterRegistrationBean<>();
    bean.setFilter(new MyFilter2());
    bean.addUrlPatterns("/*");
    bean.setOrder(1);
    return bean;
  }
}
