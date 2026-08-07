#write a numpy  program to create a vector with values 0 to 20 and change the sign of the numbers in the range 9 to 15
import numpy as np
arr=np.arange(21)
arr[9:16]=-arr[9:16]
print(arr)