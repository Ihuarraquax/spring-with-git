package pl.zablocki.springwithgit.repo;

import org.springframework.data.repository.CrudRepository;
import pl.zablocki.springwithgit.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
