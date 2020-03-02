package App;

public class RomanNumeral {
	String number;
	String[] map = {"V"};
	
	public RomanNumeral(int number) {
		this.number = number+"";
	}
	
	public String getRomanNumeral() {
		String result = "";
		for(int i = 0 ; i < number.length(); i++) {
			if(Character.getNumericValue(number.charAt(i)) < 4) {
				for(int k = 0 ; k < Character.getNumericValue(number.charAt(i)); k ++ )
					result += "I";
			}
			if(Character.getNumericValue(number.charAt(i)) == 4)
				result += "IV";
		}
		return result;
	}
}
