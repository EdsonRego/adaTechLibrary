package com.edsonrego.library.controllers;

import com.edsonrego.library.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class MemberController {

    @Autowired
    private MemberService service;

}
