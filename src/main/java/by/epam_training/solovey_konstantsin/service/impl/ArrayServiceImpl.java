package by.epam_training.solovey_konstantsin.service.impl;

import by.epam_training.solovey_konstantsin.entity.ArrayEntity;
import by.epam_training.solovey_konstantsin.service.ArrayService;
import org.apache.logging.log4j.Logger;

public class ArrayServiceImpl implements ArrayService {
    Logger logger;

    @Override
    public int searchMin(ArrayEntity entity) {
//        logger.info("searchMin method start");
        int[] array = entity.getArray();
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public int searchMax(ArrayEntity entity) {
//        logger.info("searchMax method start");
        int[] array = entity.getArray();
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public int averageOfTheArray(ArrayEntity entity) {
        logger.info("averageOfTheArray method start");
        int[] array = entity.getArray();
        int sum = 0;
        int average;
        for (int j : array) {
            sum += j;
        }
        average = sum / array.length;
        return average;
    }

    @Override

    public void exchangeOneToZero(ArrayEntity entity) {
        logger.info("exchangeOneToZero method start");
        int[] array = entity.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            }
        }
    }

    @Override
    public int sumOfArray(ArrayEntity entity) {
        logger.info("sumOfArray method start");
        int[] array = entity.getArray();
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    @Override
    public int negativeElements(ArrayEntity entity) {
        logger.info("negativeElements method start");
        int[] array = entity.getArray();
        int negativeElem = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeElem++;
            }
        }
        return negativeElem;
    }

    @Override
    public int positiveElements(ArrayEntity entity) {
        logger.info("positiveElements method start");
        int[] array = entity.getArray();
        int positiveElem = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveElem++;
            }
        }
        return positiveElem;
    }
}
