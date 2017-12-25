package isunique;

import java.util.*;

/**
 *
 * @author Rakesh
 */
public class IsUnique {

    boolean isUniq(String str){
        boolean[] flag = new boolean[128];
        if(str.length()>128)
            return false;
        for(int i=0; i < str.length() ;i++)
            {  
                int value = str.charAt(i);
                if(flag[value]){
                    return false;
                }
                flag[value] = true;
            }
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Scanner sc = new Scanner(System.in);
            String inputString = sc.nextLine();
            IsUnique uni = new IsUnique();
            if(uni.isUniq(inputString))
                System.out.println("The given input string "+ inputString +" is Unique");
            else 
                System.out.println("The given input string "+ inputString +" is not Unique");
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
}
