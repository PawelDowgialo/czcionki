from konsolowa.bubblesort import random_numbers, bubble_sort, results


def test():
    random_list = random_numbers(1000)
    sorted_list = bubble_sort(random_list)
    assert sorted_list == sorted(random_list), "False"
    print("True")

if __name__ == '__main__':
    test()