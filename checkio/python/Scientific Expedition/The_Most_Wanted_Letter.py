def checkio(text: str) -> str:
    total = 0
    text_lower = text.lower()

    for i in text_lower:
        if i.isalpha():
            if text_lower.count(i) > total:
                most = i
                total = text_lower.count(i)
            elif text_lower.count(i) == total:
                if i < most:
                    most = i
                    total = text_lower.count(i)

    return most

if __name__ == '__main__':
    print("Example:")
    print(checkio("Hello World!"))

    #These "asserts" using only for self-checking and not necessary for auto-testing
    assert checkio("Hello World!") == "l", "Hello test"
    assert checkio("How do you do?") == "o", "O is most wanted"
    assert checkio("One") == "e", "All letter only once."
    assert checkio("Oops!") == "o", "Don't forget about lower case."
    assert checkio("AAaooo!!!!") == "a", "Only letters."
    assert checkio("abe") == "a", "The First."
    print("Start the long test")
    assert checkio("a" * 9000 + "b" * 1000) == "a", "Long."
    print("The local tests are done.")
