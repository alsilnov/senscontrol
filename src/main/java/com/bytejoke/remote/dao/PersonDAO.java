package com.bytejoke.remote.dao;

import java.util.ArrayList;
import java.util.List;

import com.bytejoke.remote.models.Person;

import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;
    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "A"));
        people.add(new Person(++PEOPLE_COUNT, "B"));
        people.add(new Person(++PEOPLE_COUNT, "C"));
        people.add(new Person(++PEOPLE_COUNT, "D"));
    }
    public List<Person> index(){
        return people;
    }
    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
