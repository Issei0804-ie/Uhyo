create database Uhyo;
create table Uhyo.UserInfo(
    `UserName` varchar(255),
    `UserId` int(8) unsigned not null auto_increment ,
    `Win` int(8) unsigned not null,
    `Lose` int(8) unsigned not null,
    `Match` int(8) unsigned not null,
    PRIMARY KEY (`UserId`)
    );

create table Uhyo.RoomInfo(
    `RoomNumber` int(8) not null auto_increment,
    `HostUser` varchar(255),
    `ClientUser` varchar(255),
    PRIMARY KEY (`RoomNumber`)
);
