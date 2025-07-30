class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] result= new int[n];
        int posIndex=0; //for even index
        int negIndex=1; //for odd index
        for(int num:nums){
            if(num>0){
                result[posIndex]=num;
                posIndex+=2;
            }else{
                result[negIndex]=num;
                negIndex+=2;
            }
        }
        return result;
    }
}