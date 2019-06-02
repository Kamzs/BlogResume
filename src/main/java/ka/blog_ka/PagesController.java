package ka.blog_ka;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController
{

    @GetMapping("/")
    public String getMainPage()
    {
        return "index";
    }

    @GetMapping("/technologies")
    public String getTechnologiesPage()
    {
        return "technologies";
    }

    @GetMapping("/education")
    public String getEducationPage()
    {
        return "education";
    }

    @GetMapping("/experiance")
    public String getExperiancePage()
    {
        return "experiance";
    }

    @GetMapping("/hobbys")
    public String getHobbysPage()
    {
        return "hobbys";
    }


}
