class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        return list(set(nums1) & set(nums2))
# Alternate way using manual check (less optimal-gave 0ms runtime beating 100% of submissions but uses 12.64 MB memory beating 24.40% of submissions):
# class Solution(object):
#     def intersection(self, nums1, nums2):
#         kept = set(nums1)
#         intersections = set()
#         for num in nums2:
#             if num in kept:
#                 intersections.add(num)
#         return list(intersections)
