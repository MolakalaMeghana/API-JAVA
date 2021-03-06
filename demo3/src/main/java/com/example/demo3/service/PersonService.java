package com.example.demo3.service;
import com.example.demo3.dao.PersonDao;
import com.example.demo3.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
//import java.util.UUID;
//import java.util.Optional;
@Service
public class PersonService {
    private final PersonDao personDao;
    @Autowired
    public PersonService(@Qualifier("fakeDao")PersonDao personDao)
    {
        this.personDao=personDao;
    }
  public int addPerson(Person person) {
      return personDao.insertPerson(person);
  } 
  public List<Person> getAllPeople(){
      return personDao.selectAllPeople();
  }
  
}
