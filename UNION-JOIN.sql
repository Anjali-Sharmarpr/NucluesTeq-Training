/* alias the column name*/

select name as StudentName
from  Student; 

/* union - results comes in single coumn */
select name as StudentName 
from Student
union 
select course_name asCourseName
from Course; 

select Course.course_name ,Course.course_id
from Course
union all
select Faculty.faculty_name,Salary
from Faculty; 

/* INNER JOIN selects records that have matching values in both tables */

SELECT Student.s_id,Student.course_id, Course.course_name  
FROM Student  
INNER JOIN Course
ON Student.course_id = Course.course_id; 


Select faculty_name,course_name
from Faculty
inner join Course
on Faculty.faculty_id=Course.faculty_id;  */


/*LEFT JOIN returns all the values from left table and the matching values from the right table. 
If there is no matching join value, it will return NULL. */

SELECT Student.s_id,Student.course_id, Course.course_name  
FROM Student  
left JOIN Course
ON Student.course_id = Course.course_id
order by s_id; 

/*RIGHT JOIN returns all the values from the values from the rows of right table and the matched values from the left table. 
If there is no matching in both tables, it will return NULL. */

SELECT Student.s_id,Student.course_id, Course.course_name  
FROM Student  
right JOIN Course
ON Student.course_id = Course.course_id
order by s_id;  

/*FULL JOIN is the result of a combination of both left and right outer join. 
Join tables have all the records from both tables. It puts NULL on the place of matches not found */

SELECT Student.course_id, Course.course_name  
FROM Student  
full JOIN Course
ON Student.course_id = Course.course_id;






