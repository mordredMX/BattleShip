package org.quetzalcode.battleship.core;

import org.quetzalcode.battleship.core.battle.Battle;
import org.quetzalcode.battleship.core.player.PlayerManager;
import org.quetzalcode.battleship.core.player.RegisteredPlayer;

public class BattleShipManager {
    private PlayerManager playerManager;
    public BattleShipManager(final PlayerManager playerManager){
        this.playerManager=playerManager;
    }

    public Battle findBattle(final String id){
        RegisteredPlayer registeredPlayer=playerManager.getPlayerById(id);
        return null;
    }
}
