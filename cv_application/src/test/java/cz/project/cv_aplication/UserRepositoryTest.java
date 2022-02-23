package cz.project.cv_aplication;

import cz.project.cv_aplication.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;

@SpringBootTest
class UserRepositoryTest {

	@Autowired
	private UserRepository UserRepository;
	@Test
	void saveBookTest() throws ParseException {

	}

}
