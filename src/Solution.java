import java.util.ArrayList;

public class Solution {

	public int solution(String[] L) {
		
		ArrayList<String>myList1 = new ArrayList<String>();


		
		for(String email: L) {

			String[] atSplit = email.split("@");

			String localName = atSplit[0];
			String domainName = atSplit[1];

			localName = localName.replaceAll("\\.", "");

			localName = localName.split("\\+")[0];

			String formatEmail = localName+"@"+domainName;

			myList1.add(formatEmail);

		}
		
		int count = 0; 
		for(String a : myList1) {
			
			
			
			String localNameSnip = a.split("@")[0];
			
			if(localNameSnip.length() == 2) {
				
				count ++;
			}
				
		}
		
		
	
		return count;

	}

}
