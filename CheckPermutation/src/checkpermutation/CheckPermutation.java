package checkpermutation;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Rakesh
 */
public class CheckPermutation {

    boolean checkPermutation(String strA, String strB)
    {
        if(strA.length() != strB.length())
            return false;
        int[] charArr = new int[128];
        for(int i=0;i<strA.length();i++)
        {
            charArr[strA.charAt(i)]++;
        }
        for(int i = 0; i< strB.length();i++)
        {
            charArr[strA.charAt(i)]--;
        }
        for(int i = 0; i< strB.length();i++)
        {
            if(charArr[strA.charAt(i)]<0 || charArr[strA.charAt(i)]>0){
                return false;
            }
        }
        
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strA = "abac";
        String strB = "cbaa";
        CheckPermutation ch = new CheckPermutation();
        boolean flag = ch.checkPermutation(strA, strB);
        if(flag)
            System.out.println("Permutation");
        else 
            System.out.println("Not Permutation");
    }
    
    
}
