package Basic;
public class Fibonacci {
    
    public void PrintFibonacci(int count){
        int n0 = 0;
        int n1 = 1;
        
        System.out.print(n0+","+n1);

        int sum= 0;
        for(int i=1;i<=count;i++){
            sum = n0 + n1;
            n0 = n1;
            n1=sum;
            System.out.print(","+sum);
        }
    }
}
