/**
 * This class models a computer-based knight
 * object that can joust against another computer-base
 * knight object.
 * @author Rob Kelley
 * @version 1.2
 * Lab11 - Knight Project
 * Fall 2018
 */
import java.util.Random;

public class Knight{

	/** variable to hold Knight's experience level */
	private int experience; 
	/** variable to hold knights' name */
	private String name; 
	/** variable to hold the knight's most recent bet */
	private int bet;
	
	/**
	 * Empty-argument constructor to put the object into a consistent state
	 */
	public Knight() {
		this.setName("Mystery Knight");
		this.setExperience(25);
		this.bet = 0;
		
	}//end constructor
	
	/**
	 * This constructor initializes the object with experience and knight name
	 * @param experience
	 * @param name
	 */
	public Knight(int experience, String name){
		this.setName(name);
		this.setExperience(experience); 
		this.bet = 0;
	}//end constructor
	
	/**
	 * This method bets experience points the knight
	 * will use during the joust.
	 * @return - the amount of the bet
	 */
	public int joust(){
		
		int result = SharedRandom.getRandom(experience);
		bet = (result/2) + 1;
		experience-=bet;
		return bet;
	}//end joust

	/**
	 *  This method increases the experience points
	 *  for the knight who wins.
	 */
	public void increaseExperience(){
		experience+=bet;//win your bet back.
	}//end increaseExperience
	
	/**
	 * @return - value of experience
	 */
	public int getExperience() {
		return experience;
	}//end getExperience
	
	/**
	 * Setter for experience. Performs a bounds 
	 * check to ensure value between 10 and 50
	 * inclusive. If not, it sets it to 25.
	 * @param experience
	 */
	public void setExperience(int experience) {
		if(experience>=10 && experience<=50) {
			this.experience = experience;
		}
		else {
			this.experience = 25;
		}
	}//end setExperience
	
	/**
	 * Getter to return name of knight
	 * @return name
	 */
	public String getName() {
		return name;
	}//end getName

	/**
	 * @param - name of knight 
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName
	
	/**
	 * @return - the value of bet
	 */
	public int getBet(){
		return bet;
	}//end getBet
	
}//end class
