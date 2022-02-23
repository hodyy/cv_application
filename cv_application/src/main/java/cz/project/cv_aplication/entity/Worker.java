package cz.project.cv_aplication.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import cz.project.cv_aplication.repository.JobRepository;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Worker {

    private String name;
    private String surename;

@JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate birthDay;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

@OneToMany
    private Set<Job> jobs;

    public Worker(String name, String surename, LocalDate birthDay ) {
        this.name =name;
        this.surename =surename;
        this.birthDay =birthDay;
    }

    public Worker() {
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

    public Set<Job> getJobs() {
        return jobs;
    }

    public void setPreviousJobs(Set<Job> jobs) {
        this.jobs = jobs;
    }
}
