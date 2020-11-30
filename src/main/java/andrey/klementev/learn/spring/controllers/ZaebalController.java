package andrey.klementev.learn.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ZaebalController {
    @RequestMapping(value = "/zaebal", method = RequestMethod.GET)
    public String Zaebal() {
        return "index.jsp";
    }
}
