package functionalInterface;

import java.util.List;

public class Item {
    public String name;
    public int count;

    public Item(String name, int count){
        this.count =count;
        this.name = name;

    }
    public static void main(String... strings){
        var items = List.of(new Item("A",10), new Item("B",2), new Item("C",12),
                new Item("D",5), new Item("E",6));

    }
}
