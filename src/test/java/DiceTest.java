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
        Dice dice = new Dice();

        //When
        double actualRollSum = dice.tossAndSum(5);

        //Then
//        double expectedRollSum =


        Assert.assertTrue("Toss should bw between 2-30", actualRollSum >= 1 && actualRollSum <=30);
    }

}
