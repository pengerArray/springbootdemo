package cn.it8090.springbootdemo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description   全局异常处理类：
 * @PoweredBy Amour Mars
 * @Date 18:32 2018/1/22
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    //捕获运行时异常
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> exceptionHandler(){
        Map<String,Object> result = new HashMap<>();
        result.put("code","500");
        result.put("msg","系统错误，请稍后重试...");
        return  result;
    }
}
