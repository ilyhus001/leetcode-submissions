class Solution:

    def encode(self, strs: List[str]) -> str:
        result = ""
        for word in strs:
            result += "!-0" + word
        
        return result
        
    def decode(self, s: str) -> List[str]:

        return s.split("!-0")[1:]