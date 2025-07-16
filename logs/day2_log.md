# Day 2 — Contains Duplicate & Valid Anagram

### Problems:
- [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)
- [Valid Anagram](https://leetcode.com/problems/valid-anagram/)

### Language: Java  
### Status: Accepted

---

## What I Tried Initially

- Tried to write Java with a Python mindset.
- Used `Set` and `HashMap`, but messed up basic syntax (`Hashset`, `==`, etc.).
- In Valid Anagram, tried comparing character sets instead of frequencies — didn’t work.
- Mixed up `s.length` vs `s.length()`, `in` vs `.contains()`, and forgot `charAt(i)` usage.

---

## What I Learned

- In Java, `HashSet` is equivalent to Python’s set, and `HashMap` is like dict.
- `.getOrDefault()` is helpful when counting character frequencies.
- `.equals()` should be used instead of `==` for map or object comparison.
- Valid Anagram can be optimized using a single hashmap (or an int[26] array if we assume lowercase letters).
- Be careful about off-by-one and order of checks (length before logic).

---

## Lessons

- Stick to the language you're in — don’t let Python habits bleed into Java.
- Focus on the **pattern** more than syntax: frequency count, map lookup, character comparison — these don’t change across languages.
- Better to compare count maps than unordered sets when the order/frequency matters.

---

## Git Files for Today

java/contains-duplicate.java
java/valid-anagram.java

---

## Runtime Notes

- Contains Duplicate: 13ms — Beats ~88%  
- Valid Anagram: 16ms — Beats ~22% (but optimized version is possible)