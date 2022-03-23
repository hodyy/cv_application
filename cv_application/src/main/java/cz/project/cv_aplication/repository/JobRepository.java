package cz.project.cv_aplication.repository;

import cz.project.cv_aplication.entity.Job;
import cz.project.cv_aplication.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Optional;

public interface JobRepository extends JpaRepository <Job, Integer> {

}
