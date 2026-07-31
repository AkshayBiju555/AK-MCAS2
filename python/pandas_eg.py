import pandas as pd

data = {
    "Name": ["Alice", "Bob", "Charlie"],
    "Marks": [79, 92, 78]
}

df = pd.DataFrame(data)
#to print the entrie dataset
print(df)
#to print the 0th record
print(df.loc[0])
# Find students with marks above 80
result = df[df["Marks"] > 80]
print(result)