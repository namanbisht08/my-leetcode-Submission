// { Driver Code Starts
//saksham raj seth
import java.util.*;
class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG
{
public int remAnagrams(String s,String s1)
       {
      int len1 = s.length();
      int len2 = s1.length();
      char[] ss = s.toCharArray();
      char[] ss1 = s1.toCharArray();
      int[] arr1 = new int[26];
      int[] arr2 = new int[26];
      for(int i =0 ; i < len1;i++){
         int ind = ss[i] -97;
         arr1[ind] +=1;
      } 
      for(int i =0 ; i < len2;i++){
         int ind = ss1[i] -97;
         arr2[ind] +=1;
      } 
     int count=0;
     for(int i =0 ;i <26;i++){
         int a1 =arr1[i];
         int a2 = arr2[i];
         if(a1!=a2){
            count+= Math.abs(a1-a2);
         }
     }
       
       return count;
}
}