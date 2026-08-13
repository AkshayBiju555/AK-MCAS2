#find maximum and minimum values in a matrix
import numpy as np
A = np.array([[1, 2, 3],
              [4, 5, 6],
              [7, 8, 9]])

import numpy as np

A = np.array([[1, 2, 3],
              [4, 5, 6],
              [7, 8, 9]])

maximum = np.max(A)
minimum = np.min(A)

print("Maximum value:", maximum)
print("Minimum value:", minimum)

print("Maximum of each row:", np.max(A, axis=1))
print("Minimum of each row:", np.min(A, axis=1))

print("Maximum of each column:", np.max(A, axis=0))
print("Minimum of each column:", np.min(A, axis=0))