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


import lv.jg2crm.CustomerDB.CustomerDB;
import lv.jg2crm.UI.LoginScreen;

import java.util.ArrayList;
import java.util.List;

public class MainCRM {

    public static void main (String[] args){

        CustomerDB customerDB = new CustomerDB();
        Customer customer1 = new Customer(1,"Vlad", "12345", "Vladislav", "Selfemployee", 26333315);
        Customer customer2 = new Customer(2,"Aleks", "12345", "Aleksej","Selfemployee", 2222222);
        customerDB.addCustomer(customer1);
        customerDB.addCustomer(customer2);
        customerDB.print();
        customerDB.delCustomer(customer2);
        customerDB.print();



    }



}
