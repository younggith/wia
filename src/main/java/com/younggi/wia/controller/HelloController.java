package com.younggi.wia.controller;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    public String homeView() {
        return "index";
    }

    @GetMapping("/wia/login")
    public String loginView() {
        return "login/login";
    }

    @GetMapping("/wia/notice")
    public String noticeView() {
        return "notice/notice";
    }

    @GetMapping("/wia/login/join")
    public String joinView() {
        return "login/join";
    }

    @GetMapping("hello")
    @ResponseBody
    public Hello hello(Hello hello, Model model) {
//        model.addAttribute("data", "hello다!!");
        return hello;
    }
    @Data
    static class Hello {
        private String name;
        private String title;
    }
}