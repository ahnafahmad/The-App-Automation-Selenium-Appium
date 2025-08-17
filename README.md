# The-App-Automation-Selenium-Appium

### This project automates “The App” APK by writing test cases using Selenium, Appium, and TestNG with Java as the programming language. The automation covers three key functionalities of the mobile application using the Page Object Model (POM) for better maintainability and reusability.

### The following tasks are done:
- <b>Clipboard Demo</b> – Perform clipboard copy-paste functionality twice.
- <b>List Demo</b> – Select any 2 list items.
- <b>Picker Demo</b> – Select any 2 picker values.

## Technology: </br>
- <b>Programming Language:</b> Java
- <b>Automation Tools:</b> Selenium, Appium
- <b>Automation Tools:</b> Selenium, Appium
- <b>Mobile Testing Tools:</b> Android Studio, Appium Inspector
- Test_Runner: Appium

## Prerequisites</br>
- Install <b>Android Studio</b> (latest version)
- Install <b>Appium</b> Server (1.17.1 or later)
- Install <b>Java JDK 8</b> or any LTS version
- Install <b>Maven/Gradle</b> (project build tool)
- Configure environment variables: **ANDROID_HOME**, **JAVA_HOME** and **GRADLE_HOME**
- Stable internet connection

### Dependencies
```   
implementation group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '4.25.0'
```
```   
testImplementation group: 'org.testng', name: 'testng', version: '7.10.2'
```
```   
implementation group: 'io.appium', name: 'java-client', version: '9.3.0'
```

## Project Run

### Appium
- Turn on **Developer Options** on your android phone
- Connect your android phone with USB cable/ Create an emulated virtual device via Android Studio and run it.
- Open cmd and give ```adb devices``` command to get uuid.
- Open Appium and start server. Then open inspector tool.
- In the **JSON Representation** section, paste the following desired capabilities after adding your uuid and version:
```
  "deviceName": "My Device",
  "platformName": "Android",
  "platformVersion": Enter your Android version,
  "appPackage": "com.appiumpro.the_app",
  "appActivity": "com.appiumpro.the_app.MainActivity",
  "app": your app location,
  "automationName": "UiAutomator2",
  "disableIdLocatorAutocompletion": true,
```
- Click **Start Server**.

## Java IDE
- Clone this Project [The-App-Automation-with-Selenium-Appium](https://github.com/ahnafahmad/The-App-Automation-Selenium-Appium.git)

## Test Cases Automated
- <b>ClipboardDemoTest:</b> Perform clipboard copy-paste twice to validate repeatability.
- <b>ListDemoTest:</b> Select and validate any two list items.
- <b>PickerDemoTest:</b> Select and validate any two picker values.

