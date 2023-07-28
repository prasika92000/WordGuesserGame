package com.aurionpro.test;
import java.util.Scanner;
import java.util.Random;


public class WordGuesserGame {

	public static void main(String[] args) {
	
		        String[] wordList = {"cat", "dog", "cow", "fox", "elephant", "zebra", "giraffe"};

		        System.out.println("Welcome to the Word Guesser Game!!!!!");
		        System.out.println("Guess the word :.");

		        Random random = new Random();
		        String wordToGuess = wordList[random.nextInt(wordList.length)];
		        int maxAttempts = 7;
		        int attempts = 0;
		        boolean wordGuessed = false;

		        Scanner scanner = new Scanner(System.in);

		        while (attempts < maxAttempts && !wordGuessed) {
		            System.out.println("\nAttempts left: " + (maxAttempts - attempts));
		            System.out.print("Enter your guess: ");
		            String input = scanner.nextLine().toLowerCase();

		            if (input.equals(wordToGuess)) {
		                wordGuessed = true;
		            } else {
		                attempts++;
		                System.out.println("Wrong guess!");
		            }
		        }

		        scanner.close();

		        if (wordGuessed) {
		            System.out.println("\nCongratulations! You guessed the correct word: " + wordToGuess);
		        } else {
		            System.out.println("\nSorry, you exceeds the attempts. The word was: " + wordToGuess);
		        }
		    }

}


