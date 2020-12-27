import datetime
import time
import api
from data_structure import DataStructure


def sort_out_relevant_data_from(api_data):
    week = api_data['dagar'][0]['vecka']
    today_date = api_data['dagar'][0]['datum']
    week_day = api_data['dagar'][0]['veckodag']
    today_names = api_data['dagar'][0]['namnsdag']
    flag_day = api_data['dagar'][0]['flaggdag']

    return DataStructure(week, today_date, week_day, today_names, flag_day)


def formatted_string(data) -> str:
    end_of_line = ', '
    output_text = 'v.'
    output_text += data.week + end_of_line
    output_text += data.today_date + end_of_line
    output_text += data.week_day + end_of_line

    for name in data.today_names:
        output_text += name + end_of_line

    output_text += data.flag_day + '\n\n'

    return output_text


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


# program_loop()

# Developer option to run program now
run_program()
