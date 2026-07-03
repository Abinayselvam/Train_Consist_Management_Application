#  Train Consist Management Application

## Overview

The **Train Consist Management Application** is a Java-based console application developed to demonstrate core Java programming concepts through a real-world railway domain.

The application manages train consists by performing operations such as adding bogies, sorting, searching, validation, safety compliance, exception handling, and performance comparison.

This project is designed as a step-by-step learning application where each Use Case (UC) introduces a new Java concept while extending the previous functionality.

---

# Technologies Used

* Java
* Java Collections Framework
* Java Streams API
* Exception Handling
* Regular Expressions (Regex)
* Object-Oriented Programming (OOP)

---

# Project Structure

```
TrainConsistManagement
│
├── model
│     ├── Train.java
│     ├── Bogie.java
│     └── GoodsBogie.java
│
├── service
│     └── TrainService.java
│
├── app
│     └── TrainManagementApplication.java
│
└── util
```

---

# Features

* Initialize Train Consist
* Add Passenger Bogies
* Maintain Unique Bogie IDs
* LinkedList Operations
* Preserve Bogie Order
* Bogie Capacity Mapping
* Sorting using Comparator
* Filtering using Streams
* Grouping using Collectors
* Total Capacity Calculation
* Regex Validation
* Safety Compliance Validation
* Performance Comparison
* Exception Handling
* Manual Bubble Sort
* Arrays.sort()
* Linear Search
* Binary Search
* Defensive Programming

---

# Implemented Use Cases

## UC1 – Initialize Train and Display Consist Summary

* Initialize Train Consist
* Display initial bogie count

**Concepts**

* Class
* Main Method
* ArrayList
* List Interface

---

## UC2 – Add Passenger Bogies

* Add bogies
* Remove bogies
* Check existence

**Concepts**

* ArrayList
* add()
* remove()
* contains()

---

## UC3 – Track Unique Bogie IDs

* Maintain unique bogie IDs

**Concepts**

* HashSet
* Set Interface

---

## UC4 – Maintain Ordered Bogies

* Insert
* Remove
* Preserve sequence

**Concepts**

* LinkedList
* addFirst()
* addLast()

---

## UC5 – Preserve Insertion Order

* Maintain insertion order
* Prevent duplicates

**Concepts**

* LinkedHashSet

---

## UC6 – Map Bogie to Capacity

* Associate bogie with capacity

**Concepts**

* HashMap
* Map
* EntrySet

---

## UC7 – Sort Bogies by Capacity

* Sort custom objects

**Concepts**

* Comparator
* Lambda Expressions

---

## UC8 – Filter Passenger Bogies

* Filter based on capacity

**Concepts**

* Stream API
* filter()
* collect()

---

## UC9 – Group Bogies

* Group by category

**Concepts**

* Collectors.groupingBy()

---

## UC10 – Count Total Seats

* Calculate total seating capacity

**Concepts**

* map()
* reduce()

---

## UC11 – Validate Train ID

* Validate Train ID
* Validate Cargo Code

**Concepts**

* Regex
* Pattern
* Matcher

---

## UC12 – Safety Compliance

* Validate goods bogies

**Concepts**

* Streams
* allMatch()

---

## UC13 – Performance Comparison

* Loop vs Stream

**Concepts**

* System.nanoTime()

---

## UC14 – Custom Checked Exceptions

* Business validation
* Custom exception handling

**Concepts**

* Checked Exception
* throw
* throws

---

## UC15 – Runtime Exception Handling

* Safe cargo assignment

**Concepts**

* try
* catch
* finally
* Runtime Exception

---

## UC16 – Bubble Sort

* Manual sorting algorithm

**Concepts**

* Nested loops
* Swapping
* Bubble Sort

---

## UC17 – Arrays.sort()

* Built-in sorting

**Concepts**

* Arrays.sort()
* Arrays.toString()

---

## UC18 – Linear Search

* Sequential search

**Concepts**

* Linear Search
* equals()

---

## UC19 – Binary Search

* Optimized searching

**Concepts**

* Binary Search
* compareTo()

---

## UC20 – Exception Handling During Search

* Prevent searching on empty train

**Concepts**

* IllegalStateException
* Defensive Programming
* Fail-Fast Principle

---

# Java Concepts Covered

## Core Java

* Classes and Objects
* Constructors
* Encapsulation
* Methods
* Arrays

## Collections Framework

* ArrayList
* LinkedList
* HashSet
* LinkedHashSet
* HashMap

## Java 8 Features

* Streams
* Lambda Expressions
* Method References
* Collectors

## Algorithms

* Bubble Sort
* Arrays.sort()
* Linear Search
* Binary Search

## Exception Handling

* Checked Exceptions
* Runtime Exceptions
* Custom Exceptions
* try-catch-finally

## Validation

* Regular Expressions
* Pattern
* Matcher

---

# How to Run

### Compile

```bash
javac app/TrainManagementApplication.java
```

### Run

```bash
java app.TrainManagementApplication
```

---

# Learning Outcomes

After completing this project, the following Java concepts are demonstrated:

* Object-Oriented Programming
* Java Collections Framework
* Java Streams
* Exception Handling
* Searching Algorithms
* Sorting Algorithms
* Performance Benchmarking
* Defensive Programming
* Regular Expressions
* Functional Programming

---

# Author

**Abinaya Selvam**

Java Developer
