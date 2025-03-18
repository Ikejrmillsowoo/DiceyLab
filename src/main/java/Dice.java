import java.util.HashMap;
import java.util.Random;

public class Dice {

    private final int numberOfDice;
    private final Bins bins;
    public Dice(int numberOfDice){
        this.numberOfDice = numberOfDice;
        this.bins = new Bins(numberOfDice, numberOfDice*6);
    }

    public int tossAndSum(){
        int sum = 0;
        for (int i = 1; i <= numberOfDice; i++) {
            Random random = new Random();
            int singleDiceToss = random.nextInt(6)+1;
            System.out.println(singleDiceToss);
            sum += singleDiceToss;
        }
        bins.incrementBin(sum);
        System.out.println(sum);
        return sum;
    }



    public static void main(String[] args) {
      Dice dice = new Dice(5);
      dice.tossAndSum();
    }


}
