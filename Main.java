import java.util.*;
public class Main {
    public static void main(String[] args){
        
        

        System.out.println(Key);

    }

    public static int KeyGen(){
        Random r = new Random();
        int d1 = r.nextInt(9);
        int d2 = r.nextInt(9);
        int d3 = r.nextInt(9);
        int d4 = r.nextInt(9);
        while(d1==d2||d1==d3||d1==d4||d2==d3||d2==d4||d3==d4)
        {
            if(d1==d2||d2==d3||d2==d4)
            {
                d2 = r.nextInt(9);
            }
            if(d1==d3||d2==d3||d3==d4)
            {
                d3 = r.nextInt(9);
            }
            if(d1==d4||d2==d4||d3==d4)
            {
                d4 = r.nextInt(9);
            }
        }   
        System.out.println(d1+""+d2+""+d3+""+d4);
            }
}
