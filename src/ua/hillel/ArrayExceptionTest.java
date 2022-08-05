package ua.hillel;

public class ArrayExceptionTest {

    public static void printArray(int[] array, int start, int end) {
        int index = 0;
        try {
            for (int i = 0; i < end; i++) {
                if (i >= start) {
                    index = i;
                    System.out.println(array[i]);
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка. Попытка обращения к несуществующему индексу: " +
                    "текущий индекс = " + (index + 1) + "; размер массива = " + array.length + ";");
        } finally {
            System.out.println("\n");
        }
    }
}
