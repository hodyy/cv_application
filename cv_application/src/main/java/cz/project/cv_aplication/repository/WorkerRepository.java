package cz.project.cv_aplication.repository;

import cz.project.cv_aplication.entity.Job;
import cz.project.cv_aplication.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface WorkerRepository extends JpaRepository <Worker, Integer> {

    @Query("SELECT a FROM Worker a JOIN FETCH a.jobs WHERE a.id=?1")
    Worker findWorkerById(Integer id);

    @Query("SELECT j FROM Worker a JOIN a.jobs j WHERE a.id=?1")
    List <Job> findWorkerJobsById(Integer id);

}
