package com.thanhan.controllers;

import com.thanhan.models.chude;
import com.thanhan.models.postbai;
import com.thanhan.services.chudeService;
import com.thanhan.services.postbaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ThanhAnNguyen on 12/6/2016.
 */
@Controller
public class HomeController {
    @Autowired
    private chudeService cdService;
    @Autowired
    private postbaiService postService;

    @RequestMapping("/")
    public String Home(Model model){
        List<chude> chude= cdService.findAll();
        model.addAttribute("chudes", chude);
        List<postbai> post = postService.findAll().stream().limit(3).collect(Collectors.toList());
        model.addAttribute("post5new", post);
        return "index";
    }
}
