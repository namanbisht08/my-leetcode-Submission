class Solution(object):
    def addBinary(self, a, b):
        return bin(int('0b'+a,2)+int('0b'+b,2))[2:]