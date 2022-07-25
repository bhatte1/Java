
public class BrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is an object that represents sequence of characters //String literal
		String s0 = "Vinayak Bhatte";
		String s1 = "Vinayak Bhatte";   // as both the string have same values, s1 will be pointed to original s0 value and does not create new object
		
		
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");  //both the strings have same value. In this case s2 and s3 both will create an indivual object memory location
		
		String s = "Vinayak Bhatte is a Good Boy";
		String[] splittedString = s.split(" ");     // the string is converted into an array and we need to collect the array in an variable
		System.out.println(splittedString[1]);	
		
		for(int i=0;i<splittedString.length;i++) {   //arrays -> .length whereas string -> .length()
			System.out.println(splittedString[i]);
		}

		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));    // you cannot pass s[i], because it "s" is a string and not an array. hence use charAt.
	}

}
	
}
