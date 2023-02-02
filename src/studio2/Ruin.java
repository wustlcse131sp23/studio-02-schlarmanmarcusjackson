package studio2;

import java.util.*;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("How much money did you start with?");
		double startAmount = in.nextDouble(); 
		System.out.println("What is the win probability?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		double winLimit = in.nextDouble();
		int counter = 0;
		System.out.println("How many days are you simulating?");
		int totalSimulations = in.nextInt();
		boolean success = false;



		for (int i = 1; i <= totalSimulations; i++) {

			while(0< startAmount && startAmount < winLimit) {
				counter++;

				if (Math.random() < winChance){

					startAmount ++;
				}

				else {startAmount--;

				}

				if (startAmount == winLimit || startAmount == 0 ){
					if (startAmount == winLimit) {
						success = true;

						System.out.println("You won!");
					}

					else {System.out.println("You lost!");
					}
						
						

					}
				}




				System.out.println("Simulation day:" + i);}



















			//If booleanWin = Math.random() >= winChance;

			//System.out.println 

		}



	}

