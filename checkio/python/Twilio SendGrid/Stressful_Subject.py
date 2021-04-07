def is_stressful(subj):
    """
        recoognise stressful subject
    """
    import re

    return (subj.isupper() or subj.endswith('!!!') or any(re.search('+[.!-]*'.join(word), subj.lower())
                for word in ['help', 'asap', 'urgent']))

if __name__ == '__main__':
    #These "asserts" using only for self-checking and not necessary for auto-testing
    assert is_stressful("Hi") == False, "First"
    assert is_stressful("I neeed HHHEEEEEEELLP") == True, "Second"
    print('Done! Go Check it!')
