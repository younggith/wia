package com.younggi.wia.controller;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("/wia")
@Controller
public class HelloController {

    @GetMapping("")
    public String homeView() {
        return "index";
    }

    @GetMapping("/login")
    public String loginView() {
        return "login/login";
    }

    @GetMapping("/notice")
    public String noticeView() {
        return "notice/notice";
    }

    @GetMapping("/login/join")
    public String joinView() {
        return "login/join";
    }

    @PostMapping("/auth/sms")
    @ResponseBody
    public Hello authSms(@RequestBody Map<String,Object> inputMap){
        Hello hello = new Hello();
        hello.setName(String.valueOf(inputMap.get("name")));
        hello.setTitle(String.valueOf(inputMap.get("title")));
        return hello;
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