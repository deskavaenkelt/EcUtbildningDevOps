#!/bin/bash

# Create directory in user home folder
mkdir ~/name_day

# Copy files to the created folder
# Scripts
cp scripts/service_restart.sh ~/name_day/scripts/service_restart.sh
cp scripts/service_start.sh ~/name_day/scripts/service_start.sh
cp scripts/service_stop.sh ~/name_day/scripts/service_stop.sh

# Copy service file to systemd
sudo cp service/name_day.service /lib/systemd/system/name_day.service

# Utils
cp utils/__init__.py ~/name_day/utils/__init__.py
cp utils/api.py ~/name_day/utils/api.py
cp utils/data_structure.py ~/name_day/utils/data_structure.py
cp utils/data_transformation.py ~/name_day/utils/data_transformation.py

# Main files
cp __main__.py ~/name_day/__main__.py
cp auto_installer.sh ~/name_day/auto_installer.sh
cp installer.sh ~/name_day/installer.sh
cp name_days.txt ~/name_day/name_days.txt
cp README.md ~/name_day/README.md
cp uninstaller.sh ~/name_day/uninstaller.sh

# Make executable
chmod +x ~/name_day/scripts/service_restart.sh
chmod +x ~/name_day/scripts/service_start.sh
chmod +x ~/name_day/scripts/service_stop.sh
chmod +x ~/name_day/service_uninstaller.sh

# Reload systemd
sudo systemctl daemon-reload

# Enables Service
sudo systemctl enable name_day.service

# Start Service
sudo systemctl start name_day.service

# Status Service
sudo systemctl status name_day.service
