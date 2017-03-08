package com.writeobjecttofile;

import java.io.Serializable;

/**
 * Created by aleksandra on 02.03.2017.
 */
public class Person implements Serializable{

    public String name;
    public String lastname;
    public String proffession;
    public int age;

    Person () {}

    public Person (String name, String lastname, String proffession, int age) {
    this.name = name;
    this.lastname = lastname;
    this.proffession = proffession;
    this.age = age;
            }


    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getProffession() {
        return proffession;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", proffession='" + proffession + '\'' +
                ", age=" + age +
                '}';
    }
}
