import java.util.*;
public class KeyGen {

    public static void main(String[] args){

    }

    public static int KeyGen1(){
        Random r = new Random();
        int key1 = r.nextInt(22);
        while(key1==0){
            key1 = r.nextInt(22);
        }
        return key1;
    }
    public static int KeyGen2(){
        Random r = new Random();
        int key2 = r.nextInt(22);
        while(key2==0){
            key2 = r.nextInt(22);
        }
        return key2;
    }
    public static int KeyGen3(){
        Random r = new Random();
        int key3 = r.nextInt(22);
        while(key3==0){
            key3 = r.nextInt(22);
        }
        return key3;
    }
}
