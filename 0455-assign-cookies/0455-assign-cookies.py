class Solution(object):
    def findContentChildren(self, g, s):
        """
        :type g: List[int]
        :type s: List[int]
        :rtype: int
        """
        i,j=0,0
        s_len=len(s)
        s.sort()
        g.sort()
        # for j in range(s_len):
        #     if s[j]>=g[i]:
        #         j+=1
        #         i+=1
        #     else:
        #         return i
        for cookie in s:
            if i == len(g):
                break
            if cookie >= g[i]:
                i += 1
        return i