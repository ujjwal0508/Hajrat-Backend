package com.example.HajratBackend.Module;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "work_status")
public class WorkStatus {

    @SequenceGenerator(name="seq", initialValue=1000, allocationSize=10)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private Long id;

    @Column(name = "description")
    @NotNull
    private String description;

    @Column(name = "audio_url")
    @NotNull
    private String audioUrl;

    @Column(name = "creation_timestamp")
    @NotNull
    private Timestamp creationTimestamp;

    public WorkStatus(Long id, String description, String audioUrl, Timestamp creationTimestamp) {
        this.id = id;
        this.description = description;
        this.audioUrl = audioUrl;
        this.creationTimestamp = creationTimestamp;
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

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public Timestamp getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Timestamp creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }
}
