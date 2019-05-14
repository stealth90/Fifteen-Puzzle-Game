package com.Esame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grid a= new Grid();
        System.out.println(a);
        a.getEmptyCell();
        boolean exit=false;
        while(!exit){
            printMenu();
            int choice = scanner.nextInt();
            switch (choice){
                case 1: {
                    a.shuffleGrid();
                    System.out.println(a);
                    break;
                }
                case 2:
                    while(!a.win()){
                    System.out.println("Give me a direction or press 0 to quit.");
                    System.out.println("4 = ← || 8= ↑ || 6= → || 2== ↓");
                    int direction= scanner.nextInt();
                    if(direction==0)break;
                    a.swipe(direction);
                    System.out.println(a);
                    if(a.win()){
                        System.out.println("YOU WIN");
                        exit=true;
                        }
                    }
                    break;
                case 3:
                    System.out.println("BYE BYE. THANKS FOR PLAYING :D");
                    exit=true;
            }
        }
    }

    public static void printMenu(){
        System.out.println("WELCOME");
        System.out.println("Choose an option:");
        System.out.println("1: NEW GAME");
        System.out.println("2: DO A MOVE");
        System.out.println("3: EXIT");
    }
}
