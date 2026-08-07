#create an array matrix  to compute sum of all elements, sum of each column and sum of each row
import numpy as np
arr=np.array([[1,2,3],[4,5,6],[7,8,9]])
print("sum of all elements",np.sum(arr))
print("sum of each column",np.sum(arr,axis=0)) #axis=0 for column
print("sum of each row",np.sum(arr,axis=1)) #axis=1 for row