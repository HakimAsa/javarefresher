package codechallenges.fibonacci;

public class recursive {
    static int fibonacci(int k){
        if(k <= 1) return k;

        return fibonacci(k-1) + fibonacci(k-2);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(100)); //100 takes very long
    }
}

// a<=x<=b