package org.quetzalcode.battleship.core.player;

import java.util.Set;

public class PlayerManager {

    private Set<RegisteredPlayer> waitingPlayers;

    private Set<ActivePlayer> activePlayers;

    public RegisteredPlayer registerPlayer(final Player player){

        return null;
    }

    public boolean unRegisterPlayer(final RegisteredPlayer registeredPlayer){
        return false;
    }

    public RegisteredPlayer getPlayerById(final String id){
        return null;
    }

    public Set<ActivePlayer> getActivePlayers(){
        return activePlayers;
    }

    public Set<RegisteredPlayer> getWaitingPlayers(){
        return waitingPlayers;
    }

    public boolean switchToActivePlayer(RegisteredPlayer waitingPlayer){
        waitingPlayers.remove(waitingPlayer);
        activePlayers.add((ActivePlayer) waitingPlayer);
        return false;
    }
}
