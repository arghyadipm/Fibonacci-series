public class Fibonacci{

     static void fib(int n){
        int a=0,b=1,sum;
        for (int i=1; i<=n; i++){
	    System.out.println(a + " ");
            sum = a + b;
            a = b;
            b = sum;
        }
    }
     
    public static void main (String[] args){
        fib(10);
    }
}