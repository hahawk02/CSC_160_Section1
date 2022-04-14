package calculator.device;
import java.lang.Math;

public abstract class Calculator extends StandardCalc implements BasicMath {
	double currentValue = 0.0;
	
	void clear() {
		
	}
	
	void add(double add) {
		
	}
	
	void subtract(double subtract) {
		
	}
	
	void multiply(double multiply) {
		
	}
	
	void divide(double divide) {
		
	}

	public double getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(double currentValue) {
		this.currentValue = currentValue;
	}

}
