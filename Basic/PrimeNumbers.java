package Basic;

public class PrimeNumbers {
    public String PrimeNumber(int number){
        if (number > 1){
            for(int i=2;i<number;i++){
                if (number % i == 0){
                    return String.format("%d Is not a prime",number);
                }
            }
        }
        return String.format("%d Is a prime", number);
    }
}


