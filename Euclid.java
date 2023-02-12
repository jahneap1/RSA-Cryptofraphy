import java.lang.*;
import java.util.*;
public class Euclid
{
    public Euclid()
    {
        
    }

    public static long GCD(long x, long y)
    {
        if(y == 0)
        {
            
            //System.out.println("answer: " + x);
            return x;
        }

        else
        {
            long r = x % y;
            long q = x/y;
            //System.out.println(x+" = " + y + "(" + q + ") + " + r);
            

            return GCD(y, r);
        }
    }

    public static long extEuclid(long x, long y)
    {
        //System.out.println("x: " + x + " y: " + y);
        
        if(y == 0)
            return 0;
        
        long ans = (1 - (x*extEuclid(y, x%y)))/y;
        
        //System.out.println("x: " + x + " y: " + y + "ans: " + ans);
        return ans;
    }
    
}
