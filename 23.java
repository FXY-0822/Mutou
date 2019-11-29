class Solution {
    public int removeDuplicates(int[] nums) {
            int len=nums.length;
            int head,pmove;
            for(head=0,pmove=0;head<len&&pmove<len;){
                int temp=nums[pmove];
                while (pmove<len&&temp==nums[pmove])
                    pmove++;
                nums[head]=temp;
                head++;
        }
            len=head;
            return len;
    }
}