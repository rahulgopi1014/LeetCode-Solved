class Solution {
    public void nextPermutation(int[] nums) {
        int pividIndex=-1;
        int n=nums.length-1;
        //find pivid Index
        if(nums.length==1){
            return;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pividIndex=i;
                break;
            }
        }
        if(pividIndex==-1){
                reverse(nums,0,n);
                return;
            }
        for(int k=n;k>pividIndex;k--){
            if(nums[k]>nums[pividIndex]){
                swap(nums,pividIndex,k);
                break;
            }

        }
        reverse(nums,pividIndex+1,n);
    }
     
    private void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
     }
     private void reverse(int[] arr,int start,int end){
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
     }
}