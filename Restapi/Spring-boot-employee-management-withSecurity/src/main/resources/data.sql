insert into employee (id, first_name, last_name, email)values (1, 'Mayur', 'Singh', 'Ms@xyz.com' );
insert into employee (id, first_name, last_name, email)values (2, 'Vaibhav', 'Patil','vpp@xyz.com' );
insert into employee (id, first_name, last_name, email)values (3, 'Anu', 'Shetty', 'aks@xyz.com' );
insert into employee (id, first_name, last_name, email)values (4, 'Mannu', 'Jha', 'manuj2@xyz.com' );

insert into roles (role_id, name)values (1,'ADMIN');
insert into roles (role_id, name)values (2,'USER');

insert into users (user_id,username,password) values(1,'admin','$2a$12$RonTHZaTKKNaBfj8yOkw4utk5uYBnoysN9TRMYa1StalA27P0Ayt2');
insert into users (user_id,username,password) values(2,'user','$2a$12$qxBX7snB38oVoMF9/9YY9uH8gfwpVbAzSJEx77JsVLSE3ajwyLdzm');
insert into users_roles(user_id,role_id)values (1,1);