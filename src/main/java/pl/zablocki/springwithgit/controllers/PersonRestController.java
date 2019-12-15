package pl.zablocki.springwithgit.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.zablocki.springwithgit.domain.Person;

@RestController("/person")
public class PersonRestController {

    @GetMapping(path = "/me")
    public Person getMe() {
        return new Person("Hubert", "Zabłocki");
    }
}
