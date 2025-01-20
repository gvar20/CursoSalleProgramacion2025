#escoger un dataset y lo vamos a abrir en python y visualizar la data

import csv
with open('shopping_trends.csv', 'r') as csvfile:
    csvreader = csv.reader(csvfile)
    for row in csvreader:
        print(row)