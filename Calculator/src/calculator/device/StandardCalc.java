package calculator.device;
import java.lang.Math;

public class StandardCalc extends AdvanceCalc {
	
	public double memoryValue = 0.0;
	
	public double getMemoryValue() {
		return memoryValue;
	}

	public void setMemoryValue(double memoryValue) {
		this.memoryValue = memoryValue;
	}

	public void memoryClear() {
		memoryValue = 0.0;
	}
	
	public void memoryAdd() {
		
	}
	
	public void memoryRecall() {
		
	}

	@Override
	public void pow() {
		// TODO Auto-generated method stub
		
	}
}
