

public class RomanNumeral {
	String number;
	String[] map = {"I","X","C","M"};
	String[] map_fives = {"V","L","D"};
	
	public RomanNumeral(int number) {
		this.number = number+"";
	}
	
	public String getRomanNumeral() {
		String result = "";
		int n = number.length()-1;
		for(int i = 0 ; i < number.length(); i++) {
			//System.out.println(":"+Character.getNumericValue(number.charAt(i)) );
			if(Character.getNumericValue(number.charAt(i)) < 4) {
				for(int k = 0 ; k < Character.getNumericValue(number.charAt(i)); k ++ )
					result += map[n-i];
			}
			if(Character.getNumericValue(number.charAt(i)) == 4)
				result += map[n-i]+map_fives[n-i];
			if(Character.getNumericValue(number.charAt(i)) >= 5 && Character.getNumericValue(number.charAt(i)) < 9)
				result += map_fives[n-i];
			
			if(Character.getNumericValue(number.charAt(i)) < 9) {
				for(int k = 5 ; k < Character.getNumericValue(number.charAt(i)); k ++ )
					result += map[n-i];
			}
			
			if(Character.getNumericValue(number.charAt(i)) == 9)
				result += map[n-i]+map[n-i+1];
		}
		return result;
	}
}
