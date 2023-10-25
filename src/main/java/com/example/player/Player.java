// Write your code here.
package com.example.player;

import java.util.*;

public class Player {
  private int playerId;
  private String playerName;
  private int jerseyNumber;
  private String role;

  public Player(int playerId, String playerName, int jerseyNumber, String role) {
    this.playerId = playerId;
    this.playerName = playerName;
    this.jerseyNumber = jerseyNumber;
    this.role = role;
  }

  public String getPlayerName() {
    return this.playerName;
  }

  public void setPlayerName(String newName) {
    this.playerName = newName;
  }

  public int getPlayerId() {
    return this.playerId;
  }

  public void setPlayerId(int newId) {
    this.playerId = newId;
  }

  public int getJerseyNumber() {
    return this.jerseyNumber;
  }

  public void setJerseyNumber(int newJerseyNumber) {
    this.jerseyNumber = newJerseyNumber;
  }

  public String getRole() {
    return this.role;
  }

  public void setRole(String newRole) {
    this.role = newRole;
  }

}
// ccbp submit JSBCPCPYAI
