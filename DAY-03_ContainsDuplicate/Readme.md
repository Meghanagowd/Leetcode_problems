# 🔍 Contains Duplicate (Java)

## 📌 Overview

This project solves the **Contains Duplicate** problem using an efficient approach in Java.

The goal is to determine whether any value appears **at least twice** in the given array.

---

## 🚀 Problem Statement

Given an integer array `nums`, return:

* `true` → if any value appears at least twice
* `false` → if all elements are distinct

---

## 🔗 Problem Link

https://leetcode.com/problems/contains-duplicate/

---

## 💡 Approach

This solution uses a **HashSet** for efficient lookup:

* Traverse the array
* For each element:

  * Check if it already exists in the set
  * If yes → duplicate found → return `true`
  * Otherwise → add it to the set

---

## ⚡ Time & Space Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(n)  |

---

## 🧠 Key Insight

> Use a HashSet to track seen elements and detect duplicates in O(1) time.

---

## 📂 Project Structure

```id="i41flr"
DAY-03_ContainsDuplicate/
│
├── ContainsDuplicate.java
└── README.md
```

---

## ▶️ How to Run

1. Clone the repository:

```id="frt6ik"
git clone https://github.com/Meghanagowd/Leetcode_problems.git
```

2. Navigate to the folder:

```id="ikm3v5"
cd Leetcode_problems/DAY-03_ContainsDuplicate
```

3. Compile the program:

```id="1o6u0n"
javac ContainsDuplicate.java
```

4. Run the program:

```id="g4mcxo"
java ContainsDuplicate
```

---

## 🧪 Sample Input

```id="1kdlm5"
Enter number of elements: 4
Enter elements:
1 2 3 1
```

## ✅ Sample Output

```id="1n6v6r"
Contains Duplicate: true
```

---

## 🔍 Example Explanation

* Input: `[1, 2, 3, 1]`
* Element `1` appears twice → Output: `true`

---

## 🎯 Key Learning

* Efficient use of **HashSet for duplicate detection**
* Reduced time complexity from **O(n²) → O(n)**
* Improved understanding of **set-based lookups**

---

## 📈 Future Improvements

* Solve without extra space (sorting approach)
* Count frequency of elements
* Extend to similar problems (e.g., Contains Duplicate II)

---

## 🤝 Contribution

Feel free to fork this repository and improve it!

---

## ⭐ Support

If you found this helpful, consider giving this repository a ⭐
