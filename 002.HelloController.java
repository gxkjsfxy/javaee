package p.controller;//自定义

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
//@RestController
public class HelloController {

    @GetMapping("/hello")
    //@RequestMapping


    @Override
    public String toString() {
        return "This is from web info";
    }
}
