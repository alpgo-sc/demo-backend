package pro.elegy.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/test")
public class StudentController {
    public ModelAndView student() {
        System.out.println("执行ModelAndView的studnet方法");
        //把数据保存到ModelAndView（相当于保存request域对象）
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","Spring MVC");

        //返回一个物理路径
        mv.setViewName("/WEB-INF/jsp/sucess.jsp");
        return mv;
    }
}
