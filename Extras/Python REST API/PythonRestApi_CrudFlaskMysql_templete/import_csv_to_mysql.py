import csv

from db_config import mysql


def insert_into_table(inner_conn, inner_cursor, diamond_properties):
    _carat = diamond_properties[0]
    _cut = diamond_properties[1]
    _color = diamond_properties[2]
    _clarity = diamond_properties[3]
    _depth = diamond_properties[4]
    _table_d = diamond_properties[5]
    _price = diamond_properties[6]
    _x = diamond_properties[7]
    _y = diamond_properties[8]
    _z = diamond_properties[9]

    sql = 'INSERT INTO specifications' \
          '(carat, cut, color, clarity, depth, table_d, price, x, y, z) ' \
          'VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s)'
    data = (_carat, _cut, _color, _clarity, _depth, _table_d, _price, _x, _y, _z)

    inner_cursor.execute(sql, data)
    inner_conn.commit()


with open('diamonds.csv') as csv_file:
    osv_reader = csv.reader(csv_file, delimiter=',')
    line_count = 0

    conn = mysql.connect()
    cursor = conn.cursor()

    try:
        for row in osv_reader:
            if line_count == 0:
                print(f'Column names are {", ".join(row)}')
                line_count += 1
            else:
                insert_into_table(conn, cursor, row)
    except Exception as e:
        print(e)
    finally:
        cursor.close()
        conn.close()
