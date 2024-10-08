package moviepackage;

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Movie move = new Movie();
		String res;
		
		do {
		
		System.out.print("Enter the title of a movie: ");
		String title = sc.nextLine();
		
		move.setTitle(title);
		
		System.out.print("Enter the rating of this movie: ");
		String rate = sc.nextLine();
		
		move.setRating(rate);
		
		System.out.print("Enter the number of tickets sold for this movie: ");
		int tick = sc.nextInt();
		
		move.setSoldTickets(tick);
		
		String result = move.toString();
		
		System.out.print("\n" + result);
		sc.nextLine();
		
		System.out.print("\n\nDo you want to enter another (y/n)? ");
		
		res = sc.nextLine();
		
		}while(res.equals("y") || res.equals("Y"));
		
		//writing a loop
		
		

	}

}
