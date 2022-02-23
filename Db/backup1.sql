/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 8.0.22 : Database - textile_shop
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`textile_shop` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `textile_shop`;

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `category_id` int(5) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `main_cat` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `no_of_items` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `category` */

insert  into `category`(`category_id`,`main_cat`,`name`,`no_of_items`) values 
(00010,'Men','CASUAL PANTS',20),
(00011,'Men','SHORTS',15),
(00012,'Men','JEANS AND JOGGERS',20),
(00013,'Men','FORMAL SHIRTS',20),
(00014,'Men','FORMAL TROUSERS',20),
(00015,'Men','SPORTSWEAR',20),
(00016,'Men','HOODIES',20),
(00017,'Women','BLOUSES AND SHIRTS',20),
(00018,'Women','DRESSES',20),
(00019,'Women','LONG TOPS',20),
(00020,'Women','JUMPSUIT',20),
(00021,'Kids','DENIM',20),
(00022,'Kids','INNER WEAR',20),
(00023,'Women','SPORTSWEAR',20);

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

insert  into `customer_details`(`id`,`signup_id`,`phone_number`,`country`,`state`,`address`,`postel_code`) values 
(1,19,771231231,'Sri Lanka','colombo','23/12, dalugama Road',12345),
(2,21,112345345,'Sri lanka','gampaha','23/16, gangodawila Road',12222);

/*Table structure for table `items` */

DROP TABLE IF EXISTS `items`;

CREATE TABLE `items` (
  `item_id` int NOT NULL AUTO_INCREMENT,
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
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `items` */

insert  into `items`(`item_id`,`main_cat`,`cat_name`,`name`,`qty_s`,`qty_m`,`qty_l`,`price_s`,`price_m`,`price_l`,`img1`,`img2`,`img3`,`desc`) values 
(21,'Men','CASUAL SHIRTS','MENS “V” NECK T-SHIRT',10,10,10,1350,1550,2100,'C:\\Users\\DELL inspiron\\Documents\\University Java Project OOP\\Java Web\\shopping-desktop-app\\asserts\\Products\\1\\1.1.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.2.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.3.jpg','Keep your casual look on point with this Short-Sleeve V-Neck T-Shirt in breathable cotton-blend fabric offers just the right amount of comfort for all-day wear.'),
(22,'Men','CASUAL SHIRTS','MENS POLO T-SHIRT',15,1350,10,1550,15,2100,'C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.1.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.2.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.3.jpg','Pack your wardrobe with our mens basics Featuring a basic ribbed polo collar, traditional two front collar buttons and contrast ribbed piping on the sleeve. Style it with Chino shorts or casual denims for a complete look.'),
(23,'Men','FORMAL SHIRTS','JOBBS PHOTOCHROMIC PRINTED MAGIC SHIRT',10,10,10,2200,2450,2700,'C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.1.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.2.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.3.jpg','Introducing for the first time in Sri Lanka, The photochromic magic shirt that changes color for sunlight exposure featured in different prints to suit your style. featured in cotton rich fabric that is soft and comfortable for a all day long attire. With Long cuffed sleeves and basic shirt collar along a full front button fastening..'),
(24,'Men','FORMAL SHIRTS','EMERALD MENS FORMAL SHIRT',10,15,10,2700,3100,3500,'C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.1.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.2.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.3.jpg','Update your formal-wear with this smart shirt from Emerald. Made with lightweight and breathable fabric in an easy-to-wear finish. Its all over classic check pattern is a must have in all colour variations.'),
(25,'Men','SHORTS','MEN’S COTTON STRETCH CHINO SHORT',10,10,10,1190,1300,1450,'C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.1.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.2.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.3.jpg','Classic chino shorts with a concealed zip fly and patterned pocket bags. Made from cotton fabric with added stretch for comfort..'),
(26,'Men','SHORTS','MENS POLO T-SHIRT',10,1350,10,1550,15,2100,'C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.1.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.2.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.3.jpg','Pack your wardrobe with our mens basics Featuring a basic ribbed polo collar, traditional two front collar buttons and contrast ribbed piping on the sleeve. Style it with Chino shorts or casual denims for a complete look.'),
(27,'Men','CASUAL SHIRTS','MENS “V” NECK T-SHIRT',10,1350,10,1550,15,2100,'C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.1.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.2.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.3.jpg','Keep your casual look on point with this Short-Sleeve V-Neck T-Shirt in breathable cotton-blend fabric offers just the right amount of comfort for all-day wear.'),
(28,'Men','SHORTS','MENS POLO T-SHIRT',11,1350,10,1550,15,2100,'C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.1.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.2.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.3.jpg','Pack your wardrobe with our mens basics Featuring a basic ribbed polo collar, traditional two front collar buttons and contrast ribbed piping on the sleeve. Style it with Chino shorts or casual denims for a complete look.'),
(29,'Men','CASUAL SHIRTS','MENS “V” NECK T-SHIRT',10,1350,10,1550,15,2100,'C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.1.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.2.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.3.jpg','Keep your casual look on point with this Short-Sleeve V-Neck T-Shirt in breathable cotton-blend fabric offers just the right amount of comfort for all-day wear.'),
(30,'Men','TSHIRTS','MENS POLO T-SHIRT',10,1350,10,1550,15,2100,'C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.1.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.2.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.3.jpg','Pack your wardrobe with our mens basics Featuring a basic ribbed polo collar, traditional two front collar buttons and contrast ribbed piping on the sleeve. Style it with Chino shorts or casual denims for a complete look.'),
(31,'Men','CASUAL SHIRTS','MENS “V” NECK T-SHIRT',10,1350,10,1550,15,2100,'C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.1.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.2.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.3.jpg','Keep your casual look on point with this Short-Sleeve V-Neck T-Shirt in breathable cotton-blend fabric offers just the right amount of comfort for all-day wear.'),
(32,'Men','TSHIRTS','MENS POLO T-SHIRT',10,1350,10,1550,15,2100,'C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.1.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.2.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.3.jpg','Pack your wardrobe with our mens basics Featuring a basic ribbed polo collar, traditional two front collar buttons and contrast ribbed piping on the sleeve. Style it with Chino shorts or casual denims for a complete look.'),
(33,'Men','CASUAL SHIRTS','MENS “V” NECK T-SHIRT',10,1350,10,1550,15,2100,'C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.1.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.2.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.3.jpg','Keep your casual look on point with this Short-Sleeve V-Neck T-Shirt in breathable cotton-blend fabric offers just the right amount of comfort for all-day wear.'),
(34,'Men','TSHIRTS','MENS POLO T-SHIRT',10,1350,10,1550,15,2100,'C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.1.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.2.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.3.jpg','Pack your wardrobe with our mens basics Featuring a basic ribbed polo collar, traditional two front collar buttons and contrast ribbed piping on the sleeve. Style it with Chino shorts or casual denims for a complete look.'),
(35,'Men','CASUAL SHIRTS','MENS “V” NECK T-SHIRT',10,1350,10,1550,15,2100,'C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.1.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.2.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.3.jpg','Keep your casual look on point with this Short-Sleeve V-Neck T-Shirt in breathable cotton-blend fabric offers just the right amount of comfort for all-day wear.'),
(36,'Men','TSHIRTS','MENS POLO T-SHIRT',10,1350,10,1550,15,2100,'C:\\Users\\DELL inspiron\\Documents\\University Java Project OOP\\Java Web\\shopping-desktop-app\\asserts\\Products\\1\\1.1.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.2.jpg','C:UsersDELL inspironDocumentsUniversity Java Project OOPJava Webshopping-desktop-appassertsProducts11.3.jpg','Pack your wardrobe with our mens basics Featuring a basic ribbed polo collar, traditional two front collar buttons and contrast ribbed piping on the sleeve. Style it with Chino shorts or casual denims for a complete look.');

/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `id` int DEFAULT NULL,
  `order_customer_id` int DEFAULT NULL,
  `item_id` int DEFAULT NULL,
  `s_qty` int DEFAULT NULL,
  `m_qty` int DEFAULT NULL,
  `l_qty` int DEFAULT NULL,
  `createdAt` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `state` varchar(255) DEFAULT NULL,
  `price_s` int DEFAULT NULL,
  `price_m` int DEFAULT NULL,
  `price_l` int DEFAULT NULL,
  `main_cat` varchar(10) DEFAULT NULL,
  `cat_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `order` */

insert  into `order`(`id`,`order_customer_id`,`item_id`,`s_qty`,`m_qty`,`l_qty`,`createdAt`,`state`,`price_s`,`price_m`,`price_l`,`main_cat`,`cat_name`) values 
(1,1,1,3,3,3,'2022-02-23 08:06:02','Accepted',1200,1300,1400,'Men','CASUAL SHIRTS'),
(2,2,21,4,3,2,'2022-02-23 08:06:59','Pending',900,1000,1200,'Men','MENS POLO T-SHIRT');

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
  `address_line_1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `address_line_2` varchar(255) DEFAULT NULL,
  `postel_code` int DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `order_customer` */

insert  into `order_customer`(`id`,`signup_id`,`first_name`,`last_name`,`phone_number`,`country`,`state`,`address_line_1`,`address_line_2`,`postel_code`,`email`) values 
(2,2,'Priyantha','Deshapriya',112345345,'Sri Lanka','Western','23/16, gangodawila Road','Nugegoda',56789,'priyantha@gmail.com'),
(3,3,'Gihan','Prasanna',771345675,'Sri Lanka','Western','12/13A, pushpa uyana','IDH',12367,'gihanp88@gmail.com'),
(4,4,'Rohitha','Perera',766786781,'Sri Lanka','Western','23/14, galigamuwa junction','Gothatuwa',13457,'rohitha@gmail.com'),
(5,5,'Anushanga','Pawith',766664531,'Sri Lanka','Western','67/12, sirimal uyana','Siduwa',56789,'anushangap99@gmail.com'),
(6,6,'Saman','Perera',779879787,'Sri lanka','Western','53/12C, baron perera road','Minuwangoda',12567,'samanperera@gmail.com'),
(7,7,'Sahan','Sithmina',112345677,'Sri lanka','Western','45A, ranala road','Buthgamuwa',12356,'sithmina99@gmail.com'),
(8,8,'Nipuni','Rathnayaka',777786423,'Sri Lanka','Western','12/34, bogas handiya junction','Kolonnawa',45690,'nrathnayaka@gmail.com');

/*Table structure for table `signup` */

DROP TABLE IF EXISTS `signup`;

CREATE TABLE `signup` (
  `signup_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `createdAt` timestamp NULL DEFAULT NULL,
  `user_type` char(4) NOT NULL,
  `active` char(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '1',
  PRIMARY KEY (`signup_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `signup` */

insert  into `signup`(`signup_id`,`first_name`,`last_name`,`email`,`password`,`createdAt`,`user_type`,`active`) values 
(19,'Gihan','Prasanna','gihan@gmail.com','$2a$12$EaqcLm3ah.4Hk2jigSkDw.DhYTQPnyy3Ima19AesBEXz5H8kDsQ62','2022-02-23 10:00:21','SA','0'),
(20,'gayan','Nimnadha','gayanmalinda@gmail.com','$2a$12$mW0sO9OAaK4ioOwuIVHefeaw6f/iFV5g3sEooKDZTChDWGyzxgeq6','2022-02-23 10:00:29','SA','1'),
(21,'thushara','dasun','thushara@gmail.com','$2a$12$r1t/iiW4Db9CXjnlRK6LVOqtniH58bQkQPTcY2ddDuC7KV6D/c2.S','2022-02-23 09:58:39','SA','1'),
(23,'amal','perera','amal@gamil.com','$2a$12$2jRC/I7hrHKln0KNYFpZ2euNbH/zuxK18MAz5wVsRKKaftudfbHti','2022-02-23 10:01:20','A','0'),
(24,'nimal','perea','nimal@gmail.com','$2a$12$vx7fW2aGmCd7vWam6jaifOHrrMJZfSg/K9ZyS1Gdjq0nbqMeJmjfW',NULL,'C','1');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
