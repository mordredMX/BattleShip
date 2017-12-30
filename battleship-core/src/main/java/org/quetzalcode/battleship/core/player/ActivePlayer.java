package org.quetzalcode.battleship.core.player;

import org.quetzalcode.battleship.core.board.Board;
import org.quetzalcode.battleship.core.board.EnemyBoard;
import org.quetzalcode.battleship.core.ship.Ship;

import java.util.List;

public class ActivePlayer extends RegisteredPlayer {
   private Board ownBoard;
   private EnemyBoard enemyBoard;
}