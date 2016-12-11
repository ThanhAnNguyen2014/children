package com.thanhan.controllers.Admin;

import com.thanhan.models.postbai;
import com.thanhan.services.postbaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by ThanhAnNguyen on 12/9/2016.
 */
@Controller
public class AdHomeController {
    @Autowired
    private postbaiService postbService;
    @RequestMapping("/admin")
    public String AdHome(){
        return "Admin/index";
    }

    @RequestMapping("/admin/listpost")
    public String post(Model model){
        List<postbai> postbais=postbService.findAll();
        model.addAttribute("postbais", postbais);
        return "Admin/listpost";
    }
}
