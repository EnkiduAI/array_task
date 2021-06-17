package by.epam_training.solovey_konstantsin.entity;

import java.util.Arrays;

public class ArrayEntity {
    private int[] array;


    public ArrayEntity(int... array) {
        this.array = array;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ArrayEntity{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayEntity arrayEntity1 = (ArrayEntity) o;
        return Arrays.equals(array, arrayEntity1.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}
