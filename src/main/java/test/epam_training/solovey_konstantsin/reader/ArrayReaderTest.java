package test.epam_training.solovey_konstantsin.reader;

import by.epam_training.solovey_konstantsin.exception.ArrayException;
import by.epam_training.solovey_konstantsin.reader.impl.ArrayReaderImpl;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class ArrayReaderTest {
    final String FILE_PATH = "target/classes/data/readThis";
    private final ArrayReaderImpl reader = new ArrayReaderImpl();

    @Test
    void arrayReaderTest() throws ArrayException {
        List<String> arrayLines = reader.readFromFile(FILE_PATH);
        String actual = arrayLines.get(0);
        String expected = "1, 2, 3, 4";
        assert (actual.equals(expected));
    }
}
