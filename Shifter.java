import java.util.Scanner;

public class Shifter {
    public static void ArrShift(){
      
        char[] roll1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','z'};
        char[] roll2 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','z'};
        char[] roll3 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','z'};
        int Key1 = KeyGen.KeyGenerator();

        for(int i = 0; i < Key1; i++){
            char temp = roll1[0];
            for(int j = 0; j < roll1.length-1; j++){
                roll1[j]=roll1[j+1];
                roll1[j]=temp;
            }
        }

        for(int x = 0; x<roll1.length;x++){
            System.out.print(roll1[x] + " ");
        }
    }
}