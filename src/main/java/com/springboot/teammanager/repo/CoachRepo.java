package com.springboot.teammanager.repo;
import com.springboot.teammanager.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface CoachRepo extends JpaRepository<Player, Long> {
    void deletePlayerById(Long id);

    Optional<Player> findPlayerById(Long id);
}
