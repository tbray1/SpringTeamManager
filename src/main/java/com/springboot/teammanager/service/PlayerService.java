package com.springboot.teammanager.service;

import com.springboot.teammanager.exception.UserNotFoundException;
import com.springboot.teammanager.repo.CoachRepo;
import com.springboot.teammanager.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class PlayerService {
    private final CoachRepo coachRepo;

    @Autowired
    public PlayerService(CoachRepo coachRepo) {
        this.coachRepo = coachRepo;
    }

    public Player addPlayer(Player player) {
        return coachRepo.save(player);
    }

    public List<Player> findAllPlayers() {
        return coachRepo.findAll();
    }

    public Player updatePlayer(Player player) {
        return coachRepo.save(player);
    }

    public Player findPlayerById(Long id) {
        return coachRepo.findPlayerById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deletePlayer(Long id){
        coachRepo.deletePlayerById(id);
    }
}