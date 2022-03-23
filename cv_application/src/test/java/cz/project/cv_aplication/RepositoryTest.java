package cz.project.cv_aplication;

import cz.project.cv_aplication.entity.Job;
import cz.project.cv_aplication.entity.Worker;
import cz.project.cv_aplication.repository.JobRepository;
import cz.project.cv_aplication.repository.WorkerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.text.html.Option;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class RepositoryTest {

	@Autowired
	private WorkerRepository WorkerRepository;
	@Autowired
	private JobRepository JobRepository;

	@Test
	void test() {

//		Job job1 = new Job("Česká Banka", "Tester",LocalDate.of(2020, 7, 28),LocalDate.of(2020, 11, 28), "Testoval jsem SB");
//		Worker worker = new Worker("Petr", "Hodyc", LocalDate.of(1996, 7, 26),jobList);
		Worker worker = WorkerRepository.findWorkerById(2);
		Worker we = worker;


	}

}
