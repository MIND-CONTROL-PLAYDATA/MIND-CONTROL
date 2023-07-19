package com.playdata.mindcontrol.room.domain.request;

import com.playdata.mindcontrol.room.domain.entity.Room;

public record RoomRequest(Long id, Long ownerId, String title, Boolean remark,
                          String gameStatus, String password, int maxCapacity) {

    public Room toEntity() {
        return Room.builder().ownerId(ownerId).title(title)
                .password(password).remark(remark).maxCapacity(maxCapacity).build();
    }
}
