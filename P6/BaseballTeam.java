/**
 * This program took about 2 hours to complete.
 * This class creates the stats of a baseball team.
 * We worked seperately on this program and then met to compare. The effort was equal.
 * @author Wade Madden and Sam Sklopan
 * @version 12/04/2015
 */

public class BaseballTeam
{
	private String name;
	private int wins;
	private int losses;
	private double percentage;
	/**
	*This is a constructor which sets empty and zero values.
	*@param none
	*@return nothing
	*/
	public BaseballTeam ()
	{
		name = "";
		wins = 0;
		losses = 0;
		percentage = 0.0;
	}
	/**
	*This is a constructor which sets a team name and zero values.
	*@param _name - team name
	*@return nothing
	*/
	public BaseballTeam (String _name)
	{
		name = _name;
		wins = 0;
		losses = 0;
		percentage = 0.0;
	}
	/**
	*Increments the wins of a team
	*@param none
	*@return void
	*/
	public void incrementWins ()
	{
		wins++;
	}
	/**
	*Increments the losses of a team
	*@param none
	*@return void
	*/
	public void incrementLosses ()
	{
		losses++;
	}
	/**
	*Calculates the winning percentage of a team
	*@param none
	*@return void
	*/
	public void calculatePercentage ()
	{
		double total_games = wins + losses;
		percentage = wins / total_games;
		percentage *= 100;
	}
	/**
	*Accesses the name of a team
	*@param none
	*@return the name of the team
	*/
	public String getName ()
	{
		return name;
	}
	/**
	*Sets the name of a team
	*@param _name - team name
	*@return void
	*/
	public void setName (String _name)
	{
		name = _name;
	}
	/**
	*Accesses the number of wins of a team
	*@param none
	*@return the number of wins of a team
	*/
	public int getWins ()
	{
		return wins;
	}
	/**
	*Sets the number of wins of a team
	*@param _wins - the number of wins
	*@return void
	*/
	public void setWins (int _wins)
	{
		wins = _wins;
	}
	/**
	*Accesses the number of losses of a team
	*@param none
	*@return the number of losses of a team
	*/
	public int getLosses ()
	{
		return losses;
	}
	/**
	*Sets the number of losses of a team
	*@param _losses - the number of losses
	*@return void
	*/
	public void setLosses (int _losses)
	{
		losses = _losses;
	}
	/**
	*Accesses the percentage of a team
	*@param none
	*@return percentage of a team
	*/
	public double getPercentage ()
	{
		return percentage;
	}
	/**
	*Sets the percentage of a team
	*@param _percentage - the percentage of wins
	*@return void
	*/
	public void setPercentage (double _percentage)
	{
		percentage = _percentage;
	}
}
	