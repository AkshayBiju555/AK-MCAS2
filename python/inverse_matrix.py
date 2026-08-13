#find inverse of a matrix
import numpy as np

A = np.array([[1, 2],[3, 4]])

det = np.linalg.det(A) #det fundtion to find determinat from linear algebra function in numpy package
print("Matrix A:") 
print(A)
print("\nDeterminant:", det)
inverse = np.linalg.inv(A) #inv fundtion to find inverse from linear algebra function in numpy package
print("\nInverse of A:")
print(inverse)