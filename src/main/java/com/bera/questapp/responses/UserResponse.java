package com.bera.questapp.responses;

import com.bera.questapp.entities.User;
import lombok.Data;

@Data
public class UserResponse {

    Long id;
    int avatar;
    String userName;

    public UserResponse(User entity) {
        this.id = entity.getId();
        this.avatar = entity.getAvatar();
        this.userName = entity.getUserName();
    }
}
