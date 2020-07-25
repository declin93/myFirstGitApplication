
public class Counter {
	protected int value = 50;
	protected int maxValue = 0;
	protected String status = "OK";
	
	
	public Counter(int maxValue) {
		this.maxValue = maxValue;
	}
	
	public void inc() {
		if(value+1 > maxValue) {
			status = "ERROR";
			System.out.println("ERRORE: Non è possibile incrementare il valore del contatore.");
		}else {
			value = value + 1;
		}
	}
	
	public void reset() {
		value = 0;
		status = "OK";
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isError() {
		if (status != "OK") {
			return true;
		}else {
			return false;
		}
	}
	
}
