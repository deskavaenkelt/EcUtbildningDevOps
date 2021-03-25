# New User
New-ADUser -DisplayName "Cesar Cesarsson" -Name "Cesar Cesarsson" -GivenName "Cesar" -Surname "Cesarsson" -SamAccountName "cesces" -UserPrincipalName "cesces@lab2.local" -AccountPassword(Read-Host -AsSecureString "Input Password") -Enabled $true -ChangePasswordAtLogon $true


# Add user to a group
Add-ADGroupMember -Identity Marketing -Members cesces


# All in one - Nicely formatted
New-ADUser `
-DisplayName "David Davidsson" `
-Name "David Davidsson" `
-GivenName "David" `
-Surname "Davidsson" `
-SamAccountName "davdav" `
-UserPrincipalName "davdav@lab2.local" `
-AccountPassword(Read-Host -AsSecureString "Input Password") `
-Enabled $true `
-ChangePasswordAtLogon $true

Add-ADGroupMember -Identity Marketing -Members davdav


# Add user script from ADAC
# This script was provided when I added "Fredrik Fredriksson" in "Active Directory Administrative Center":

New-ADUser -DisplayName:"Fredrik Fredriksson" -GivenName:"Fredrik" -Name:"Fredrik Fredriksson" -Path:"OU=Users,OU=Gothenburg,DC=LAB2,DC=LOCAL" -SamAccountName:"frefre" -Server:"LAB2-DC1.LAB2.LOCAL" -Surname:"Fredriksson" -Type:"user"

Set-ADAccountPassword -Identity:"CN=Fredrik Fredriksson,OU=Users,OU=Gothenburg,DC=LAB2,DC=LOCAL" -NewPassword:"System.Security.SecureString" -Reset:$true -Server:"LAB2-DC1.LAB2.LOCAL"

Enable-ADAccount -Identity:"CN=Fredrik Fredriksson,OU=Users,OU=Gothenburg,DC=LAB2,DC=LOCAL" -Server:"LAB2-DC1.LAB2.LOCAL"

Add-ADPrincipalGroupMembership -Identity:"CN=Fredrik Fredriksson,OU=Users,OU=Gothenburg,DC=LAB2,DC=LOCAL" -MemberOf:"CN=Marketing,CN=Users,DC=LAB2,DC=LOCAL" -Server:"LAB2-DC1.LAB2.LOCAL"

Set-ADAccountControl -AccountNotDelegated:$false -AllowReversiblePasswordEncryption:$false -CannotChangePassword:$false -DoesNotRequirePreAuth:$false -Identity:"CN=Fredrik Fredriksson,OU=Users,OU=Gothenburg,DC=LAB2,DC=LOCAL" -PasswordNeverExpires:$false -Server:"LAB2-DC1.LAB2.LOCAL" -UseDESKeyOnly:$false

Set-ADUser -ChangePasswordAtLogon:$true -Identity:"CN=Fredrik Fredriksson,OU=Users,OU=Gothenburg,DC=LAB2,DC=LOCAL" -Server:"LAB2-DC1.LAB2.LOCAL" -SmartcardLogonRequired:$false
