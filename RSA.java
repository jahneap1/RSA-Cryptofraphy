
public class RSA
{
    private static long p;
    private static long q;
    private static long n;
    private static long phi;
    private static long e;
    private static long d;
    
    //the first number is the modulus
    //the second number is the inverse
    public RSA()
    {
        p = Prime.largePrimeNum();
        q = Prime.largePrimeNum();
        phi = (p-1)*(q-1);
        
        
        n = p*q;
        e = 2;
        
        
        
        
        while(Euclid.GCD(phi, e)!=1)
        {
            //System.out.println(e);
            e++;
        }
        d = Euclid.extEuclid(phi, e);
        if(d < 0)
        {
            while(d<0)   
            {
                d = d + phi;
            }
        }
        
        
    }
    
    public long getE()
    {
        return e;
    }
    public long getP()
    {
        return p;
    }
    public long getQ()
    {
        return q;
    }
    public long getD()
    {
        return d;
    }
    public long getN()
    {
        return n;
    }
    public long getPhi()
    {
        return phi;
    }
    
    public static  long encrypt(long m, long a, long b)
    {
        return Mod.mod(m, a, b);
    }
    
    public static long decrypt(long c, long a, long b)
    {
        return Mod.mod(c, a, b);
    }
    
    public static boolean test(long M)
    {
        long c = encrypt(M, e, n);
        System.out.println("Message: "+M);
        System.out.println("Public Key: (" +e+", "+n+")");
        System.out.println("Private Key: (" +d+", "+n+")");
        System.out.println("Encrypted Message: "+c);
        System.out.println("Decrypted Message: "+decrypt(c, d, n));
        return M == decrypt(c, d, n);
    }

}
