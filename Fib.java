public class Fib{

     static void fib(int l){
        int a=0,n=1,sum;
        for (int i=1; i<=l; i++){
	    System.out.println(a + " ");
            sum = a + n;
            a = n;
            n = sum;
        }
    }
     
    public static void main (String[] args){
        fib(8);
    }
}