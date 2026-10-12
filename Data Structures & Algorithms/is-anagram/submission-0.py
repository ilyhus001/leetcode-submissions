class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        seen_t = {}
        seen_s = {}

        if len(s) != len(t):
            return False 

        for i in range(len(s)):
            if t[i] not in seen_t:
                seen_t[t[i]] = 1
            else:
                seen_t[t[i]] += 1

            if s[i] not in seen_s:
                seen_s[s[i]] = 1
            else:    
                seen_s[s[i]] += 1

        return seen_t == seen_s