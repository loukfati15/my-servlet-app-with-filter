#!/bin/bash

cd my-servlet-app
mvn clean install

# Source file path
source_file="C:\Users\LOUKILI\Desktop\GIT\my-servlet-app-with-filter\my-servlet-app\target\my-servlet-app-1.0-SNAPSHOT.war"

# Destination directory path
destination_directory="C:\apache-tomcat-9.0.85\apache-tomcat-9.0.85\webapps/"

# Copy the file to the destination location
cp "$source_file" "$destination_directory"

echo "war deployed to tomcat"
