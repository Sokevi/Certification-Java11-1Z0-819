package localisation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.function.LongConsumer;
import java.util.function.ToDoubleFunction;
import java.util.stream.IntStream;

public class Test {
    public static void main(String... strings){
        LocalDate d1 = LocalDate.of(1997,2,7);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("eeee d'th of' MMMM yyy");
        System.out.println(dateTimeFormatter.format(d1));
    }


}
enum QUALITY{
    A(100),B(74), C(50);

    int percent;
    private QUALITY(int percent){
        this.percent = percent;
    }

    static void checkQuality(QUALITY q){
        switch (q){
            case A : System.out.println("best"); break;
            default: System.out.println("Not best"); break;
        }
    }
    public static void main(String... strings){
       checkQuality(QUALITY.A);

        List<String> fruits = List.of("Orange","Apple","Lemmon","Respberry");
        List<String> types = List.of("Juice","Pie","Ice","Tart");
        var stream = IntStream.range(0, Math.min(fruits.size(),types.size()))
                .mapToObj((i) -> fruits.get(i)+ " "+ types.get(i));

        stream.forEach(System.out::println);

    }
}