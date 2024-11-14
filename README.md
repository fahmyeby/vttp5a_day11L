"# vttp5a_day11L" 

#Git Commands
In project root folder: 
git init

Add files to staging: 
git add *

Commit files to local repo: 
git commit -m "message"

Change branch: 
git branch -M main

Link remote repo to local repo: 
git remote add origin

Push code from local repo to remote repo: 
git push -u origin main

#Maven
In project root folder
mvnw.cmd clean

Package the compiled bytecode classes into jar/war file
./mvnw package
mvnw.cmd package

Delete target, redownload dependencies, recompile to class files, package to jar/war
./mvnw clean package
mvnw.cmd clean package

Run the application in embedded localhost server
./mvnw spring-boot:run mvnw.cmd spring-boot:run

