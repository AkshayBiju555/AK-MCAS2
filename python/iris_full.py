from sklearn.datasets import load_iris

# Load the Iris dataset
iris = load_iris()

# Dataset information
print("----- IRIS DATASET INFORMATION -----\n")

# Feature names
print("Feature Names:")
print(iris.feature_names)
print("Number of Features:", len(iris.feature_names))

# Target names
print("\nTarget Names:")
print(iris.target_names)
print("Number of Target Classes:", len(iris.target_names))

# Data
print("\nFirst 5 Data Samples:")
print(iris.data[:5])

print("\nFirst 5 Target Values:")
print(iris.target[:5])

# Number of samples
print("\nTotal Number of Samples:", len(iris.data))

# Shape of the dataset
print("Shape of Data:", iris.data.shape)
print("Shape of Target:", iris.target.shape)

# First sample with feature names
print("\nFirst Sample Details:")
for feature, value in zip(iris.feature_names, iris.data[0]):
    print(f"{feature}: {value}")

# First sample class
print("\nFirst Sample Target:", iris.target[0])
print("First Sample Flower Name:", iris.target_names[iris.target[0]])

# Display first 10 samples
print("\n----- FIRST 10 SAMPLES -----")
for i in range(10):
    print(f"\nSample {i+1}")
    for feature, value in zip(iris.feature_names, iris.data[i]):
        print(f"{feature}: {value}")
    print("Class:", iris.target[i])
    print("Flower:", iris.target_names[iris.target[i]])