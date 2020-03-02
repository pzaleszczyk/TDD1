package App;

public class RomanNumeral {
	String number;
	String[] map = {"I","V"};
	
	public RomanNumeral(int number) {
		this.number = number+"";
	}
	
	public String getRomanNumeral() {
		String result = "";
		for(int i = 0 ; i < number.length(); i++) {
			if(Character.getNumericValue(number.charAt(i)) < 4) {
				for(int k = 0 ; k < Character.getNumericValue(number.charAt(i)); k ++ )
					result += map[i];
			}
			if(Character.getNumericValue(number.charAt(i)) == 4)
				result += map[i]+map[i+1];
			if(Character.getNumericValue(number.charAt(i)) >= 5)
				result += map[i+1];
			
			if(Character.getNumericValue(number.charAt(i)) < 9) {
				for(int k = 5 ; k < Character.getNumericValue(number.charAt(i)); k ++ )
					result += map[i];
			}
		}
		return result;
	}
}
