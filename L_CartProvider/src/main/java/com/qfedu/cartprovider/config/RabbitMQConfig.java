package com.qfedu.cartprovider.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * projectName: last
 *
 * @author: 武圣杰
 * time: 2020/11/4 22:01
 * description:
 */
@Configuration
public class RabbitMQConfig {
    public static String qname_cart="cart-sync";
    @Bean
    public Queue createQu(){
        return new Queue(qname_cart);
    }
}
