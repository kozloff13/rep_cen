create table users (
  id bigserial primary key not null,
  first_name varchar(255) not null,
  last_name varchar(255) not null,
  middle_name varchar(255) not null,
  email varchar(255) not null,
  password varchar(255) not null
);