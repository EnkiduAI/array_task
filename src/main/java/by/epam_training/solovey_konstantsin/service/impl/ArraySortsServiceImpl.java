package by.epam_training.solovey_konstantsin.service.impl;

import by.epam_training.solovey_konstantsin.entity.ArrayEntity;
import by.epam_training.solovey_konstantsin.service.ArraySortsService;

public class ArraySortsServiceImpl implements ArraySortsService {
    @Override
    public void bubbleSort(ArrayEntity entity) {
        int []arr = entity.getArray();
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    @Override
    public void insertionSort(ArrayEntity entity) {
        int []arr = entity.getArray();
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    @Override
    public void selectionSort(ArrayEntity entity) {
        int[] arr = entity.getArray();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
