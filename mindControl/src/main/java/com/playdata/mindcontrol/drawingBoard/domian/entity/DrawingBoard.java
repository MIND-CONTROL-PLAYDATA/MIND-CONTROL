package com.playdata.mindcontrol.drawingBoard.domian.entity;

import com.playdata.mindcontrol.game.domain.entity.Game;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "DrawingBoard")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DrawingBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 자동 생성된 그림판 ID

    @OneToOne
    @JoinColumn(name = "gameId")
    private Game game; // 해당 게임

    private boolean onlyDrawingUserCanDraw; // 그림 권한이 있는 유저만 그릴 수 있는지 여부

    // 생성자, getter/setter, 기타 메서드
}
