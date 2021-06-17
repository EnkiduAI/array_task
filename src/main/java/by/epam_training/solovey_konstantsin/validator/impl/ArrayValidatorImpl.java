package by.epam_training.solovey_konstantsin.validator.impl;

import by.epam_training.solovey_konstantsin.validator.ArrayValidator;

public class ArrayValidatorImpl implements ArrayValidator {
    private static final String REGEX_ARRAY = "^-?(\\d*[\\ \\-\\,]*)*";
    @Override
    public boolean isValid(String string) {
        return string.matches(REGEX_ARRAY);
    }
}
