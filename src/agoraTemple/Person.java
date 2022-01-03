package agoraTemple;

public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
}

class Tester {
    public  static void main(String... strings){
        Person p = null;
        checkPerson(p);
        System.out.println(p);
        p = new Person("Marry");
        checkPerson(p);
        System.out.println(p);

        int nums1[] = new int[3];
        int nums2[] = {1,2,3,4,5};

        nums1 = nums2;
        for (int x: nums1){
            System.out.println(x + ":");
        }

    }

    public static  Person checkPerson(Person p){
        if(p == null){
            p = new Person("Joe");
        }else {
            p =null;
        }
        return  p;
    }
}


class  Employee{
    public int salary;

}

class Manager extends  Employee{
    public int budget;
}

class Director extends Manager{
    public int stockOptions;
}

class Testo{
    public static void main(String... strings){
        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();

        employee.salary =500;
        director.salary =522;
        //employee.budget =
        manager.budget =75555;
        //manager.stockOption =
        director.stockOptions =755;


        Product prt  = new Product();
        prt.price = 200;
        double newPRice = 100;


        Testo testo = new Testo();
        testo.updatePrice(prt,newPRice);

        System.out.println(prt.price+ ": "+ newPRice);

    }

    public void updatePrice (Product product, double price ){
        price = price *2;
        product.price = product.price + price;
    }
}

class  Product {
    double price;
}
