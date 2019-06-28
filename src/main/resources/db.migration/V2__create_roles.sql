create table user_role (
  user_id bigint not null,
  roles varchar(255)
);

alter table user_role add constraint user_role_user_fk
  foreign key (user_id) references user (id);