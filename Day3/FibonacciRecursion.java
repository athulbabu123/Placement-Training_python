package Day3;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int n = 10;
        int count = 1;
        while(count <=n){
            if(count % 2 != 0){
                System.out.println(fib(count));
            }else{
                System.out.println(fib(count) * -1);
            }
            count++;
        }
    }

    static int fib(int n){
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 1;
        }else{
            return fib(n-1) + fib(n-2);
        }

    }
}
