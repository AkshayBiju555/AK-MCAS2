import sklearn
print(sklearn.__version__)
from sklearn.linear_model import LinearRegression

X = [[1], [2], [3], [4]]
y = [2, 4, 6, 8]

model = LinearRegression()
model.fit(X, y)

prediction = model.predict([[5]])
print(prediction)