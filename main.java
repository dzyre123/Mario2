package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hashheight;
        //Prompts user to give us a height
        do {
            System.out.print("What do you want the height to be?");
            hashheight = input.nextInt();
            //makes sure heights are valid
        } while (hashheight < 1 || hashheight > 8);
        hashtags(hashheight);
        System.out.println("Height = " + hashheight);
    }

    static void hashtags(int hashheight) {
        for (int r = 0; r < hashheight; r++) {
            // spaces for right aligned = height - row - 1
            for (int space = 0; space < hashheight - r - 1; space++) {
                System.out.print(" ");
            }
            for (int columns = 0; columns <= r; columns++) {
                System.out.print("#");
            }
            System.out.print("  ");
            for (int columns = 0; columns <= r; columns++) {
                System.out.print("#");
            }
            //print new line
            System.out.print("\n");
        }
    }
}
