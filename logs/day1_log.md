# 📅 Day 1 Log — Two Sum

**Problem:** [Two Sum](https://leetcode.com/problems/two-sum/)  
**Language:** Python  
**Difficulty:** Easy  
**Status:** ✅ Accepted  
**Runtime:** 0 ms (Beats 100%)  
**Memory:** 13.43 MB  

---

## 🔍 What I Did Initially:
- Used brute force with 2 nested loops.
- Worked but O(n²) — slow.

## 🧠 What I Learned:
- Improved to O(n) by using a dictionary.
- Stored elements in `seen` with their index.
- Checked if `target - current` exists in `seen`.
- Realized **dictionary lookup is O(1)** — that's why it’s fast.

## 🤯 Realization:
- Initially tried storing index as key → failed.
- Then flipped it: store value as key, index as value.

## ✅ Lesson:
> Always check how you're storing data in a hashmap — keys must be what you're searching for.

---

## 💬 Fun Moment:
> I beat 100% runtime 😎 and did it without seeing the solution. Felt GOOD.

