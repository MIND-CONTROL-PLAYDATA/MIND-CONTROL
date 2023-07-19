package com.playdata.mindcontrol.game.service;

import com.playdata.mindcontrol.user.MockUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GameService {
    private final MockUserRepository userRepository;

}
