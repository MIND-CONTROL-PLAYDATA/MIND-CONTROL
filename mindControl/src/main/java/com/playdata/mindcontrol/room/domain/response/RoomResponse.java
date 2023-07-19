package com.playdata.mindcontrol.room.domain.response;

import com.playdata.mindcontrol.room.domain.entity.Room;
import lombok.Getter;

@Getter
public class RoomResponse {
    private Long id; // 자동 생성된 방 ID

    private Long ownerId; // 방장 아이디

    private String title; // 제목

    private int capacity; // 인원 수
    private Boolean  remark; // 비고 (방 패스워드 존재 여부에 따라 비공개 방, 공개 방)

    private boolean gameStatus; // 게임 상태 (대기, 진행)

    private String password; // 방 패스워드

    private int maxCapacity; // 최대 수용 인원

    public RoomResponse(Room room) {
        this.id = room.getId();
        this.ownerId = room.getOwnerId();
        this.title = room.getTitle();
        this.capacity = room.getCapacity();
        this.remark = room.getRemark();
        this.gameStatus = room.isGameStatus();
        this.password = room.getPassword();
        this.maxCapacity = room.getMaxCapacity();
    }
}
