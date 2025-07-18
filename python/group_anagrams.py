class Solution(object):
    def groupAnagrams(self, strs):
        groups = {}
        for string in strs:
            key = ''.join(sorted(string))
            if key not in groups:
                groups[key] = []
            groups[key].append(string)
        return list(groups.values())