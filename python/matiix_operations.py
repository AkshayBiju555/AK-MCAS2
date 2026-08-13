import numpy as np

arr = np.array([[1, 2, 3],
                [4, 5, 6],
                [7, 8, 9]])

arr1 = np.array([[11, 22, 33],
                 [12, 14, 16],
                 [20, 21, 23]])

# Addition
addition = arr + arr1

# Subtraction
subtraction = arr - arr1

# Matrix multiplication using dot()
multiplication = np.dot(arr, arr1) # dot function is used for matrix multiplication
#multi=arr*arr1

#transpose of two matrices
transpose = arr.T
transpose2=arr1.T

print("\nTranspose of Matrix 1:")




print("Matrix 1:")
print(arr)

print("\nMatrix 2:")
print(arr1)

print("\nAddition:")
print(addition)

print("\nSubtraction:")
print(subtraction)

print("\nMultiplication:")
print(multiplication)
#print(multi)

print("\n transpose")
print("\nfirst matrix", transpose)
print("\nsecond matrix", transpose2)