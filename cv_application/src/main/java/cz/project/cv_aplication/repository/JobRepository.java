package cz.project.cv_aplication.repository;

import cz.project.cv_aplication.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository <Job, Integer> {
}
