package com.example.demo.handler;


import com.example.demo.entity.ErrorInfo;
import com.example.demo.util.MyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理类
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    public static final String DEFAULT_ERROR_VIEW = "error";


//    @ResponseBody
//    @ExceptionHandler(value = Exception.class)
//    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e)throws Exception{
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("message",e.getMessage());
//        mv.addObject("url",req.getRequestURI());
//        mv.setViewName(DEFAULT_ERROR_VIEW);
//        log.info(e.getMessage());
//        log.info(req.getRequestURI());
//        //System.out.println(e.getMessage());
//        //System.out.println(req.getRequestURI());
//        return mv;
//    }

    @ResponseBody
    @ExceptionHandler(value = MyException.class)
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req, MyException e) throws Exception {
        ErrorInfo<String> r = new ErrorInfo<>();
        r.setMessage(e.getMessage());
        r.setCode(ErrorInfo.ERROR);
        r.setData("Some Data");
        r.setUrl(req.getRequestURL().toString());
        return r;
    }
}
