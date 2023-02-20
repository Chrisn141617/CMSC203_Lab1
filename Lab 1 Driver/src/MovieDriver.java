import java.util.Scanner;

public class MovieDriver {
	
	public static void main(String[] args) {
		
		char ch = 'y';
		
		while(ch == 'y' || ch == 'Y') 
		{
			Scanner sc = new Scanner(System.in);
			Movie pgk = new Movie();
			
			System.out.println("Enter the title of the movie: ");
			String title = sc.nextLine();
			pgk.setTitle(title);
			
			System.out.println("Enter the movie's rating: ");
			String rating = sc.nextLine();
			pgk.setRating(rating);
			
			System.out.println("Enter the amount of tickets sold at the rio theater: ");
			int soldTickets = sc.nextInt();
			pgk.setSoldTickets(soldTickets);
			
			System.out.println(pgk);
			
			System.out.println("Do you want to enter another? (y or n)");
			ch = sc.next().charAt(0);
			sc.nextLine();

		}
		System.out.println("GoodBye!");
		
	}

}
