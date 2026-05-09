# 🔁 Remove Duplicates from Sorted Array (Java)

## 📌 Overview

This project solves the **Remove Duplicates from Sorted Array** problem using the **Two Pointer Technique** in Java.

The goal is to remove duplicates from a sorted array **in-place** and return the number of unique elements.

---

## 🚀 Problem Statement

Given a sorted integer array `nums`, remove the duplicates **in-place** such that each unique element appears only once.

Return:

* The number of unique elements `k`
* The first `k` elements of the array should contain the unique elements

### 📝 Rules:

* Do not use extra array space
* Modify the input array in-place
* Maintain the relative order of elements

---

## 🔗 Problem Link

https://leetcode.com/problems/remove-duplicates-from-sorted-array/

---

## 💡 Approach

This solution uses the **Two Pointer Technique**:

* One pointer tracks the position of unique elements
* Another pointer traverses the array
* When a new unique element is found:

  * Place it at the unique index
  * Increment the unique pointer

---

## ⚡ Time & Space Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(1)  |

---

## 🧠 Key Insight

> Since the array is sorted, duplicates appear next to each other, making two pointers an efficient solution.

---

## 📂 Project Structure

```id="3k0rxa"
DAY-08_RemoveDuplicatesSortedArray/
│
├── RemoveDuplicates.java
└── README.md
```

---

## ▶️ How to Run

1. Clone the repository:

```id="5x7ycp"
git clone https://github.com/Meghanagowd/Leetcode_problems.git
```

2. Navigate to the folder:

```id="2h6vkg"
cd Leetcode_problems/DAY-08_RemoveDuplicatesSortedArray
```

3. Compile the program:

```id="v5z0lq"
javac RemoveDuplicates.java
```

4. Run the program:

```id="n1gq2d"
java RemoveDuplicates
```

---

## 🧪 Sample Input

```id="v0qk9f"
Enter number of elements: 10
Enter sorted elements:
0 0 1 1 1 2 2 3 3 4
```

## ✅ Sample Output

```id="jlwm5s"
Array after removing duplicates:
0 1 2 3 4

Number of unique elements: 5
```

---

## 🔍 Example Explanation

Input:

```id="z0g4mu"
[0,0,1,1,1,2,2,3,3,4]
```

Unique elements:

```id="z91n4j"
[0,1,2,3,4]
```

Duplicates are removed in-place and the count of unique elements is returned.

---

## 🎯 Key Learning

* Understanding the **Two Pointer Technique**
* In-place array modification
* Efficient handling of sorted arrays
* Avoiding unnecessary extra space

---

## 📈 Future Improvements

* Allow duplicates up to twice
* Remove duplicates from unsorted arrays
* Compare brute-force vs optimized approaches

---

## 🤝 Contribution

Feel free to fork this repository and improve it!

---

## ⭐ Support

If you found this helpful, consider giving this repository a ⭐
