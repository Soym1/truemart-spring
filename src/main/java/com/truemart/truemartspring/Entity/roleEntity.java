package com.truemart.truemartspring.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="roles")
public class roleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name="role", nullable = false)
    private String role;

    @ManyToMany(mappedBy = "roles")
    private List<userEntity> users = new ArrayList<>();

    public roleEntity() {
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public void setUsers(List<userEntity> users) {
        this.users = users;
    }
}
