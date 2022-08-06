winner_grade = 1
winner_score = 0

for i in range(5):
    score = sum(list(map(int, input().split())))
    if winner_score < score:
        winner_score = score
        winner_grade = i + 1

print(winner_grade, winner_score)
