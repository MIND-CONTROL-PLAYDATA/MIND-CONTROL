package com.playdata.mindcontrol.game.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/apl/v1/game")
public class GameController {
    @PostMapping("exit")
    public String exit(){
        return "/room";
    }

}
