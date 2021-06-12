package com.monolith.messaging.services.monolith.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupUserDTO {
    int userId;
    int groupId;
}
