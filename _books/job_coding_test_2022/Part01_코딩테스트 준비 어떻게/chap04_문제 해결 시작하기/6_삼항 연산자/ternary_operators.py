a = [2, 4, 7, 5, 1, 8, 6, 3]
for i in a:
    even_or_odd = "짝" if i % 2 == 0 else "홀"
    print(i, even_or_odd)

b = [1 if j % 2 else 0 for j in a]
print(b)
