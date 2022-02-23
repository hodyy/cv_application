package cz.project.cv_aplication.api;

import cz.project.cv_aplication.entity.Worker;
import cz.project.cv_aplication.repository.JobRepository;

import cz.project.cv_aplication.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class WorkerController {
    @Autowired
    WorkerRepository WorkerRepository;
    @Autowired
    JobRepository  JobRepository;

    @PostMapping("/AddNewWorker")
    public void  AddNewWorker(@RequestBody Worker newWorker) {
        WorkerRepository.save(newWorker);
    }

    @GetMapping("/GetAllWorker")
    public List<Worker> GetAllWorker(){
        return WorkerRepository.findAll();
    }

    @GetMapping("/GetWorkerByID")
    public Optional<Worker> GetWorkerByID(@RequestBody int id){
        return WorkerRepository.findById(id);
    }


}
