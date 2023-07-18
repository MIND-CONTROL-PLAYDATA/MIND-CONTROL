package com.playdata.mindcontrol.game.domain.entity;

import com.playdata.mindcontrol.chat.domain.entity.Chat;
import com.playdata.mindcontrol.drawingBoard.domian.entity.DrawingBoard;
import com.playdata.mindcontrol.player.domain.entity.Player;
import com.playdata.mindcontrol.room.domain.entity.Room;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@Table(name = "Game")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 자동 생성된 게임 ID

    @Column(nullable = false)
    private int drawingTimeLimit; // 그림 그리는 타임 어택 시간 (초)

    @Column(nullable = false)
    private int guessingTimeLimit; // 정답 맞추는 시간 타임 어택 시간 (초)

    @ManyToOne
    @JoinColumn(name = "roomId")
    private Room room; // 해당 게임의 방

    @OneToMany(mappedBy = "game")
    private List<Player> players; // 플레이어 목록

    @OneToOne(mappedBy = "game")
    private DrawingBoard drawingBoard; // 그림판

    @OneToMany(mappedBy = "game")
    private List<Chat> chats; // 채팅 목록

    // 생성자, getter/setter, 기타 메서드
}
