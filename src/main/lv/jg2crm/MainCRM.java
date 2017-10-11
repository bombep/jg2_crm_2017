package lv.jg2crm;

/*
Things to do:
create database CRM;
use CRM;
create table CRMusers(
    id int NOT NULL AUTO_INCREMENT,
    login varchar(50), realname varchar (100), role varchar(50), password varchar(50), PRIMARY KEY (id)
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
url             http://link
------------------------------------------------

 */



public class MainCRM {

    public static void main (String[] args){


    }



}

/*
Наш функционал

Данные
Таблица юзеров
Таблица клиентов
Таблица событий, свазанных с клиентом и юзером
Таблица произвольно настраиваемых полей-признаков (например, район, продукт, источник)
-----

Экраны:
1) Окно логина
2) Окно просмотра списка клиентов с возможностью фильтра и сортировки по произвольным полям
3) Окно клиента
    - список всех событий
    - возможность добавления нового события
    - возможность загрузки файла (скриншот/картинка/документ)



9) po analogii s moim proektom sdelatj svoi proekt i nachatj realizaciju svojego proekta poka v vide konsoljnogo app
temu da, mozno prosto napisatj potom mne
10) dlja svoego proekta vibratj samij vaznij funkcional kotorij nuzno realizovatj
i opisatj ego v vide prostogo tekstovogo faila punkt za punktom
esli rabotaete v komande to razdelite fitchi po uchastnikam komandi
12) podumatj chto i kak nado sdelatj s tochki zrenija koda, dizaina i arhitekturi, chto bi ego uluchitj


 */