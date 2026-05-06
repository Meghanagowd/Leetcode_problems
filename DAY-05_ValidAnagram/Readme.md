# 🔤 Valid Anagram (Java)

## 📌 Overview

This project solves the **Valid Anagram** problem using efficient approaches in Java.

The goal is to determine whether two strings are anagrams of each other.

An anagram is formed when two strings contain the **same characters with the same frequency**, but possibly in a different order.

---

## 🚀 Problem Statement

Given two strings `s` and `t`, return:

* `true` → if `t` is an anagram of `s`
* `false` → otherwise

---

## 🔗 Problem Link

https://leetcode.com/problems/valid-anagram/

---

## 💡 Approaches

### 🔹 Approach 1: Sorting

* Convert both strings into character arrays
* Sort both arrays
* Compare the sorted arrays using `Arrays.equals()`

### 🔹 Approach 2: Frequency Count (Optimized)

* Use a frequency array of size `26`
* Increment count for characters in `s`
* Decrement count for characters in `t`
* If all frequencies become `0` → valid anagram

---

## ⚡ Time & Space Complexity

| Approach        | Time Complexity | Space Complexity |
| --------------- | --------------- | ---------------- |
| Sorting         | O(n log n)      | O(1) / O(n)      |
| Frequency Count | O(n)            | O(1)             |

---

## 🧠 Key Insight

> Two strings are anagrams if every character appears the same number of times in both strings.

---

## 📂 Project Structure

```id="spvj07"
DAY-05_ValidAnagram/
│
├── ValidAnagram.java
└── README.md
```

---

## ▶️ How to Run

1. Clone the repository:

```id="h1ynme"
git clone https://github.com/Meghanagowd/Leetcode_problems.git
```

2. Navigate to the folder:

```id="0kif1d"
cd Leetcode_problems/DAY-05_ValidAnagram
```

3. Compile the program:

```id="dphxt5"
javac ValidAnagram.java
```

4. Run the program:

```id="nvxhnn"
java ValidAnagram
```

---

## 🧪 Sample Input

```id="5sklb5"
Enter first string: anagram
Enter second string: nagaram
```

## ✅ Sample Output

```id="r68q5j"
Are Anagrams: true
```

---

## 🔍 Example Explanation

* `anagram` → sorted → `aaagmnr`
* `nagaram` → sorted → `aaagmnr`

Since both are equal, the strings are anagrams.

---

## 🎯 Key Learning

* Efficient use of **sorting and hashing concepts**
* Understanding **frequency counting**
* Comparing different optimization approaches

---

## 📈 Future Improvements

* Support Unicode characters
* Ignore spaces and special characters
* Implement case-insensitive comparison

---

## 🤝 Contribution

Feel free to fork this repository and improve it!

---

## ⭐ Support

If you found this helpful, consider giving this repository a ⭐
