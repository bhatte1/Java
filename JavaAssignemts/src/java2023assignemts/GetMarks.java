package java2023assignemts;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class GetMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetMarks gm = new GetMarks();
		
		int marks = gm.getMarks("josh");
		
		System.out.println("The marks obtained is "+ marks);

	}
	
	
	public int getMarks(String StudentName) {
		
		int marks = -1;
		
		switch (StudentName) {
		
		case "Vinayak": {
			marks = 90;
			break;
			
		}
		
		case "Robert":{
			marks = 55;
			break;
		}
		
		case "Tim":{
			
			marks = 75;
			break;
		
		}
		
		default:
		 System.out.println("There is no student with this name");
			
		}
		
		return marks;
		
		
		
	}

}
