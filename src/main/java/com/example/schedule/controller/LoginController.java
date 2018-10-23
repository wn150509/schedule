package com.example.schedule.controller;

import com.example.schedule.entity.Sporter;
import com.example.schedule.service.LoginService;
import com.example.schedule.service.WalksService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/st")
public class LoginController {
    @Resource
    private LoginService loginService;
    @Resource
    private WalksService walksService;

    @GetMapping("/login")
    public Sporter getuser(String account, String password){
        return loginService.findone(account,password);
    }
    @GetMapping("/oneuser")
    public Sporter getone(String account){
        return loginService.getOne(account);
    }
    @GetMapping("/all")
    public List<Sporter>getall(){
        return loginService.getAll();
    }

}
