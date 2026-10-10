class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        # d = dict()
        # for i in range(len(nums)):
        #     d[nums[i]] = i
        # for i in range(len(nums)):
        #     need = target-nums[i]
        #     if(need in d.keys() and d[need] != i):
        #         return [i,d[need]]


        for i in range (len(nums)):
            for j in range (i+1 , len(nums)):
                if (nums[i]+nums[j] == target):
                    return [i,j]
                
        
        
        
        # for i in range (len(nums)):
        #     for j in range (i+1 , len(nums)):
        #         if (nums[i] + nums[j] == target):
        #             return [i , j]
        
            
        