"""
Q13
random 모듈을 사용하여 로또 번호(1~45 사이의 숫자 6개)를 생성해 보자. (단 중복된
숫자가 있으면 안 됨)

"""
import random

lang_list = [
    'C',
    'C++',
    'C#',
    'Python',
    'Ruby',
    'Go',
    'Java',
    'Kotlin',
    'JavaScript',
    'PHP',
    'Rust',
    'Swift',
    'Dart'
]

select = random.choice(lang_list)
print(select, '을(를) 선택하였습니다.')
