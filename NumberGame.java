package com.java.dev;

import java.util.*;

class game
{
    Scanner sc = new Scanner(System.in);
    int round = 0;
    int win = 0;

    public void playGame()
    {
        boolean play = true;

        while(play)
        {
            Random random = new Random();
            int num = random.nextInt(101);
            int attempts = 0;
            int maxAttempts = 5;
    
            round++;

            while(attempts < maxAttempts)
            {
                System.out.print("Enter Your Guess: ");
                int guess = sc.nextInt();
                attempts++;
        
                if(guess<num)
                {
                    System.out.println("No is low");
                }
                else if(guess>num)
                {
                    System.out.println("No is high");
                }
                else
                {
                    System.out.println("You get the no");
                    win++;
                    break;
                }
            }

            System.out.print("You want to play again (yes/no): ");
            String playAgain = sc.next().trim().toLowerCase();

            if(playAgain.equals("no"))
            {
                play = false;
            }
        }

        System.out.print("\nTotal Rounds: "+round);
        System.out.print("\nTotal Win: "+win);
        sc.close();
        
    }
}

public class NumberGame 
{
	public static void main(String[] args) 
	{
		game obj = new game();
		obj.playGame();
	}

}
