package codechallenges.fibionacci;
import java.math.*;
public class tabulation {
    //will be using BigInteger to avoid integer overflow
    static BigInteger fib_tabulation(BigInteger k){
        int comp = k.compareTo(BigInteger.valueOf(2));
        if(comp < 0) return k;
        BigInteger first, second, result;
         first = new BigInteger("1");
         second = new BigInteger("0");
         result = new BigInteger("0");

        for(int i = 1; k.compareTo(BigInteger.valueOf(i)) > 0; i++){
            result = first.add(second);
            second = first;
            first = result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(fib_tabulation(BigInteger.valueOf(100)));
    }
}
