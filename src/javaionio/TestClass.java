package javaionio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;

public class TestClass {
    public static void main(String... args){
        try{
            Path path = Paths.get("/u01/work");
            BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println(attributes);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

