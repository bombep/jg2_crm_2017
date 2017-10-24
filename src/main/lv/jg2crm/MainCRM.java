package lv.jg2crm;

/* database creation script was moved to a separate file

    Customers:
    id int,
    nickname varchar(50), 
    realname varchar (100),
    company varchar(50),
    profession varchar(50),
    address varchar(50),
    phone varchar(50),
    creationdatetime DATETIME,
    lastupdatedatetime DATETIME,

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


import lv.jg2crm.database.customers.CustomerDB;
import lv.jg2crm.database.customers.InMemoryCustomerDB;

public class MainCRM {

    public static void main (String[] args){

    //use cases:
        //1. Add customer
        //2. List customers
        //3. Add event to customer
        //4. Exit

        CustomerDB customerDB = new InMemoryCustomerDB();






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
