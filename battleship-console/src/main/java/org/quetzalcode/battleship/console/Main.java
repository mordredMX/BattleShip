package org.quetzalcode.battleship.console;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to battleship...");
        System.out.println("Press any key to start...");
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        reader.readLine();
        printBoard();
    }

        public static void printBoard(){
        for (int i=0;i<=10;i++){
            for (int j=0;j<=10;j++){
                if(i==0 && j==0){
                    System.out.print("\t ");
                }
                else if(i==0){
                    System.out.print("\t"+(j));
                }
                else if(j==0){
                    System.out.print("\t"+(i));
                }else {
                    System.out.print("\t#");
                }
            }
            System.out.print("\n\n");
        }
    }
}
