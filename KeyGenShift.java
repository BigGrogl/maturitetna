import java.util.*;

public class KeyGenShift {

    public static void main(String[] args){

        int constanta = 52;
        int[] Key = new int[3];
        for(int i = 0; i < 2; i++){
            Key[i] = KeyGen(constanta);
        }

        System.out.printf("%d%n%n", constanta);
        System.out.printf("%d %d %d%n", Key[0],Key[1],Key[2]);

    }

    
    //STRING TO ARRAY
    public static char[] CharArr(){
        // Creating array of string length
        String str = Reader.Read();
        char[] stringChar = new char[str.length()];

        // Copy character by character into array
        for (int i = 0; i < str.length(); i++) {
            stringChar[i] = str.charAt(i);
        }

        return stringChar;
    }

    //KEY GEN
    public static int KeyGen(int X){
        Random r = new Random();
        int key = r.nextInt(X);
        while(key==0){
            key = r.nextInt(X);
        }
        return key;
    }

    //cipher
    public static char[] encode(int key){
        final char[] cleanArr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','R','S','T','U','V','Z',' ','!','"','?','.',',','(',')'};
        char[] cipher = cleanArr;
            for(int j = 0; j < key; j++){
                char temp = cleanArr[0];
                int i;
                for(i = 0; i < cleanArr.length; i++){
                    cipher[i]=cipher[i+1];
                }
                cipher[i]=temp;
            }
        return cipher;
    }
}