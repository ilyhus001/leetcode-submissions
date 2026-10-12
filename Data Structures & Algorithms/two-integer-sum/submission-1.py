class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        i = 0

        for num in nums:
            goal = target - num

            if goal not in seen:
                seen.update({num: i})

            else:
                return [seen.get(goal), i]

            i += 1

        return []
        