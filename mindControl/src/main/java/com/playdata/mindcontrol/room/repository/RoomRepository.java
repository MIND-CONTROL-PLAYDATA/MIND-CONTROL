package com.playdata.mindcontrol.room.repository;

import com.playdata.mindcontrol.room.domain.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
