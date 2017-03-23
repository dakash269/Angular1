# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table archivetable (
  id                            bigint auto_increment not null,
  user                          TEXT,
  content                       TEXT,
  title                         TEXT,
  timestamp                     timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  reminder                      TEXT,
  constraint pk_archivetable primary key (id)
);

create table notetaken1 (
  id                            bigint auto_increment not null,
  user                          TEXT,
  content                       TEXT,
  title                         TEXT,
  timestamp                     timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  reminder                      TEXT,
  is_archive                    int ,
  is_trash                      int,
  constraint pk_notetaken1 primary key (id)
);

create table registration (
  user_id                       bigint auto_increment not null,
  user_name                     varchar(255),
  user_email                    varchar(255),
  user_password                 varchar(255),
  timestamp                     timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  constraint pk_registration primary key (user_id)
);

create table trashtable (
  id                            bigint auto_increment not null,
  user                          TEXT,
  content                       TEXT,
  title                         TEXT,
  timestamp                     timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  reminder                      TEXT,
  constraint pk_trashtable primary key (id)
);


# --- !Downs

drop table if exists archivetable;

drop table if exists notetaken1;

drop table if exists registration;

drop table if exists trashtable;

