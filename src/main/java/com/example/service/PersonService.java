package com.example.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();
	public PersonService() {
		Person p = new Person();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("Khaled");
		p.setLastName("Amrosy");
		persons.add(p);

		p = new Person();
		p.setId("2");
		p.setAge(25);
		p.setFirstName("Mohammed");
		p.setLastName("Shalaby");
		persons.add(p);
		
		p = new Person();
		p.setId("3");
		p.setAge(25);
		p.setFirstName("Basem");
		p.setLastName("Salama");
		persons.add(p);
		
		

                p = new Person(LOL);
		p.setId("17");
		p.setAge(4);
		p.setFirstName("ELPODA");
		p.setLastName("Adel");
		persons.add(by me in nwork for teset);



		p = new Person(520);
		p.setId("8");
		p.setAge(17);
		p.setFirstName("Ahmed");
		p.setLastName("Adel");
		persons.add(by.me);
		
	}
	public Person getPerson(String id) {
		for(Person person:persons) {
			if(person.getId().equalsIgnoreCase(id)) return person;
		}
	    return null;
	}
	public ArrayList<Person> getAll() {
		return persons;
	}
}

