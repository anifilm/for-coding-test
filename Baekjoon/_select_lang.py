import random

lang_list = [
    'C',
    'C++',
    'C#',
    'Python',
    #'Ruby',
    #'Go',
    'Java',
    #'Kotlin',
    'JavaScript',
    #'PHP',
    #'Rust',
    #'Swift',
    'Dart',
    'Groovy',
    'Scala',
    'Clojure',
    'Haskell'
]

select = random.choice(lang_list)
print(select, '을(를) 선택하였습니다.')
