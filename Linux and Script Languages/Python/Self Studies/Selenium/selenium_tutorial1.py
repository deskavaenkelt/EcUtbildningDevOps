from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time

PATH = '/Users/lars/Development/selenium/chromedriver'
driver = webdriver.Chrome(PATH)

driver.get('https://techwithtim.net/')
print(driver.title)

# driver.close()
driver.quit()
