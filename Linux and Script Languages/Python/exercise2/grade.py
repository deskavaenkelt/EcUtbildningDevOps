MIN_POINTS = 0
MAX_POINTS = 100


def get_int_from_user() -> int:
    try:
        return int(input('Enter Score: '))
    except Exception:
        print('Invalid input')
        return -1


def valid_point_range(user_input: int) -> int:
    """ Check if point is in valid range """
    if MIN_POINTS <= user_input <= MAX_POINTS:
        return user_input
    else:
        print('Out of points range')
        return -1


def get_user_input_as_int() -> int:
    """ Return only score in valid range """
    user_input = -1
    while user_input == -1:
        user_input = get_int_from_user()
        user_input = valid_point_range(user_input)
    return user_input


def calculate_percent(score: float) -> float:
    """ Return Score as float """
    return round(score / MAX_POINTS, 2)     # round of to two decimals


def get_grade(calculated_percent: float) -> str:
    """ Evaluate score and returns grade """
    if calculated_percent >= 0.9:
        return 'A'
    elif calculated_percent >= 0.8:
        return 'B'
    elif calculated_percent >= 0.7:
        return 'C'
    elif calculated_percent >= 0.6:
        return 'D'
    else:
        return 'F'


student_name = input('Enter student name: ')
student_score = get_user_input_as_int()
score_percent = calculate_percent(student_score)
student_grade = get_grade(score_percent)

print('{} fick betyget {} och hade {}%'.format(student_name, student_grade, score_percent))
