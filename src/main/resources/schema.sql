
CREATE TABLE IF NOT EXISTS  users
    (
        id SERIAL NOT NULL,
        name varchar(100) NOT NULL,
        type varchar(10) NOT NULL,
        phone_no varchar(15) NOT NULL,
        password varchar(100) NOT NULL,
        PRIMARY KEY (id)
    );

    CREATE TABLE IF NOT EXISTS  requirement
    (
        id SERIAL NOT NULL ,
        description varchar(250),
        image_url varchar(100),
        audio_url varchar(100),
        creation_timestamp timestamp NOT NULL,
        completion_timestamp timestamp,
        status varchar(15) NOT NULL,
        PRIMARY KEY (id)
    );

    CREATE TABLE IF NOT EXISTS location
    (
       id SERIAL NOT NULL ,
        address varchar(100) NOT NULL,
        latitude double precision,
        longitude double precision,
        worksite_id integer NOT NULL,
        PRIMARY KEY (id)
    );

    CREATE TABLE IF NOT EXISTS worksite
    (
        id SERIAL NOT NULL,
        name varchar(25) NOT NULL,
        description varchar(100),
        image_url varchar(100),
        PRIMARY KEY(id)
    );

    CREATE TABLE IF NOT EXISTS work_status
    (
        id SERIAL NOT NULL,
        description varchar(250),
        audio_url varchar(100),
        creation_timestamp timestamp NOT NULL,
        PRIMARY KEY(id)
    );


    CREATE TABLE IF NOT EXISTS work_status_image
    (
        id SERIAL NOT NULL,
        image_url varchar(100) NOT NULL,
        work_status_id SERIAL NOT NULL,
        PRIMARY KEY(id)
    );


--    alter sequence location_id_seq restart with 110000;
--    alter sequence worksite_id_seq restart with 120000;
--    alter sequence users_id_seq restart with 130000;
--    alter sequence requirement_id_seq restart with 140000;
--    alter sequence work_status_id_seq restart with 150000;
--    alter sequence work_status_image_id_seq restart with 160000;

