/* Queries*/
/* show all stduent data who are from raipur/bhopal/kanpur/bhilai
SELECT * FROM StudentData
WHERE Address="Raipur";
*/
/*show only stduent name and course who are from raipur
SELECT Name, Course FROM StudentData
WHERE Address="Raipur";
*/
/* show all student data whose course is Computer/engineer/maths
SELECT * from StudentData
WHERE course= "Maths";
*/
/* modifying table column
ALTER TABLE StudentData
MODIFY COLUMN Email VARCHAR(50);
*/
/*updating email
UPDATE StudentData 
SET email= "anjali.sharma@gmail.com"
WHERE Name="Anjali Sharma";
*/
/*
INSERT INTO StudentData
VALUES(16,"xyz","abc",5659,"cnjks@gmail.com","unknown");*/

/*delete from table
DELETE  from StudentData
WHERE name="xyz";
*/

 /*show data sorted according to course/name/ ascending/desc 

SELECT * FROM StudentData
ORDER BY course;

/*
SELECT * FROM StudentData
ORDER BY Address;
*/

/* show only first 10 entries
SELECT * FROM StudentData
LIMIT 10;
*/
/* select distinct course
Use sql_tutorial;
SELECT  distinct course FROM StudentData; */

/* select student who lives in raipur and course is computer
SELECT * from StudentData  WHERE Address="Raipur" AND Course="Computer";*/

/*select students who are from raipur OR whose course is Computer
SELECT * FROM StudentData WHERE Address="Raipur" OR Course="Computer"; */

/* select students who are outside  of chhattisgarh
select * from StudentData where not Address="Raipur" AND not Address="Bhilai" AND not  Address="Durg" and  not Address="Korba"; */
