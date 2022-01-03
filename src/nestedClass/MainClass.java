package nestedClass;

public class MainClass {

    private String name;

    public class SubClass {

        private int index;

        public int incrementIndex() {
            this.index++;
            System.out.println(this.index);
            return this.index;
        }
    }

    public SubClass getSubClassInstance() {
        SubClass subClass = new SubClass();

        return subClass;
    }

    private static class StaticClass {

        private String name;
        private float poids;

    }


    public MainClass(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println(this.name);
        return this.name;
    }


    public static void main(String[] args) {

        MainClass mainClass = new MainClass("landry");
        mainClass.getName();

        SubClass subClass = mainClass.new SubClass();
        subClass.incrementIndex();

        subClass = mainClass.getSubClassInstance();

        StaticClass mainClass1 = new MainClass.StaticClass();
    }

}
