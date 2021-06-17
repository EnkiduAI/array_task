package by.epam_training.solovey_konstantsin.reader;

import by.epam_training.solovey_konstantsin.exception.ArrayException;

import java.util.List;

public interface ArrayReader {
      List<String> readFromFile(String filepath) throws ArrayException;
}
