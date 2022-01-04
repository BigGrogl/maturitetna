import java.util.Scanner;

public class Shifter {
    public static void ArrShift(){
      
        char[] roll1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','z'};
        char[] roll2 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','z'};
        char[] roll3 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','z'};

        //SHIFT 1
        char last1 = roll1[roll1.length-1];
        for(int index1 = roll1.length-1; index1 >= 0; index1--){
            roll1[index1+1]=roll1[index1];
        }
        roll1[0]=last1;

        //SHIFT 2
        char last2 = roll2[roll2.length-1];
        for(int index2 = roll2.length-1; index2 >= 0; index2--){
            roll2[index2+1]=roll2[index2];
        }
        roll2[0]=last2;

        //SHIFT 2
        char last3 = roll3[roll3.length-1];
        for(int index3 = roll3.length-1; index3 >= 0; index3--){
            roll3[index3+1]=roll3[index3];
        }
        roll3[0]=last3;

        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);
    }
}
