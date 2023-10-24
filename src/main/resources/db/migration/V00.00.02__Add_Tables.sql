create table products
(
id serial primary key,
ean varchar(13) not null,
name text,
company_id integer,
country_id integer,
description text,
active boolean not null DEFAULT true,
changed_by integer,
changed_at TIMESTAMP DEFAULT now(),
created_by integer,
created_at TIMESTAMP DEFAULT now()
);
create table users
(
    id serial primary key,
	email varchar(50) not null UNIQUE,
	password text,
	first_name text,
	last_name text,
    last_login_date TIMESTAMP DEFAULT  now() not null,
    active boolean,
    changed_by integer,
    changed_at TIMESTAMP DEFAULT now(),
    created_by integer,
    created_at TIMESTAMP DEFAULT now()
);