package heritage;

import functionalInterface.Supplier;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;
import java.util.stream.Stream;

public class DNASynth {
    int aCount;
    int tCount;
    int cCount;
    int gCount;

    DNASynth(int a, int tCount,int c, int g){
        setGCount(g);
        cCount =setCCount(c);
        aCount =a;
    }
    int setCCount(int c){
        return c;
    }


    void setGCount(int gCount){
        this.gCount = gCount;

    }

    @Override
    public String toString() {

        return "DNASynth{" +
                "aCount=" + aCount +
                ", tCount=" + tCount +
                ", cCount=" + cCount +
                ", gCount=" + gCount +
                '}';
    }


    public static void main(String... strings){
        DNASynth dnaSynth = new DNASynth(1,2,3,4);
        Path pathOfFile
                = Paths.get("D:\\Work\\Test\\"
                + "text1.txt");
        Comparator<Integer> comparator = new Comparator<>() {

            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };

        int x;
        int y = 5;
        if (y > 2) {
            x = ++y;
            y = x +7;
        }else{
            x=1; //like this
            y++;
        }
        System.out.println(x + " "+ y);
    }
}
