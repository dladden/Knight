	
import java.util.*;

public class Desk {
	
	private int length;
	private int width;
	private int numberOfdrawers;
	
	
	public Desk() {
		
		length = 0;
		width = 0;
		numberOfdrawers = 0;
		
		}//empty constructor
	
	
	public Desk(int l, int w, int nod) {
		
		this.setLength(l);
		this.setWidth(w);
		this.setNumberOfdrawers(nod);
		
	}


	private int getArea(int lenght, int width) {
		
		int area = lenght * width;
		return area;
	}
	
	public double calculateCost() {
		
		return(20 *
		
	}


	public void setLength(int length) {
		
		if(length<0) {
		
			this.length = 0; 
		}
		else {
			
		this.length = length;
	}
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		if(width<0) {
			this.width = 0;
		}
		else {
		this.width = width;
	}
	}

	public int getNumberOfdrawers() {
		return numberOfdrawers;
	}


	public void setNumberOfdrawers(int numberOfdrawers) {
		
		if(numberOfdrawers<0 || numberOfdrawers>4) {
			this.numberOfdrawers = 0;
		}
		else {
		this.numberOfdrawers = numberOfdrawers;
	}
	}
	
	
	
}//END DESK