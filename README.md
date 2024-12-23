# BoubyanMobileAutomationTask
This is task for Boubyan Company

1-Task includes Android application only using appium and Java.
2-Project can be run from "Demo Task.java" or from "testng.xml".
3-Project is implemented with POM mode, files are as follow:
-For intializing capibilities, launch application, quit application,.. etc. Base Test file is created in "src/test/java/baseTest" file.
-Pages' files for identifying all locators and methods related to its specific page are creted on separate pages' files in "src/main/java/"
-Test class is created with All test methods for all login cases in "src/test/java/DemoTask"
4-Allure report is integrated and reports generated successfully.
5-You can generate allure reports using cmd from "Root of project file", please use the following commands to generate the report: "allure serve allure-results"
if you faced any issue while generating the report like the following error "allure-results does not exist
Report successfully generated to C:\Users\user\AppData\Local\Temp\14569219447688210395\allure-report
Starting web server...
2024-12-23 20:27:06.772:INFO::main: Logging initialized @1652ms to org.eclipse.jetty.util.log.StdErrLog
Server started at <http://192.168.100.6:51918/>. Press <Ctrl+C> to exit
Terminate batch job (Y/N)? y"
-you might need to run this command first: "allure generate allure-results -o allure-report"
-If you want to run the command through user cmd instead of file root you will need to add the absoulute path of allure results directory.
6-POM file contains all dependecies and plugins needed
