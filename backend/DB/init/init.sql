create database Uhyo;

create table Uhyo.RoomInfos(
    `RoomNumber` int(8) not null auto_increment,
    `HostUser` varchar(255),
    `ClientUser` varchar(255),
    PRIMARY KEY (`RoomNumber`)
);
