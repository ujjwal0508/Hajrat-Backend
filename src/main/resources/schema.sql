
CREATE SCHEMA IF NOT EXISTS ;

    CREATE TABLE users
    {
        id varchar(11) NOT NULL,
        name varchar(100) NOT NULL,
        type varchar(10) NOT NULL.
        phone_no varchar(15) NOT NULL,
        password varchar(100) NOT NULL,
        PRIMARY KEY (id)

    };

    CREATE TABLE requirement
    {
        id varchar(11) NOT NULL,
        description varchar(250),
        image_url varchar(100),
        audio_url varchar(100),
        creation_timestamp timestamp NOT NULL,
        completion_timestamp timestamp,
        status varchar(15) NOT NULL,
        location_id varchar(11),
        PRIMARY KEY (id)

    };

    CREATE TABLE location
    {
        id varchar(11) NOT NULL,
        address varchar(100) NOT NULL,
        latitude varchar(20),
        longitude varchar(20),

    };

    CREATE TABLE worksite
    {
        id varchar(11) NOT NULL,
        name varchar(25) NOT NULL,
        description varchar(100),
        image_url varchar(100),
        location_id varchar(11) NOT NULL,
        PRIMARY KEY(id)
    };

    CREATE TABLE work_status
    {
        id varchar(11) NOT NULL,
        description varchar(250),
        audio_url varchar(100),
        creation_timestamp timestamp NOT NULL,
        PRIMARY KEY(id)
    };


    CREATE TABLE work_status_image
    {
        id varchar(11) NOT NULL,
        image_url varchar(100) NOT NULL,
        work_status_id varchar(11) NOT NULL,
        PRIMARY KEY(id)
    };

