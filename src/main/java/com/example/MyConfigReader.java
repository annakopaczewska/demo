package com.example;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@ConfigurationProperties(prefix = "db")
class DataBaseProperties {
    @RestController
    @ConfigurationProperties("app")
    public class PersonReader {

        private List<Person> persons = new ArrayList<>();

        public List<Person> getPersons() {
            return persons;
        }

        public void setPersons(List<Person> persons) {
            this.persons = persons;
        }

        @RequestMapping("/showPersons")
        public List<Person> showPersons() {
            return persons;
        }
    }
}