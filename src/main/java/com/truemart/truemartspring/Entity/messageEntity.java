package com.truemart.truemartspring.Entity;


import com.truemart.truemartspring.Model.messageStatus;
import com.truemart.truemartspring.Model.messageType;
import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "messages")
public class messageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "conversation_id", nullable = false)
    private conversationEntity conversationID;
    @ManyToOne
    @JoinColumn(name = "sender_ID", nullable = false)
    private userEntity senderID;

    @Enumerated(EnumType.STRING)
    private messageStatus status;

    @Column(name = "message", columnDefinition = "LONGTEXT", nullable = false)
    private String message;

    @Enumerated(EnumType.STRING)
    private messageType type;

    @Column(name = "date_creation")
    private Date createAt;

    public messageEntity() {
    }

    public Long getId() {
        return id;
    }

    public conversationEntity getConversationID() {
        return conversationID;
    }

    public void setConversationID(conversationEntity conversationID) {
        this.conversationID = conversationID;
    }

    public userEntity getSenderID() {
        return senderID;
    }

    public void setSenderID(userEntity senderID) {
        this.senderID = senderID;
    }

    public messageStatus getStatus() {
        return status;
    }

    public void setStatus(messageStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public messageType getType() {
        return type;
    }

    public void setType(messageType type) {
        this.type = type;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
