Use Practice;

/*
CREATE TABLE Student (
  s_id INT PRIMARY KEY,
  name VARCHAR(40),
  gender VARCHAR(10),
  semester varchar(5),
  phoneNo varchar(10),
  email varchar(50),
  address varchar(50),
  course_id int 
);

CREATE TABLE Course (
 course_id int primary key,
 course_name varchar(40),
 faculty_id  int 
  
);

alter table Student
add foreign key(course_id) 
references Course(course_id)
on delete set NULL;

create table Faculty(
faculty_id int primary key,
faculty_name varchar(40),
gender varchar(5),
salary double

);
alter table Course
add foreign key(faculty_id)
references Faculty(faculty_id)
on delete set NULL;

INSERT into Student
VALUES (1,"Anjali Sharma", 'F',8,15653265,"anjali@gmail.com","Raipur",NULL);
select * from student;


update student
set course_id=1
where s_id=1;
*/





