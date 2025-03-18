import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class DiceTest {

//    void setUp(){
//        Dice dice = new Dice();
//        dice.tossAndSum(5);
//    }
    @Test
    public void diceTest(){
        //Given
        Dice dice = new Dice(4);

        //When
        double actualRollSum = dice.tossAndSum();

        //Then
//        double expectedRollSum =


        Assert.assertTrue("Toss should bw between 4-24", actualRollSum >= 4 && actualRollSum <=24);

    }

    @Test
    public void diceTest2(){
        //Given
        Dice dice = new Dice(4);

        //When
        double actualRollSum = dice.tossAndSum();

        //Then
//        double expectedRollSum =


        Assert.assertTrue("Toss should bw between 4-24", actualRollSum >= 4 && actualRollSum <=24);
    }

}
