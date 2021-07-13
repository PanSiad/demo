package com.stoad.demo.domain.entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "CHORES")
public class ChoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHORE_ID")
    private long id;

    @NonNull
    @Column(name = "TITLE")
    private String title;

    @Column(name = "TIME_CREATED")
    private Instant timeCreated;

    @Column(name = "TIME_UPDATED")
    private Instant timeUpdated;

    @Column(name = "TIME_DELETED")
    private Instant timeDeleted;

//    public ChoreEntity(long id, String title, Instant timeCreated, Instant timeUpdated, Instant timeDeleted) {
//        this.id = id;
//        this.title = title;
//        this.timeCreated = timeCreated;
//    }

    public ChoreEntity() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instant getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Instant timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Instant getTimeUpdated() {
        return timeUpdated;
    }

    public void setTimeUpdated(Instant timeUpdated) {
        this.timeUpdated = timeUpdated;
    }

    public Instant getTimeDeleted() {
        return timeDeleted;
    }

    public void setTimeDeleted(Instant timeDeleted) {
        this.timeDeleted = timeDeleted;
    }
}
