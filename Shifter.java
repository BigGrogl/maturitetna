import java.util.Scanner;

public class Shifter {
    public static void ArrShift(){
      
        char[] roll1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','z'};
        char[] roll2 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','z'};
        char[] roll3 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','z'};
        int Key1 = KeyGen.KeyGenerator();

        //ROLLER 1 LEFT
        for(int i = 0; i < Key1; i++){
            char temp = roll1[0];
            int j;
            for(j = 0; j < roll1.length-1; j++){
                roll1[j]=roll1[j+1];
            }
                roll1[j]=temp;
        }

        //ROLLER 2 RIGHT
        for (int i = 0; i < Key1; i++) {
			char temp = roll2[roll1.length - 1];
			int j;
			for (j = roll2.length - 1; j > 0; j--){
				roll2[j] = roll2[j - 1];
            }
			roll2[j] = temp;
		}

        //ROLLER 3 LEFT
        for(int i = 0; i < Key1; i++){
            char temp = roll3[0];
            int j;
            for(j = 0; j < roll3.length-1; j++){
                roll3[j]=roll3[j+1];
            }
            roll3[j]=temp;
        }

        for(int x = 0; x<roll1.length;x++){
            System.out.print(roll1[x] + " ");
        }
        System.out.println();
        for(int x = 0; x<roll2.length;x++){
            System.out.print(roll1[x] + " ");
        }
        System.out.println();
        for(int x = 0; x<roll3.length;x++){
            System.out.print(roll1[x] + " ");
        }
    }
}