package ka.blog_ka;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController
{

    @GetMapping("/")
    public String getMainPage(){return "index";}
}
