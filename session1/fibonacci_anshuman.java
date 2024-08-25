class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int r,w,b;
        r=0;
        b=0;
        w=0;
        for(int i =0; i < n ;i++){
            if(nums[i]==0)
                r++;
            else if(nums[i]==1)
                w++;
            else
                b++;
        }
        int i = 0;
        while(r!=0){
            nums[i] = 0;
            i++;r--;
        }
        while(w!=0){
            nums[i]=1;
            i++;w--;
        }
        while(b!=0){
            nums[i]=2;
            i++;b--;
        }
    }
}
