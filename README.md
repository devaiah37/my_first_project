# First Assignment

## Introduction
Below are the instructions for this first assignment/mini-projet. The commands to execute are not explicitly mentioned but you should be able to find those informations online (such as how to git clone a project). Toward the end of the project, you will need to do more research to achieve the goals.

## Execution
This is an individual assignment, questions at the end of the assignment must be done individually. You can help each other in case you have issues in understanding but you must execute all actions indivudally.
You can reach out for help to Rajaneesh or me, or your respective manager.

## Prerequisites to install
- git bash
- IntelliJ Community Edition
- Docker (on Windows or on WSL if you have it)
- Java JDK 20 + Configure Windows "PATH"

### Optional, highly recommended:
- WSL (Ubuntu integrated in Windows and can be used as a terminal)

## Setting up your repository
1. Fork this project (top right corner of the page)
2. Go to the newly created project, from your personal account.
3. Clone it to your local laptop

## Runing your application
1. Open the project from IntelliJ by selecting the nested my_first_app folder as shown on this screenshot :

![](doc/project_location.png)

2. Go to File -> Project Structure -> Project Settings - Project -> SDK : Select Oracle OpenJDK version 20
3. Run MyApp
3. Check that you see a message "Hello World!" in the intellij console

## Pushing your change to your repository
### Setting up the github authentication
For an easy setup of github authentication, you can simply use gitbash. When you do your first push, it will ask for your username/password and memorize it.

Others options for authentication are below :
- SSH Authentication (! SSH is blocked on KG Guest network !) 
    1. Generate a key pair : https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent
    2. Add the public key (.pub file) to your Github ssh keys: https://docs.github.com/en/authentication/connecting-to-github-with-ssh/adding-a-new-ssh-key-to-your-github-account
    3. Test your setup : https://docs.github.com/en/authentication/connecting-to-github-with-ssh/testing-your-ssh-connection
    4. When pushing change, your ssh key will be automatically use to authenticate to your repo
- Token authentication
    1. Generate a token from https://github.com/settings/tokens
    2. Use is as a password when pushing change to your repo
### Pushing change to your repo
1. Add your first name to the "Hello World!" message, for example : "Hello World! This is Bastien".
2. Push the new change to your personal repository
    - Use an explicit commit message (for example "Customize Hello World message" and not "my commit")

## Making your project a maven and make a jar
1. Follow https://www.jetbrains.com/help/idea/convert-a-regular-project-into-a-maven-project.html
    - If you encounter some issues during the procedure, try restarting IntelliJ IDEA.
2. Generate the jar (as mentioned in the procedure)
3. Execute your generated jar from the terminal (cmd or other), check that "Hello World" is displayed
    - If you encounter some issue such as "com.nagra.MyApp" not found. Add this section in the build section of pom.xml for maven to identify your source code location:
    
           <sourceDirectory>main/src</sourceDirectory>
     

## Building a docker running your code
1. Build a docker image that will run your code, include your first name in the docker image.
2. Run a docker container from that image
3. Check that "Hello World" is displayed

## Adding functionnalities to your code
1. Include this lib through maven : https://mvnrepository.com/artifact/org.alcibiade/asciiart-core
2. Add code to convert a picture of your choice into ASCII character. For example I used the swiss flag and I got this output :
![](doc/sample_ascii_art_from_picture.png)
3. Make a jar and run the jar to see if you have the same output. Check that link below to generate a jar which includes the maven dependencies :
 https://stackoverflow.com/questions/574594/how-can-i-create-an-executable-runnable-jar-with-dependencies-using-maven
    - In a similar fashion as "Making your project a maven and make a jar" you might need to add this section in build part of pom.xml for maven to identify your resources file and package it in the jar.


            <resources>
                <resource>
                    <directory>main/resources</directory>
                </resource>
            </resources>

4. Re-build a docker image with the latest jar you have created and run the docker container to verify that your app is properly running.

## Sharing your docker image through a docker registry
1. Share your image to another person through dockerhub: https://docs.docker.com/get-started/04_sharing_app/
2. Ask that person to pull that image and run it, and compare the behavior of your container locally and the one running on your partner. The behavior should be the same.

 ## Deliverable
 At the end of the README.md, add those following elements :
 - A screenshot of your docker image and docker running (from the command line)
 - A screenshot of your app output
 - Answer to those questions :
    - What is the prerequisite for another machine to run your application if you provide it the docker image ?
        - In term of Operating System, pre-installed app, etc...
    - What is the difference between a virtual machine and a docker container ?
- Refer to https://www.markdownguide.org/basic-syntax/ to learn about markdown syntax (ie. how to include pictures)
## Deadline
Send me your git repo link on discord through direct message by **Friday, 21th April, 5pm**.

## Extra tasks
After you have sent me your git repo link and I have given you the green light, you can do the following tasks :
- Change your code to run indefinetly, printing the ascii art every 15 seconds. 
- While the container is running find a way to access the shell of the app.
- Change your code to display a different dad joke every 15 seconds (forever), fetching your jokes from https://icanhazdadjoke.com/api. Check the documentation on that website.
- Build and run the docker and check that you get a joke every 15 seconds.
