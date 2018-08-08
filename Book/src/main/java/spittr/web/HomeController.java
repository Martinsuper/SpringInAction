package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName HomeController
 * @Description
 * @Author martind
 * @Date 2018/8/7 15:25
 **/
@Controller
//@RequestMapping({"/","home"})
public class HomeController {
    @RequestMapping(value = "/homepage", method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}
