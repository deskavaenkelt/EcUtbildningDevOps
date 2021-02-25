# Active Directory - Installation

## Table of content

- [Configure network](#configure-network)
- [Add Feature Domain Controller](#add-feature-domain-controller)
- [Deployment Configuration](#deployment-configuration)
- [PowerShell add additional Domain Controller on Member Server ](#powershell-add-additional-domain-controller-on-member-server-lab2-dc2)

# Configure network

If needed check or not done already check out [Network configuration](../../Network)

# Add Feature Domain Controller

1. Now we add roles and features  
   ![add_role_or_features](img/add_role_or_features.png)
2. Next
3. **Role-based or feature-based installation** > Next
4. Choose your computer name `LAB2-DC1` > Next
5. Choose "Active Directory Domain Services", klick "Add features" in the pop-up window then klick next
6. No more features ar needed to add so klick on Next
7. Click Next on the informative screen
8. Click Install
    - The service is now being installed, but the feature is not activated.
9. When ready klick on "Promote this server to a domain controller"
    - If you already clicked on Close
    - There is a notification icon that you can click on  
      ![notification_icon](img/notification_icon.png)

# Deployment Configuration

10. Choose "Add new forest"
    - Root domain name: `LAB2.LOCAL`
    - Next
11. Domain Controller Options:
    - Functional level: Windows server 2016 (minimum level of our domain controllers)
    - Type the Directory Services Restore Mode (DSRM) password
    - Next
12. DNS Options
    - Next
13. Additional Options
    - The NetBIOS domain name: `LAB2`
    - Next
14. Paths
    - Next
15. Review Options
    - Next
16. Prerequisites Check
    - Install

# PowerShell add additional Domain Controller on Member Server `LAB2-DC2`

```powershell
Install-WindowsFeature ad-domain-services
```

![ps_install_active_directory_success](img/ps_install_active_directory_success.png)

```powershell
Get-WindowsFeature
```

![ps_installed_windows_features](img/ps_installed_windows_features.png)

```powershell
Import-Module ADDSDeployment
```

```powershell
Install-ADDSDomainController -DomainName lab2.local -SiteName Default-First-Site-Name -InstallDns -Credential (Get-Credential)
```

Enter credentials:  
Username: `lab2\administrator`  
Password: `yourPassword`

`SafeModeAdministratorPassword: ********`  
`Confirm SafeModeAdministratorPassword: ********`

[Script](../PowerShell/PowerShell_install_Active_Directory_on_member_server.ps1)

Script handed to me from GUI

```
#
# Windows PowerShell script for AD DS Deployment
#

Import-Module ADDSDeployment
Install-ADDSDomainController `
-NoGlobalCatalog:$false `
-CreateDnsDelegation:$false `
-Credential (Get-Credential) `
-CriticalReplicationOnly:$false `
-DatabasePath "C:\Windows\NTDS" `
-DomainName "LAB2.LOCAL" `
-InstallDns:$true `
-LogPath "C:\Windows\NTDS" `
-NoRebootOnCompletion:$false `
-ReplicationSourceDC "LAB2-DC1.LAB2.LOCAL" `
-SiteName "Default-First-Site-Name" `
-SysvolPath "C:\Windows\SYSVOL" `
-Force:$true

lab2\administrator
```
