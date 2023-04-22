package com.truemart.truemartspring.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "conversation")
public class conversationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date")
    private Date create_date;

    @OneToMany(mappedBy = "conversation")
    private List<participantEntity> participants = new ArrayList<>();
    @OneToMany(mappedBy = "conversationID")
    private List<messageEntity> messages = new ArrayList<>();
    public conversationEntity() {
    }

    public Long getId() {
        return id;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public List<participantEntity> getParticipants() {
        return participants;
    }

    public void setParticipants(List<participantEntity> participants) {
        this.participants = participants;
    }
}
