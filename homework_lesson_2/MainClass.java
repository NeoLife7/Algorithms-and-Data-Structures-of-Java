import java.util.Random;

public class MainClass {

    public static void main(String[] args) {
        Random random = new Random();

        Array array = new ArrayImpl(10000);
        for (int i = 0; i < 10000; i++) {
            array.addElement(random.nextInt(10000));
        }


        System.out.println("Size is " + array.getSize());
        array.display();

        System.out.println("Deleting 8000");
        System.out.println(array.deleteElement(8000));
        array.display();
    }
}
