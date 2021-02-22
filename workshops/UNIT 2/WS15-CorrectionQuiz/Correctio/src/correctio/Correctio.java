/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctio;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Correctio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        int totalOfPlayers = 0;
        String[] players;
        float[] goalAverages;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Plase Enter the amount of player you want to record ->");
        totalOfPlayers = scanner.nextInt();

        players = new String[totalOfPlayers];
        goalAverages = new float[totalOfPlayers];

        for (int i = 0; i < totalOfPlayers; i++) {
            scanner.nextLine();
            System.out.println("Please Enter the name of player #" + i + " ->");
            players[i] = scanner.nextLine();
            System.out.println("Please enter " + players[i] + "goals average ->");
            goalAverages[i] = scanner.nextFloat();
        }

        System.out.println(" Player -> \t   goal average  ");

        for (int i = 0; i < totalOfPlayers; i++) {
            System.out.println(players[i] + " -> \t" + goalAverages[i]);
        }

    }
}