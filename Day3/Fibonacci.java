package Day3;

// 1,-1,2,-3,5,-8,13,-21,34,-55,...

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int count = 1;
        for(int i=0;i<n;i++){
            if(count %  2 != 0){
                System.out.println(fib(i));
            }else{
                System.out.println(fib(i)*-1);
            }
            count++;
        }
    }

    static int fib(int n){
        int a = 0;
        int b = 1;
        if(n == 0 || n == 1){
            return 1;
        }else{
            while(n > 0){
                int nextNum = a + b;
                a = b;
                b = nextNum;
                n--;
            }
            return b;
        }
    }
}
