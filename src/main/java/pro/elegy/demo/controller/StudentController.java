package pro.elegy.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StudentController {
    @RequestMapping("/test")
    public String test() {
        return "hello student";
    }
}
