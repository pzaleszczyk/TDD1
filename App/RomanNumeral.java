package App;

public class RomanNumeral {
	int number;
	public RomanNumeral(int number) {
		this.number = number;
	}
	public String getRomanNumeral() {
		if(number == 1)
			return "I";
		else if(number == 2)
			return "II";
		else
			return "III";
	}
}
