# 🔄 Move Zeroes (Java)

## 📌 Overview

This project solves the **Move Zeroes** problem using an efficient in-place approach in Java.

The goal is to move all `0`s to the end of the array while maintaining the **relative order of non-zero elements**.

---

## 🚀 Problem Statement

Given an integer array `nums`, move all `0`s to the end of it while maintaining the relative order of the non-zero elements.

### 📝 Rules:

* Perform the operation **in-place** (no extra array)
* Maintain the **order of non-zero elements**

---

## 🔗 Problem Link

https://leetcode.com/problems/move-zeroes/

---

## 💡 Approach

This solution uses a **two-pointer technique**:

* Maintain a pointer `j` for the position of non-zero elements
* Traverse the array:

  * If the current element is non-zero → place/swap it at index `j`
  * Increment `j`
* All zeros automatically shift to the end

---

## ⚡ Time & Space Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(1)  |

---

## 🧠 Key Insight

> Keep non-zero elements in front and push all zeros to the end while preserving order.

---

## 📂 Project Structure

```id="g9n8x1"
DAY-04_MoveZeroes/
│
├── MoveZeroes.java
└── README.md
```

---

## ▶️ How to Run

1. Clone the repository:

```id="5qtx6x"
git clone https://github.com/Meghanagowd/Leetcode_problems.git
```

2. Navigate to the folder:

```id="bd3hcz"
cd Leetcode_problems/DAY-04_MoveZeroes
```

3. Compile the program:

```id="p3q2xy"
javac MoveZeroes.java
```

4. Run the program:

```id="y7qv6l"
java MoveZeroes
```

---

## 🧪 Sample Input

```id="3f1yyt"
Enter number of elements: 5
Enter elements:
0 1 0 3 12
```

## ✅ Sample Output

```id="3f5x1m"
Array after moving zeroes:
1 3 12 0 0
```

---

## 🔍 Example Explanation

* Input: `[0, 1, 0, 3, 12]`
* Non-zero elements → `[1, 3, 12]`
* Zeros moved to end → `[1, 3, 12, 0, 0]`

---

## 🎯 Key Learning

* Efficient use of **two-pointer technique**
* In-place array manipulation
* Maintaining order while modifying array

---

## 📈 Future Improvements

* Solve using different approaches (shifting vs swapping)
* Count number of zeroes
* Extend to similar problems (e.g., Move Negatives)

---

## 🤝 Contribution

Feel free to fork this repository and improve it!

---

## ⭐ Support

If you found this helpful, consider giving this repository a ⭐
