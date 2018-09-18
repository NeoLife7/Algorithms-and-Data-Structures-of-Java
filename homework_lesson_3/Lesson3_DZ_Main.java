import java.util.Stack;

public class Lesson3_DZ_Main {
    public static void main(String[] args) {
        String str = "Dima";

        Stack st = new Stack();
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
         while (!st.isEmpty() ) {
             System.out.println(st.pop());
         }
         if(true)
             return;
    }
}
