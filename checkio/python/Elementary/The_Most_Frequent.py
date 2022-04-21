def most_frequent(data: list) -> str:
    """
    determines the most frequently occurring string in the sequence.
    """
    most_count = 0
    most_data = 0

    for elem in data:
        elem_count = data.count(elem)
        if most_count < elem_count:
            most_count = elem_count
            most_data = elem

    return most_data


if __name__ == "__main__":
    # These "asserts" using only for self-checking and not necessary for auto-testing
    print("Example:")
    print(most_frequent(["a", "b", "c", "a", "b", "a"]))

    assert most_frequent(["a", "b", "c", "a", "b", "a"]) == "a"
    assert most_frequent(["a", "a", "bi", "bi", "bi"]) == "bi"
    print("Done")
