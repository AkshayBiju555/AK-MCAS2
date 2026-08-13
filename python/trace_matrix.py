#find trace of a matrix
import numpy as np

A = np.array([[1, 2, 3],
              [4, 5, 6],
              [7, 8, 9]])

trace = np.trace(A)

print("Trace of A:", trace)