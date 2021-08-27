package com.example.demo3.dao;
import com.example.demo3.model.Person;
import java.util.UUID;
import java.util.List;
public interface PersonDao {
   int insertPerson(UUID id, Person person) ;
   default int insertPerson(Person person) {
       UUID id=UUID.randomUUID();
       return insertPerson(id,person);
   }
   List<Person> selectAllPeople();

   
}
