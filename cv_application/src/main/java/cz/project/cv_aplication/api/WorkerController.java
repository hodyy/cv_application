package cz.project.cv_aplication.api;

import cz.project.cv_aplication.entity.Job;
import cz.project.cv_aplication.entity.Worker;
import cz.project.cv_aplication.repository.JobRepository;

import cz.project.cv_aplication.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin( origins = "*")
public class WorkerController {
    @Autowired
    WorkerRepository WorkerRepository;
    @Autowired
    JobRepository JobRepository;

    @PostMapping("/AddNewWorker")
    public void AddNewWorker(@RequestBody Worker newWorker) {
        WorkerRepository.save(newWorker);
    }

    @GetMapping("/GetAllWorker")
    public List<Worker> GetAllWorker() {
        return WorkerRepository.findAll();
    }

    @GetMapping("/GetWorkerByID/{id}")
    public Optional<Worker> GetWorkerByID(@PathVariable int id) {
        return WorkerRepository.findById(id);
    }

//    @PostMapping("/AddNewWorkersJob/{id}")
//    public Worker AddNewWorkersJob(@PathVariable int id, @RequestBody Job newJob) {
//
//        Optional<Worker> optional = WorkerRepository.findWorkerById(id);
//        Worker worker = optional.get();
//        worker.setJob(newJob);
//        return worker;
//
//    }
    @GetMapping("/GetAllWorkerJobs/{id}")
    public List<Job> AddNewWorkersJob(@PathVariable int id) {
       return WorkerRepository.findWorkerJobsById(id);
    }

}