package com.playdata.mindcontrol.gameResult.domain.entity;

import com.playdata.mindcontrol.game.domain.entity.Game;
import com.playdata.mindcontrol.user.domain.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "GameResult")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GameResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 자동 생성된 게임 결과 ID

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // 유저 정보

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game; // 해당 게임

    private int correctAnswers; // 맞춘 정답 개수

    // 생성자, getter/setter, 기타 메서드
}
