package com.example.vodionlinemoviewebsite.error;

import com.example.vodionlinemoviewebsite.repository.AccountRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailValidator implements ConstraintValidator<EmailValidation, String> {

    @Autowired
    private AccountRepository repo;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        s = s.split(",")[0];
        String userName = repo.findEmail(s);
        
        if (userName == null) return true;

        if (userName.isEmpty()) return true;
        else return false;
    }

//    @Override
//    public void initialize(EmailValidation constraintAnnotation) {
//        ConstraintValidator.super.initialize(constraintAnnotation);
//        
//        constraintAnnotation.
//    }
}
