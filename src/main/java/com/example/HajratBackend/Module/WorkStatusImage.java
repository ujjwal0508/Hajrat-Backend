package com.example.HajratBackend.Module;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "work_status_image")
public class WorkStatusImage {

    @SequenceGenerator(name="seq", initialValue=1000, allocationSize=10)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private Long id;

    @Column(name = "image_url")
    @NotNull
    private String imageUrl;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_status_id", nullable = false, unique = true)
    private WorkStatus workStatus;

    public WorkStatusImage(Long id, String imageUrl, WorkStatus workStatus) {
        this.id = id;
        this.imageUrl = imageUrl;
//        this.workStatus = workStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
//
//    public WorkStatus getWorkStatus() {
//        return workStatus;
//    }
//
//    public void setWorkStatus(WorkStatus workStatus) {
//        this.workStatus = workStatus;
//    }
}
