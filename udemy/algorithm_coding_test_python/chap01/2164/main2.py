n = int(input())

lst = list(range(1, n+1))
cards = ''.join(str(_) for _ in lst)

while len(cards) > 1:
    cards = cards[1:] # 첫번째 카드 버림
    cards = cards[1:] + cards[0] # 두번째 카드를 맨뒤로

print(cards)
