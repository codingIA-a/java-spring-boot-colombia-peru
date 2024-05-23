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













