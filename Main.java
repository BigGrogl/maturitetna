import java.util.*;
public class Main {
    public static void main(String[] args){
        
        Random rand = new Random();
        int max = 10000;
        int min = 1000;

        int Key = rand.nextInt(max-min)+min;
        if(Key%1111==0){
        Key = rand.nextInt(max-min)+min;
        }

        System.out.println(Key);

    }
}
