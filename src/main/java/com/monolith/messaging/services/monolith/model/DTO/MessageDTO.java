package com.monolith.messaging.services.monolith.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MessageDTO {
    private int messageId;
    private String message;
    private int userId;
    private int groupId;
}
