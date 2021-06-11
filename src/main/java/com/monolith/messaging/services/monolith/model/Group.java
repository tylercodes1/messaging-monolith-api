package com.monolith.messaging.services.monolith.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "group")
public class Group {

    public Group (int groupId) {
        this.groupId = groupId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groupId;
    private String groupName;
    
    @ManyToMany(mappedBy = "groups", cascade = { CascadeType.ALL })
    private Set<User> users = new HashSet<>();
}
