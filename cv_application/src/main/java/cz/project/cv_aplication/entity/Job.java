package cz.project.cv_aplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Job {

    private String companyName;
    private String positionName;
    private LocalDate  contractStartDate;
    private LocalDate  contractEndDate;
    private String  note;
    private boolean currentJob=false;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    @ManyToOne
//    private Worker worker;

    public Job(String companyName, String positionName, LocalDate contractStartDate, LocalDate contractEndDate, String note) {
        this.companyName = companyName;
        this.positionName =positionName;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.note = note;
        if (contractEndDate.isAfter(LocalDate.now()))
            this.currentJob = true;

    }
    public Job(String companyName, String positionName, LocalDate contractStartDate, String note) {
        this.companyName = companyName;
        this.positionName = positionName;
        this.contractStartDate = contractStartDate;
        this.currentJob = true;

    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPositionName() {
        return positionName;
    }

    public LocalDate getContractStartDate() {
        return contractStartDate;
    }

    public void setCurrentJob(boolean currentJob) {
        this.currentJob = currentJob;
    }

    public LocalDate getContractEndDate() {
        return contractEndDate;
    }

    public String getNote() {
        return note;
    }

    public boolean isCurrentJob() {
        return currentJob;
    }

    public Integer getId() {
        return id;
    }
}
