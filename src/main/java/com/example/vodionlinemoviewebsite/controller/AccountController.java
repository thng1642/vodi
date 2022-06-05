package com.example.vodionlinemoviewebsite.controller;

import com.example.vodionlinemoviewebsite.dto.AccountDto;
import com.example.vodionlinemoviewebsite.model.AccountModel;
import com.example.vodionlinemoviewebsite.repository.AccountRepository;
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
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {

            System.out.println("Error!");
            return "html/home/index";
        }

        String username = accountDto.getEmail();
        String[] tmp = username.split(",");
//        accountDto.setEmail(tmp[0]);

        AccountModel accountModel = new AccountModel();
        accountModel.setUserName(tmp[0]);
        accountModel.setPassword(accountDto.getPassword());

        accountRepo.insertNewAccount(tmp[0], accountDto.getPassword());

//        accountDto.

//        System.out.println(accountDto.getEmail());
        return "redirect:/";
    }
}
