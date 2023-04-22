package com.truemart.truemartspring.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "participant")
public class participantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "conversation_id", nullable = false)
    private conversationEntity conversation;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private userEntity userID;

    public participantEntity() {
    }

    public Long getId() {
        return Id;
    }

    public conversationEntity getConversation() {
        return conversation;
    }

    public void setConversation(conversationEntity conversation) {
        this.conversation = conversation;
    }

    public userEntity getUserID() {
        return userID;
    }

    public void setUserID(userEntity userID) {
        this.userID = userID;
    }
}
