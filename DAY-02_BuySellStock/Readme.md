# 📈 Best Time to Buy and Sell Stock (Java)

## 📌 Overview

This project implements the classic **Best Time to Buy and Sell Stock** problem using an optimized approach in Java.

The goal is to calculate the **maximum profit** that can be achieved by buying and selling a stock **only once**.

---

## 🚀 Problem Statement

Given an array of integers `prices[]` where:

* `prices[i]` represents the stock price on day `i`

Find the **maximum profit** you can achieve.

### 📝 Rules:

* You must **buy before you sell**
* Only **one transaction** is allowed
* If no profit is possible, return `0`

---

## 🔗 Problem Link

https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

---

## 💡 Approach

This solution uses an **optimized single-pass approach (O(n))**:

* Traverse the array once
* Keep track of the **minimum price so far**
* For each element:

  * Calculate profit = current price - min price
  * Update maximum profit if needed

---

## ⚡ Time & Space Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(1)  |

---

## 🧠 Key Insight

> Buy at the lowest price and sell at the highest profit AFTER that.

---

## 📂 Project Structure

```
DAY-02_BuySellStock/
│
├── BuyAndSellStock.java
└── README.md
```

---

## ▶️ How to Run

1. Clone the repository:

```
git clone https://github.com/Meghanagowd/Leetcode_problems.git
```

2. Navigate to the folder:

```
cd Leetcode_problems/DAY-02_BuySellStock
```

3. Compile the program:

```
javac BuyAndSellStock.java
```

4. Run the program:

```
java BuyAndSellStock
```

---

## 🧪 Sample Input

```
Enter number of days: 6
Enter stock prices:
7 1 5 3 6 4
```

## ✅ Sample Output

```
Maximum Profit: 5
```

---

## 🔍 Example Explanation

* Buy at price **1**
* Sell at price **6**
* Profit = **5**

---

## 🎯 Key Learning

* Optimized solution from **O(n²) → O(n)**
* Efficient tracking of **minimum values**
* Real-world use of array traversal techniques

---

## 📈 Future Improvements

* Allow multiple buy/sell transactions
* Track actual buy and sell days
* Compare with brute-force approach

---
 
 
---

## 🤝 Contribution

Feel free to fork this repository and improve it!

---

## ⭐ Support

If you found this helpful, consider giving this repository a ⭐
