# Assignment 1

## Table of content

- [Part 1](#part-1)
    - [Questions](#questions)
- [Part 2](#part-2)
    - [Create a Windows Server](#create-a-windows-server)
    - [Starting criteria](#starting-criteria)
    - [Network](#network)
    - [Router VM](#router-vm)
    - [Windows Server DC1](#windows-server-dc1)
        - [Create DSVE-DC1 VM](#create-dsve-dc1-vm)
        - [Install the role Domain Controller](#install-the-role-domain-controller)
        - [Create users](#create-users)
    - [Windows 10](#windows-10)
    - [](#)
- [Part 3](#part-3)
- [Part 4](#part-4)
- [](#)
- [](#)
- [](#)

# Part 1

## Questions

1. Describe a use case for Windows Server.
    - To be able to have a domain controller with user administration.
    - DHCP Server to give IP-Addresses to computers that connect to the network.

2. What is Active Directory?
    - Active Directory (AD) is a directory service developed by Microsoft for Windows domain networks. It is included in
      most Windows Server operating systems as a set of processes and services. Active Directory is an umbrella title
      for a broad range of directory-based identity-related services.

3. What is a Domain Controller?
    - On Microsoft Servers, a domain controller (DC) is a server computer that responds to security authentication
      requests (logging in, etc.) within a Windows domain. A domain is a concept introduced in Windows NT whereby a user
      may be granted access to a number of computer resources with the use of a single username and password
      combination.

4. What is Hyper-V?
    - Microsoft Hyper-V is a native hypervisor, it can create virtual machines on x86-64 systems running Windows.

5. What is System Center Virtual Machine Manager?
    - A System Center Virtual Machine Manager (SCVMM) is a virtual support center for Microsoft Windows machines, that
      entails the system administrators to have a centrally virtualized environment that holds multiple physical servers
      consolidated in it.

6. What is PowerShell?
    - PowerShell is a task automation and configuration management framework from Microsoft, consisting of a
      command-line shell, and the associated scripting language.

7. Where do you troubleshoot or monitor services in Windows Server?
    - Logg files
    - Task manager

8. What is a "Role" in Windows Server?
    - Server roles refer to the roles that your server can play on your network — roles such as a file server, a web
      server, or a DHCP or DNS server. Features refer to additional capabilities of the Windows operating system itself,
      such as the .NET Framework or Windows Backup.

# Part 2

## Create a Windows Server

Set up a Windows Server ~~(2016)~~ (2019), this will act as a domain controller. Install the necessary extensions /
roles on this server needed for this.

## Starting criteria

I installed Windows Server 2019 on a physical computer with the following specifikation:

- i7-4790K (4 Core, 8 Threads)
- 32GB RAM
- SSD
    - 128GB OS
    - 128GB ISOs
    - 256GB RefDisks
    - 256GB VMs

![](img/giggan/disk-management.png)

I will use the iso's int the image below.

![](img/giggan/isos.png)

This machine will run all other machines for this assignment as VMs under Hyper-V and will be called "GIGGAN".

So I only install the role **"Hyper-V Manger"** on GIGGAN.

![](img/giggan/server-info.png)

I use a tool from Sysinternals that Microsoft has
available [here](https://docs.microsoft.com/en-us/sysinternals/downloads/bginfo) that displays the Server information to
the right in the image above.

## Network

All VMs will run on their own privat network, so they don't interfere with my regular network. This forces me to create
2 virtual networks in the "Virtual Switch Manager" on GIGGAN. I will call them:

- WAN (Internet Access)
- LAN (VM network)

The names are used according to my LAB-environments perspective!

I could just shield of the network since it's a LAB-environment, but I need internet access for [part 4](#part-4) in
this assignment.

![](img/giggan/virtual-switches.png)

## Router VM

Since I need a router to be able to access the internet on my LAB-environment I start by creating it first. I'll
Use [OPNsense](https://opnsense.org/) as router software.

1. Settings for Router:
    - Name: OPNsense
    - Generation 1 for compatibility reasons (don't work on Gen2)
    - Startup memory: 2048 MB
    - Add WAN network
    - Virtual hard disk get standard settings (Location `G:\Virtual Hard Disks\`)
    - Install from ISO (OPNsense-21.1-OpenSSL-dvd-amd64.iso)
    - Finish

2. Open Settings for "OPNsense" and change:
    - Change to 2 cores
    - Add LAN network

3. Start VM:
    - Start from iso
    - log in with
        - user: `installer`
        - password: `opnsense`
        - To start installation and follow on-screen instructions
    - log in with
        - user: `root`
        - password: `your choosen password during setup`
    - Connect WAN and LAN network-ports to the correct interface
        - `1) Assign interfaces`
        - `2) Set interface IP address`
        - Result:  
          ![](img/opnsense/logged-in-screen.png)

    - WAN network gets ip from my real router on my network
    - LAN network IP is set static to `192.168.0.1`
    - When we install our other machines on the LAN network we will be able to connect to `192.168.0.1` to administrate
      the router through a webb interface.

## Windows Server DC1

### Create DSVE-DC1 VM

1. Settings for Domain Controller:
    - Name: DSVE-DC1
    - Generation 2
    - Startup memory: 4096 MB
    - Add LAN network
    - Virtual hard disk get standard settings (Location `G:\Virtual Hard Disks\`)
    - Install from ISO (Windows Server 2019
      17763.737.190906-2324.rs5_release_svc_refresh_SERVER_EVAL_x64FRE_en-us_1.iso)
    - Finish

2. Open Settings for "OPNsense" and change:
    - Change to 4 cores

3. Start VM:
    - Start from iso (Pictures from my Windows Server 2016 installation, but it's the same process for Server 2019)
    - ![Step 1](img/dsve-dc1/windows-installation/step1.png)
    - ![Step 2](img/dsve-dc1/windows-installation/step2.png)
    - ![Step 3](img/dsve-dc1/windows-installation/step3_data_center_gui.png)
    - ![Step 4](img/dsve-dc1/windows-installation/step4.png)
    - ![Step 5](img/dsve-dc1/windows-installation/step5.png)
    - ![Step 6](img/dsve-dc1/windows-installation/step6.png)
    - ![Step 7](img/dsve-dc1/windows-installation/step7.png)
    - ![Step 8](img/dsve-dc1/windows-installation/step8.png)
    - ![Step 9](img/dsve-dc1/windows-installation/step9.png)
    - ![Step 10](img/dsve-dc1/windows-installation/step10.png)
    - ![Step 11](img/dsve-dc1/windows-installation/step11.png)
    - ![Step 12](img/dsve-dc1/windows-installation/step12.png)
    - ![Step 13](img/dsve-dc1/windows-installation/step13.png)
    - ![Step 14](img/dsve-dc1/windows-installation/step14.png)

### Install the role Domain Controller

1. Add new Role Active Directory Domain Controller

2. Deploy the server with the setting for the domain which can be seen in the PowerShell-script below

```powershell
#
# Windows PowerShell script for AD DS Deployment
#

Import-Module ADDSDeployment
Install-ADDSForest `
-CreateDnsDelegation:$false `
-DatabasePath "C: \Windows \NTDS" `
-DomainMode "WinThreshold" `
-DomainName "ad.dsve.se" `
-DomainNetbiosName "DSVE" `
-ForestMode "WinThreshold" `
-InstallDns:$true `
-LogPath "C: \Windows\NTDS" `
-NoRebootOnCompletion:$false `
-SysvolPath "C: \Windows \SYSVOL" `
-Force: Strue
```

![](img/dsve-dc1/domain-controller/dsve-dc1.png)
![](img/dsve-dc1/domain-controller/dsve-dc1-local-manger.png)

3. Restart

### Create users

Here I will use a PowerShell-script to change the structure in "Active Directory Users and Computers" under Tools menu.

Standard view:

![](img/dsve-dc1/domain-controller/active-directory-users-and-computers.png)

```powershell
$ParentDomain = "DC=AD,DC=DSVE,DC=SE"
$DomainName = "DSVE"

# Create Domain OU
New-ADOrganizationalUnit -Name $DomainName -Path $ParentDomain -ProtectedFromAccidentalDeletion $True

# Create Computer Containers
New-ADOrganizationalUnit -Name Computers -Path "OU=$DomainName,$ParentDomain" -ProtectedFromAccidentalDeletion $True

New-ADOrganizationalUnit -Name Clients -Path "OU=Computers,OU=$DomainName,$ParentDomain" -ProtectedFromAccidentalDeletion $True
New-ADOrganizationalUnit -Name New -Path "OU=Computers,OU=$DomainName,$ParentDomain" -ProtectedFromAccidentalDeletion $True
New-ADOrganizationalUnit -Name Servers -Path "OU=Computers,OU=$DomainName,$ParentDomain" -ProtectedFromAccidentalDeletion $True

# Create User Container
New-ADOrganizationalUnit -Name Users -Path $( "OU=$DomainName,$ParentDomain" ) -ProtectedFromAccidentalDeletion $True
New-ADOrganizationalUnit -Name HQ -Path $( "OU=Users,OU=$DomainName,$ParentDomain" ) -ProtectedFromAccidentalDeletion $True
New-ADOrganizationalUnit -Name ResourceGroups -Path $( "OU=Users,OU=$DomainName,$ParentDomain" ) -ProtectedFromAccidentalDeletion $True

# Create Service Account Container
New-ADOrganizationalUnit -Name "ServiceAccounts" -Path "OU=$DomainName,$ParentDomain" -ProtectedFromAccidentalDeletion $True

# Create Security Groups Container
New-ADOrganizationalUnit -Name "SecurityGroups" -Path "OU=$DomainName,$ParentDomain" -ProtectedFromAccidentalDeletion $True

# Create Admins Container
New-ADOrganizationalUnit -Name "Admins" -Path "OU=$DomainName,$ParentDomain" -ProtectedFromAccidentalDeletion $True
```

![](img/dsve-dc1/domain-controller/add-adstructure.png)

Add random users

```powershell
$Names = (Invoke-RestMethod -Uri "http://names.drycodes.com/10?nameOptions=boy_names").split("_")
$FirstName = $Names[0]
$Lastname = $Names[1]

Write "$FirstName $Lastname"
```

## Windows 10

1. Settings for Windows 10:
    - Name: DSVE-CL1-WIN10
    - Generation 2
    - Startup memory: 4096 MB
    - Add LAN network
    - Virtual hard disk get standard settings (Location `G:\Virtual Hard Disks\`)
    - Install from ISO (Win10_20H2_v2_EnglishInternational_x64.iso)
    - Finish

2. Open Settings for "OPNsense" and change:
    - Change to 4 cores

3. Start VM:
    - Install Windows and make a standard installation with Windows 10 Pro
    - Create an offline user
    - Set static IP settings
    - Join Domain
   
![](img/dsve-cl1-win10/clean_install.png)
![](img/dsve-cl1-win10/domain-join-1.png)
![](img/dsve-cl1-win10/domain-join-2.png)
![](img/dsve-cl1-win10/domain-join-3.png)
![](img/dsve-cl1-win10/domain-join-4.png)
![](img/dsve-cl1-win10/domain-join-5.png)
![](img/dsve-cl1-win10/domain-join-6.png)
![](img/dsve-cl1-win10/domain-join-7.png)
![](img/dsve-cl1-win10/domain-join-8.png)
![](img/dsve-cl1-win10/domain-join-9.png)
![](img/dsve-cl1-win10/domain-join-10.png)
![](img/dsve-cl1-win10/domain-join-11.png)

# Part 3

Add new user with PowerShell

```powershell

```


Add new VM

```powershell
$Refdisk = 'E:\Refdiskar\pfsense Ref 201109. vhdx'
#$Refdisk = "C: Refdiskar\Windows 10 2004 Ref 201109. vhdx"
$VHDPath = (Get-VMHost).VirtualHardDiskPath
$VMName = "pfsense-FakeInternet"

if ($VHDPath.Substring($VHDPath.Length - 1, 1) -notmatch "\\")
{
    $VHDPath = $VHDPath + "\"
}

(SPite deserterwans a firman action sale a y contain ye A to or ted -
13 else
SVHDx
SVM
New-VHD -Path $VHDPath$VMName.vhdx -Differencing -ParentPath SRefdisk
New-VM -Name $VMName -MemoryStartupBytes 512MB -SwitchName "Default Switch" -VHDPath S(SVHDX. Path) -Generation 2
SVM | Set-VM -AutomaticcheckpointsEnabled Sfalse -ProcessorCount
#SVM | Start-VM
vmconnect. exe Senv: computername SVM. Name
```

# Part 4

## Create Domain

Create new VM

- Name "LAB-DC1"
- Windows Server 2019
- Domain Controller
- DNS Server
- Active Directory
- DHCP Server

### Domänkontroller scriptet


























