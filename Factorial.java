 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        int y = 1;
        BigInteger x = BigInteger.valueOf(1);
        
        while(y <= value){
           x = x.multiply(BigInteger.valueOf(y));
           y++;
        }
        
        return x;
    }

}
