package codechallenges.fibionacci;

public class recursive {
    static int fibionacci(int k){
        if(k <= 1) return k;

        return fibionacci(k-1) + fibionacci(k-2);
    }
    public static void main(String[] args) {
        System.out.println(fibionacci(3));
        System.out.println(fibionacci(100));
    }
}

// a<=x<=b