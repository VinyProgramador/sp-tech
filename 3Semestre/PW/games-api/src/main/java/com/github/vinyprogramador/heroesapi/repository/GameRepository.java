package com.github.vinyprogramador.heroesapi.repository;

import com.github.vinyprogramador.heroesapi.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {

    int countByisRatedRFalse();

    int countByCompanyId(Integer id);
}
