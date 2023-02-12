import java.lang.Math;
public class Mod
{


    public static long mod(long base, long exp, long mod)
    {
        
        if ((exp < 0) || (mod < 1)) 
        {
            return 0;
        }
        long result = 1;
        while (exp > 0)
        {
            if ((exp % 2) == 1) 
                result = (result * base) % mod;

            base = (base * base) % mod;
            exp = exp/2;
        }
        return (result);
    }

  
}