package com.younggi.wia.controller;

import com.younggi.wia.common.bean.ResultMap;
import com.younggi.wia.common.controller.CommonController;
import com.younggi.wia.service.MemberService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/wia")
@Controller
@RequiredArgsConstructor
public class HelloController extends CommonController {

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
    public String authSms(@RequestBody HashMap<String,Object> inputMap, Model model){
        Hello hello = new Hello();
        hello.setName(String.valueOf(inputMap.get("name")));
        hello.setTitle(String.valueOf(inputMap.get("title")));
        model.addAllAttributes(inputMap);
        return JSON_VIEW;
    }

    @PostMapping("/signup/create")
    public String createUser(@RequestBody HashMap<String,Object> dataMap, Model model){
        System.out.println(dataMap.toString());
        model.addAllAttributes(dataMap);
        return JSON_VIEW;
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