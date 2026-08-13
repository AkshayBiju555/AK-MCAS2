#inorder to implemen the machine learning algo
#import all the statements required
#splitting the datatset into training and testing
#fitting the model
#predicition using x_test and y_test
#accuracy,classification report and confusion matrix

from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.neighbors import KNeighborsClassifier
from sklearn.metrics import accuracy_score,confusion_matrix,classification_report
import numpy as np


iris=load_iris()
X=iris.data
y=iris.target
X_train,X_test,y_train,y_test=train_test_split(X,y,test_size=0.2,random_state=42)
# print(X_train)
# print(X_test)
# print(y_train)
# print(y_test)

model=KNeighborsClassifier(n_neighbors=3)
model.fit(X_train,y_train)
y_pred=model.predict(X_test)
print("predicted values:", y_pred)
print("accuracy = ",accuracy_score(y_test,y_pred))

print("confusion matrix: ", confusion_matrix(y_test,y_pred))
print("classification report:", classification_report(y_test,y_pred))

#print the names of the predicted values
for i in y_pred:
    print(i,"-->",iris.target_names[i])
    
x = np.array([[2.1,4.5,4.2,5.1]])
pred=model.predict(x)
print("class ",pred[0])
print("category:",iris.target_names[pred[0]])
    

    