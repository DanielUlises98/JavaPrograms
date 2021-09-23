package Basic;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
    public int randomNumber(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    public void RandomWithClass(){
        Random rand = new Random();
        int x = rand.nextInt(50);
        float y = rand.nextFloat();
        double z = rand.nextDouble();
        long l = rand.nextLong();
        boolean b = rand.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(l);
        System.out.println(b);
    }
    public void TrheadLocalRandom(){
       int a =  ThreadLocalRandom.current().nextInt();        
        double d = ThreadLocalRandom.current().nextDouble();        
        boolean bs = ThreadLocalRandom.current().nextBoolean();        

        System.out.println(a);
        System.out.println(d);
        System.out.println(bs);
    }

    public void randomJAVAEight(){
        Random ran = new Random();
        System.out.println(ran.ints(10));
    }
}