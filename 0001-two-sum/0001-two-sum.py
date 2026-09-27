class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        for i in range (len(nums)):
            need = target - nums[i]
            if (need in nums and nums.index(need) != i):
                return [i ,nums.index(need) ]
        
        
        
        
        
        
        # for i in range (len(nums)):
        #     for j in range (i+1 , len(nums)):
        #         if (nums[i] + nums[j] == target):
        #             return [i , j]
        
            
        