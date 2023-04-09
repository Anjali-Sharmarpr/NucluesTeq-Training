Use sql_tutorial;

/*CREATE TABLE StudentData(
ID INT PRIMARY KEY,
Name VARCHAR(20),
Course VARCHAR(20),
PhoneNumber INT,
Email VARCHAR(20),
Address VARCHAR(50)
 );*/
 
 /*
  INSERT INTO StudentData
 VALUES(1,"Anjali Sharma", "Computer",125467893,"akjdsjdm@gmail.com","Raipur");*/
 /*
 INSERT INTO StudentData
 VALUES (2,"Pooja Sharma", "Medical",15653265,"nkjdhkd@gmail.com","Raipur"),
        (3,"Jaya Sharma", "Arts",15456456,"hwgdyu@gmail.com","Raipur"),
        (4,"Anil Sharma", "Civil",24656412,"gsfrtfdd@gmail.com","Raipur"),
        (5,"Tanisha Sharma", "BioTech",156325,"fcsgsss@gmail.com","Kanpur"),
        (6,"Krishna Sharma", "Maths",7979635,"cgasfaa@gmail.com","Kanpur"),
        (7,"Vanshika Sharma", "Computer",74656554,"ahgdydgw@gmail.com","Bhilai"),
        (8,"Khushi Yadav ", "Maths",7964487,"lskwowkws@gmail.com","Bhopal"),
        (9,"Isha Mishra", "Engineer",79433165,"kaliowqtqg@gmail.com","Bhilai"),
        (10,"Tulsi Dewangan", "Civil Service",79466514,"atrwtgwqf@gmail.com","Durg"),
        (11,"Harshita Pillai", "Management",79436514,"iuwiuwisb@gmail.com","VishakahaPatnam"),
        (12,"Adabala Navneeta", "Management",78943651,"yuwhsw@gmail.com","VishakhaPatnam"),
        (13,"Abhay Gupta", "Engineer",798641354,"uiysmjk@gmail.com","Korba"),
        (14,"Abhinandan Adhikari", "Computer Science",2364781,"twytqst@gmail.com","Korba"),
        (15,"Nachiketa Mohanty", "Civil Service",76134891,"owiwosqa@gmail.com","Bhopal");
  
  SELECT *from StudentData;
*/

/*DROP TABLE Course;*/
/*
CREATE TABLE Course(
Course_ID INT PRIMARY KEY,
Course VARCHAR(20),
ID INT ,
CourseFaculty VARCHAR(20),

FOREIGN KEY (Course_ID) REFERENCES StudentData(ID)

);
*/
INSERT INTO Course
VALUES (1,"Arts",3,"Ram Sir"),
       (2,"BioTech",5,"Geeta Mam"),
       (3,"Civil",4,"Mohan Sir"),
       (4,"Civil Service",10,"Dharma Sir"),
       (4,"Civil Service",15,"Dharma Sir"),
       (5,"Computer",1,"Soni Mam"),
       (5,"Computer",7,"Soni Mam"),
       (6,"Computer Science",14,"Shyam Sir"),
       (7,"Engineer",9,"Guru Sir"),
       (7,"Engineer",13,"Guru Sir"),
       (8,"Management",11,"Shaalu Mam"),
       (8,"Management",12,"Shaalu Mam"),
       (9,"Maths",6,"Aditya Sir"),
       (9,"Maths",8,"Aditya Sir"),
       (10,"Medical",2,"Reena Mam");
       

