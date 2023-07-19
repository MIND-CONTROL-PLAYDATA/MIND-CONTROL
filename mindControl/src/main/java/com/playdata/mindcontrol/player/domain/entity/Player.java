package com.playdata.mindcontrol.player.domain.entity;

import com.playdata.mindcontrol.game.domain.entity.Game;
import com.playdata.mindcontrol.user.domain.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "Player")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 자동 생성된 플레이어 ID

    @ManyToOne
    @JoinColumn(name = "gameId")
    private Game game; // 해당 게임

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user; // 유저 정보

    private String nickname; // 닉네임

    private int correctAnswers; // 정답 수


    // 생성자, getter/setter, 기타 메서드
}
