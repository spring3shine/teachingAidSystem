package com.teaching.member.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("getAllMembers")
    public List<String> getMember(){
        List<String> allMember = new ArrayList<>();
        allMember.add("member port: "+port);
        allMember.add("zhang3");
        allMember.add("li4");
        allMember.add("wang5");
        return allMember;
    }
}
