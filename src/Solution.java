import java.util.Collection;
import java.util.HashMap;

public class Solution {
    
    public int solution(String[] L) {
        
        HashMap<String,Integer> lm = new HashMap<>();
        
        
        
        for(String email: L) {
            
            String[] atSplit = email.split("@");
            
            String localName = atSplit[0];
            String domainName = atSplit[1];
            //implementing all the rules in the challenge
            localName = localName.replaceAll("\\.", "");
    
            localName = localName.split("\\+")[0];
            
            String formatEmail = localName+"@"+domainName;
            
            //grouping
            if(lm.containsKey(formatEmail)) {
                
                int keyVal = lm.get(formatEmail);
                
                lm.put(formatEmail, keyVal+1);
            }
            else {
                
                lm.put(formatEmail, 1);
                
            }
        }
        //counting collections that are greater than one.
        int count = 0;
        for(Integer i : (Collection<Integer> )lm.values()) {
            
            if(i > 1) {
                
                count ++;
            }
            
        }
        
        return count;
        
    }
    
}
