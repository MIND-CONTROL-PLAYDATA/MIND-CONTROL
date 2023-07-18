package com.playdata.mindcontrol.room.domain.entity;

import com.playdata.mindcontrol.game.domain.entity.Game;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@Table(name = "Room")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 자동 생성된 방 ID

    @Column(nullable = false)
    private Long ownerId; // 방장 아이디

    @Column(nullable = false)
    private String type; // 종류 (개인방)

    @Column(nullable = false)
    private String title; // 제목

    @Column(nullable = false)
    private int capacity; // 인원 수

    private String remark; // 비고 (방 패스워드 존재 여부에 따라 비공개 방, 공개 방)

    @Column(nullable = false)
    private String gameStatus; // 게임 상태 (대기, 진행)

    private String password; // 방 패스워드

    private int maxCapacity; // 최대 수용 인원

    @OneToMany(mappedBy = "room")
    private List<Game> games; // 게임 목록

    // 생성자, getter/setter, 기타 메서드
}
