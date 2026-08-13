#write a python program to predict diabtetes using knn classification
from sklearn.datasets import load_diabetes
from sklearn.model_selection import train_test_split
from sklearn.neighbors import KNeighborsRegressor
from sklearn.metrics import r2_score
import numpy as np

diabetes=load_diabetes()
print(diabetes.data.shape)
print(diabetes.target.shape)


print(diabetes.feature_names)
print(diabetes.target) # to print target values
print(diabetes.data[0]) #0th row values or first sample features ranging from -0.2 to +0.2
#create the knn model to predict diabetes
X=diabetes.data
y=diabetes.target
X_train,X_test,y_train,y_test=train_test_split(X,y,test_size=0.2,random_state=42)

model=KNeighborsRegressor(n_neighbors=10)
model.fit(X_train, y_train)


# Predict using X_test

y_pred = model.predict(X_test)

print("\nPredicted values:")
print(y_pred)

print("\nActual values:")
print(y_test)

# Calculate R2 Score

r2 = r2_score(y_test, y_pred) # Cant use acuracy score in case of regression so we use r2 score

print("\nR2 Score:", r2)



x = np.array([[0.03807591,0.05068012  ,0.06169621 , 0.02187239, -0.0442235,  -0.03482076,-0.04340085 ,-0.00259226 ,0.01990749 ,-0.01764613]])

pred = model.predict(x)
print("\nPredicted diabetes value:", pred[0])

#print((X_train,y_train,X_test,y_test,y_pred)*100)

    
