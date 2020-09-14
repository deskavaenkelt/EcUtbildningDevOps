# Install Java
Instructions for our class to get going.
Original instructions https://aws.amazon.com/corretto/

## Download
Latest Amazon Corretto 11 JDK and save in `Downloads` folder
https://corretto.aws/downloads/latest/amazon-corretto-11-x64-linux-jdk.deb

## Install manually (Debian)
Run commands below in order
1. `sudo apt-get update && sudo apt-get install java-common`
2. `cd Downloads`
3. `sudo dpkg --install java-11-amazon-corretto-jdk_11.0.8.10-1_amd64.deb`
    - or type
    - `sudo dpkg --install java` 
    - and "tab" to autocomplete filename if the version differ from mine

## Verify Installation
`java --version`
expected output:

![java_version_output]

If you see a version string that doesn't mention Corretto, run the following command to change the default java or javac providers.

### Java
`sudo update-alternatives --config java`
I have 2 versions installed and choose alternative 1.
![choose_java_version]

### Javac
`sudo update-alternatives --config javac`
Here I only have 1 version installed so i don't need to chose anything.
![choose_javac_version]

## Uninstall a Java version
`sudo dpkg --remove java-11-amazon-corretto-jdk` for amazon corretto
`sudo dpkg --remove java-xxx` repalce xxx with the version you wish to uninstall.

# Add to PATH
## Bash
1. `sudo nano /etc/environment`
    - Add the following line, at the end of the file:
    - `JAVA_HOME="/usr/lib/jvm/java-11-amazon-corretto"`
    ![sudo_nano_etc_enviroment]
    - `ctrl-s`
    - `ctrl-x`
2. `source /etc/environment`
3. `echo $JAVA_HOME`
    - Expected output
    - `/usr/lib/jvm/java-11-amazon-corretto`

# Add path to Visual Studio Code
Open Visual Studio Code

## Add Java extension
Install Java Extension Pack from extensions tab
![vscode_java_extension_pack]

## Edit path to java.home
Open settings
![vscode_preferences_settings]

serach for `java.home` click on `Edit in settings.json`
![settings_java_home]

You can see the path to all installed Java Versions with the command: `ll /usr/lib/jvm/`

If you have the line `"java.home": "",` add `/usr/lib/jvm/java-11-amazon-corretto/` inside the `""`

Else you can add this line `"java.home": "/usr/lib/jvm/java-11-amazon-corretto/",`

When done it should lock something like this:
![settings_java_home_contains]

### Restart Visual Studio Code!

# Run a java program
Create a new file in Visual Studio Code.
![vscode_new_file]

Write code to print hello to console
![vscode_hello_source]

Run program by clicking `F5` on keybord or click `Run` between row 3 and 4.
![vscode_hello_run]

# Install IntelliJ IDEA Community
[Link to Jetbrains Toolbox App download page](https://www.jetbrains.com/toolbox-app/)
![Download IntelliJ IDEA](img/jetbrains/jetbrains_download_toolbox.png)
![Save file](img/jetbrains/jetbrains_save_file.png)

Open your Home folder

![](img/jetbrains/jetbrain_open_package.png)

Double-click on the file

![](img/jetbrains/jetbrains_extract_steps.png)

Close window

![](img/jetbrains/jetbrains_extract_close.png)

Double click on installer

![](img/jetbrains/jetbrains_double_click_installer.png)

Agree to License Agreement 
![](img/jetbrains/jetbrains_license.png)

Install IntelliJ IDEA Community Edition
![](img/jetbrains/jetbrains_install_community_edition.png)

## Intellij first start and settings
Start IntelliJ via Toolbox in the menu

![](img/intellij/intellij_start.png)

Agree to Privacy Policy

![](img/intellij/intellij_agreement.png)

Data Sharing, choose one

![](img/intellij/intellij_data_sharing.png)

Choose a Theme

![](img/intellij/intellij_first_start.png)

Next

![](img/intellij/intellij_first_start_plugins.png)

Install the 2 marked plugins
![](img/intellij/intellij_first_start_plugins2.png)

IntelliJ Home Screen, update plugins
![](img/intellij/intellij_home_screen.png)

Click on Update all and OK
![](img/intellij/intellij_home_screen_update_all.png)

Install additional plugins
![](img/intellij/intellij_install_additional_plugins.png)

Plugins I like to use, install all marked if you want to, then press ok and restart IntelliJ
![](img/intellij/intellij_recommended_plugins.png)

If you installed the recommended plugins you will se this screen
![](img/intellij/intellij_meterial_ui.png)

I like Oceanic Theme
![](img/intellij/intellij_meterial_ui_oceanic.png)

I don't touch any other settings so for me I'll just choose Next on everything.
![](img/intellij/intellij_meterial_ui_next_1.png)
![](img/intellij/intellij_meterial_ui_next_2.png)
![](img/intellij/intellij_meterial_ui_next_3.png)
![](img/intellij/intellij_meterial_ui_next_4.png)

After installation, you will be att the start screen
![](img/intellij/intellij_home_screen_2.png)






[java_version_output]: img/java/java_version.png "Java version output"
[choose_java_version]: img/java/choose_java_version.png "Choose Java version"
[choose_javac_version]: img/java/choose_javac_version.png "Choose Javac version"
[sudo_nano_etc_enviroment]: img/java/sudo_nano_etc_enviroment.png "Sudo   Nano /etc/enviroment"

[vscode_java_extension_pack]: img/vscode/vscode_java_extension_pack.png "Java Extension Pack"
[vscode_preferences_settings]: img/vscode/vscode_preferences_settings.png "Settings in VS Code"
[settings_java_home]: img/java/settings_java_home.png "Settings java.home"
[settings_java_home_contains]: img/java/settings_java_home_contains.png "settings.json"

[vscode_new_file]: img/vscode/vscode_new_file.png "vscode_new_file"
[vscode_hello_source]: img/vscode/vscode_hello_source.png "vscode_hello_source"
[vscode_hello_run]: img/vscode/vscode_hello_run.png "vscode_hello_run"

