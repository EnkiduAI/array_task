package by.epam_training.solovey_konstantsin.service;

import by.epam_training.solovey_konstantsin.entity.ArrayEntity;

public interface ArrayService {

    int searchMin(ArrayEntity entity);

    int searchMax(ArrayEntity entity);

    int averageOfTheArray(ArrayEntity entity);

    void exchangeOneToZero(ArrayEntity entity);

    int sumOfArray(ArrayEntity entity);

    int negativeElements(ArrayEntity entity);

    int positiveElements(ArrayEntity entity);

}
