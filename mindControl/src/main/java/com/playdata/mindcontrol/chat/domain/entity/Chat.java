package com.playdata.mindcontrol.chat.domain.entity;

import com.playdata.mindcontrol.game.domain.entity.Game;
import com.playdata.mindcontrol.user.domain.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "Chat")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 자동 생성된 채팅 ID

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game; // 해당 게임

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender; // 메시지를 보낸 유저

    @Column(nullable = false)
    private String message; // 메시지 내용

    // 생성자, getter/setter, 기타 메서드
}
