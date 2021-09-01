#!/bin/bash

# This file is for Proxmox environment

# Update with latest packages
sudo apt update && sudo upgrade -y

# Install QEMU agent for Virtual environment on Proxmox
sudo apt-get install qemu-guest-agent

