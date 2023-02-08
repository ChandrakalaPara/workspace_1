package com.game;

import java.util.*;

	
class guesser{	
	int guessNum;
	
	int guessNum()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Guesser kindky guess the number");
		int guessNum= scan.nextInt();
		return guessNum;
		
	}
}
	
class player{
		
		int guessNum;
		int guessNum()
		{
			Scanner scan= new Scanner(System.in);
			System.out.println("Player kindly guess the number");
			int guessNum= scan.nextInt();
			return guessNum;
			
		}
				
	}
	
	class umpire{
		
		int numFromGuesser;
		int numFromPlayer1;
		int numFromPlayer2;
		int numFromPlayer3;
		
		void collectNumFromGuesser() {
			
			guesser g=new guesser();
			numFromGuesser=g.guessNum();
			
		}
        void collectNumFromPlayer() {
        	
        	player p1= new player();
        	player p2= new player();
        	player p3= new player();
        numFromPlayer1=p1.guessNum();
        numFromPlayer2=p2.guessNum();
        numFromPlayer3=p3.guessNum();
        
			
		}
        void compare() {
        	
        	if (numFromGuesser==numFromPlayer1) {
        		
        		if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
        			
        			System.out.println("All Players won the game");
        		}
        		else if(numFromGuesser==numFromPlayer2) {
        			
        			System.out.println("Players 1&2 won the game");
        			
        		}
        		else if(numFromGuesser==numFromPlayer3) {
        			
        			System.out.println("Players 1&3 won the game");
        		}
        		else {
        		
        		System.out.println("Player 1 won the game");}
        	}
        	else if(numFromGuesser==numFromPlayer2) {
        		
        		if(numFromGuesser==numFromPlayer3) {
        			
        			System.out.println("Player 2 & 3  won the game");
        		}
        		else {
           		
        		System.out.println("Player 2 won the game");
        		}
        		
            }
        	else if(numFromGuesser==numFromPlayer3) {
        		
        		System.out.println("Player 3 won the game");
        	}
        	else {
        	   
        		System.out.println("Nobody won the game");
        	}
        		
		}
		
	}
	
	class Gesser_game {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		umpire u=new umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
		
     
	}
	}


