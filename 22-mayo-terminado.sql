/*

En este contexto, la relación entre las tablas schools y students 
es una relación de uno a muchos. Esto significa que
 un solo registro en la tabla schools (una escuela)
  puede estar asociado con muchos registros en la tabla students
   (muchos estudiantes), 
pero cada estudiante está asociado con una sola escuela.
*/

/*
DELETE FROM table
WHERE Name = "Pedro";
*/
create table school(
id  int primary key not null,
nombre varchar(45) not null,
created_at date not null,
updated_at date  default (current_date)
);

create table student(
id int primary key ,
first_name varchar(45),
last_name varchar(45),
age int,
created_at date,
updated_at date default (current_date),
fk_school_id int,
foreign key (fk_school_id) references school(id)
);
drop table  school;

/*
crear 3 school
*/
insert into school (id, nombre, created_at) values
(1, 'Blue school', '2024-05-22'),
(2, 'Red school', '2024-05-22'),
(3, 'Green school', '2024-05-22');

/*Consulta todos los school*/
select * from school;
show columns from school;
/*
crear 2 student por school
*/
 
insert into student (id, first_name, last_name, age, created_at, updated_at, fk_school_id) values
(1, 'Leo', 'Nakamura', 25, '2024-05-22', '2024-05-22', 1),
(2, 'Ryu', 'Hayabusa', 27, '2024-05-22', '2024-05-22', 1),
(3, 'Ken', 'Masters', 30, '2024-05-22', '2024-05-22', 2),
(4, 'Shin', 'Kage', 22, '2024-05-22', '2024-05-22', 2),
(5, 'Hana', 'Sato', 28, '2024-05-22', '2024-05-22', 3),
(6, 'Yuki', 'Takahashi', 24, '2024-05-22', '2024-05-22', 3);

/*
Consulta todos los student
*/
select * from student;

/*
Consulta todos los student y muestra el nombre y apellido
*/
select 
first_name,
last_name
from student;

/*
Consulta todos los student del 'Blue school'
*/
select 
*
from school;

select 
* from student
where fk_school_id = 1;
/*
Consulta todos los student del 'Green school'
*/

/*
Actualiza el nombre de los school (Blue school por First school y así sucesivamente)
*/
select * from school;
update school set nombre = 'First school' where id = 1;
update school set nombre = 'Second school' where id = 2;
update school set nombre = 'Third school' where id = 3;












