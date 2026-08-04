from sklearn.datasets import load_iris
#before dividing the dataset import the following
from sklearn.model_selection import train_test_split
#before creating gaussian model import the follwoing, NB=naive_BAYEs
from sklearn.naive_bayes import GaussianNB
#import accuracy
from sklearn.metrics import accuracy_score
from sklearn.metrics import confusion_matrix,classification_report

#load the iris dataset
iris = load_iris()

#features and label
X=iris.data
y=iris.target

#divide the dataset into two for training and testing
X_train,X_test,y_train,y_test=train_test_split(X,y,test_size=0.3,random_state=42)

#gaussian model creation and train the model
model=GaussianNB()

#train the gaussianNB
model.fit(X_train,y_train)

#prediction on test data or unseen data
y_prediction=model.predict(X_test)

print("predicted value ",y_prediction)
print("Actual value: ",y_test)
print("Accuracy score: ", accuracy_score(y_test,y_prediction))
cm = confusion_matrix(y_test, y_prediction)
print(cm)
print(classification_report(y_test, y_prediction))
