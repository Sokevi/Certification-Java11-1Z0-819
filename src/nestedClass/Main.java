package nestedClass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

     class Student{
        String className;
        Student(String classname){
            this.className = classname;
        }
    }
    public static void main(String... strings){
        Main main = new Main();
        var student = main.new Student("Biology");
        Path source = Paths.get("/repo/a/a.txt");
        Path destination = Paths.get("/repo");

        try {
            Files.move(source, destination); // line 1
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.delete (source);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
