#!/bin/bash

# Create directory in user home folder
mkdir ~/name_day
cd ~/name_day

# URL's
api=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/api.py
data_structure=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/data_structure.py
installer=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/installer.sh
name_day=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/name_day.py
name_day_service=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/name_day.service
name_days=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/name_days.txt
service_restart=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/service_restart.sh
service_start=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/service_start.sh
service_stop=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/service_stop.sh
uninstaller=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/uninstaller.sh


# Use wget to download all files
# Program files
wget -O api.sh $api
wget -O data_structure.py $data_structure
wget -O installer.sh $installer
wget -O name_day.py $name_day
wget -O name_day.service $name_day_service
wget -O data_structure.py $data_structure
wget -O name_days.txt $name_days
wget -O service_restart.sh $service_restart
wget -O service_start.sh $service_start
wget -O service_stop.sh $service_stop
wget -O uninstaller.sh $uninstaller

# Copy service file to systemd
sudo cp name_day.service /lib/systemd/system/name_day.service

# Make executable
chmod +x installer.sh
chmod +x service_restart.sh
chmod +x service_start.sh
chmod +x service_stop.sh
chmod +x uninstaller.sh

# Reload systemd
sudo systemctl daemon-reload

# Enables Service
sudo systemctl enable name_day.service

# Start Service
sudo systemctl start name_day.service

# Status Service
sudo systemctl status name_day.service