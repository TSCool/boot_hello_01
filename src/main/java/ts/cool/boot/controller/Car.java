package ts.cool.boot.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Description: 配置类实体
 *
 * @author liutianshuo
 * @Date 2023/10/31
 * @Version 1.0
 **/
@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String email;
}
