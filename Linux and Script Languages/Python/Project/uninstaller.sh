#!/bin/bash

# Status Service
sudo systemctl status name_day.service

# Stop Service
sudo systemctl stop name_day.service

# Status Service
sudo systemctl status name_day.service

# Delete Service
sudo rm -d /lib/systemd/system/name_day.service

# Delete directory in user home folder
rm -r ~/name_day
