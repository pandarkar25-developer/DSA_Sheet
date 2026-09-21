public class nFibonaciiNumber {
    
    void fibo (int a,int b,int n,int sum){
        if(n-2==0){
            System.out.println(sum);
            return;
        }
        sum =a+b;
        a=b;
        b=sum;
        fibo(a, b, n-1, sum);
    }

    public static void main(String[] args) {
        nFibonaciiNumber nf =new nFibonaciiNumber();
        nf.fibo(0, 1, 5, 0);
    }
}
