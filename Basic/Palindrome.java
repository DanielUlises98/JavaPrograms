package Basic;

public class Palindrome {
    public String IsPalindrome(int number){
        String num = String.format("%d",number);
        if (num.equals(reversIt(num))){
            return String.format("%d Is a palindrome",number);
        }
        return String.format("%d Is not a palindrome",number);
    }
    private String reversIt(String word){
        String reversed="";
        for(int i = word.length()-1;i>=0;i--){
            reversed += Character.toString(word.charAt(i));
        }
        return reversed;
    }
}
