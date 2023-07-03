create table items (
       id bigint auto_increment,
       name varchar(255), 
       count varchar(255),
       status varchar(255),
       primary key (id)
    );

INSERT INTO items (name, count, status) VALUES ('José', '3', 'aberto');
INSERT INTO items (name, count, status) VALUES ('Maria', '5', 'fechado');
INSERT INTO items (name, count, status) VALUES ('João', '2', 'fechado');

