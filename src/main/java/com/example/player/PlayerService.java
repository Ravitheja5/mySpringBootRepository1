/*
 
* You can use the following import statements*/
package com.example.player;

import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import java.util.*;
//import java.util.Collections.Collcetion;
import com.example.player.Player;
import com.example.player.PlayerRepository;

// Don't modify the below code

public class PlayerService implements PlayerRepository {

    private static HashMap<Integer, Player> team = new HashMap<>();
    int uniqueId = 12;

    public PlayerService() {
        team.put(1, new Player(1, "Alexander", 5, "All-rounder"));
        team.put(2, new Player(2, "Benjamin", 3, "All-rounder"));
        team.put(3, new Player(3, "Michael", 18, "Batsman"));
        team.put(4, new Player(4, "William", 45, "Batsman"));
        team.put(5, new Player(5, "Joshua", 19, "Batsman"));
        team.put(6, new Player(6, "Daniel", 10, "Bowler"));
        team.put(7, new Player(7, "Matthew", 34, "Bowler"));
        team.put(8, new Player(8, "Samuel", 17, "Batsman"));
        team.put(9, new Player(9, "John", 1, "Bowler"));
        team.put(10, new Player(10, "Earnest", 2, "All-rounder"));
        team.put(11, new Player(11, "Bob", 25, "Batsman"));
    }

    // Don't modify the above code

    // Write your code here
    @Override
    public ArrayList<Player> getPlayers() {
        Collection<Player> list = team.values();
        ArrayList<Player> playersList = new ArrayList<>(list);
        return playersList;

    }

    @Override
    public Player postPlayer(Player playerObject) {
        int id = team.size();
        playerObject.setPlayerId(uniqueId);
        team.put(id, playerObject);
        uniqueId = uniqueId + 1;
        return  getPlayerById(id);
    }

    
@Override
    public Player getPlayerById(int id) {

        Player player = team.get(id);
        if (player == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return player;

    }






    @Override
    public Player updatePlayer(int id, Player playerObject) {
        Player hashMapPlayerbject = team.get(id);
        if (hashMapPlayerbject != null) {
            hashMapPlayerbject.setPlayerName(playerObject.getPlayerName());
            hashMapPlayerbject.setJerseyNumber(playerObject.getJerseyNumber());
            hashMapPlayerbject.setRole(playerObject.getRole());

            return getPlayerById(id);
        }

        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @Override
    public ArrayList<Player> deletePlayer(int id) {

        Player playerOb = team.get(id);

   

          
            if (playerOb != null) {
                team.remove(id);
                throw new ResponseStatusException(HttpStatus.NO_CONTENT);

            }
            else{
               throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            }
    
           
        

       

    }

}
