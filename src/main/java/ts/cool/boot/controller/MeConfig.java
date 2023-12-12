package ts.cool.boot.controller;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Description: 测试类
 *
 * @author liutianshuo
 * @Date 2023/10/27
 * @Version 1.0
 **/
@Import(Person.class)
@Configuration(proxyBeanMethods = true)
@EnableConfigurationProperties(Car.class)
public class MeConfig {
    @Bean//给容器中添加组件，以方法名称作为id
    public Person addPerson(){
        return new Person();
    }
}
