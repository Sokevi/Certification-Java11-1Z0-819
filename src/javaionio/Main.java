package javaionio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;

public class Main {

    private String[] strings = {"ABCDEFGHIJKIMNOFpRSTUVNXYZ"
                    , "abadefghijklmnoparstuvwxyz", "0123456789"};

    public void write (String filename) {
       try (FileChannel fileChannel = new FileOutputStream(filename).getChannel();){
           for (String str : strings){
               ByteBuffer buffer = ByteBuffer.wrap(str.getBytes () ) ;
               fileChannel.write(buffer);
           }
       }catch (IOException e){
           e.printStackTrace();
       }
    }
    public static void main(String... strings){
        Main test = new Main();
        test.write("file_to_path");
    }


    }


