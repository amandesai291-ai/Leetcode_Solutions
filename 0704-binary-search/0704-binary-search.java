class Solution {

    public static  int  helper(int arr[] ,int target , int low , int high)
    {
        if(low>high)    return -1;
        int mid = low + (high - low)/2;
        if(arr[mid] == target) return  mid;
        else if(arr[mid] > target) return  helper(arr, target , low , mid -1 ); 
        else return helper(arr , target  , mid + 1 , high);     
    }

    public int search(int[] arr, int target) {
        int n = arr.length;
        return  helper(arr , target , 0 , n-1);
    }
}