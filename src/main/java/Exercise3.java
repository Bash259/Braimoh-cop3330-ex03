/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */


import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("What is the quote?");
        Scanner UserInput = new Scanner(System.in);
        String quote = UserInput.nextLine();
        System.out.println("Who said it?");
        String author = UserInput.nextLine();
        System.out.println(author+" says, "+"\""+quote+"\"");
    }
}
