import java.util.*;
public class KeyGen {
    public static int KeyGenerator(){
        Random r = new Random();
        int d1 = r.nextInt(9);
        int d2 = r.nextInt(9);
        int d3 = r.nextInt(9);
        while(d1==d2||d1==d3||d2==d3)
        {
            if(d1==d2||d2==d3||d2==0)
            {
                d2 = r.nextInt(9);
            }
            if(d1==d3||d2==d3||d3==0)
            {
                d3 = r.nextInt(9);
            }
           
        }   
        int Key = d1*1000+d2*100+d3*10;
        return Key;
            }
}
