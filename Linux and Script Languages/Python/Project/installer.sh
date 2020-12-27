#!/bin/bash

# Create directory in user home folder
mkdir ~/.name_day

# Make executable
chmod +x ~/.name_day/service_restart.sh
chmod +x ~/.name_day/service_start.sh
chmod +x ~/.name_day/service_stop.sh
chmod +x ~/.name_day/service_uninstaller.sh

# Copy files to the created folder
cp api.py ~/.name_day/api.py
cp data_structure.py ~/.name_day/data_structure.py
cp data_transformation.py ~/.name_day/data_transformation.py
cp name_day.py ~/.name_day/name_day.py
cp name_days.txt ~/.name_day/name_days.txt
cp README.md ~/.name_day/README.md
cp service_restart.sh ~/.name_day/service_restart.sh
cp service_start.sh ~/.name_day/service_start.sh
cp service_stop.sh ~/.name_day/service_stop.sh
cp service_uninstaller.sh ~/.name_day/service_uninstaller.sh

# List files in directory
ll -a ~/.name_day

# Copy service file to systemd
sudo cp name_day.service /lib/systemd/system/name_day.service

# Reload systemd
sudo systemctl daemon-reload

# Enables Service
sudo systemctl enable name_day.service

# Start Service
sudo systemctl start name_day.service

# Status Service
sudo systemctl status name_day.service
