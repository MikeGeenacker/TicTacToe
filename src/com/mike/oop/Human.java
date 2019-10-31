package com.mike.oop;

import java.util.Scanner;

public class Human extends Player {
    public Human(String s, Piece p) {
        super(s, p);

    }

    public int[] doMove() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Waar wil je je Piece plaatsen?");

        // breakt er uit met valid input (niet in relatie met het Board maar gewoon 2 ints)
        while(true) {
            String input = scan.nextLine();

            if(input.length() != 3) {
                System.out.println("ongeldige lengte van input");
            }
            int x = 99;
            int y = 99;

            try {
                x = Integer.parseInt(input.substring(0, 1));
                y = Integer.parseInt(input.substring(2));

                return new int[] {x, y};
            } catch(Exception e){
                System.out.println("Geen int input");
            }

        }

    }
}
