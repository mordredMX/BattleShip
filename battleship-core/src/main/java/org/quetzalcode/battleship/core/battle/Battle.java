package org.quetzalcode.battleship.core.battle;

import org.quetzalcode.battleship.core.player.ActivePlayer;

public class Battle {
    private ActivePlayer player1;
    private ActivePlayer player2;
    public Battle(ActivePlayer player1,ActivePlayer player2){
        this.player1=player1;
        this.player2=player2;
    }
}
