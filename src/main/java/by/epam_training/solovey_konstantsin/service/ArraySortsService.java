package by.epam_training.solovey_konstantsin.service;

import by.epam_training.solovey_konstantsin.entity.ArrayEntity;

public interface ArraySortsService {
    void bubbleSort(ArrayEntity entity);

    void insertionSort(ArrayEntity entity);

    void selectionSort(ArrayEntity entity);

}
