Install-WindowsFeature ad-domain-services

Get-WindowsFeature

Import-Module ADDSDeployment

Install-ADDSDomainController -DomainName lab2.local -SiteName Default-First-Site-Name -InstallDns -Credential (Get-Credential)
