package com.playdata.mindcontrol.game.repository;

import com.playdata.mindcontrol.game.domain.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
