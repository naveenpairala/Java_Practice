--create table student(sid int, fname varchar(10),lname varchar(6),sage int,semail varchar(20),sgender varchar(2),sadd varchar(10),srollno int);
--create table deptDetails(did int,deptname varchar(10),createddate DATE);
--create table subjectdeptdetails(subjectid int,subject varchar(10),deptid int);
--create table marks(smid int, studentid int, subjectid int,marks int, percentage float);
--create table studentdeptdetails(sdeptid int, studentid int,deptid int);
--insert into student values(1,"naveen","pairala",23,"gmail1.com","m","hyd",1234),(2,"karthik","pairala",24,"gmail2.com","m","wrngl",234),(3,"tharun","pairala",20,"gmail3.com","m","bhpl",5353),(4,"raju","teretj",25,"gmail4.com","m","mulugu",5454);
 --select *from student;
--insert into deptDetails values(1,'EEE','2019-12-08'),(2,'ECE','2018-12-04'),(3,'CSE','2017-10-03');
--select *from deptDetails;
--insert into subjectdeptdetails values(1,'python',1),(2,'java',1),(3,'.net',1);
--select *from subjectdeptdetails;
--insert into marks values(1,1,1,55,85.3),(2,2,2,75,90.4),(3,3,3,65,70.1),(4,4,4,86,75.4);
 --select *from marks
--insert into studentdeptdetails values(1,1,1),(2,2,1),(3,3,1);
--select *from studentdeptdetails;
--select studentid from studentdeptdetails;
--select *from student where sage>20;
--select *from student where sid<10;
--select *from student where sid=1 or sid= 3 or sid=4;
--select *from student where sid>1 and sid<4;
--update student set fname="vijay" where sid=1;
--update deptDetails set deptname="mech" where did=3;
--update student set sage=20 where sid=1 or sid=2 or  sid=3;
--delete from deptDetails where deptname=null;
--select *from student where fname!=null;
--select distinct sage from student;
--select max(marks) from marks;
--select *from student order by srollno desc;
--select *from student order by sid ;
--select *from student order by fname;
--update student set sage=20 where fname like "k%";
--select sage from student where fname like "%u";
--delete from student where fname like "r%";
--select *from student where sage between 20 and 25 group by fname like "k%";
--select max(marks),studentid from marks;
--select *from student order by srollno desc;
--select count(sage) from student where sage<21;
--select max(sage),fname from student group by fname;
--select sum(marks),smid from marks group by smid;
--select max(marks),smid from marks group by smid having sum(marks)>55;
--select min(marks),smid from marks group by smid having sum(marks)>70;
--select max(marks),smid from marks group by smid having sum(marks)>55 and fname like "n%";
--select *from subjectdeptdetails group by subject like "p%" and deptid in(1,2,3);
--select count(sgender) from student droup by sgender='m';
--select count(fname) from student group by sadd having count(sadd)=1;








