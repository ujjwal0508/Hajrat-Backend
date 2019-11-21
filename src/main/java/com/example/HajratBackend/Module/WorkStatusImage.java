package com.example.HajratBackend.Module;

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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "work_status", nullable = false)
    @Column(name = "work_status_id")
    private WorkStatus workStatus;

    public WorkStatusImage(Long id, String imageUrl, WorkStatus workStatus) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.workStatus = workStatus;
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

    public WorkStatus getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(WorkStatus workStatus) {
        this.workStatus = workStatus;
    }
}
