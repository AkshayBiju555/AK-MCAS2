#write a python pgm i) to read number of rows and columns for matrix 1 ii) create matrix 1 iii) read and number or rows and columns for matrix 2 and create it

import numpy as np

# Matrix 1
r1 = int(input("Enter number of rows for matrix 1: "))
c1 = int(input("Enter number of columns for matrix 1: "))

matrix1 = np.zeros((r1, c1), dtype=int)

print("Enter elements of matrix 1:")

for i in range(r1):
    for j in range(c1):
        matrix1[i][j] = int(input(f"Enter element [{i}][{j}]: "))

print("\nMatrix 1:")
print(matrix1)


# Matrix 2
r2 = int(input("\nEnter number of rows for matrix 2: "))
c2 = int(input("Enter number of columns for matrix 2: "))

matrix2 = np.zeros((r2, c2), dtype=int)

print("Enter elements of matrix 2:")

for i in range(r2):
    for j in range(c2):
        matrix2[i][j] = int(input(f"Enter element [{i}][{j}]: "))

print("\nMatrix 2:")
print(matrix2)