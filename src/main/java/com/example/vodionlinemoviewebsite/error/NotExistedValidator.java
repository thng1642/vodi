package com.example.vodionlinemoviewebsite.error;

import com.example.vodionlinemoviewebsite.repository.AccountRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class NotExistedValidator implements ConstraintValidator<EmailNotExisted, String> {

    @Autowired
    AccountRepository repo;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        s = s.split(",")[0];
        String userName = repo.findEmail(s);


        if (userName.isEmpty() || userName == null) return false;
        else return true;
    }
}
