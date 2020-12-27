import datetime
import time
import api
from data_transformation import sort_out_relevant_data_from, formatted_string


def run_program():
    string = formatted_string(sort_out_relevant_data_from(api.response()))

    with open('name_days.txt', 'a') as name_file:
        current_time = str(datetime.datetime.now()) + '\n'
        name_file.write(current_time)
        name_file.write(string)


check_time_hour = 20
for_one_hour = 3600


def program_loop():
    while True:
        hour = datetime.datetime.now().hour

        if hour == check_time_hour:
            run_program()

        time.sleep(for_one_hour)


program_loop()

# Developer option to run program now
# run_program()
