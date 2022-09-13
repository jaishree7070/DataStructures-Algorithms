//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class who_has_the_majority{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many TEST cases you want");
        int t = sc.nextInt(); // input testcases
        int c=0;
        while (t-- > 0) // Loop until we exhaust all testcases
        {
            c++;
            System.out.println("Number of elements you want in the TEST case array number-->"+c);
            int n = sc.nextInt(); // Input size of array n
            int arr[] = new int[n]; // Declaring the array
            System.out.println("Start adding elements in the array");
            for (int i = 0; i < n; i++) 
            {
                int x = sc.nextInt();
                arr[i] = x; // Assigning elements to array
            }

            int x = sc.nextInt(); // Input x
            int y = sc.nextInt(); // Input y

            Solution obj = new Solution(); // object to call the function
            System.out.println(
            obj.majorityWins(arr, n, x, y)); // The functions you complete
        }
    }
}
// } Driver Code Ends
// User function Template for Java
class Solution {
    // Function to find element with more appearances between two elements in an array.
   int x_cnt;//counts the occurrence of x
   int y_cnt;//counts the occurrence of y  
    public int majorityWins(int arr[], int n, int x, int y) 
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x) x_cnt++;
            if(arr[i]==y) y_cnt++;
        }
        if(x_cnt==y_cnt) return x>y? y:x;
        return x_cnt>y_cnt ? x : y; //returns no. with greater occurrence
    }
}
