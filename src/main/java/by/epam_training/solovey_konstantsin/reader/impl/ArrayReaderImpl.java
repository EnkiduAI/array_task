package by.epam_training.solovey_konstantsin.reader.impl;

import by.epam_training.solovey_konstantsin.exception.ArrayException;
import by.epam_training.solovey_konstantsin.reader.ArrayReader;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ArrayReaderImpl implements ArrayReader{

    @Override
    public List<String> readFromFile(String filepath) throws ArrayException {
        List<String> lines;
        try{
            lines = Files.readAllLines(Paths.get(filepath), StandardCharsets.UTF_8);
        }catch (IOException e){
            throw new ArrayException("File not found", e);
        }
        return lines;
    }
}
