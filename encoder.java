public class encoder {
    public static void main(String[] args){

        int[] Key = new int[3];
        for(int i = 0; i < 2; i++){
            Key[i] = KeyGenShift.KeyGen(52);
        }
        System.out.printf("%d %d %d%n", Key[0],Key[1],Key[2]);
        Encode(KeyGenShift.encode(Key[0]),KeyGenShift.encode(Key[1]),KeyGenShift.encode(Key[2]), Reader.Read(), KeyGenShift.index(StringToChar(Reader.Read()));

    }

    public static char[] StringToChar(String input){
        char[] inputString = new char[input.length()];
        for(int i = 0; i < input.length(); i++){
            inputString[i]=input.charAt(i);
        }
        return inputString;
    }

    public static void Encode(char[] code1,char[] code2,char[] code3, String input, int[] index){
        int count = 0;
        char[] encoded = new char[input.length()];
        for(int i = 0; i < input.length(); i++){

            if(count < 51){
                for(int j = 0; j < code1.length; j++){

                    encoded[i] = code1[index[i]];

                    char temp = code1[0];
                    int k;
                    for(i = 0; i < 52; i++){
                        code1[i]=code1[i+1];
                    }
                    code1[i]=temp;
                }
            }
        }
    }









}
