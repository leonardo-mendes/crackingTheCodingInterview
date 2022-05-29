package dataStructure.chapter01.implArray;

import java.util.Arrays;

public class ArrayListImpl<T> {

    private Object[] array;

    ArrayListImpl() {
        array = new Object[0];
    }

    public T get(int index){
        return (T) this.array[index];
    }

    public void add(T value) {
        this.generateNewArray(1);
        this.array[this.array.length - 1] = value;
    }

    private void generateNewArray(int approachArg) {
        array = Arrays.copyOf(this.array, this.array.length + approachArg);
    }

    public int size() {
        return this.array.length;
    }

    public void remove(int index) {
        final int newSize;
        if ((newSize = this.array.length - 1) > index)
            System.arraycopy(array, index + 1, array, index, newSize - index);
        this.generateNewArray(-1);
    }

    public boolean isEmpty() {
        return this.array.length == 0;
    }

    public void add(T value, int index) {
        this.generateNewArray(1);
        System.arraycopy(this.array, index,
                this.array, index + 1,
                (this.array.length - 1) - index);
        this.array[index] = value;
    }
}