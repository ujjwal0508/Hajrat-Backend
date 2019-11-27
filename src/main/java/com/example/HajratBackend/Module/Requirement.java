package com.example.HajratBackend.Module;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "requirement")
public class Requirement {

    @SequenceGenerator(name="seq", initialValue=1000, allocationSize=10)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "audio_url")
    private String audioUrl;

    @Column(name = "creation_timestamp")
    @NotNull
    private Timestamp creationTimeStamp;

    @Column(name = "completion_timestamp")
    private Timestamp completionTimeStamp;

    @Column(name = "status")
    @NotNull
    private ReqStatus.Status status;

    public Requirement(Long id, String description, String imageUrl, String audioUrl, Timestamp creationTimeStamp, Timestamp completionTimeStamp, ReqStatus.Status status) {
        this.id = id;
        this.description = description;
        this.imageUrl = imageUrl;
        this.audioUrl = audioUrl;
        this.creationTimeStamp = creationTimeStamp;
        this.completionTimeStamp = completionTimeStamp;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public Timestamp getCreationTimeStamp() {
        return creationTimeStamp;
    }

    public void setCreationTimeStamp(Timestamp creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
    }

    public Timestamp getCompletionTimeStamp() {
        return completionTimeStamp;
    }

    public void setCompletionTimeStamp(Timestamp completionTimeStamp) {
        this.completionTimeStamp = completionTimeStamp;
    }

    public ReqStatus.Status getStatus() {
        return status;
    }

    public void setStatus(ReqStatus.Status status) {
        this.status = status;
    }


}
