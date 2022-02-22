package cz.project.cv_aplication;

import cz.project.cv_aplication.entity.User;
import cz.project.cv_aplication.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class AuthorRepositoryTest {

	@Autowired
	private UserRepository UserRepository;
	@Test
	void saveAuthorTest() {

        UserRepository.save(new User("Pavel", "Hodyc", LocalDate.of(1996, 7, 26) ));

	}

}
