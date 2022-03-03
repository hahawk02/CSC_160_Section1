public class Player {
	private String name;
	private int number;
	private int num1Attempts;
	private int num2Attempts;
	private int num3Attempts;
	private int madePoints;
	private int num1shots;
	private int num2shots;
	private int num3shots;
	private int fouls;

	public Player() {
		this.name = null;
		this.number = 0;
		this.num1Attempts = 0;
		this.num2Attempts = 0;
		this.num3Attempts = 0;
		this.madePoints = 0;
		this.num1shots = 0;
		this.num2shots = 0;
		this.num3shots = 0;
		this.fouls = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNum1Attempts() {
		return num1Attempts;
	}

	public void setNum1Attempts(int num1Attempts) {
		this.num1Attempts = num1Attempts;
	}

	public int getNum2Attempts() {
		return num2Attempts;
	}

	public void setNum2Attempts(int num2Attempts) {
		this.num2Attempts = num2Attempts;
	}

	public int getNum3Attempts() {
		return num3Attempts;
	}

	public void setNum3Attempts(int num3Attempts) {
		this.num3Attempts = num3Attempts;
	}

	public int getMadePoints() {
		return madePoints;
	}

	public void setMadePoints(int madeAttempts) {
		this.madePoints = madeAttempts;
	}

	public int getNum1shots() {
		return num1shots;
	}

	public void setNum1shots(int num1shots) {
		this.num1shots = num1shots;
	}

	public int getNum2shots() {
		return num2shots;
	}

	public void setNum2shots(int num2shots) {
		this.num2shots = num2shots;
	}

	public int getNum3shots() {
		return num3shots;
	}

	public void setNum3shots(int num3shots) {
		this.num3shots = num3shots;
	}

	public int getFouls() {
		return fouls;
	}

	public void setFouls(int fouls) {
		this.fouls = fouls;
	}
	
	public void displayPlayerStats() {
		System.out.println(name + " Fouls = " + getFouls() + " Points = " + getMadePoints());
	}
	
}
