PS: You wonder why i have 3 commits, well i commited the second step (step 2.0) when i finished it. 
Then i upgraded my app and modified some files thats the step 2.

STEP1 : 
- 2 classes created book and main where i dit the total price
STEP2 :
- I created another class user and command with some methodes

Creating Database: 
To connect Java application with the MySQL database, we need to follow the following steps.

In this example we are using MySql as the database. So we need to know following informations for the mysql database:

Driver class: The driver class for the mysql database is com.mysql.jdbc.Driver.
Connection URL: The connection URL for the mysql database is jdbc:mysql://localhost:3306/test where jdbc is the API, mysql is the database, localhost is the server name on which mysql is running, we may also use IP address, 3306 is the port number and sonoo is the database name. We may use any database, in such case, we need to replace the sonoo with our database name.
Username: The default username for the mysql database is root.
Password: It is the password given by the user at the time of installing the mysql database. In this example, we are going to use root as the password.
Two ways to load the jar file:
Paste the mysqlconnector.jar file in jre/lib/ext folder
Set classpath
Paste the mysqlconnector.jar file in JRE/lib/ext folder
Download the mysqlconnector.jar file. Go to jre/lib/ext folder and paste the jar file here
Go to environment variable then click on new tab. In variable name write classpath and in variable value paste the path to the mysqlconnector.jar file by appending mysqlconnector.jar;.; as C:\folder\mysql-connector-java-5.0.8-bin.jar.

And finnaly just aded my CRUD mehtodes.
