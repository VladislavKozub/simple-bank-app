0. Import assignment1.sql (if having troubles with hibernate)
1. Create DB user with admin rights or change properties
    db.username=springuser
    db.pwd=ThePassword
in ProjectDir\src\main\resources\application.properties and rebuild
2. Run the following command in the folder of application: java -jar "name of the jar file" (without "")
3. In your browser go to localhost:8080/ and you will be prompted to the login page of the application
4. The following accounts may be used:
    * Username: user
    * Password: user (has normal user rights)
  
    * Username: admin
    * Password: admin (has admin rights)
