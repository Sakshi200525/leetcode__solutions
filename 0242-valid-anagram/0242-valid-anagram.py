class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
       return Counter(s) == Counter(t)
       
       
        # if len(s) != len(t):
        #     return False
        # return sorted(s) == sorted(t)


        # for i in range (1,len(s)):
        #     for res in range (len(t)):
        #         if s[i] == t[i]:
        #             return False
        #     return True
        