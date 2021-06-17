package by.epam_training.solovey_konstantsin.parser.impl;

import by.epam_training.solovey_konstantsin.entity.ArrayEntity;
import by.epam_training.solovey_konstantsin.parser.ArrayParser;
import by.epam_training.solovey_konstantsin.validator.impl.ArrayValidatorImpl;


import java.util.ArrayList;
import java.util.List;

public class ArrayParserImpl implements ArrayParser {
    private static final String SPLIT_ARRAY_REGEX = "(\\s\\-\\s)|(\\,\\s)|(\\s)";
    private final ArrayValidatorImpl validator = new ArrayValidatorImpl();

    @Override
    public List<ArrayEntity> parseToInt(List<String> stringList) {
        List<ArrayEntity> parsedList = new ArrayList<>();
        int[] parsedArray;
        for (String line : stringList) {
            if (validator.isValid(line)) {
                String[] splitString = line.split(SPLIT_ARRAY_REGEX);
                parsedArray = new int[splitString.length];
                for(int i = 0; i<parsedArray.length; i++){
                    parsedArray[i] = Integer.parseInt(splitString[i]);
                }
                parsedList.add(new ArrayEntity(parsedArray));
            }
        }
        return parsedList;
    }
}
