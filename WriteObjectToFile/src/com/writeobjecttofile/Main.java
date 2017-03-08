package com.writeobjecttofile;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String fileName = "/Users/aleksandra/odt.txt";

        Person p1 = new Person("Jan", "Kowalski", "plumber", 21);
        Person p2 = new Person("Jan", "Kowalski", "plumber", 21);
        Person p3 = new Person("Jan", "Kowalski", "plumber", 21);


        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileName));

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(p1);
            objectOutputStream.writeObject(p2);
            objectOutputStream.writeObject(p3);

            FileInputStream fileInputStream = new FileInputStream (fileName);
            ObjectInputStream objectInputStream
                    = new ObjectInputStream(fileInputStream);

            while (objectInputStream.readObject() != null){

                Person output =  (Person) objectInputStream.readObject();
                System.out.println(output.getName());
            }
            fileInputStream.close();

            fileOutputStream.close();
            objectOutputStream.close();

        } catch (FileNotFoundException err) {
            err.printStackTrace();
        } catch (IOException err) {
            err.printStackTrace();
        }catch (ClassNotFoundException) {
            err.printStackTrace();
        }
    }






}
