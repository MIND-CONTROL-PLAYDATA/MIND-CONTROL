package com.playdata.mindcontrol.room.controller;


import com.playdata.mindcontrol.room.domain.request.RoomRequest;
import com.playdata.mindcontrol.room.domain.response.RoomResponse;
import com.playdata.mindcontrol.room.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/room")
public class RoomController {
    private final RoomService roomService;

    @PostMapping
    public void createRoom(@RequestBody RoomRequest request) {
        roomService.createRoom(request);
    }

    @GetMapping
    public List<RoomResponse> findAll() {
        return roomService.findAll();
    }
}
