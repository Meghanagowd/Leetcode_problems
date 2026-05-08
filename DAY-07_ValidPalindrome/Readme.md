# 🔁 Valid Palindrome (Java)

## 📌 Overview

This project solves the **Valid Palindrome** problem using the **Two Pointer Technique** in Java.

The goal is to determine whether a string is a palindrome after:

* Converting all uppercase letters to lowercase
* Removing all non-alphanumeric characters

---

## 🚀 Problem Statement

Given a string `s`, return:

* `true` → if it is a palindrome
* `false` → otherwise

A palindrome reads the same forward and backward after ignoring:

* Spaces
* Punctuation
* Special characters
* Letter casing

---

## 🔗 Problem Link

https://leetcode.com/problems/valid-palindrome/

---

## 💡 Approach

This solution uses the **Two Pointer Technique**:

* One pointer starts from the beginning
* Another pointer starts from the end
* Skip non-alphanumeric characters
* Compare lowercase characters
* Continue until pointers meet

---

## ⚡ Time & Space Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(1)  |

---

## 🧠 Key Insight

> Ignore unnecessary characters and compare meaningful characters from both ends.

---

## 📂 Project Structure

```id="mt0p9n"
DAY-07_ValidPalindrome/
│
├── ValidPalindrome.java
└── README.md
```

---

## ▶️ How to Run

1. Clone the repository:

```id="xq4m0n"
git clone https://github.com/Meghanagowd/Leetcode_problems.git
```

2. Navigate to the folder:

```id="4xg4v2"
cd Leetcode_problems/DAY-07_ValidPalindrome
```

3. Compile the program:

```id="7p2wq8"
javac ValidPalindrome.java
```

4. Run the program:

```id="x3rwk6"
java ValidPalindrome
```

---

## 🧪 Sample Input

```id="a6tqow"
Enter a string:
A man, a plan, a canal: Panama
```

## ✅ Sample Output

```id="77z6ph"
Is Palindrome: true
```

---

## 🔍 Example Explanation

Input:

```id="c5t3zp"
"A man, a plan, a canal: Panama"
```

Processed string:

```id="gnm7pq"
amanaplanacanalpanama
```

Since it reads the same forward and backward, the output is:

```id="y2m1lf"
true
```

---

## 🎯 Key Learning

* Understanding the **Two Pointer Technique**
* Efficient string traversal
* Handling alphanumeric characters in Java
* Case-insensitive comparison

---

## 📈 Future Improvements

* Check palindrome recursively
* Reverse string approach comparison
* Extend to palindrome substring problems

---

## 🤝 Contribution

Feel free to fork this repository and improve it!

---

## ⭐ Support

If you found this helpful, consider giving this repository a ⭐
