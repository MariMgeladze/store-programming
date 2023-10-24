CREATE TABLE IF NOT EXISTS public.companies
(
    id serial primary key,
    parent_id integer,
    country_id text ,
    name text ,
    name_geo text ,
    active boolean NOT NULL DEFAULT true,
    changed_by integer,
    changed_at timestamp without time zone DEFAULT now(),
    created_by integer,
    created_at timestamp without time zone DEFAULT now()

);
CREATE TABLE IF NOT EXISTS public.countries
(
    id serial primary key ,
    iso_code_2 character(2)  NOT NULL,
    iso_code_3 character(3)  NOT NULL,
    name text ,
    name_geo text
);
