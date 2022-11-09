package com.younggi.wia.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Configuration
public class SpringConfig {

    @Bean
    MappingJackson2JsonView jsonView(){
        return new MappingJackson2JsonView();
    }

    @Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setDefaultEncoding("UTF-8"); // 파일 인코딩 설정
        //multipartResolver.setMaxUploadSize(1024*1024*500);
        return multipartResolver;
    }
}
