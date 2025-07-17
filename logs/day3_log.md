# 📅 Day 3 Log — Intersection of Two Arrays

**Problem:** [Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)  
**Language:** Java + Python  
**Difficulty:** Easy  
**Status:** ✅ Accepted  

---

## 🧠 What I Learned:
- Learned to use `Set` in Java for checking existence efficiently (like Python’s `set`).
- Learned that Java’s arrays are fixed-size — can’t append like Python.
- Understood how to convert `Set<Integer>` to `int[]` using loop.
- Explored Python’s inline set intersection with `set(nums1) & set(nums2)`.

---

## ✅ Lessons:
- HashSet in Java is like Python’s set — powerful for O(1) lookups.
- Java doesn’t allow direct index access in HashSet → need loop.
- Python’s set operations are expressive and memory efficient.

---

## ⚙️ Complexity:
| Approach     | Time       | Space      |
|--------------|------------|------------|
| Java Sets    | O(n + m)   | O(n + m)   |
| Python Set & | O(n + m)   | O(n + m)   |

---

## 💬 Fun Moment:
> Was frustrated trying to do `.get(i)` on a HashSet 😤  
> But ended up writing clean, fast code that beat **96.69% in Java** and **100% in Python runtime** 😎

---

## 🔁 Progress.md Entry

```md
# 🚀 LeetCode Brain Journal Progress

| Day | Problem                     | Language     | Status | Runtime        | Notes                                      |
|-----|-----------------------------|--------------|--------|----------------|--------------------------------------------|
| 1   | Two Sum                     | Python       | ✅     | 0 ms (100%)    | Learned hashmap trick                      |
| 2   | Valid Anagram               | Java         | ✅     | 16 ms (22%)    | Improved with character count map          |
| 3   | Intersection of Two Arrays | Java + Python| ✅     | Java: 2 ms (96%) / Python: 0 ms (100%) | Learned set intersection tricks            |
