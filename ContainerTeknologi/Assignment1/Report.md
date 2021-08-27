# Assignment 1 Containerteknologi(docker) Report

## Part 1 - Theoretically

### 1. Virtualization

1. Benefits of using Virtualization is that you can run multiple virtual machines on the same host/server 
    simultaneously
  and therefore utilize the hardware more effectively.
2. Different types of Virtualization are:
    - Type 1 hypervisor runs directly on the host machine's physical hardware, and it's referred to as a bare-metal
      hypervisor. The Type 1 hypervisor doesn't have to load an underlying OS.
    - Type 2 hypervisor is typically installed on top of an existing OS. It is sometimes called a hosted hypervisor
      because it relies on the host machine's preexisting OS to manage calls to CPU, memory, storage and network
      resources.
3. A hypervisors primarily purpose is to handle the Virtual Machines (VM), networks and resources available on the host
  machine.
4. The definition of a VM is a server/machine running on a host machine without any physical hardware assigned to it,
   all
  hardware are virtualized (some hardware can be passthroughs if necessary).
5. There is a lot of hypervisors:
    - VMWare ESX/ESXi/Fusion/Worktation
    - Microsoft Hyper-V
    - Citrix XenServer
    - Proxmox
6. The role of virtualization is to utilize the hardware more effectively.
7. `VMware` is an American cloud computing and virtualization technology company, they provide virtualization Software.

### 2. Containerteknologi

1. The benefits of using containers instead of VMs ar that each container is running as a service and do not require 
   any virtual hardware assigned to it. It also allows us to rebuild an application instead of upgrading it.
2. 
