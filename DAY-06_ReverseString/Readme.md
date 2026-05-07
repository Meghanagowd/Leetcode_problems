# 🔄 Reverse String (Java)

## 📌 Overview

This project solves the **Reverse String** problem using the **Two Pointer Technique** in Java.

The goal is to reverse a character array **in-place** without using extra space.

---

## 🚀 Problem Statement

Write a function that reverses a string.

The input string is given as an array of characters `char[]`.

### 📝 Rules:

* Modify the array **in-place**
* Use only **O(1)** extra memory

---

## 🔗 Problem Link

https://leetcode.com/problems/reverse-string/

---

## 💡 Approach

This solution uses the **Two Pointer Technique**:

* One pointer starts from the beginning
* Another pointer starts from the end
* Swap characters at both positions
* Move pointers inward until they meet

---

## ⚡ Time & Space Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(1)  |

---

## 🧠 Key Insight

> Reverse the string efficiently by swapping characters from both ends toward the center.

---

## 📂 Project Structure

```id="5wzsvw"
DAY-06_ReverseString/
│
├── ReverseString.java
└── README.md
```

---

## ▶️ How to Run

1. Clone the repository:

```id="y0t56g"
git clone https://github.com/Meghanagowd/Leetcode_problems.git
```

2. Navigate to the folder:

```id="sh1w6h"
cd Leetcode_problems/DAY-06_ReverseString
```

3. Compile the program:

```id="yidc3r"
javac ReverseString.java
```

4. Run the program:

```id="uvf8an"
java ReverseString
```

---

## 🧪 Sample Input

```id="rgtp8u"
Enter a string: hello
```

## ✅ Sample Output

```id="l0y4fp"
Reversed String: olleh
```

---

## 🔍 Example Explanation

* Original String → `hello`
* Swap first and last characters
* Continue until pointers meet
* Final Output → `olleh`

---

## 🎯 Key Learning

* Understanding the **Two Pointer Technique**
* In-place array/string manipulation
* Efficient swapping logic

---

## 📈 Future Improvements

* Reverse words in a sentence
* Reverse only vowels
* Check palindrome using two pointers

---

## 🤝 Contribution

Feel free to fork this repository and improve it!

---

## ⭐ Support

If you found this helpful, consider giving this repository a ⭐
