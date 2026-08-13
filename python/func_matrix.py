#find dot product,transpose of matrix 1 and 2,trace of matrix 1 and 2,find rank of matrix 1 and 2 ,then find of determinant of matrix 1,find inverse of matrix 2
import numpy as np

# ---------------- MATRIX 1 ----------------

r1 = int(input("Enter number of rows for matrix 1: "))
c1 = int(input("Enter number of columns for matrix 1: "))

matrix1 = np.zeros((r1, c1), dtype=int)

print("Enter elements of matrix 1:")

for i in range(r1):
    for j in range(c1):
        matrix1[i][j] = int(input(f"Enter element [{i}][{j}]: "))

print("\nMatrix 1:")
print(matrix1)


# ---------------- MATRIX 2 ----------------

r2 = int(input("\nEnter number of rows for matrix 2: "))
c2 = int(input("Enter number of columns for matrix 2: "))

matrix2 = np.zeros((r2, c2), dtype=int)

print("Enter elements of matrix 2:")

for i in range(r2):
    for j in range(c2):
        matrix2[i][j] = int(input(f"Enter element [{i}][{j}]: "))

print("\nMatrix 2:")
print(matrix2)


# ---------------- DOT PRODUCT ----------------

if c1 == r2:
    dot_product = np.dot(matrix1, matrix2)

    print("\nDot Product of Matrix 1 and Matrix 2:")
    print(dot_product)
else:
    print("\nDot product cannot be performed.")
    print("Number of columns of Matrix 1 must equal number of rows of Matrix 2.")


# ---------------- TRANSPOSE ----------------

print("\nTranspose of Matrix 1:")
print(matrix1.T)

print("\nTranspose of Matrix 2:")
print(matrix2.T)


# ---------------- TRACE ----------------

if r1 == c1:
    print("\nTrace of Matrix 1:")
    print(np.trace(matrix1))
else:
    print("\nTrace of Matrix 1 cannot be found because it is not square.")


if r2 == c2:
    print("\nTrace of Matrix 2:")
    print(np.trace(matrix2))
else:
    print("\nTrace of Matrix 2 cannot be found because it is not square.")


# ---------------- RANK ----------------

print("\nRank of Matrix 1:")
print(np.linalg.matrix_rank(matrix1))

print("\nRank of Matrix 2:")
print(np.linalg.matrix_rank(matrix2))


# ---------------- DETERMINANT OF MATRIX 1 ----------------

if r1 == c1:
    determinant1 = np.linalg.det(matrix1)

    print("\nDeterminant of Matrix 1:")
    print(determinant1)
else:
    print("\nDeterminant of Matrix 1 cannot be found because it is not square.")


# ---------------- INVERSE OF MATRIX 2 ----------------

if r2 == c2:

    determinant2 = np.linalg.det(matrix2)

    if determinant2 != 0:
        inverse2 = np.linalg.inv(matrix2)

        print("\nInverse of Matrix 2:")
        print(inverse2)
    else:
        print("\nInverse of Matrix 2 does not exist.")
        print("Determinant of Matrix 2 is 0.")

else:
    print("\nInverse of Matrix 2 cannot be found because it is not square.")