/**
 * This program took about 6 hours to complete.
 * This class uses the information from all baseball teams to report on the league.
 * We worked seperately on this program and then met to compare. The effort was equal.
 * @author Wade Madden and Sam Sklopan
 * @version 12/04/2015
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P6
{
	private static ArrayList<BaseballTeam> league = new ArrayList<BaseballTeam>();
	/**
	*This is the main method which consists of loops which assign winners and losers to sets of games.
	*@param String[] args
	*@return void
	*/
	public static void main (String[] args)
	{
		Scanner cin = new Scanner(System.in);
		
		int num_teams = cin.nextInt();
		String dummy_text = cin.nextLine();		//clears out the first line so that the team on the second line of the text file is the first team in the array
		for (int i = 0; i < num_teams; ++i)
		{	
			String next_name = cin.nextLine();
			BaseballTeam current = new BaseballTeam(next_name);
			league.add(current);
		}
		
		while (true)	//Loop which goes through each game and assigns the winner and loser of said game until there are no more games
		{
			String game = cin.nextLine();
			if (game.equals("DONE 0 DONE 0"))
				break;
			
			StringTokenizer st = new StringTokenizer(game);
			String team1 = st.nextToken();
			int score1 = Integer.parseInt(st.nextToken());
			String team2 = st.nextToken();
			int score2 = Integer.parseInt(st.nextToken());
				
			int team1_index = findIndex(league,team1);
			int team2_index = findIndex(league,team2);
			
			String winner = getWinner(team1,score1,team2,score2);
			
			if (winner.equals(team1))
			{
				league.get(team1_index).incrementWins();
				league.get(team2_index).incrementLosses();
			}
			else
			{
				league.get(team1_index).incrementLosses();
				league.get(team2_index).incrementWins();
			}
		}
		
		for (BaseballTeam current : league)
			current.calculatePercentage();
		
		sortArray();
		printStandings();
	}
	/**
	*This method takes an array of BaseballTeams, and a String name, and returns the index of the team name.
	*@param input - ArrayList of type BaseballTeam
	*@param name - String of the team name
	*@return the index of the team name
	*/
	public static int findIndex (ArrayList<BaseballTeam> input, String name)
	{
		int i = 0;
		for (i = 0; i < input.size(); i++)
		{
			String current = input.get(i).getName();
			if (current.equals(name))
				break;
		}
		return i;
	}
	/**
	*Compares the scores of two teams and returns the team with the higher score.
	*@param team1 - name of the first team
	*@param score1 - the number of runs of the first team
	*@param team 2 - the name of the second team
	*@param score2 - the number of runs of the second team
	*@return the team with the higher number of runs
	*/
	public static String getWinner (String team1, int score1, String team2, int score2)
	{
		if (score1 > score2)
			return team1;
		else
			return team2;
	}
	/**
	*Finds the index of the largest winning % remaining
	*@param none
	*@return void
	*/
	public static void sortArray ()
	{
		ArrayList<BaseballTeam> temp = new ArrayList<BaseballTeam>();
		for (BaseballTeam current : league)
			temp.add(current);
		
		league.clear();
		
		for (int i = 0; i < temp.size(); i++)
		{
			String name = temp.get(i).getName();
			boolean added = false;
			for (int j = 0; j < league.size(); ++j)
			{
				if (name.compareTo(league.get(j).getName()) <= 0)
				{
					league.add(j,temp.get(i));
					added = true;
					break;
				}
			}
			
			if (!added)
				league.add(temp.get(i));
		}
	}
	/**
	*Prints the standings of all Baseball teams in order of winningest percentage.
	*@param none
	*@return void  
	*/
	public static void printStandings ()
	{
		System.out.println(String.format("%-12.12s %5s %5s %s","Teams","Wins","Losses","Percentage"));
		for (BaseballTeam current : league)
			System.out.println(String.format("%-12.12s %5d %5d %7.1f",current.getName(),current.getWins(),current.getLosses(),current.getPercentage()));
		
	}
}