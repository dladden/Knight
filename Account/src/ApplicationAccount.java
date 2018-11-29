
public class ApplicationAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a1 = new Account();
		System.out.print(a1.toString());
		
		Account a2 = new Account("2020202", 400);
		System.out.println(a2.toString());
		
		a2.deposit(5);
		System.out.println(a2.toString());
		
		a2.withdraw(500);
		System.out.println(a2.toString());
		
		a2.withdraw(300);
		System.out.println(a2.toString());
		
		
		
	}

}