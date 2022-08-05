package ua.hillel;

public class StackOverFlowTest {
    private static int count;

    public static void test() {
        try {
            count = 0;
            test();
        } catch (StackOverflowError e) {
            System.out.println("В Java нельзя поймать ошибки?");
        }
    }
}
