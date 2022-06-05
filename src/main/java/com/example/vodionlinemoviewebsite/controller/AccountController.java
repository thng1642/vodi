package com.example.vodionlinemoviewebsite.controller;

import com.example.vodionlinemoviewebsite.dto.AccountDto;
import com.example.vodionlinemoviewebsite.model.AccountModel;
import com.example.vodionlinemoviewebsite.repository.AccountRepository;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {

    @Autowired
    AccountRepository accountRepo;

    @PostMapping("/signup")
    public String register(@ModelAttribute("account") @Valid AccountDto accountDto,
            BindingResult bindingResult,
            HttpServletResponse response) {

        if (bindingResult.hasFieldErrors()) {

            System.out.println("Error!");
            return "html/home/index";
        }

        String username = accountDto.getEmail();
        String[] tmp = username.split(",");

        AccountModel accountModel = new AccountModel();
        accountModel.setUserName(tmp[0]);
        accountModel.setPassword(accountDto.getPassword());

        accountRepo.insertNewAccount(tmp[0], accountDto.getPassword());
        String name = accountDto.getEmail().split("@")[0];
        Cookie cookie = new Cookie("name", name);
        response.addCookie(cookie);

        return "redirect:/";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("account")@Valid AccountDto accountDto,
            BindingResult bindingResult,
            HttpServletResponse response) {

        System.out.println(accountDto.toString());
        if (bindingResult.hasGlobalErrors()) {

            System.out.println(bindingResult.getGlobalError());
            return "html/home/index";
        }

        String name = accountDto.getEmail().split("@")[0];
//        System.out.println(name);

        Cookie cookie = new Cookie("name", name);
        response.addCookie(cookie);

        return "redirect:/";
    }
}
