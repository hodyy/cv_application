package cz.project.cv_aplication.repository;

import cz.project.cv_aplication.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository <Worker, Integer> {
}
