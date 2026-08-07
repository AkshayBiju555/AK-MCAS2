#write a numoy program to save a given array to a text file and load it
#predefined func to save as txt file : np.savetxt
#predefined func to read from the textfile : np.loadtxt
import numpy as np
arr=np.array([1,2,3,4,5])
np.savetxt("arrayfile.txt",arr,fmt="%d")
b=np.loadtxt("arrayfile.txt",int)
print("array ",arr)
print("array read from text file ",b)