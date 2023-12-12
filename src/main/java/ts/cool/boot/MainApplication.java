package ts.cool.boot;

/**
 * Description: 主程序
 *
 * @author liutianshuo
 * @Date 2023/10/26
 * @Version 1.0
 **/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.metrics.ApplicationStartup;
import org.springframework.context.annotation.ComponentScan;

/**
 * 主程序类
 * 通过SpringBootApplication告诉Springboot这是一个SpringBoot应用
 */
@SpringBootApplication(scanBasePackages = "ts.cool")
public class MainApplication {
    public static void main(String[] args) {
        //获取Ioc容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //查看容器里面的组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
    }
}
