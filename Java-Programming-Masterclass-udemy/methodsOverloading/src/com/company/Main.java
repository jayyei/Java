package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        calculateScore("Tim", 500);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    // El cambiar el valor de retorno no alternal al firma del metodo, por lo que no se considera sobrecarga
    // ejemplo:
    // public static int calculateStore() {}
    // public static void calculateStore() {}

    // lo que hace efectiva la sobrecarga de metodos es la cantidad y tipo de parametros

}
