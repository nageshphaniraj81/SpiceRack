# SpiceRack
Open Source Test Automation Framework for all

Setup Spicerack:
Please follow below steps to setup spicerack automation framework :

To clone from github:
1.Login to github with your credentials and search for the repository  nageshphaniraj81/SpiceRack 
2.Open the repository nageshphaniraj81/SpiceRack & Click on fork button on the top right corner of the screen
3.Click on "Clone or download" button in Git and copy the download link , or copy the link given below
 https://github.com/nageshphaniraj81/SpiceRack.git
4.Open GitBash prompt (or similar Git management tool) and navigate to the folder where you want automation framework to be setup
Example: C:\Automation
5.Enter the command -  
git clone https://github.com/nageshphaniraj81/SpiceRack.git

To extract zip file:
1.Click on "Clone or download" button in Git and click on download zip
2.Extract the zip into the folder where you want automation framework to be setup
Example: C:\Automation

Opening the Maven Project in Eclipse:
1.Open Eclipse and in the create workspace dialog, enter the path of the spicerack project where you had copied the maven project earlier
 ( downloadload location\SpiceRack\GingerUI)
Example : C:\Automation\SpiceRack\GingerUI
2.Eclipse opens up the project and automatically starts building the project by downloading maven dependencies.
3.Open command prompt and navigate to the location ( downloadload location\SpiceRack\GingerUI\gingerui)
Example : C:\Automation\SpiceRack\GingerUI\gingerui
4.Enter the maven command :
mvn clean install -DSkipTests

Once the Build Passes with 0 Errors, you are good to start.


