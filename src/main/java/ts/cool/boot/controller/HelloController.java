package ts.cool.boot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 控制器
 *
 * @author liutianshuo
 * @Date 2023/10/26
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @RequestMapping(value = "/hello/{username}",method = RequestMethod.GET)
    public String hello(@PathVariable(value = "username") String username){
        System.out.println("处理后参数"+username);
        MyIntercepter myIntercepter = new MyIntercepter() {
            @Override
            public int reduce(int a, int b){
                return a+b;
            }
        };
        System.out.println(myIntercepter.reduce(1,2));
        MyIntercepter myIntercepter1 = (a,b) -> {
            System.out.println("lambda实现接口");
            return a+b;
        };
        System.out.println(myIntercepter1.reduce(3,5));
        return "hello springboot";
    }

}
