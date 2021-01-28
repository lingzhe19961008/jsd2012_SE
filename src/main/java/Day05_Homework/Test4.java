package Day05_Homework;

import io.day05.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File(".obj");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Person p=(Person) ois.readObject();
        System.out.println(p);
        ois.close();
    }
}
