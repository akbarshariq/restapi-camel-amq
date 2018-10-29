package com.example.restapi;

/**
 * Created by Shariq on 29/10/18.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public MessageStorage customerStorage() {
        return new MessageStorage();
    }
}
