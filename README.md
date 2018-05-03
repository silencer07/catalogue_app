# Catalogue Application

## Tech Stack
1. Spring 3 MVC
2. JSP
3. Hibernate  3
4. Maven
5. MySQL

## Setup MySQL using Terminal
1. Make sure you have installed and connected to mysql server -- (Installed using Homebrew): `mysql -v -u<username> -p<password>`
2. Create database: `CREATE DATABASE CATALOGUE;`
3. Use database: `use CATALOGUE;`
4. Create Apparels Table:
```
		CREATE TABLE APPARELS
		(
		    id       INT PRIMARY KEY AUTO_INCREMENT,
		    name    VARCHAR(30),
		    price    INT,
		    stock   INT
		)
```

## Import and Run Project Using Eclipse
1. Clone this repository: `git clone git@github.com:anaya-seertech/catalogue_app.git`
2. Open Eclipse IDE(Neon 3)
3. Select File then Open Projects from File System...
4. Click Director then select cloned folder(catalogue_app)
5. Right click project name(catalogue_app) in the Project Explorer then select Run As > Run on Server(Make sure you have Apache Tomcat Installed)