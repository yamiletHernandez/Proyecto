# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table medicina (
  id                            integer not null,
  nombre                        varchar(255),
  descripcion                   varchar(255),
  gramos                        integer,
  precio                        integer,
  constraint pk_medicina primary key (id)
);
create sequence medicina_seq;


# --- !Downs

drop table if exists medicina;
drop sequence if exists medicina_seq;

