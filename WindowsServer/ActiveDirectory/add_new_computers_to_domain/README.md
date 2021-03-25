# Add a computer to a domain

In my case since I don't have DHCP-Server activated, yet I set the IP-Addresses manually.

Don't forget to set a static IP-address before this step if you follow this tutorial. [Instructions here in Network section](../../Network)

## Table of content

- [Add Computer before connecting to domain](#add-computer-before-connecting-to-domain)
- [Set computer name](#set-computer-name)
- [Add Windows Server to an Existing Domain](#add-windows-server-to-an-existing-domain)
- [Add an existing Windows 10 computer to an Existing Domain](#add-an-existing-windows-10-computer-to-an-existing-domain)
- [Add a newly installed Windows 10 computer to an Existing Domain](#add-a-newly-installed-windows-10-computer-to-an-existing-domain)
- [](#)
- [](#)

# Add Computer before connecting to domain

There is the possibility to add a computer to the domain before it is connected to the network.

In "Active Directory Users and Computers"

![Active Directory Users and Computers](img/aduac_1.png)

![Active Directory Users and Computers](img/aduac_2.png)

![Active Directory Users and Computers](img/aduac_3.png)

![Active Directory Users and Computers](img/aduac_4.png)

![Active Directory Users and Computers](img/aduac_5.png)

# Set computer name

Right Click the `Start Menu` > Click `System` 

![computer_name_part_1](img/computer_name_part_1.png)

Click `Advanced System Settings`

![computer_name_part_2](img/computer_name_part_2.png)

Click `Computer Name` -> `Change...`

![computer_name_part_3](img/computer_name_part_3.png)

Enter a new `Computer Name` OR go to next part to add server/client to domain

![computer_name_part_4](img/computer_name_part_4.png)

Press `OK` and restart your computer.

# Add Windows Server to an Existing Domain

Click on "Member of Domain", enter your domain and Click `OK`

![computer_name_part_5](img/computer_name_part_5.png)

Enter valid credentials to join the Domain Server, press `OK`

![computer_name_part_6](img/computer_name_part_6.png)

Press `OK`

![computer_name_part_7](img/computer_name_part_7.png)

Press `OK`

![computer_name_part_8](img/computer_name_part_8.png)

Press `Close`

![computer_name_part_9](img/computer_name_part_9.png)

Press `Restart Now`

![computer_name_part_10](img/computer_name_part_10.png)

Login screen after reboot, log in with any valid user.

![computer_name_part_10](img/computer_name_part_11.png)

# Add an existing Windows 10 computer to an Existing Domain

# Add a newly installed Windows 10 computer to an Existing Domain


