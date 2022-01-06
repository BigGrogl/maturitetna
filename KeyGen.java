import java.util.*;
public class KeyGen {
    public static int KeyGenerator(){
        Random r = new Random();
        int key1 = r.nextInt(9);
        int key2 = r.nextInt(9);
        int key3 = r.nextInt(9);
        while(key1==key2||key1==key3||key2==key3)
        {
            if(key1==0){
                key1 = r.nextInt(9);
            }
            if(key1==key2||key2==key3||key2==0)
            {
                key2 = r.nextInt(9);
            }
            if(key1==key3||key2==key3||key3==0)
            {
                key3 = r.nextInt(9);
            }
           
        }   
        int Key = key1*1000+key2*100+key3*10;
        return key1;
            }
}
