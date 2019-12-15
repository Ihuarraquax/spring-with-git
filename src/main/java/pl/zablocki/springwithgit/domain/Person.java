package pl.zablocki.springwithgit.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Person {
    @Id
    private long id;
    private String name;
    private String surname;
}
