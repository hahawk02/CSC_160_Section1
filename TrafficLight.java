
public class TrafficLight {
	
	private static final String RESET = "\033[0m";
	private static final String RED = "\033[31;7m";
	private static final String YELLOW = "\033[33;7m";
	private static final String GREEN = "\033[32;7m";
	
	public boolean redLight;
	public boolean yellowLight;
	public boolean greenLight;
	
	public TrafficLight() {
		this.redLight = true;
		this.yellowLight = false;
		this.greenLight = false;
	}

	public boolean isRedLight() {
		return redLight;
	}

	public void setRedLight() {
		this.redLight = true;
		this.yellowLight = false;
		this.greenLight = false;
	}

	public boolean isYellowLight() {
		return yellowLight;
	}

	public void setYellowLight() {
		this.redLight = false;
		this.yellowLight = true;
		this.greenLight = false;
	}

	public boolean isGreenLight() {
		return greenLight;
	}

	public void setGreenLight() {
		this.redLight = false;
		this.yellowLight = false;
		this.greenLight = true;
	}

	public static String getReset() {
		return RESET;
	}

	public static String getRed() {
		return RED;
	}

	public static String getYellow() {
		return YELLOW;
	}

	public static String getGreen() {
		return GREEN;
	}
	
	public void displayLight() {
		if (redLight)
			System.out.print(RED + "Red" + RESET);
		else if (yellowLight)
			System.out.print(YELLOW + "Yellow" + RESET);
		else if (greenLight)
			System.out.print(GREEN + "Green" + RESET);
	}

	
}

