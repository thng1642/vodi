package com.example.vodionlinemoviewebsite.controller;

import com.example.vodionlinemoviewebsite.dto.AccountDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
//    Return Home
    @RequestMapping("home")
    public String home(){
        return "html/home/index";
    }

    @GetMapping("/")
    public String index(Model model){

        AccountDto account = new AccountDto();

        model.addAttribute("account", account);
        return "html/home/index";
    }

//    Account Detail
    @GetMapping("account")
    public String account(){
        return "html/account/account";
    }

//    Archive
    @GetMapping("movies")
    public String movies(){
        return "html/archive/movies";
    }

    @GetMapping("sports")
    public String sports(){
        return "html/archive/sports";
    }

    @GetMapping("tv_shows")
    public String tv_shows(){
        return "html/archive/tv-shows";
    }

//    Blog
    @GetMapping("blog")
    public String blog(){
        return "html/blog/blog";
    }

//    Packet Subscription
    @GetMapping("packet_subscription")
    public String packet_subscription(){
        return "html/packet-subscription/packet-subscription";
    }

//    Single Movies
    @GetMapping("/single_movies_v3")
    public String single_movies_v3(){
        return "html/single-movies/single-movies-v3";
    }

//    Contact
    @GetMapping("contact")
    public String contact(){
        return "html/static/contact";
    }

//    Upload Video
    @GetMapping("upload_video")
    public String upload_video(){
        return "html/upload-video/upload-video";
    }

}
