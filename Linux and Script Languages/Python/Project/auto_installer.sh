#!/bin/bash

# Create directory in user home folder

mkdir ~/name_day && cd name_day

# URL's
# Script
service_restart=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/scripts/service_restart.sh
service_start=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/scripts/service_start.sh
service_stop=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/scripts/service_stop.sh

# Service
name_day_service=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/service/name_day.service

# Utils
init=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/utils/__init__.py
api=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/utils/api.py
data_structure=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/utils/data_structure.py
data_transformation=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/utils/data_transformation.py

# Main
main=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/name_day.py
auto_installer=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/installer.sh
installer=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/installer.sh
name_days=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/name_days.txt
readme=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/README.md
uninstaller=https://raw.githubusercontent.com/deskavaenkelt/EcUtbildningDevOps/master/Linux%20and%20Script%20Languages/Python/Project/uninstaller.sh


# Use wget to download all files
# Script & Make executable
mkdir ~/name_day/script && cd ~/name_day/script

wget -O service_restart.sh $service_restart
wget -O service_start.sh $service_start
wget -O service_stop.sh $service_stop

chmod +x script/service_restart.sh
chmod +x script/service_start.sh
chmod +x script/service_stop.sh

cd ..

# Service
mkdir ~/name_day/service && cd ~/name_day/service
wget -O name_day.service $name_day_service
cd ..

# Utils
mkdir ~/name_day/utils && cd ~/name_day/utils
wget -O __init__.sh $init
wget -O api.sh $api
wget -O data_structure.py $data_structure
wget -O data_transformation.py $data_transformation
cd ..

# Main & Make executable
wget -O __main__.py $main
wget -O auto_installer.py $auto_installer
wget -O installer.sh $installer
wget -O name_days.txt $name_days
wget -O README.md $readme
wget -O uninstaller.sh $uninstaller

chmod +x installer.sh
chmod +x uninstaller.sh

# Copy service file to systemd
cp service/name_day.service /lib/systemd/system/name_day.service

# Reload systemd
sudo systemctl daemon-reload

# Enables Service
sudo systemctl enable name_day.service

# Start Service
sudo systemctl start name_day.service

# Status Service
sudo systemctl status name_day.service