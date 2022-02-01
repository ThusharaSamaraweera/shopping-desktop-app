/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 8.0.22 : Database - textile shop
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`textile shop` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `textile shop`;

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `category_id` int NOT NULL,
  `main_cat` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `category` */

insert  into `category`(`category_id`,`main_cat`,`name`) values 
(1,'Male','CASUAL SHIRTS');

/*Table structure for table `customer_details` */

DROP TABLE IF EXISTS `customer_details`;

CREATE TABLE `customer_details` (
  `id` int NOT NULL,
  `signup_id` int NOT NULL,
  `phone_number` int NOT NULL,
  `country` varchar(255) NOT NULL,
  `state` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `postel_code` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `customer_details` */

/*Table structure for table `items` */

DROP TABLE IF EXISTS `items`;

CREATE TABLE `items` (
  `item_id` int NOT NULL,
  `main_cat` varchar(255) NOT NULL,
  `cat_name` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `qty_s` int NOT NULL,
  `qty_m` int NOT NULL,
  `qty_l` int NOT NULL,
  `price_s` int NOT NULL,
  `price_m` int NOT NULL,
  `price_l` int NOT NULL,
  `img1` varchar(255) DEFAULT NULL,
  `img2` varchar(255) DEFAULT NULL,
  `img3` varchar(255) DEFAULT NULL,
  `desc` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `items` */

insert  into `items`(`item_id`,`main_cat`,`cat_name`,`name`,`qty_s`,`qty_m`,`qty_l`,`price_s`,`price_m`,`price_l`,`img1`,`img2`,`img3`,`desc`) values 
(1,'men','CASUAL SHIRTS','JOBBS SELECT MENS PRINTED CASUAL SHIRT',23,2,3,52,234,324,'',NULL,NULL,'Keep it cool and breezy but super stylish with this 100% cotton rich blend short sleeve shirt. Made with lightweight textured fabric in short sleeves and finished off with invincible front buttons fastening, this printed shirt will keep you cool and take you from day to evening. Pair with chino shorts and flip flops for a lunchtime look or style up with a lightweight trouser and espadrille for a relaxed evening outfit. Available in many prints and colors.'),
(2,'men','CASUAL SHIRTS','JOBBS SELECT MENS PRINTED CASUAL SHIRT',5,2,3,1000,1200,1500,'',NULL,NULL,'Keep it cool and breezy but super stylish with this 100% cotton rich blend short sleeve shirt. Made with lightweight textured fabric in short sleeves and finished off with invincible front buttons fastening, this printed shirt will keep you cool and take you from day to evening. Pair with chino shorts and flip flops for a lunchtime look or style up with a lightweight trouser and espadrille for a relaxed evening outfit. Available in many prints and colors.');

/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `id` int DEFAULT NULL,
  `order_customer_id` int DEFAULT NULL,
  `item_id` int DEFAULT NULL,
  `s_qty` int DEFAULT NULL,
  `m_qty` int DEFAULT NULL,
  `l_qty` int DEFAULT NULL,
  `createdAt` datetime DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `order` */

/*Table structure for table `order_customer` */

DROP TABLE IF EXISTS `order_customer`;

CREATE TABLE `order_customer` (
  `id` int NOT NULL,
  `signup_id` int DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `phone_number` int DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `postel_code` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `order_customer` */

/*Table structure for table `signup` */

DROP TABLE IF EXISTS `signup`;

CREATE TABLE `signup` (
  `signup_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `createdAt` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  `user_type` char(4) NOT NULL,
  PRIMARY KEY (`signup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `signup` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
