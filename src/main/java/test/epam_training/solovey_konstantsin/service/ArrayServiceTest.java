package test.epam_training.solovey_konstantsin.service;

import by.epam_training.solovey_konstantsin.entity.ArrayEntity;
import by.epam_training.solovey_konstantsin.service.impl.ArrayServiceImpl;
import by.epam_training.solovey_konstantsin.service.impl.ArraySortsServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;


public class ArrayServiceTest {
    static final Logger logger = LogManager.getLogger(ArrayServiceTest.class);
    private final ArrayServiceImpl service = new ArrayServiceImpl();
    private final ArraySortsServiceImpl sortsService = new ArraySortsServiceImpl();
    private final ArrayEntity basicArray = new ArrayEntity(3, -1, 2, 5, 8, -2, -1, 0);
    private final ArrayEntity onesAndZeroes = new ArrayEntity(2, 1, 4, 1, 0, 2, 4, 1, 3, 1);
    private final ArrayEntity sumOfElements = new ArrayEntity(1, 2, 3, 4, 5, 6, 7, 8, 9);
    private final ArrayEntity averageOfElements = new ArrayEntity(2, 3, 5, 4, 3, 6, 7, 2);
    private final ArrayEntity sortsArray = new ArrayEntity(4, 3, 5, 7, 8, 2, 9, 1, 6);

    @Test
    void minNumberTest() {
        logger.info("minNumberTest start");
        int actual = service.searchMin(basicArray);
        int expected = -2;
        assert (actual == expected);
    }

    @Test
    void maxNumberTest() {
        logger.info("maxNumberTest start");
        int actual = service.searchMax(basicArray);
        int expected = 8;
        assert (actual == expected);
    }

    @Test
    void onesAndZeroesTest() {
        logger.info("onesAndZeroes start");
        service.exchangeOneToZero(onesAndZeroes);
        ArrayEntity expected = new ArrayEntity(2, 0, 4, 0, 0, 2, 4, 0, 3, 0);
        assert (onesAndZeroes.equals(expected));
    }

    @Test
    void sumOfElementsTest() {
        logger.info("sumOfElements start");
        int actual = service.sumOfArray(sumOfElements);
        int expected = 45;
        assert (actual == expected);
    }

    @Test
    void averageOfElementsTest() {
        logger.info("averageOfElements start");
        int actual = service.averageOfTheArray(averageOfElements);
        int expected = 4;
        assert (actual == expected);
    }

    @Test
    void bubbleSortTest() {
        logger.info("bubbleSortTest start");
        sortsService.bubbleSort(sortsArray);
        ArrayEntity expected = new ArrayEntity(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assert (sortsArray.equals(expected));
    }

    @Test
    void insertionSortTest(){
        logger.info("insertionSortTest start");
        sortsService.insertionSort(sortsArray);
        ArrayEntity expected = new ArrayEntity(1,2,3,4,5,6,7,8,9);
        assert (sortsArray.equals(expected));
    }

    @Test
    void selectionSortTest(){
        logger.info("selectionSortTest start");
        sortsService.selectionSort(sortsArray);
        ArrayEntity expected = new ArrayEntity(1,2,3,4,5,6,7,8,9);
        assert (sortsArray.equals(expected));
    }
}
