import random

def random_numbers(n):
    random_list = []
    for i in range(0, n):
        random_list.append(random.randint(0, n))
    return random_list

def bubble_sort(random_list):
    for i in range(len(random_list)):
        for j in range(len(random_list)):
            if (random_list[i] < random_list[j]):
                random_list[i], random_list[j] = random_list[j], random_list[i]
    return random_list

def results(sorted_list):
    result = ""
    for i in range(len(sorted_list)):
        result += str(sorted_list[i]) + ", "
    return result

if __name__ == "__main__":
    random_list = random_numbers(100)
    print(f'Nieposortowana lista: {random_list}\n\n')
    sorted_list = bubble_sort(random_list)
    print(f'Posortowana lista: {results(sorted_list)}')