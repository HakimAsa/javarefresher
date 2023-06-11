package codechallenges.fibonacci;
// dynamic programming approach
public class dp {
    static int fib_dp(int k){
        return fib_dp(k, new int[k+1]);
    }

    static int fib_dp(int k, int[] cache){
        if(k <= 1) return k;

        if(cache[k] > 0) return cache[k];

        cache[k] = fib_dp(k-1, cache) + fib_dp(k-2, cache);
        return cache[k];
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //int k = 100; //this gives integer overflow ....
        int k = 10; //this gives integer overflow ....
        System.out.println(fib_dp(k));
        long end = System.currentTimeMillis();

        System.out.println("Elapsed Time in milliseconds is: " +(end - start));
    }
}
