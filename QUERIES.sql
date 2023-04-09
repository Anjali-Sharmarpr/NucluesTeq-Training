use practice;

/*find all female students
select * from student
where gender="F";*/

/*list names of students along with their courses
Select s_id,name,semester,Student.course_id,course_name from Student,Course where Student.course_id=Course.course_id;/*

ordered by name
Select s_id,name,semester,Course.course_id,course_name from Student,Course where Student.course_id=Course.course_id 
order by name; */

/* find information of all girls
 select s_id, name,semester,course_name,Faculty_name from Student ,Course,Faculty 
 WHERE Student.course_id=Course.course_id 
 AND Course.course_id=Faculty.faculty_id
 AND Student.gender="F"; */
 
 /* find students who don't enrolled in any course
 select * from Student  
 where course_id is NULL;  */
 
 /*list of students enrolled in medical/civil course
 select *  from Student 
 where Student.course_id in (
    select course_id from Course
    where course_name="Medical"
    ); */
 
 /* list of faculty who teaches medical/civil course
 select *  from Faculty 
 where faculty_id in (
    select course_id from Course
    where course_name="Medical"
    ); */
  
  /* list of course teaching by a apecific professor
select course_name from Course
where faculty_id in (
    select faculty_id 
    from Faculty 
    where faculty_name= "Vaibhavi Dwivedi"
    );
*/

/* course and faculty details where course id =5
select course_name ,Faculty.faculty_id,faculty_name,salary
from Course, Faculty
where Course.course_id =5 
and Faculty.faculty_id= Course.course_id; */

/* list of course along with their faculty
select course_name , faculty_name
from Course,Faculty
where  Faculty.faculty_id= Course.faculty_id; */

/* list of student name, course name and faculty name together 
select name, course_name,faculty_name
from Student, Course, Faculty
where Student.course_id=Course.course_id
and Faculty.faculty_id= Course.faculty_id 
order by s_id; */


