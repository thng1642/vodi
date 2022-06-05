package com.example.vodionlinemoviewebsite.error;

import com.example.vodionlinemoviewebsite.dto.AccountDto;
import com.example.vodionlinemoviewebsite.repository.AccountRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class PasswordValidator implements ConstraintValidator<PasswordValidation,
            AccountDto> {

    @Autowired
    private AccountRepository repo;

    @Override
    public boolean isValid(AccountDto accountDto,
            ConstraintValidatorContext constraintValidatorContext) {
        String email =  accountDto.getEmail().split(",")[0];
        String myPass = repo.findPassword(email);
        String password = accountDto.getPassword();


        if (myPass == null) return false;

        return myPass.equals(password);
    }
}
