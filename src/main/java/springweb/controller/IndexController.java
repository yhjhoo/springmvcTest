package springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping(value="/sss")
    public String index() {
        return "index.jsp";
    }
    
    @RequestMapping(value="/test")
    public String test() {
        return "test1.jsp";
    }
}
