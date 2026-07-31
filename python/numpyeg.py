from sklearn.datasets import load_iris

iris = load_iris()

print(iris.keys())
X = iris.data

print(X[:5])