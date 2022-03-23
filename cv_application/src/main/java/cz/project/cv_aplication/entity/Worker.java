package cz.project.cv_aplication.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@NoArgsConstructor
@Entity
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surename;

@JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate birthDay;


@OneToMany(targetEntity = Job.class, cascade = CascadeType.ALL)
@JoinColumn(name ="worker_id", referencedColumnName = "id")
    private List<Job> jobs;

    public Worker(String name, String surename, LocalDate birthDay, List<Job> jobs) {
        this.name =name;
        this.surename =surename;
        this.birthDay =birthDay;
        this.jobs=jobs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surname) {
        this.surename = surename;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Job> getJobs() {

        return jobs;
    }

    public void setJob(Job job) {
        this.jobs.add(job);
    }
}
