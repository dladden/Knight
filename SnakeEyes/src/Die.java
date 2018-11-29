
public class Die {
	
	private final int max = 6; //maximum face value 
	private int faceValue; // current face value
	
	
	/**
	 * Constructor that sets the initial face value of the die
	 */
    public Die() {
    	faceValue = 1;
    }
	 
    public int roll() {
    	faceValue = (int)(Math.random()* max) + 1;
    	return faceValue;
    }

	public int getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(int value) {
		if(value > 0 && value <= max) {
			faceValue = value;
		}
	}

	public int getMax() {
		return max;
	}

	@Override
	public String toString() {
		return "Die [max=" + max + ", faceValue=" + faceValue + "]";
	}
    
    
    
}//end class
