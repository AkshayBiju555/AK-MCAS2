#write a numpy program,create an element wise operations of two arrays(=,<=,>=,<,>)
import numpy as np
a1=np.array([5,2,9])
a2=np.array([4,7,9])
print("array 1 ",a1)
print("array 2 ", a2)
print("Equal: ", np.equal(a1,a2))
print("greater: ",np.greater(a1,a2))
print("lesser: ",np.less(a1,a2))
print("greater or equal: ",np.greater_equal(a1,a2))
print("less than or equal",np.less_equal(a1,a2))
print("notEqual: ", np.not_equal(a1,a2))

