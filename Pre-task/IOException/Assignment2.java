import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;
public class Assignment2 {
    public static void main(String[] args){
        String fileName = "test.txt";
        try(RandomAccessFile file = new RandomAccessFile(fileName, "rw")){
            file.write("This\n".getBytes());
            file.write("is\n".getBytes());
            file.write("java\n".getBytes());
            file.write("true\n".getBytes());
            file.write("123\n".getBytes());
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}