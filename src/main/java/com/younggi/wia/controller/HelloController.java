package com.younggi.wia.controller;

import com.younggi.wia.common.bean.ResultMap;
import com.younggi.wia.service.MemberService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Result;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/wia")
@Controller
@RequiredArgsConstructor
public class HelloController {

    private final MemberService memberService;

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

    @GetMapping("/signup/checkId")
    @ResponseBody
    public ResultMap checkId(String id) {
        ResultMap result = new ResultMap();
        String checkId = "test";
        if(checkId.equals(id)){
            result.put("status", 211);
            return result;
        }
        return result;
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