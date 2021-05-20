# file-upload-autoIt-selenium
AutoIt is a scripting language implemented for windows GUI automation. Using the combination of simulated keyboard, mouse movement, and window/control manipulation to automate tasks not possible using only selenium.  So use of AutoIt tool, We will Uploading &amp; Downloading the files in Selenium.

## Prerequisites
* Java as the programming language
* AutoIT as the automation tool
* Maven as the build tool
* WebDriver as the browser automation tool
* IntelliJ as the IDE

## Upload the file using AutoIt Script in Selenium WebDriver
* Open the Programs – Autoit tool – SciTE Script Editor and include the below mentioned AutoIt script in Autoit editor and save it as ‘UploadFile.au3’ in your system.
* Convert it as ‘UploadFile.exe’.
* Run the Selenium Script.

## AutoItScript
  ControlFocus("Open","","Edit1")
  ControlSetText("Open","","Edit1","C:\Users\PrajjawalK\Music\check\visit.pdf")
  ControlClick("Open","","Button1")
  
## Execution Steps
* Complete the installation of AutoIT
* Add the AutoIT script in SciTE application.
* Clone the Repo.
* Run the selenium script in window machine.
