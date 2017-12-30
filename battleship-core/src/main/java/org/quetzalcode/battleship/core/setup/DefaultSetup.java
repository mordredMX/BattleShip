package org.quetzalcode.battleship.core.setup;

public class DefaultSetup {
    private static final int BOARD_SIZE=20;

    private static final int [] SHIPS_CONF=new int [] {2,3,3,5};

    public int getBoardSize(){
        return BOARD_SIZE;
    }

    public int[] shipsConfiguration(){
        return  SHIPS_CONF;
    }
}
