package linklistoperations;

import java.util.Scanner;

/**
 *
 * @author Rakesh
 */

public class LinkListOperations {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int numOfNodes = sc.nextInt();
        int[] arr = {1, 2, 5, 1, 3, 4, 5};
        Node node = null;
        for(int i = 0; i< arr.length; i++)
        {
            if(node == null)
            {
                node = new Node(arr[i]);
            }
            else
                node.append(arr[i]);
        }
        node.Display();
        //System.out.println("Removing Duplicate");
        //node.removeDuplicate();
        //node.removeDuplicateHashMap();
        //System.out.println("After Removing Duplicate");
        //node.Display();
        System.out.println("Kth element is (k=4) "+ node.returnLastKthNode(4));
        
    }
    
}
