import java.util.Scanner;

public class TrafficController {

	public static Intersection intersection1;
	public static Intersection intersection2;

	private final static String doubleLine = "===========================================================================";

	
	private int getMenuChoice() {
		int menuChoice = 0;
		System.out.println();
		System.out.print(doubleLine + "\n" + "The Traffic Light Controller" + "\n" + doubleLine + "\n" + "\n" + "0 = Exit System" + "\n" + "1 = Switch ALL Traffic" + "\n" + "2 = Stop ALL Traffic");
		System.out.print("\n" + "\n");
		menuChoice = Input.getIntRange("Menu Choice: ", 0, 3);
		System.out.print("\n" + "\n" + doubleLine + "\n" + "\n");
		return menuChoice;

	}
	
	private void switchAll() {
		intersection1.switchTraffic();
		intersection2.switchTraffic();
	}
	
	private void stopAll() {
		intersection1.stopTraffic();
		intersection2.stopTraffic();
	}
	
	private void displayAll() {
		intersection1.displayLights();
		intersection2.displayLights();
	}
	
	public void controlTraffic() {
		
		int menuChoice = -1;

		while (menuChoice != 0) {

			menuChoice = getMenuChoice();

			switch (menuChoice) {
			case 0:
				break;
			case 1:
				switchAll();
				displayAll();
				break;
			case 2:
				stopAll();
				displayAll();
				break;
			default:
				System.out.println("\n" + "whoops" + "\n");
				break;
			}
		}
	}



		public static void main(String[] args) {

		intersection1 = new Intersection("50th & Deborah");
		intersection2 = new Intersection("49th & Johnson");

		
		TrafficController app = new TrafficController();
		app.controlTraffic();
		
		System.out.println("Goodbye. . . You'll Drive Safely!");
		Input.sc.close();


		
		}
		

	}


