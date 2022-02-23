package cz.project.cv_aplication;

import cz.project.cv_aplication.entity.Job;
import cz.project.cv_aplication.entity.Worker;
import cz.project.cv_aplication.repository.JobRepository;
import cz.project.cv_aplication.repository.WorkerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class RepositoryTest {

	@Autowired
	private WorkerRepository WorkerRepository;
	@Autowired
	private JobRepository JobRepository;
//	@Autowired
//	private UserPreviousJobsRepository UserPreviousJobsRepository;

	@Test
	void test() {


//		Worker worker = new Worker("Pavel", "Hodyc", LocalDate.of(1996, 7, 26));
//		Job job = new Job(,"Česká Banka", "Tester",LocalDate.of(2020, 7, 28),LocalDate.of(2020, 11, 28), "Testoval jsem SB");
//		WorkerRepository.save(worker);
//		WorkerRepository.findById(7);
//		JobRepository.save(job);
		Optional<Worker> listWorkers = WorkerRepository.findById(7);
		Worker worker = listWorkers.get();
		Job job = new Job(worker,"Česká Pojištovna", "Developer",LocalDate.of(2020, 7, 28),LocalDate.of(2020, 11, 28), "Testoval jsem SB");
		JobRepository.save(job);









//		  List<User> users= UserRepository.findAll();
//        UserRepository.save(new User("Pavel", "Hodyc", LocalDate.of(1996, 7, 26) ));

	}

}
