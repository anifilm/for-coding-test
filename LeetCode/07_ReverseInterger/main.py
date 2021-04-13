class Solution:
    def reverse(self, x: int) -> int:
        if x > 0:  # handle positive numbers
            a = int(str(x)[::-1])
        if x <= 0:  # handle negative numbers
            a = -1 * int(str(x * -1)[::-1])
        # handle 32 bit overflow
        min_a = -2 ** 31
        max_a = 2 ** 31 - 1
        if a not in range(min_a, max_a):
            return 0
        else:
            return a
