# Practice 2013 - 02: Jenga

## Background
You are writing a computer program that will play Jenga, but first you need to
figure out what boards are legal! Given a set of possible jenga boards,
determine if each board is standing or if it has fallen over. A board falls over
if any two consecutive blocks in a row (not column) are both missing, including
within the top row. Assume that even two consecutive missing blocks on the top
row makes the tower ”Fallen.”

## Description

### Input
The first line of input is the number of test cases that follow.

Each input case will start with a single integer representing the height of the
Jenga tower. Each row in the tower appears on a single line and represents the
blocks currently still in the board for that row. A ’1’ represents the block
being present, a ’0’ represents a removed block.

There will be between 1 and 100 test cases, each with one jenga board of height
between 1 and 20.

### Output
For each case, output the line “Case x:” where x is the case number, on a single
line followed by a single space and either the word ”Fallen” or ”Standing”

## Sample
### Input
```
4
8
111
111
111
100
101
111
010
111
4
111
111
101
101
5
000
111
111
111
101
8
111
010
111
011
100
101
101
111
```

### Output
```
Case 1: Fallen
Case 2: Standing
Case 3: Fallen
Case 4: Fallen
```
