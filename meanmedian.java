import java.io.*;
import java.util.*;
class meanmedian {
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many TEST cases you want");
		//testcase
		int T=sc.nextInt();
		int c=1;
		//looping testcase
		while(T-->0)
		{
		    Solution obj=new Solution();
		    int N;
		    
		    //number of elements in array
            System.out.println("Number of elements you want in the TEST case array number-->"+c);

		    N=sc.nextInt();
		    int a[]=new int [N];
		    System.out.println("Start adding elements in the array");

		    //inserting elements in the array
		    for(int i=0;i<N;i++)
		    {
		        int x=sc.nextInt();
		        a[i]=x;
		    }
		    
		    //calling mean() and median() functions
		    System.out.println("Mean & Median are repectively.."+obj.mean(a,N)+" "+obj.median(a,N));
		    c++;

		    
		}
		
	}
}

//Driver Code Ends
class Solution
{
  //Function to find median of the array elements.  
  public int median(int A[],int N)
    {
      
       Arrays.sort(A);
       if(N%2==1){
           return (A[N/2]);
       }
       else{
           return((A[N/2]+A[(N/2)-1])/2);
       }
       //If median is fraction then convert it to integer and return
    }
    //Function to find median of the array elements.
    public int mean(int A[],int N)
    {
       
       int sum=0;
       for(int i=0;i<N;i++){
          sum+= A[i];
       }
       return(sum/N);//sum/no. of elements
    }

}

