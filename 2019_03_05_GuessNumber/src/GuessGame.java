
public class GuessGame {
	
	private int hiddenNumber;

	public GuessGame(int hiddenNumber) {
		this.hiddenNumber = hiddenNumber;
	}

	public int getHiddenNumber() {
		return hiddenNumber;
	}

	@Override
	public String toString() {
		return "Hidden number is " + hiddenNumber;
	}
	
	
	
	

}
