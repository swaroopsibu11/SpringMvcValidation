package com.app.test.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<Password,String>
{
	public boolean isValid(String s, ConstraintValidatorContext cvc) 
	{  
        
        boolean result=s.contains("evry");  
        return result;  
    
	}  
}
