import java.util.*;
public class Reader {
    public static void main(String[] args) {
        //TEST INPUT
        Scanner input = new Scanner(System.in);
        String test = input.nextLine();

        //Leak close
        input.close();
    }
}
