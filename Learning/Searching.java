/* Linear Search*/

/*input : arr=[10,12,32,43,58] 
     key : 43
     output :Valid found
*/

/*Binary Search */

/*input : arr=[10,12,32,43,58] 
     key : 43
     output :Valid found
*/

import java.util.*;
class Main
{
    public static int BinarySearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==target)
                {
                    return mid;
                } else if (arr[i]>target) {
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr={10,30,20,50,40};
        int target=30;
        int result=BinarySearch(arr,target);
        if(result!=-1)
        {
            System.out.println("Found");
        }
        else {
            System.out.println("Not found");
        }
    }
}