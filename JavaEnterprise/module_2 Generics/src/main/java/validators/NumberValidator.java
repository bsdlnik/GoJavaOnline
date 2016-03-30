package validators;

import interfaces.Validator;

public class NumberValidator implements Validator<Number>{

    @Override
    public boolean isValid(Number value){
        if ((value.intValue() / 2 == 0) && value.intValue() >= 0){
            return false;
        }
        return true;
    }
}
