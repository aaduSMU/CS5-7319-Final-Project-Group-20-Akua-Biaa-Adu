# CS5-7319-Final-Project-Group-20-Akua-Biaa-Adu
CS5/7319 Final Project Group 20
1. This web application can be run in IntelliJ IDE on java 11 SDK (no earlier version). IntelliJ Community and Java SDK can be downloaded at https://www.jetbrains.com/edu-products/download/other-IIE.html and https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html respectively.
2. To compile the code simply open in IntelliJ IDE and compilation will be stright forward. Default dependencie should work if all project files are imported into the IDE (via the pow.xml file - import as project)
3. Execute the system by running the main program - KairosWebServer.java Listen via localhost:8080 and update kairos-application-context.xml with email and password to recieve email.
4. Different archetecture styles used was:
   # Event - Based Architecture
   Though components such as PointsData, etc. can easily be reused, having one event bus leads to an overload of too many events to manage/keep under control. Also this nature makes it challenging to upgrade due to the single event bus (many interconnected components in one bus).
   # REST API Architecture
   Though latency is caused by multiple complex query requests to different endpoints when there are network delays, this architecture combines multiple architectural styles such as layered architecture and client-server architecture for better management of send and receipt of messages across components. Also, it is   
   very scalable with an ease to add more servers to handle increased load (Easier to upgrade). Due to standard REST principles and HTTP methods like GET, POST, PUT, DELETE, its straightforward to design, implement, and maintain
   # Rationale
   - The chosen architecture allowed for different and a variety of data formats to send and receive messages such as JSON, XML, HTML, etc. which makes it very flexible when the clients and servers agree on the format.
   - The chosen architecture could allow to scale up by the addition of servers if I wanted to expand the functionality or the productivity tracking application. (with one event bus scalability is harder since components and respective messages could be intertwined within that single bus)
   - The combination of different architectural styles allows for less limitation for the application and more close communication between components. (having one event bus wouldn’t have provided this opportunity)
