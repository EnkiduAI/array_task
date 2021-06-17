package test.epam_training.solovey_konstantsin.parser;


import by.epam_training.solovey_konstantsin.entity.ArrayEntity;
import by.epam_training.solovey_konstantsin.exception.ArrayException;
import by.epam_training.solovey_konstantsin.parser.impl.ArrayParserImpl;
import by.epam_training.solovey_konstantsin.reader.impl.ArrayReaderImpl;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ParserTest {
    public static final ArrayReaderImpl reader = new ArrayReaderImpl();
    public static final ArrayParserImpl parser = new ArrayParserImpl();
    final String FILE_PATH = "target/classes/data/readThis";

    @Test
    void parserTest() throws ArrayException {
        List<String> stringArray = reader.readFromFile(FILE_PATH);
        List<ArrayEntity> actual = parser.parseToInt(stringArray);
        List<ArrayEntity> expected = new ArrayList<>();
        ArrayEntity array1 = new ArrayEntity(1, 2, 3, 4);
        ArrayEntity array2 = new ArrayEntity(3, 4, 6, 5);
        ArrayEntity array3 = new ArrayEntity(8, 2, 5, 3);
        expected.add(array1);
        expected.add(array2);
        expected.add(array3);
        assert (expected.equals(actual));
    }
}
