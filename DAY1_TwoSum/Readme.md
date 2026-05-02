# 🔍 Two Sum Problem (Java)

## 📌 Overview

This project implements the classic **Two Sum** problem using an efficient approach with a **HashMap** in Java.

The goal is to find two indices in an array such that their corresponding values add up to a given target.

---

## 🚀 Problem Statement

Given an array of integers `arr` and an integer `target`, return the indices of the two numbers such that:

arr[i] + arr[j] = target

* Each input has exactly one solution
* You cannot use the same element twice
* Return indices of the two numbers

---

## 💡 Approach

This solution uses a **HashMap** to achieve optimal performance:

* Traverse the array once

* For each element, calculate the required complement:

  required = target - current_element

* Check if the complement exists in the map

* If found → return indices

* Otherwise → store the current element in the map

---

## ⚡ Time & Space Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(n)  |

---

## 🛠️ Technologies Used

* Java
* HashMap (from `java.util`)

---

## 📂 Project Structure

```
TwoSum.java
README.md
```

---

## ▶️ How to Run

1. Clone the repository:

```
git clone https://github.com/your-username/two-sum-java.git
```

2. Navigate to the folder:

```
cd two-sum-java
```

3. Compile the code:

```
javac TwoSum.java
```

4. Run the program:

```
java TwoSum
```

---

## 🧪 Sample Input

```
Enter number of elements: 4
Enter elements:
2 7 11 15
Enter target: 9
```

## ✅ Sample Output

```
0 1
```

---

## 🎯 Key Learning

* Efficient use of **HashMap for lookup**
* Reducing time complexity from **O(n²) → O(n)**
* Understanding complement-based searching

---

## 📈 Future Improvements

* Handle multiple pairs
* Return values instead of indices
* Implement brute-force and two-pointer approaches for comparison

---

## 🤝 Contribution

Feel free to fork this repo, improve it, and submit a pull request!

---

## ⭐ Support

If you found this helpful, consider giving this repository a star ⭐
