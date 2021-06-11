package com.monolith.messaging.services.monolith.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private int userId;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private List<Integer> groupIds;
}
