/* count no of students/course/faculty */
select COUNT(s_id) 
from Student;


/* no of female/ male students/faculty */
select count(faculty_id)
from Faculty
where gender="M"; 

/* no of faculty whose salary is more than 20000 */
select count(faculty_id)
from Faculty
where salary >20000; 


select sum(salary)
from Faculty;

select avg(salary)
from Faculty;

select min(Salary)
from Faculty;

select max(Salary)
from Faculty;


/* no of female and male at same time */
select gender ,count(s_id)
from student
Group by gender; 

/* distinct courses from students*/
select count(distinct course_id)
from Student; 


