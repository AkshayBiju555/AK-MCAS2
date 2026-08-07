#write a numpy program to create 5x5 zero matrix and the main diagonal = 1 2 3 4 5
import numpy as np
arr=np.diag([1,2,3,4,5])
print(arr)

#output
'''
[[1 0 0 0 0]
 [0 2 0 0 0]
 [0 0 3 0 0]
 [0 0 0 4 0]
 [0 0 0 0 5]]
 '''