package com.playdata.mindcontrol.room.service;

import com.playdata.mindcontrol.room.domain.entity.Room;
import com.playdata.mindcontrol.room.domain.request.RoomRequest;
import com.playdata.mindcontrol.room.domain.response.RoomResponse;
import com.playdata.mindcontrol.room.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    public Room createRoom(RoomRequest request) {
        return roomRepository.save(request.toEntity());
    }

    public List<RoomResponse> findAll() {
        List<Room> all = roomRepository.findAll();
        return all.stream().map(RoomResponse::new).toList();
    }
}
