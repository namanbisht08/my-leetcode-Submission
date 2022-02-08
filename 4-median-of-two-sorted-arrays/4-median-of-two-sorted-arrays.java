class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int s1=num1.length;
        int s2=num2.length;
        int arr[] = new int[s1+s2];
        merge(num1, num2, arr,s1,s2);
        if((s1+s2)%2==0)
            return (arr[(s1+s2)/2] + arr[(s1+s2)/2-1])/2.0;
        else
            return (double)(arr[(s1+s2)/2]);
    }
    
    void merge(int[] num1, int[] num2, int[] arr, int s1, int s2)
    {
        int k=0,i=0,j=0;
        while(i<s1 && j<s2)
        {
            if(num1[i]<num2[j])
                arr[k++]=num1[i++];
            else
                arr[k++]=num2[j++];
        }
        if(i<s1)
            while(i<s1) arr[k++]=num1[i++];
        else
            while(j<s2) arr[k++]=num2[j++];
    }
}