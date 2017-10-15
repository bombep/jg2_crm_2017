package lv.jg2crm;

/*
Things to do:
create database CRM;
use CRM;
create table CRMusers(
    id int NOT NULL AUTO_INCREMENT,
    username varchar(50), realname varchar (100), role varchar(50), password varchar(50), PRIMARY KEY (id)
);

create table CRMcustomers(
    id int NOT NULL AUTO_INCREMENT,
    nickname varchar(50), realname varchar (100),
    company varchar(50),
    profession varchar(50),
    address varchar(50),
    phone varchar(50),
    creationdatetime DATETIME,
    lastupdatedatetime DATETIME,
    PRIMARY KEY (id)
);

create table CRMcustomfields(
    id int NOT NULL AUTO_INCREMENT,
    custid int NOT NULL,
    fieldname varchar(50), fieldvalue varchar (200),
    PRIMARY KEY (id),
    FOREIGN KEY (custid)   REFERENCES CRMcustomers(id)
);

create table CRMevents(
    id int NOT NULL AUTO_INCREMENT,
    custid int NOT NULL,
    userid int NOT NULL,
    startdatetime DATETIME,
    enddatetime DATETIME,
    eventtype varchar(50), text varchar (500),
    PRIMARY KEY (id),
    FOREIGN KEY (custid)   REFERENCES CRMcustomers(id),
    FOREIGN KEY (userid)   REFERENCES CRMusers(id)
);


Logic behind the events table
------------------------------------------------
Event type      Text value
--------------  --------------------------------
incomingcall    comments
outgoingcall    comments
meeting         comments
agreement       agreement number
filesent        file name
filereceived    file name
------------------------------------------------

 */


public class MainCRM {

    public static void main (String[] args){




    }



}
