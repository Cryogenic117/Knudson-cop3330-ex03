/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Brandon Knudson
 */
package oop.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String quote, author;

        System.out.println("What is the quote?");
        quote = input.nextLine();

        System.out.println("Who said it?");
        author = input.nextLine();

        System.out.printf("%s says, \"%s\".", author, quote);

    }
}
