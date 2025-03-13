


public class Dice {


    public static void tossAndSum(Integer num){
        double sum = 0.0;
        for (int i = 1; i <= num; i++) {
            double singleDiceToss = Math.floor(Math.random() * 6);
            System.out.println(singleDiceToss);
            sum += singleDiceToss;
        }
        System.out.println(sum);
       Bins bins = new Bins(2,num,12);
       // bins.addToBins((int) sum);
   // return sum;
    }

    public static void main(String[] args) {
        tossAndSum(2);
    }


}
