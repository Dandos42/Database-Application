# Security Database Systems

## Description
This application is the result of a semester-long project aimed at designing, managing, and integrating a relational database with a graphical user interface. The project is divided into three main phases: from creating the database schema, through writing advanced SQL scripts, to the final integration with the application. The database is designed in at least third normal form and contains at least 12 related tables.

## Main functions
, The application includes a login window that actually validates the username and password against the database.
, User passwords are securely stored in the database in hashed form using recommended algorithms such as Argon2 or PBKDF2.  
, The system provides full-featured CRUD operations (create, read, update, delete) for selected entities directly within the graphical interface.  
, Data filtering is implemented, such as searching for people by last name.  
, More complex operations are executed within a single transaction, and a rollback occurs in case of failure.  
, The application is protected against SQL injection attacks through the use of PreparedStatements.  
, Runtime errors and exceptions are properly logged with daily archiving (e.g., using SLF4J Logback).

## Applications and libraries
. Database: PostgreSQL
. Application: Java desktop application (Swing/JavaFX)
. Build: Maven tool for command-line compilation.  

