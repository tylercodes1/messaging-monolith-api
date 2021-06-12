package com.monolith.messaging.services.monolith.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Group {

    public Group (int groupId) {
        this.groupId = groupId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groupId;
    private String groupName;
}
