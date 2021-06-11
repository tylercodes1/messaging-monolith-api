package com.monolith.messaging.services.monolith.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    @ManyToMany(cascade = {
            CascadeType.ALL
    })
    @JoinTable(
            name = "user_group",
            joinColumns = {
                    @JoinColumn(name = "user_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "group_id")
            }
    )
    Set<Group> groups = new HashSet<>();
}
