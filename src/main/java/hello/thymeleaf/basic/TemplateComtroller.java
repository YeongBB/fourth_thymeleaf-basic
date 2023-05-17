package hello.thymeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")
public class TemplateComtroller {

    @GetMapping("/fragment")
    public String template(){
        return "template/fragment/fragmentMain";
    }

    @GetMapping("/layout")
    public String layou(){
        return "template/layout/layoutMain";
    }

    @GetMapping("/layoutExtend")
    public String layouyExtend(){
        return "template/layoutExtend/layoutExtendMain";
    }
}
