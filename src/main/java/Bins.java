import com.sun.jdi.Value;
import org.w3c.dom.ls.LSOutput;

import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Bins {
    HashMap<Integer, Integer> bins = new HashMap<>();
   // List<Key Value> bins = new ArrayList<Key Value>();

    public Bins(int min, int max){
        for (int i = min; i <= max; i++) {
            bins.put(i, 0);
        }
    }

    public int getBin(int binToGet){
       return bins.get(binToGet);
    }
    public void incrementBin(int binToIncrement){
        int valueToIncrement = bins.get(binToIncrement) ;
        bins.put(binToIncrement, valueToIncrement+1);
    }


    public void print(){
        System.out.println(bins.toString());
    }


}
