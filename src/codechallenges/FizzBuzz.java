package codechallenges;

public class FizzBuzz {
    public static String fizzBuzz(int n){
        if(n % 5 == 0 && n % 3 == 0) return "FizzBuzz";
        if(n % 3 == 0 ) return "Fizz";
        if(n % 5 == 0 ) return "Buzz";

        return Integer.toString(n);
    }
    public static void main(String[] args) {
        System.out.println(fizzBuzz(4));
        System.out.println(fizzBuzz(9));
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(10));
    }
}
