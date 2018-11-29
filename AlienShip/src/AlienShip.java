
import java.util.Random;

public class AlienShip {
		
		private int xPos;// variable that hold x postition 
		private int yPos;
		private int numberTorpedoes;
		private int health;
		private String shipName;
		
		public static int alienCount = 0;
		
		private Random r = new Random();
		
		/**
		 * Empty Arg construcor to put the 
		 */
		
		public AlienShip() {
			
			xPos = 0;
			yPos = 0;
			numberTorpedoes = 0;
			health = 100;
			shipName = "StarLord";
			alienCount++;
			
		}//empty argument constroctor
		/**
		 * 
		 * @param x
		 * @param y
		 * @param numberTorpedoes
		 * @param shipName
		 */
		
		public AlienShip(int x, int y, int numberTorpedoes, String shipName) {
			
			this.xPos = x; //calls the setter which has bounds checking
			this.yPos = y; //calls the setter which has bounds checking
			this.numberTorpedoes = numberTorpedoes; //calls the setter which has bounds checking
			this.shipName = shipName;
			health = 100;
			alienCount++;
			
	}//constroctor
		
		/**
		 * this methods updates alien's postion in 2d space
		 * @param x integer value of a x cordinate
		 * @param y
		 */
		
		public void updatePosition( int x, int y ) {
			
			setxPos(x); //calling the seter for xPos
			setyPos(y); //calling rhe seter for yPos
			
			
		}//updatePosition
		/**
		 * This fire one torpedo
		 */
		
		public void fire() {
			
			if(this.numberTorpedoes>=1) {
				numberTorpedoes--;
				
			}
		
			
		}//fire
		/**
		 * This methods fires the specific number of torpedoes 
		 * @param numbertorpedoes
		 */
		
		public void fire(int numberTorpedoes) {
			if(this.numberTorpedoes>=numberTorpedoes)
				numberTorpedoes-=numberTorpedoes;
		}//fire
		
		public String sendMessage() {
			int m = r.nextInt(5);
			String message;
			
			switch(m) {
			
			case 0: 
				message = "Taking Dmamage";
				break;
			case 1: 
				message = "Taking Dmamage2";
				break;	
			case 2: 
				message = "Taking Dmamage3";
				break;
			case 3: 
				message = "Taking Dmamage4";
				break;
			default:
				message = "End";
			}// end switch
			return message;
		}
		
		
		/**
		 * This method reduces the health of the ship
		 * based on th epower of the ship
		 * 
		 * @param power
		 */
		public int takeDamage(int power) {
		
			if(power<1 || power>10)
				return health;
			else {
				health-=power;
				if(this.health<0)
					health = 0;	
			}
			return health;
		}//end takeDamage
		
		
		public int getxPos() {
			return xPos;
		}
		public void setxPos(int xPos) {
			this.xPos = xPos;
			
			if(xPos < -200 || xPos > 200) {
				
				this.xPos = 0;
			}
			else {
				
				this.xPos = xPos;
				}
				
		}//end setxPos
		public int getyPos() {
			return yPos;
		}
		public void setyPos(int yPos) {
			this.yPos = yPos;
			
			if(yPos> 0 && yPos <= 500) {
				this.yPos = 0;
				}
			else {
				this.yPos = 0;
			}
		}//end ypos
		public int getNumberTorpedoes() {
			return numberTorpedoes;
		}
		public void setNumberTorpedoes(int numberTorpedoes) {
		    if(numberTorpedoes < 0 || numberTorpedoes > 500) {
		    	
		    	this.numberTorpedoes = 100;
		    	}
		    else {
		    	this.numberTorpedoes = 0;
		    	    }
		
		}
		public int getHealth() {
			return health;
		}
		public void setHealth(int health) {
			this.health = health;
		}
		public String getShipName() {
			return shipName;
		}
		public void setShipName(String shipName) {
			this.shipName = shipName;
		}//Getters and Setters
		
		
		
		
		@Override
		public String toString() {
			return "AlienShip [xPos=" + xPos + ", yPos=" + yPos + ", numberTorpedoes=" + numberTorpedoes + ", health="
					+ health + ", shipName=" + shipName + "]";
		}
	
		
		
}//class

