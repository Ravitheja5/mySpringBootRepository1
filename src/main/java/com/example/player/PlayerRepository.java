// Write your code here

package com.example.player;

import java.util.*;
import com.example.player.Player;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();

    Player postPlayer(Player player);

    Player getPlayerById(int id);

    Player updatePlayer(int id, Player player);

    ArrayList<Player> deletePlayer(int id);

}