package com.playdata.mindcontrol.game.service;

import com.playdata.mindcontrol.game.domain.entity.Game;
import com.playdata.mindcontrol.game.domain.response.GameResponse;
import com.playdata.mindcontrol.game.repository.GameRepository;
import com.playdata.mindcontrol.user.domain.entity.User;
import com.playdata.mindcontrol.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GameService {
    private final GameRepository gameRepository;
    private final UserRepository userRepository;

    public GameResponse enterUser(Long id) {
        Optional<User> byId = userRepository.findById(id);
        User user = byId.orElseThrow(() -> new NullPointerException("없는 유저입니다."));
        return new GameResponse(user);
    }
}
