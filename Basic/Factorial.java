package Basic;

public class Factorial {
    public int FactorialOf(int number){
        for(int i = number-1;i>0;i--){
            number= number * i;
        }
        return number;
    }
}
