Required Softwares to be installed on your machine
1. Java
2. Maven

This project includes following scenarios which are automated
1. Login
2. Sign Up
3. Add to cart
4. Invalid login

Folder Structure as follows
1. Pages: Pages folder contains the locaters and their actions for each individual web page.
2. Runner: Runner helps us to run the feature files for BDD framework
3. Step Definations:  Step Definations contains the functions for defining the steps that will be used in feature file
4. Features: Features folder contains our test scenarios

POM.xml: this file contain all the dependencies that are required to compile and execute our test scenarios

Run: 
To run the test scripts, following command have to be executed in the terminal. This command will execute all the dependant jars at first run and will execute the test scenarios.

mvn clean test
