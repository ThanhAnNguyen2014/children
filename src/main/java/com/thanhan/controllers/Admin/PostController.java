package com.thanhan.controllers.Admin;

import com.thanhan.models.chude;
import com.thanhan.models.postbai;
import com.thanhan.services.chudeService;
import com.thanhan.services.postbaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

/**
 * Created by ThanhAnNguyen on 12/11/2016.
 */
@Controller
public class PostController {
    @Autowired
    private postbaiService postService;
    @Autowired
    private chudeService cdService;
    @RequestMapping("/admin/createpost")
    public String CreatePost(Model model){
        model.addAttribute("post",new postbai());

        List<chude> chude= cdService.findAll();
        model.addAttribute("title", chude);
        return "Admin/post/postnew";
    }
    @RequestMapping(value = "post",method = RequestMethod.POST)
    public String savePost( @RequestParam("file")MultipartFile file,postbai post){
        // upload image
        String name=file.getOriginalFilename();
        if(!file.isEmpty()){
            try
            {
                byte[] bytes = file.getBytes();
                // Create the directory to store file
                File dir = new File( "src/main/resources/static/Upload");
                if(!dir.exists())
                    dir.mkdirs();
                // Create the file on Server
                File serverFile = new File(dir.getPath() + File.separator + name);
                BufferedOutputStream stream=new BufferedOutputStream( new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();

            }
            catch (Exception e){
                return "You failed to upload =>" + e.getMessage();
            }
        }else {
            return "You failed to upload " + file.getName()
                    + " because the file was empty.";
        }
        post.setImage(name);
        postService.Save(post);
        return "redirect:/admin/listpost";
    }
    @RequestMapping("/admin/edit/post/{id}")
    public String edit(@PathVariable Long id, Model model){
        model.addAttribute("post", postService.findById(id));
        List<chude> chude= cdService.findAll();
        model.addAttribute("title", chude);
        return "Admin/post/postnew";
    }

}
