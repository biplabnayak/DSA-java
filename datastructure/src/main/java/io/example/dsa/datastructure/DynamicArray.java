package io.example.dsa.datastructure;

/**
 *
 * @author Biplab Nayak
 */
public class DynamicArray<T> {

    private T[] arr;
    private int length;
    private int capacity;

    public DynamicArray() {
        this.capacity = 1;
        arr = (T[]) new Object[this.capacity];
    }

    /**
     * Constructor with initial capacity
     *
     * @param initialCapacity
     */
    public DynamicArray(int initialCapacity) {
        this.capacity = initialCapacity;
        arr = (T[]) new Object[this.capacity];
    }

    /**
     * adds an element to the array
     *
     * @param element
     */
    public void add(T element) {
        if (length + 1 >= capacity) {
            if (capacity == 0) capacity = 1;
            else capacity *= 2;

            T[] newArr = (T[]) new Object[capacity];

            for (int i = 0; i < length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[length++] = element;
    }

    /**
     * Remove element from a particular index of an array
     *
     * @param index
     * @return
     */
    public T removeAt(int index) {

        if (index >= length) throw new IndexOutOfBoundsException();
        T data = arr[index];
        T[] newArr = (T[]) new Object[length -1];

        for (int i = 0, j = 0; i<length; i++, j++) {

            if(i == index) j--;
            if (j < 0) continue;
            newArr[j] = arr[i];
        }

        arr = newArr;
        this.length--;
        return data;
    }

    public void printData() {
        System.out.print("[");
        for (int i = 0; i<length; i++) {
            System.out.print(this.arr[i]);
            if (i+1 < length) System.out.print(", ");
        }
        System.out.println("]");

    }

    public static void main(String[] args) {

        DynamicArray<String> dynamicArray = new DynamicArray<String>();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");

        dynamicArray.removeAt(2);
        dynamicArray.printData();

    }
}
