# k-pac in k-pac sets

Project Description
-------------
This is a Spring-based web application. It allows you to create, read, and delete data relating to K-PACs (knowledge packages) and K-PAC Sets.

This app stores data about K-PACs and K-PAC Sets in a relational database managed by MySQL.

Features
-------------
You can perform the following operations:

Get a list of all knowledge packages (`GET: /kpacs`), create a knowledge package (`POST: /kpacs`), delete a knowledge package (`DELETE: /kpacs/{id}`).

Get a list of all knowledge package sets (`GET: /sets`), create a K-PAC Set (`POST: /sets`), delete a K-PAC Set (`DELETE: /sets/{id}`). 

Get a list of all knowledge packages attached to a K-PAC Set (`GET: /set/{id}`).

Technology Stack
-------------
- Java 11
- Spring (Core, Web, JdbcTemplate)
- MySQL
- Apache TomCat 9.0.50
- Maven

Getting Started
-------------
In order to run this application, install MySQL and Apache TomCat 9.0.50 on your computer and follow the instructions listed below:
1. Clone this project.
2. Create a schema and respective tables and fill these tables with data by running the scripts placed in `schema.sql` and `data.sql` files in the `resources` directory.
3. Create a connection to your database in the `resources` directory (`db.properties`) by using your credentials.
4. Configure TomCat. Use `/` as your application context path.
5. You can now run this application by using a TomCat local server.
6. Use Postman or any other software to send HTTP-requests and receive HTTP-responses.
