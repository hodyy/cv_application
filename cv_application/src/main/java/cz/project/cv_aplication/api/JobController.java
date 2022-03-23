//package cz.project.cv_aplication.api;
//
//import cz.project.cv_aplication.entity.Job;
//import cz.project.cv_aplication.entity.Worker;
//import cz.project.cv_aplication.repository.JobRepository;
//import cz.project.cv_aplication.repository.WorkerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//public class JobController {
//    @Autowired
//    WorkerRepository WorkerRepository;
//    @Autowired
//    JobRepository JobRepository;
//
//    @GetMapping("/GetAllWorkerJobs/{id}")
//    public Worker AddNewWorkersJob(@PathVariable int id) {
//        return JobRepository.findAll();
//    }
//    @DeleteMapping("/DeleteWork/{id}")
//    public Worker AddNewWorkersJob(@PathVariable int id, @RequestBody Job newJob) {
//
//        Optional<Worker> optional = WorkerRepository.findWorkerById(id);
//        Worker worker = optional.get();
//        worker.setJob(newJob);
//        return worker;
//
//    }
//
//}