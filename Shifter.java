import java.util.Scanner;

public class Shifter {
    public static void ArrShift(){
      
        char[] roll1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','z'};
        char[] roll2 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','z'};
        char[] roll3 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','z'};
        int Key1 = KeyGen.KeyGen1();
        int Key2 = KeyGen.KeyGen2();
        int Key3 = KeyGen.KeyGen3();

        //ROLLER 1 LEFT
        for(int i = 0; i < Key1; i++){
            char temp1 = roll1[0];
            int j;
            for(j = 0; j < roll1.length-1; j++){
                roll1[j]=roll1[j+1];
            }
                roll1[j]=temp1;
        }

        //ROLLER 2 RIGHT
        for (int x = 0; x < Key2; x++) {
			char temp2 = roll2[roll2.length - 1];
			int y;
			for (y = roll2.length - 1; y > 0; y--){
				roll2[y] = roll2[y - 1];
            }
			roll2[y] = temp2;
		}

        //ROLLER 3 LEFT
        for(int a = 0; a < Key3; a++){
            char temp3 = roll3[0];
            int b;
            for(b = 0; b < roll3.length-1; b++){
                roll3[b]=roll3[b+1];
            }
            roll3[b]=temp3;
        }

        System.out.println(Key1 + " "+ Key2 + " "+ Key3 + " ");

        for(int x = 0; x<roll1.length;x++){
            System.out.print(roll1[x] + " ");
        }
        System.out.println();
        for(int x = 0; x<roll2.length;x++){
            System.out.print(roll2[x] + " ");
        }
        System.out.println();
        for(int x = 0; x<roll3.length;x++){
            System.out.print(roll3[x] + " ");
        }
    }
}