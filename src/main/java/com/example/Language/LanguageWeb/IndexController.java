package com.example.Language.LanguageWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value ="/addWord")
    public String addW() {
        return "index2";
    }



}
