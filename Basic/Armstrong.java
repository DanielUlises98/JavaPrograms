package Basic;

public class Armstrong {
    public String IsArmstrongNumber(int number){
        if (number < 10){
             return String.format("%d Is an armstrong number",number);
        }
        String numbers = String.format("%d", number);
        double sum = 0;
        for (char nc: numbers.toCharArray()) {
            int n = Character.getNumericValue(nc);
            sum += Math.pow(n, numbers.length());
        }
        if (number == sum){
            return String.format("%d Is an armstrong number", number);
        }
        return String.format("%d Is not an armstrong number", number);
    }
}
