# Active Directory - Users and groups

## Table of content

- [Users to be added](#users-to-be-added)
- [Active Directory Users and Computers](#active-directory-users-and-computers)
- [Create Group](#create-group)
- [Add user to group](#add-user-to-group)
    - [First](#first)
    - [Second](#second)
    - [Third](#third)
    - [Verify that the user is added](#verify-that-the-user-is-added)
- [Create template user and add to a group](#create-template-user-and-add-to-a-group)
    - [Create template user](#create-template-user)
    - [Create user from template user](#create-user-from-template-user)
- [Add user with PowerShell](#add-user-with-powershell)
    - [New User](#new-user)
    - [Add user to a group](#add-user-to-a-group)
    - [All in one - Nicely formatted](#all-in-one---nicely-formatted)

# Users to be added

|First name | Last name   | User logon name   |
| --------- | ----------- | ----------------- |
| Adam      | Adamsson    | admadm            |
| Bengt     | Bengtsson   | benben            |
| Cesar     | Cesarsson   | cesces            |
| David     | Davidsson   | davdav            |
| Fredrik   | Fredriksson | frefre            |

Password: newPassword2021

# Active Directory Users and Computers

Open Active Directory Users and Computers in Server Manager:

![open_ad_users_and_computers](img/open_ad_users_and_computers.png)

## Create user

#### Step 1

![Step 1](img/users/step_1.png)

#### Step 2

![Step 2](img/users/step_2.png)

#### Step 3

![Step 3](img/users/step_3.png)

#### Step 4

![Step 4](img/users/step_4.png)

#### Step 5

![Step 5](img/users/step_5.png)

## Create Group

#### Step 1

![Step 1](img/groups/step_1.png)

#### Step 2

![Step 2](img/groups/step_2.png)

#### Step 3

![Step 3](img/groups/step_3.png)

## Add user to group

There are at least 3 ways to do it in the UI:

### First

#### Step 1

![a1](img/add_user_to_group/a1.png)

#### Step 2

![a2](img/add_user_to_group/a2.png)

### Second

#### Step 1

![b1](img/add_user_to_group/b1.png)

#### Step 2

![b2](img/add_user_to_group/b2.png)

#### Step 3

![b3](img/add_user_to_group/b3.png)

#### Step 4

![b4](img/add_user_to_group/b4.png)

### Third

#### Step 1

![c1](img/add_user_to_group/c1.png)

#### Step 2

![c2](img/add_user_to_group/c2.png)

#### Step 3

![c3](img/add_user_to_group/c3.png)

#### Step 4

![c4](img/add_user_to_group/c4.png)

#### Step 5

![c5](img/add_user_to_group/c5.png)

#### Step 6

![c6](img/add_user_to_group/c6.png)

### Verify that the user is added

#### Step 1

![c1](img/add_user_to_group/c1.png)

#### Step 2

![c6](img/add_user_to_group/c6.png)

## Create template user and add to a group

### Create template user

#### Step 1

![p1](img/create_template_user/p1.png)

#### Step 2

![p2](img/create_template_user/p2.png)

#### Step 3

![p3](img/create_template_user/p3.png)

#### Step 4

![p4](img/create_template_user/p4.png)

#### Step 5

![p5](img/create_template_user/p5.png)

#### Step 6

![p6](img/create_template_user/p6.png)

#### Step 7

![p7](img/create_template_user/p7.png)

### Create user from template user

#### Step 8

![p8](img/create_template_user/p8.png)

#### Step 9

![p9](img/create_template_user/p9.png)

#### Step 10

![p10](img/create_template_user/p10.png)

#### Step 11

![p11](img/create_template_user/p11.png)

#### Step 12

![p12](img/create_template_user/p12.png)

#### Step 13

![p13](img/create_template_user/p13.png)

## Add user with PowerShell

### New User

Create a new user "Cesar Cesarsson":

```powershell
New-ADUser -DisplayName "Cesar Cesarsson" -Name "Cesar Cesarsson" -GivenName "Cesar" -Surname "Cesarsson" -SamAccountName "cesces" -UserPrincipalName "cesces@lab2.local" -AccountPassword(Read-Host -AsSecureString "Input Password") -Enabled $true -ChangePasswordAtLogon $true
```

### Add user to a group

```powershell
Add-ADGroupMember -Identity Marketing -Members cesces
```

### All in one - Nicely formatted

Create a new user "David Davidsson":

```powershell
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
```

### Add user script from ADAC

This script was provided when I added "Fredrik Fredriksson" in "Active Directory Administrative Center":

```powershell
New-ADUser -DisplayName:"Fredrik Fredriksson" -GivenName:"Fredrik" -Name:"Fredrik Fredriksson" -Path:"OU=Users,OU=Gothenburg,DC=LAB2,DC=LOCAL" -SamAccountName:"frefre" -Server:"LAB2-DC1.LAB2.LOCAL" -Surname:"Fredriksson" -Type:"user"

Set-ADAccountPassword -Identity:"CN=Fredrik Fredriksson,OU=Users,OU=Gothenburg,DC=LAB2,DC=LOCAL" -NewPassword:"System.Security.SecureString" -Reset:$true -Server:"LAB2-DC1.LAB2.LOCAL"

Enable-ADAccount -Identity:"CN=Fredrik Fredriksson,OU=Users,OU=Gothenburg,DC=LAB2,DC=LOCAL" -Server:"LAB2-DC1.LAB2.LOCAL"

Add-ADPrincipalGroupMembership -Identity:"CN=Fredrik Fredriksson,OU=Users,OU=Gothenburg,DC=LAB2,DC=LOCAL" -MemberOf:"CN=Marketing,CN=Users,DC=LAB2,DC=LOCAL" -Server:"LAB2-DC1.LAB2.LOCAL"

Set-ADAccountControl -AccountNotDelegated:$false -AllowReversiblePasswordEncryption:$false -CannotChangePassword:$false -DoesNotRequirePreAuth:$false -Identity:"CN=Fredrik Fredriksson,OU=Users,OU=Gothenburg,DC=LAB2,DC=LOCAL" -PasswordNeverExpires:$false -Server:"LAB2-DC1.LAB2.LOCAL" -UseDESKeyOnly:$false

Set-ADUser -ChangePasswordAtLogon:$true -Identity:"CN=Fredrik Fredriksson,OU=Users,OU=Gothenburg,DC=LAB2,DC=LOCAL" -Server:"LAB2-DC1.LAB2.LOCAL" -SmartcardLogonRequired:$false
```
