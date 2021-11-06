n, k = map(int, input().split())

a = [str(i + 1) for i in range(n)]
#print(a)

result = []
t = 0

for _ in range(n):
    t += k - 1
    t %= len(a)
    result.append(a.pop(t))
    #print(result)
    #print(a)

#print(result)
print("<" + ", ".join(result) + ">")

# 예제1 은 만족하지만 제출시 틀림
# 길이가 작다면 붙이고 종료 부분 수정 필요
# 순서대로 K번 세어서 제거해야 함 (수정 완료)

# 반례 5 4 입력시
# <4, 3, 5, 2, 1>
