package ua.hillel;

public class Main {

    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
        ArrayExceptionTest.printArray(myArray, 0, 5);
        ArrayExceptionTest.printArray(myArray, 2, 40);
        ArrayExceptionTest.printArray(myArray, 3, 4);

        StackOverFlowTest.test();
    }
}
