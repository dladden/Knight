
import java.util.Random;

public class Application {

	public static void main(String[] args) {
		
		AlienShip s1 = new AlienShip();
		System.out.println(s1.toString());
		System.out.println(s1.alienCount);
		
		
		AlienShip s2 = new AlienShip(10, 10, 200, "StarLord");
		System.out.println(s2.toString());
		System.out.println(AlienShip.alienCount);
		System.out.println(s2.alienCount);
		
		s2.setxPos(50);
		System.out.print("The X Position is: "  +s2.getxPos());
		
		s1.updatePosition(10, 20);
		System.out.printf("Postion: [%d, %d]%n", s2.getxPos(), s2.getyPos());
		
		System.out.println(s2.getNumberTorpedoes());
		s2.fire();
		
		System.out.println(s2.getNumberTorpedoes());
		s2.fire(10);
		System.out.println(s2.getNumberTorpedoes());
	
		
	Random r = new Random();
	
	int shot = 0;
	
	while(s2.getHealth()>0) {
		
		shot = r.nextInt(10)+1;
		s2.takeDamage(shot);
		System.out.println(s2.sendMessage());
		
	}//end while
	
	System.out.println("BOOM");
	
	
	
	}//main
	
	
}//class