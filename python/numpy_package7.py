#create 1d array using arange and use reshape to make it 2d then find the sum
import numpy as np
arr=np.arange(1,10).reshape(3,3)
print(arr)
print("sum of all elements",np.sum(arr))
print("sum of each column",np.sum(arr,axis=0)) #axis=0 for column
print("sum of each row",np.sum(arr,axis=1)) #axis=1 for row
