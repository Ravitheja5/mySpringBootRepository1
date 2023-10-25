/*
 * You can use the following import statements
 * 
 * 
 */

// Write your code here.
package com.example.player;

import org.springframework.web.bind.annotation.*;

import com.example.player.PlayerService;
import java.util.*;
import com.example.player.Player;

@RestController
public class PlayerController {

  PlayerService ps = new PlayerService();

  @GetMapping("/players")
  public ArrayList<Player> GetListOfPlayers() {
    return ps.getPlayers();
  }

  @PostMapping("players")
  public Player addPlayer(@RequestBody Player player) {
    return ps.postPlayer(player);
  }

  @GetMapping("/players/{studentId}")
  public Player getStudent(@PathVariable int studentId) {
    return ps.getPlayerById(studentId);
  }

  @PutMapping("/players/{playerId}")
  public Player putPlayer(@PathVariable int playerId, @RequestBody Player player) {
    return ps.updatePlayer(playerId, player);
  }

  @DeleteMapping("players/{playerId}")
  public ArrayList<Player> delete(@PathVariable int playerId) {
    return ps.deletePlayer(playerId);
  }

}
