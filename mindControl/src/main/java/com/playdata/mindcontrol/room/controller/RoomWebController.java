package com.playdata.mindcontrol.room.controller;

import com.playdata.mindcontrol.room.domain.request.RoomRequest;
import com.playdata.mindcontrol.room.domain.response.RoomResponse;
import com.playdata.mindcontrol.room.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/room")
public class RoomWebController {

    private final RoomService roomService;

    @GetMapping("/create")
    public String showCreatePage() {

        return "/room/createRoom";
    }

    @PostMapping("/create")
    public String createRoom(@ModelAttribute RoomRequest request) {
        roomService.createRoom(request);

        return "redirect:/main";
    }
}
