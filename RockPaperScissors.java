/*****************************
* File Name: RockPaperScissors
* Coder Name: Raymond Luu
* Assignment: 5
*****************************/

import java.util.*;

public class RockPaperScissors
{
	public static final int rounds = 10;
	
	public static void main ( String [] args )
	{	
		int w = 0;
		int l = 0;
		int t = 0;
		int e = 0;
		
		System.out.println( "Welcome to Rock, Paper, Scissors in Java." );
		System.out.println( "To enter your choice of Rock, Paper, Scissors," );
		System.out.println( "type one letter: r or p or s." + "\n" );
		for (int i = 1; i <= rounds; i++) //run the game however many times the global constant is
		{
			int a = playRound(i);
		
			if ( a == 4 )//resets the round if you make an error
			{
				i--;
			}
			
			if ( a == 1 )
			{
				w++; //adds up wins
			}
			else if ( a == 2 )
			{
				l++; //adds up loses
			}
			else if ( a == 3 )
			{
				t++; //adds up ties
			}
			else if ( a == 4 )
			{
				e++; //adds up errors
			}
		}
		System.out.println( "Results: You won " + w + ", Computer won " + l + ", You Tied " + t + ", " + e + " errors were made");
	}
	public static int playRound(int round)//parameter for each round
	{
		int n = round;
		String r = "Rock!";
		String p = "Paper!";
		String s = "Scissors!";
		
		System.out.print( "Round " + n + ":\n" );
		
		Scanner console = new Scanner(System.in);
		String input = console.next(); //input from user
		
		System.out.print( "Your Choice: " );
		
		if ( input.equals("r") )
		{
			System.out.println( r );
		}
		else if ( input.equals("p") )
		{
			System.out.println( p );
		}
		else if ( input.equals("s") )
		{
			System.out.println( s );
		}
		else //users input choice
		{
			System.out.println( input );
		}
		
		System.out.print( "Computer's Choice: " );
		
		Random rand = new Random();
		int comp = rand.nextInt(3);	//using comp as the
												//variable instead of r
		//computers random generated choice
		if (comp == 0)
		{
			System.out.println("Rock!");
		}
		else if ( comp == 1 )
		{
			System.out.println("Paper!");
		}
		else	// comp == 2
		{
			System.out.println("Scissors!");
		}
		//comparing your choice vs computers choice to see who wins
		if ( input.equals("r") && comp == 2 || 
			  input.equals("p") && comp == 0 ||
			  input.equals("s") && comp == 1 )
		{
			System.out.println( "You win Round " + n + "\n" );
			return 1; //win gets value 1
		}
		else if ( input.equals("r") && comp == 1 || 
			  		 input.equals("p") && comp == 2 ||
			  		 input.equals("s") && comp == 0 )
		{
			System.out.println( "Computer wins Round " + n + "\n" );
			return 2; //lose gets value 2
		}
		else if ( input.equals("r") && comp == 0 || 
			  		 input.equals("p") && comp == 1 ||
			  		 input.equals("s") && comp == 2 )
		{
			System.out.println( "Tie for Round " + n + "\n" );
			return 3; //tie gets value 3
		}
		else
		{
			System.out.println( "You need to pick r or p or s" );
			System.out.println();
			return 4; //error gets value 4
		}
	}
}