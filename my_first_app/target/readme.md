DOCKER IMAGES
![DockerImages](https://user-images.githubusercontent.com/129824904/234293058-f3fa6d8a-4012-4164-96fc-8881ce008891.png)

DOCKER CONTAINER RUNNING
<img width="960" alt="dockerRun" src="https://user-images.githubusercontent.com/129824904/234293073-b46b9126-176b-4963-ad31-63730c4715a9.PNG">

MyApp.java OUTPUT
![AppOutput](https://user-images.githubusercontent.com/129824904/234293075-47a0303f-740a-4459-b90b-c4a5694ed1db.png)

**1)What is the prerequisite for another machine to run your application if you provide it the docker image ?**
To run a Docker image on another machine, the machine must have the Docker Engine installed, which is available for different operating systems such as Windows, macOS, and Linux. The machine should also have enough resources like CPU, memory, and disk space to run the container. The resource requirements depend on the application and its dependencies.

**What is the difference between a virtual machine and a docker container ?**
A virtual machine is a software version of a physical machine that operates independently and has its own OS, kernel, drivers, and libraries. It requires a hypervisor to emulate the underlying hardware and runs in isolation from the host machine.
However, a Docker container shares the kernel and resources of the host OS, but provides a separate environment for running applications. It uses fewer resources than a virtual machine and can be started and stopped more quickly.
