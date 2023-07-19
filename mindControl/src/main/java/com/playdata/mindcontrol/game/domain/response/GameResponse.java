package com.playdata.mindcontrol.game.domain.response;

import com.playdata.mindcontrol.user.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GameResponse {
    private byte[] profilePicture;
    private String username;

    public GameResponse(User user) {
        this.profilePicture = user.getProfilePicture();
        this.username = user.getUsername();
    }
}
