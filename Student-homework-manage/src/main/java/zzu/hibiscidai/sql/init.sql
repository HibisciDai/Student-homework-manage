/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/9/22 13:10:09                           */
/*==============================================================*/

drop database if exists StudentHomeworkManage;

create database StudentHomeworkManage default character set utf8 collate utf8_general_ci;

use StudentHomeworkManage;

drop table if exists t_Admin;

drop table if exists t_Homework;

drop table if exists t_Student;

drop table if exists t_Teacher;

drop table if exists t_Uploadwork;

/*==============================================================*/
/* Table: t_Admin                                               */
/*==============================================================*/
create table t_Admin
(
   a_id                 int not null,
   a_usename            varchar(20) not null,
   a_password           varchar(20) not null,
   primary key (a_id)
);

/*==============================================================*/
/* Table: t_Homework                                            */
/*==============================================================*/
create table t_Homework
(
   h_id                 int not null,
   h_teacher_id         int,
   h_context            longtext not null,
   h_update             time not null,
   h_donedate           time not null,
   primary key (h_id)
);

/*==============================================================*/
/* Table: t_Student                                             */
/*==============================================================*/
create table t_Student
(
   s_id                 int not null,
   s_username           varchar(20) not null,
   s_password           varchar(20) not null,
   primary key (s_id)
);

/*==============================================================*/
/* Table: t_Teacher                                             */
/*==============================================================*/
create table t_Teacher
(
   s_id                 int not null,
   s_username           varchar(20) not null,
   s_password           varchar(20) not null,
   primary key (s_id)
);

/*==============================================================*/
/* Table: t_Uploadwork                                          */
/*==============================================================*/
create table t_Uploadwork
(
   id                   int not null,
   u_sutdent_id         int,
   u_homeword_id        int,
   u_context            longtext not null,
   u_grade              int,
   u_update             time not null,
   primary key (id)
);

alter table t_Homework add constraint FK_Reference_1 foreign key (h_teacher_id)
      references t_Teacher (s_id) on delete restrict on update restrict;

alter table t_Uploadwork add constraint FK_Reference_2 foreign key (u_sutdent_id)
      references t_Student (s_id) on delete restrict on update restrict;

alter table t_Uploadwork add constraint FK_Reference_3 foreign key (u_homeword_id)
      references t_Homework (h_id) on delete restrict on update restrict;

