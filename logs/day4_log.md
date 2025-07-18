# 📅 Day 4 Log — Group Anagrams

**Problem:** [Group Anagrams](https://leetcode.com/problems/group-anagrams/)  
**Language:** Python  
**Difficulty:** Medium  
**Status:** ✅ Accepted  
**Runtime:** 19 ms (Beats 80.95%)  
**Memory:** 16.35 MB (Beats 51.73%)  

---

## 🔍 What I Did Initially:
- Tried using sets to collect unique letters from each string.
- Attempted to group by checking if letter sets matched.
- Got confused with list indexing and grouping logic.

## 🧠 What I Learned:
- **Key insight**: Anagrams have same characters with same frequencies.
- **Solution approach**: Use sorted string as the grouping key.
- **HashMap pattern**: `groups[key].append(value)` for grouping items.
- **Python trick**: `''.join(sorted(string))` creates a canonical form.

## 🤯 Breakthrough Moment:
- Realized that `"eat"` and `"tea"` both become `"aet"` when sorted.
- This sorted string serves as a perfect "signature" for anagram groups.

## ✅ Key Lessons:
> When grouping similar items, find their "canonical form" or "signature"  
> HashMap with lists as values is powerful for grouping problems  
> Sometimes the simplest approach (sorting) beats complex counting

---

## ⚙️ Complexity:
- **Time:** O(n × m log m) where n = number of strings, m = average string length
- **Space:** O(n × m) for storing all strings in groups

---

## 🎯 Next Steps:
- Try this problem in Java to practice `HashMap<String, List<String>>`
- Explore the character frequency counting approach as alternative
- Ready for more advanced hashmap problems!

---

## 💬 Fun Moment:
> Started with a messy approach but the "sorted string as key" insight clicked perfectly! 🔑✨