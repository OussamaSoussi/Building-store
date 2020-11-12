# MySQL-Front 3.2  (Build 6.11)

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES 'latin1' */;

# Host: localhost    Database: bookstore
# ------------------------------------------------------
# Server version 5.7.32-log

#
# Table structure for table book
#

DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(11) DEFAULT NULL,
  `Author` varchar(11) DEFAULT NULL,
  `Price` double DEFAULT NULL,
  `ReleaseDate` date DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

#
# Dumping data for table book
#

INSERT INTO `book` (`Id`,`Title`,`Author`,`Price`,`ReleaseDate`) VALUES (1,'sfsf','qsfq',1325,'1996-05-22');
INSERT INTO `book` (`Id`,`Title`,`Author`,`Price`,`ReleaseDate`) VALUES (2,'aaa','bbb',55,'2020-11-11');

#
# Table structure for table user
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(11) DEFAULT NULL,
  `password` varchar(11) DEFAULT NULL,
  `first_Name` varchar(11) DEFAULT NULL,
  `last_name` varchar(11) DEFAULT NULL,
  `phone` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

#
# Dumping data for table user
#

INSERT INTO `user` (`Id`,`login`,`password`,`first_Name`,`last_name`,`phone`) VALUES (1,'oussama','0000','oussama','soussi',23703187);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
