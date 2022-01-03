package heritage;

public interface Downloadable {
    public void download();
      int i=2;

}

interface Readable extends Downloadable{
    public void readBook();
}

abstract class Book implements  Readable{
    public void readBook(){
        System.out.println("Read Book");
    }
}

class EBook extends Book{
    public void readBook(){
        System.out.println("Read E-Book");
    }

    public static void main(String... strings){
        Book book = new EBook();
        book.readBook();
    }

    @Override
    public void download() {

    }
}
