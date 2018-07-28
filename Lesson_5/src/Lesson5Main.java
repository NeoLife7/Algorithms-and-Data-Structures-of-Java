public class Lesson5Main {

    public static void main(String[] args) {
        int value = -5;
//        while (value > 0) {
//            System.out.println(value);
//            value--;
//        }
//        countdown(value);

//        System.out.println(factorial(5));

        Anagramm anagramm = new Anagramm("кот");
        anagramm.getAnagramm();
    }

    private static int countdown(int value) {
        if (value > 0) {
            return value;
        }
        System.out.println(value);
        return countdown(value - 1);
    }

    private static int factorial(int n) {
        if (n == 1)
            return 1;

        return n * factorial(n - 1);
    }
}