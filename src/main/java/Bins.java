import com.sun.jdi.Value;
import org.w3c.dom.ls.LSOutput;

import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Bins {
    HashMap<Double, Double> bins = new HashMap<>();
   // List<Key Value> bins = new ArrayList<Key Value>();

    public Bins(int min, double number, int max) {
        for (int i = min; i <= max ; i++) {
           if (bins.get(i) == null){
               bins.put((double) i, number);
           }

            print();
        }
    }

//    public void addToBins(Integer number){
//        bins.add(number);
//        print();
//    }

//    public int getBin(){
//
//    }

    public void print(){
        System.out.println(bins.toString());
    }


}
