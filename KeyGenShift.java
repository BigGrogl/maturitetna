import java.util.*;

public class KeyGenShift {

    public static void main(String[] args){

        int constanta = 52;
        final char[] cleanArr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','R','S','T','U','V','Z',' ','!','"','?','.',',','(',')'};
        int Key1 = KeyGen(constanta);
        int Key2 = KeyGen(constanta);
        int Key3 = KeyGen(constanta);
        while(Key2==Key1){
            Key2=KeyGen(constanta);
        }
        while(Key3==Key1||Key3==Key2){
            Key3=KeyGen(constanta);
        }

        char[] roll1 = Shifter(Key1);
        char[] roll2 = Shifter(Key2);
        char[] roll3 = Shifter(Key3);



        System.out.printf("%d%n%n", constanta);
        System.out.printf("%d %d %d%n", Key1,Key2,Key3);
        for(int i = 0; i < constanta; i++){
            System.out.print(roll1[i]);
        }System.out.println();
        for(int i = 0; i < constanta; i++){
            System.out.print(roll2[i]);
        }System.out.println();
        for(int i = 0; i < constanta; i++){
            System.out.print(roll3[i]);
        }
        
        String str = Reader.Read();
        // Creating array of string length
        char[] ch = new char[str.length()];
        char[] encoded = new char[str.length()];
        char[] encoded2 = new char[str.length()];
        char[] encodedFinal = new char[str.length()];
        int[] index = new int[str.length()];
        int[] index2 = new int[str.length()];
        int[] index3 = new int[str.length()];
      
        // Copy character by character into array
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        //compare clean arr with string arr
        for(int i = 0; i < str.length();i++){
            for(int j = 0; j < cleanArr.length;j++){
               if(ch[i] == cleanArr[j]){
                   index[i] = j;
               }
            }
        }
        //encode string arr into first encode
        char startChar = roll1[0];
        System.out.println(startChar);
        for(int i = 0; i < str.length();i++){
            encoded[i] = roll1[index[i]];
                char temp1 = roll1[0];
                int j;
                for(j = 0; j < roll1.length-1; j++){
                    roll1[j]=roll1[j+1];
                }
                    roll1[j]=temp1;
            }
        for(int i = 0; i < encoded.length; i++){
            System.out.printf("%c", encoded[i]);
        }

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

    public static char[] Shifter (int key){
        //ROLLER
        final char[] cleanArr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','R','S','T','U','V','Z',' ','!','"','?','.',',','(',')'};
        char[] tabela = cleanArr;
        for(int i = 0; i < key; i++){
            char temp1 = tabela[0];
            int j;
            for(j = 0; j < tabela.length-1; j++){
                tabela[j]=tabela[j+1];
            }
                tabela[j]=temp1;
        }
        return tabela;
    }
}