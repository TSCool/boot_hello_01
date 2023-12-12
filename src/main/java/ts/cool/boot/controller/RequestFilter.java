package ts.cool.boot.controller;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Description: 请求过滤
 *
 * @author liutianshuo
 * @Date 2023/11/6
 * @Version 1.0
 **/
@Component
@Aspect
public class RequestFilter {
    @Pointcut(value = "execution(* ts.cool.boot.controller.*.*(..)) && args(username)")
    public void publicPointCut(String username){
    }

//    @Pointcut(value = "execution(* ts.cool.boot.controller.*.*(..)) && r")
//    public void publicPointCut2(String username){
//    }

    @Before(value = "publicPointCut(username)")
    public void before(String username){
        System.out.println("请求前参数处理"+username);
        username = "new lts";
    }
}
