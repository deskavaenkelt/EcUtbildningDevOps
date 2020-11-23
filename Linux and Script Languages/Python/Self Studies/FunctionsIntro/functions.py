def multiply() -> float:
    result = 10.5 * 4
    return result


def multiply2(x: float, y: float) -> float:
    result = x * y
    return result


print(multiply())
print(multiply2(10.5, 4))
print()

for val in range(1, 5):
    print(multiply2(2, val))
