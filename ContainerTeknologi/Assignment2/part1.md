# Part 1

### What is Docker (platform)?

Docker is an open source containerization platform. It enables developers to package applications into
containers—standardized executable components combining application source code with the operating system (OS) libraries
and dependencies required to run that code in any environment.

### What is a Docker Image and how does one relate to Docker Containers?

A Docker image is a read-only template that contains a set of instructions for creating a container that can run on the
Docker platform. It provides a convenient way to package up applications and preconfigured server environments, which
you can use for your own private use or share publicly with other Docker users.

### What does container technology mean?

Container technology, also simply known as just a container, is a method to package an application, so it can be run,
with its dependencies, isolated from other processes. Container technology gets its name from the shipping industry.

### What is the Docker Registry?

A registry is a storage and content delivery system, holding named Docker images, available in different tagged
versions. Users interact with a registry by using docker push and pull commands.

### What is the Docker Linux Kernel job description (what does it do and how does it work)?

The Docker technology uses the Linux kernel and features of the kernel, like Cgroups and namespaces, to segregate
processes, so they can run independently. This independence is the intention of containers—the ability to run multiple
processes and apps separately from one another to make better use of your infrastructure while retaining the security
you would have with separate systems.

### How can Docker and Docker Containers be compared to ship transport?

Imagine that you have a company in Europe and you want to transport your products to China by sea. So, you can find a
ship with the adequate size and load the Ship with your cargo.

__Metaphor: In the software world, the ship is your Server.__

In a local trading association you find out that other companies are also sending products to China and you all can use
a bigger Ship and send your products together to save some money.

__Metaphor: Here, the big Ship is your server and the smaller ships are virtual machines. In this case, we have multiple
Ships with all the capabilities to travel to China, but they are all constrained to the capacity and limitations of the
big ship.__

If we have a big ship we load the ship with the cargo of every company.

__Metaphor: In software, you are now loading the Server with containers. Containers will guarantee you that the software
is isolated, protected and that a Container will take care what it needs, not the ship. Other benefit is that Containers
are immutable so you can be pretty sure that your container won't be violated.__

### What happens when we have a Docker file and run `docker build .`? Go through the build process

Create a file named `Dockerfile` in the same folder as the content for the container with the following contents.

This command used the Dockerfile to build a new container image. You might have noticed that a lot of “layers” were
downloaded. This is because we instructed the builder that we wanted to start from (for example) the node:12-alpine
image. But, since we didn’t have that on our machine, that image needed to be downloaded.

After the image was downloaded, we copied in our application and used yarn/npm to install our application’s
dependencies. The CMD directive specifies the default command to run when starting a container from this image.
