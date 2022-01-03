package agoraTemple;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static  Integer c;
    int a;
    int b = 0;

    public void m(){
        int d;
        int e = 0;

    }
    public static void main (String... strings) throws IOException {
      /* File tmp = new File("/repo/a/a.txt");
        tmp.getParentFile().mkdirs();
        tmp.createNewFile();*/

        /*
        Path source = Paths.get("/repo/a/a.txt");
        Path destination = Paths.get("/repo");
        Files.move(source, destination); // line 1
        Files.delete(source); // line 2
        */
        Double d = 7.5;




        LocalDate date = LocalDate.of(2012,01,31);
        date.plusDays(10);
        System.out.println(date);

        StringBuilder dd = new StringBuilder("d");
        String ff="f";

        refecrenceValue(dd,ff);

        System.out.println(dd);
        System.out.println(ff);

    }

    static void refecrenceValue(StringBuilder d, String f) {
        d.append("cx");
        f +="dd";
    }
}


class ObjectReferenceExample {

    public static void main(String... doYourBest) {
        Simpson simpson = new Simpson();
        transformIntoHomer(simpson);
        System.out.println(simpson.name);
    }

    static void transformIntoHomer(Simpson simpson) {
        simpson.name = "Homer";
    }

}

class Simpson {
    String name;
}

class Teste{

    public Teste(int a){

    }
    public static void testInts(Integer obj, int var){
        var++;
        obj = var++;
        obj++;
    }
    public static void main(String[] args) {
        List<Integer> names = Arrays.asList(1, 2, 3);


     System.out.println(names.stream().mapToInt(x->x).sum());

    //     System.out.println(names.stream().forEach((sum, x)->sum = sum + x));

        System.out.println(names.stream().reduce(0, (a, b)->a+b));

         System.out.println(names.stream().collect(
                Collectors.mapping(x->x, Collectors.summarizingInt(x->x))).getSum());

         System.out.println(names.stream().collect(
                Collectors.summarizingInt(x->x)).getSum());
        Integer val1 = 5;
        int val2 = 9;
        testInts(val1++, ++val2);
        System.out.println(val1+" "+val2);

        float f = 4.5f;
        double d = f;
       double ff =  f+d;




    }

}

class DragonWarriorReferenceChallenger {

    public static void main(String... doYourBest) {
        StringBuilder warriorProfession = new StringBuilder("Dragon ");
        String warriorWeapon = "Sword ";
        changeWarriorClass(warriorProfession, warriorWeapon);

        System.out.println("Warrior=" + warriorProfession + " Weapon=" + warriorWeapon);
    }

    static void changeWarriorClass(StringBuilder warriorProfession, String weapon) {
        warriorProfession.append("Knight");
        weapon = "Dragon " + weapon;

        weapon = null;
        warriorProfession = null;


    }

}