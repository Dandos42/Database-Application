

-- Database: Cinema_Village

-- DROP DATABASE IF EXISTS "Cinema_Village";

CREATE DATABASE "Cinema_Village"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.utf8'
    LC_CTYPE = 'en_US.utf8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

COMMENT ON DATABASE "Cinema_Village"
    IS 'database of cinemas';
----------------------------------------------------------------

-- Table: bds.address

--DROP TABLE IF EXISTS bds."address";

CREATE TABLE IF NOT EXISTS bds."address"
(
    id_address serial NOT NULL,
    city varchar(40) NOT NULL,
    street varchar(45) NOT NULL,
    house_number varchar(15) NOT NULL,
    zip_code varchar(6),
    CONSTRAINT "address_pkey" PRIMARY KEY (id_address)
);





-- Table: bds.cinema

-- DROP TABLE IF EXISTS bds."cinema";

CREATE TABLE IF NOT EXISTS bds."cinema"
(
    id_cinema serial NOT NULL,
    cinemas_name varchar(60) NOT NULL,
    email varchar(45) NOT NULL,
    free_parking boolean,
    wheelchair_access boolean,
	id_other_information integer,
	id_cinemas_address integer NOT NULL,
	id_opens_closes integer NOT NULL,
    CONSTRAINT "cinema_pkey" PRIMARY KEY (id_cinema)
    CONSTRAINT fk_cinema_has_address FOREIGN KEY (id_cinema)
        REFERENCES bds.address (id_address) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE CASCADE
        NOT VALID,
    CONSTRAINT fk_opens_closes FOREIGN KEY (id_opens_closes)
        REFERENCES bds.opening_hours (id_opening_hours) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT fk_other_information FOREIGN KEY (id_other_information)
        REFERENCES bds.has_other_information (id_other_information) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE CASCADE
        NOT VALID
);




-- Table: bds.employees

-- DROP TABLE IF EXISTS bds."employees";

CREATE TABLE IF NOT EXISTS bds."employees"
(
    id_employee serial NOT NULL,
    username varchar(45) NOT NULL,
    password varchar(45) NOT NULL,
    first_name varchar(45) NOT NULL,
    last_name varchar(45) NOT NULL,
    CONSTRAINT "employees_pkey" PRIMARY KEY (id_employee)
);





-- Table: bds.employee_has_address

-- DROP TABLE IF EXISTS bds."employee_has_address";

CREATE TABLE IF NOT EXISTS bds."employee_has_address"
(
    id_employee serial NOT NULL,
    id_address serial NOT NULL,
    CONSTRAINT "has_employee_address_pkey" PRIMARY KEY (id_address, id_employee),
    CONSTRAINT fk2_id_address FOREIGN KEY (id_address)
        REFERENCES bds."address" (id_address) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk3_id_employee FOREIGN KEY (id_employee)
        REFERENCES bds."employees" (id_employee) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);




-- Table: bds.opening_hours

-- DROP TABLE IF EXISTS bds."opening_hours";

CREATE TABLE IF NOT EXISTS bds."opening_hours"
(
    id_opening_hours serial NOT NULL,
    opening time NOT NULL,
    closing time NOT NULL,
    CONSTRAINT "opening_hours_pkey" PRIMARY KEY (id_opening_hours)
);




-- Table: bds.positions

-- DROP TABLE IF EXISTS bds."positions";

CREATE TABLE IF NOT EXISTS bds."positions"
(
    id_position serial NOT NULL,
    name varchar(45) NOT NULL,
    salary decimal(11,2) NOT NULL,
    CONSTRAINT "positions_pkey" PRIMARY KEY (id_position)
);


-- Table: bds.has_position

-- DROP TABLE IF EXISTS bds."has_position";

CREATE TABLE IF NOT EXISTS bds."has_position"
(
    id_employee serial NOT NULL,
    id_position serial NOT NULL,
    CONSTRAINT fk5_id_employee FOREIGN KEY (id_employee)
        REFERENCES bds."employees" (id_employee) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_id_position FOREIGN KEY (id_position)
        REFERENCES bds."positions" (id_position) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        
);



-- Table: bds.works

-- DROP TABLE IF EXISTS bds."works";

CREATE TABLE IF NOT EXISTS bds."works"
(
    id_cinema serial NOT NULL,
    id_employee serial NOT NULL,
    CONSTRAINT "works_pkey" PRIMARY KEY (id_cinema, id_employee),
    CONSTRAINT fk3_id_cinema FOREIGN KEY (id_cinema)
        REFERENCES bds."cinema" (id_cinema) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_id_employee FOREIGN KEY (id_employee)
        REFERENCES bds."employees" (id_employee) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);




-- Table: bds.genres

-- DROP TABLE IF EXISTS bds."genres";

CREATE TABLE IF NOT EXISTS bds."genres"
(
    id_genre serial NOT NULL,
    genre varchar(45) NOT NULL,
    CONSTRAINT "genres_pkey" PRIMARY KEY (id_genre)
);

CREATE TYPE bds."enum" AS ENUM ('3','7','12','16','18');

CREATE TABLE IF NOT EXISTS bds."films"
(
    id_film serial NOT NULL,
    films_name varchar(80) NOT NULL,
	age_limit bds."enum" NOT NULL,
    footage_minutes smallint NOT NULL,
    premiere date,
    CONSTRAINT "films_pkey" PRIMARY KEY (id_film)
);

-- Table: bds.has_film

-- DROP TABLE IF EXISTS bds."has_film";

CREATE TABLE IF NOT EXISTS bds."has_film"
(
    id_cinema serial NOT NULL,
    id_film serial NOT NULL,
    CONSTRAINT "has_film_pkey" PRIMARY KEY (id_film, id_cinema),
    CONSTRAINT fk_id_cinema_4 FOREIGN KEY (id_cinema)
        REFERENCES bds.cinema (id_cinema) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE CASCADE
        NOT VALID,
    CONSTRAINT fk_id_film FOREIGN KEY (id_film)
        REFERENCES bds.films (id_film) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE CASCADE
        NOT VALID
);




-- Table: bds.has_genre

-- DROP TABLE IF EXISTS bds."has_genre";

CREATE TABLE IF NOT EXISTS bds."has_genre"
(
    id_film serial NOT NULL,
    id_genre serial NOT NULL,
    CONSTRAINT "has_genre_pkey" PRIMARY KEY (id_genre, id_film),
    CONSTRAINT fk2_id_film FOREIGN KEY (id_film)
        REFERENCES bds."films" (id_film) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_id_genre FOREIGN KEY (id_genre)
        REFERENCES bds."genres" (id_genre) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

-- Table: bds.changed_table

-- DROP TABLE IF EXISTS bds.changed_table;

CREATE TABLE IF NOT EXISTS bds.changed_table
(
    id_film integer NOT NULL,
    description_date date NOT NULL,
    CONSTRAINT changed_table_pkey PRIMARY KEY (id_film)
);

-- Table: bds.has_other_information

-- DROP TABLE IF EXISTS bds.has_other_information;

CREATE TABLE IF NOT EXISTS bds.has_other_information
(
    id_other_information integer NOT NULL,
    total_capacity integer NOT NULL,
    projections character varying COLLATE pg_catalog."default" NOT NULL,
    count_of_movie_theater integer NOT NULL,
    CONSTRAINT has_other_information_pkey PRIMARY KEY (id_other_information)
);


