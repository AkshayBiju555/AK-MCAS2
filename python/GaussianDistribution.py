import numpy as np
import matplotlib.pyplot as plt
from scipy.stats import norm

# Mean and Standard Deviation
mu = 50
sigma = 10

# Generate x values
x = np.linspace(20, 80, 100)

# Calculate Gaussian PDF
y = norm.pdf(x, mu, sigma)

# Plot
plt.plot(x, y, color='blue')
plt.title("Gaussian (Normal) Distribution")
plt.xlabel("x")
plt.ylabel("Probability Density")
plt.grid(True)
plt.show()