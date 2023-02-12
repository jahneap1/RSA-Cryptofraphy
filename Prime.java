import java.lang.*;
import java.util.*;
public class Prime
{
    // instance variables - replace the example below with your own

    public Prime()
    {

    }

    public static boolean isPrime(long n)
    {
        int x=2;
        while(x<10)
        {
            if(Mod.mod(x, n-1, n)!=1)
                return false;
                
            x++;
        }
        return true;
    }

    // public static void tester(long n)
    // {
    // for(long i = 0; i<n; i++)
    // {
    // if(isPrime(i))
    // {

    // System.out.prlongln(i);
    // }
    // }
    // }

    // public static long largePrimeNum()
    // {
    // long num = 123456;
    // while(!isPrime(num))
    // {
    // long one = ((long)(Math.random()*90)+10)*10000;
    // long two = ((long)(Math.random()*90)+10)*100;
    // long three = ((long)(Math.random()*90)+10);
    // num = one+two+three;
    // }
    // return num;
    // }

    public static long largePrimeNum()
    {

        long x = (long)(Math.random()*(900L))+100;
        //long x = (long)(Math.random()*(90L));
        while(!isPrime(x))
        {
            x = (long)(Math.random()*(900L))+100;
            //x = (long)(Math.random()*(90L));
            //System.out.println(x);
        }
        return x;
    }
    
    
}
