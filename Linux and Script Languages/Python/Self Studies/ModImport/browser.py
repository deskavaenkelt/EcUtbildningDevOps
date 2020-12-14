import webbrowser

# webbrowser.open("https://www.dsve.se/")
# help(webbrowser)
chrome = webbrowser.get(using='chrome')
chrome.open_new("https://www.dsve.se/")
