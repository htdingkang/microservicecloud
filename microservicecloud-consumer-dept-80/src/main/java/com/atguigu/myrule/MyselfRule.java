package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//RibbonClient  自定义的负载均衡规则所在的包不能被主启动类@ComponentScan注解扫描到。
//否则我们自定义的这个配置就会被所有的ribbon客户端共享，就不能达到特殊化定制的目的了。
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule_DK();
    }
}

