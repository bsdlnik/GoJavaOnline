package ua.goit.java;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class GenericExtendsSuper {

    @Test
    public void testPersonList() throws Exception {
        List<Person> persons = Arrays.asList(new Person("Pavel", "Pavlov"), new Person("Elena", "Pavlova"), new Person("Anna", ""));
        System.out.println(isValidList(persons, new PersonValidator()));
        List<Citizen> citizens = Arrays.asList(new Citizen("Pavel", "Pavlov", "Sadovaya"), new Citizen("Elena", "Pavlova", "Vishnevaya"), new Citizen("Anna", "", ""));
        System.out.println(isValidList(citizens, new PersonValidator()));
    }

    public boolean isValidList(List<? extends Person> persons, Validator<Person> personValidator) {
        for (Person person : persons) {
            if (!personValidator.isValid(person)){
                return false;
            }
        }
        return true;
    }

    public interface Validator<T> {
        boolean isValid(T value);
    }

    public static class PersonValidator implements Validator<Person> {

        @Override
        public boolean isValid(Person person) {
            return isNotBlank(person.name) && isNotBlank(person.surname);
        }
    }

    public static class Person {
        public String name;
        public String surname;

        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }

    public static class Citizen extends  Person{
        public String address;

        public Citizen(String name, String surname, String address) {
            super(name, surname);
            this.address = address;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

}
