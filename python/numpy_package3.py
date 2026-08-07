#write a numpy program to create a 3*3 identity matrix
#predefined function: identity in numpy to create identity matrix
import numpy as np
arr=np.identity(3,int)
print(arr)
#to avoid . at the end ,use int

#also use eye for the same
arr=np.eye(3)
print(arr)