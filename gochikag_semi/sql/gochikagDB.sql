-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: gochikag
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

drop database if exists gochikag;

create database gochikag;
use gochikag;


--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `item_id` int(11) NOT NULL,
  `amount` float NOT NULL,
  `delete_flg` tinyint(1) NOT NULL,
  `registration_date` datetime NOT NULL,
  `updated_date` datetime NOT NULL,
  `item_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `item_id` (`item_id`),
  CONSTRAINT `cart_ibfk_1` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`),
  CONSTRAINT `cart_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `cart_ibfk_3` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `credit`
--

DROP TABLE IF EXISTS `credit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `credit` (
  `user_id` int(11) NOT NULL,
  `card_brand` varchar(255) NOT NULL,
  `name_e` varchar(255) NOT NULL,
  `credit_number` varchar(255) NOT NULL,
  `security_code` int(11) NOT NULL,
  `expiration_day` varchar(255) NOT NULL,
  `updated_date` datetime NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `credit_number` (`credit_number`),
  CONSTRAINT `credit_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credit`
--

LOCK TABLES `credit` WRITE;
/*!40000 ALTER TABLE `credit` DISABLE KEYS */;
/*!40000 ALTER TABLE `credit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detail`
--

DROP TABLE IF EXISTS `detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detail` (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `detail_ja` varchar(255) DEFAULT NULL,
  `detail_en` varchar(255) DEFAULT NULL,
  `deleteflg` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`item_id`),
  KEY `index_item_id` (`item_id`),
  CONSTRAINT `detail_ibfk_1` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail`
--

LOCK TABLES `detail` WRITE;
/*!40000 ALTER TABLE `detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(255) NOT NULL,
  `price` float NOT NULL,
  `main_picture` varchar(255) DEFAULT NULL,
  `stock_number` int(11) NOT NULL,
  `delete_flg` tinyint(1) NOT NULL DEFAULT '0',
  `registration_date` datetime NOT NULL,
  `updated_date` datetime NOT NULL, /* timestump‘«‚·‚©‚à */
  `category` enum('kagu','kaden','sale') NOT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pictures`
--

DROP TABLE IF EXISTS `pictures`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pictures` (
  `item_id` int(11) NOT NULL,
  `sub_picture1` varchar(255) NOT NULL,
  `sub_picture2` varchar(255) NOT NULL,
  `sub_picture3` varchar(255) NOT NULL,
  `delete_flg` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`item_id`),
  CONSTRAINT `pictures_ibfk_1` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pictures`
--

LOCK TABLES `pictures` WRITE;
/*!40000 ALTER TABLE `pictures` DISABLE KEYS */;
/*!40000 ALTER TABLE `pictures` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase`
--

DROP TABLE IF EXISTS `purchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchase` (
  `item_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `item_count` int(11) NOT NULL,
  `amount` float NOT NULL,
  `purchase_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_date` datetime NOT NULL,
  KEY `item_id` (`item_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `purchase_ibfk_1` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`),
  CONSTRAINT `purchase_ibfk_2` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`),
  CONSTRAINT `purchase_ibfk_3` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase`
--

LOCK TABLES `purchase` WRITE;
/*!40000 ALTER TABLE `purchase` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchase` ENABLE KEYS */;
UNLOCK TABLES;





/*!40101 SET character_set_client = @saved_cs_client */;



--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `phone_email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `login_flg` tinyint(1) NOT NULL DEFAULT '0',
  `user_flg` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-06 18:38:47
/*kagu_item*/

insert into item values(1,'キャビネット',15800,'img/item/kagu/cabinet_main.jpg',10,'0','2017/03/17','2017/03/17','kagu');
insert into item values(2,'アンティークチェスト',7800,'img/item/kagu/chest_main.jpg',10,'0','2017/03/17','2017/03/17','kagu');
insert into item values(3,'テーブル',5800,'img/item/kagu/table_main.jpg',10,'0','2017/03/17','2017/03/17','kagu');
insert into item values(4,'ドレッシングチェスト',15800,'img/item/kagu/dresser_main.jpg',10,'0','2017/03/17','2017/03/17','kagu');
insert into item values(5,'ソファー',10100,'img/item/kagu/sofa_main.jpg',10,'0','2017/03/17','2017/03/17','kagu');
insert into item values(6,'サロンチェアー',12800,'img/item/kagu/chair_main.jpg',10,'0','2017/03/17','2017/03/17','kagu');

/*kagu_pictures*/

insert into pictures values(1,'img/item/kagu/cabinet_sub1.jpg','img/item/kagu/cabinet_sub2.jpg','img/item/kagu/cabinet_sub3.jpg','0');
insert into pictures values(2,'img/item/kagu/chest_sub1.jpg','img/item/kagu/chest_sub2.jpg','img/item/kagu/chest_sub3.jpg','0');
insert into pictures values(3,'img/item/kagu/table_sub1.jpg','img/item/kagu/table_sub2.jpg','img/item/kagu/table_sub3.jpg','0');
insert into pictures values(4,'img/item/kagu/dresser_sub1.jpg','img/item/kagu/dresser_sub2.jpg','img/item/kagu/dresser_sub3.jpg','0');
insert into pictures values(5,'img/item/kagu/sofa_sub1.jpg','img/item/kagu/sofa_sub2.jpg','img/item/kagu/sofa_sub3.jpg','0');
insert into pictures values(6,'img/item/kagu/chair_sub1.jpg','img/item/kagu/chair_sub2.jpg','img/item/kagu/chair_sub3.jpg','0');


/*kaden_item*/

insert into item values(7,'コーヒーメーカー',10000,'img/item/kaden/coffee_maker.jpg',20,'0','2017-03-17-12:00','2017-03-17-12:00','kaden');
insert into item values(8,'トースター',1500,'img/item/kaden/toaster.jpg',20,'0','2017-03-17-12:00','2017-03-17-12:00','kaden');
insert into item values(9,'空気清浄器',2500,'img/item/kaden/coffee_maker.jpg',20,'0','2017-03-17-12:00','2017-03-17-12:00','kaden');
insert into item values(10,'蓄音機',5000,'img/item/kaden/chikuonki.jpg',20,'0','2017-03-17-12:00','2017-03-17-12:00','kaden');
insert into item values(11,'暖炉',8000,'img/item/kaden/danro.jpg',20,'0','2017-03-17-12:00','2017-03-17-12:00','kaden');
insert into item values(12,'ライト',4000,'img/item/kaden/light.jpg',20,'0','2017-03-17-12:00','2017-03-17-12:00','kaden');


/*kaden_picture*/

insert into pictures values(7,'img/item/kaden/coffee_maker2.jpg','img/item/kaden/coffee_maker3.jpg','img/item/kaden/coffee_maker4.jpg','0');
insert into pictures values(8,'img/item/kaden/air_clean2.jpg','img/item/kaden/air_clean3.jpg','img/item/kaden/air_clean4.jpg','0');
insert into pictures values(9,'img/item/kaden/toaster2.jpg','img/item/kaden/toaster3.jpg','img/item/kaden/toaster4.jpg','0');
insert into pictures values(10,'img/item/kaden/chikuonki_sub1.jpg','img/item/kaden/chikuonki_sub2.jpg','img/item/kaden/chikuonki_sub3.jpg','0');
insert into pictures values(11,'img/item/kaden/danro_sub1.jpg','img/item/kaden/danro_sub2.jpg','img/item/kaden/danro_sub3.jpg','0');
insert into pictures values(12,'img/item/kaden/light_sub1.jpg','img/item/kaden/light_sub2.jpg','img/item/kaden/light_sub3.jpg','0');


/*SALE item*/

insert into item values(13,"キャビネット", 6000, "img/item/sale/cabinet_main.jpg", 20, false, "2017-03-17-12:00", "2017-03-17-12:00", "sale");
insert into item values(14,"シャンデリア",8000, "img/item/sale/chandelier_main.jpg",20,false,"2017-03-17-12:00","2017-03-17-12:00","sale");
insert into item values(15,"時計", 3500, "img/item/sale/clock_main.jpg", 20,false,"2017-03-17-12:00","2017-03-17-12:00","sale");
insert into item values(16,"ソファー", 7000,"img/item/sale/sofa_main.jpg",20,false,"2017-03-17-12:00","2017-03-17-12:00","sale");
insert into item values(17,"ゴミ箱",2000,"img/item/sale/dust_box_main.jpg",20,false,"2017-03-17-12:00","2017-03-17-12:00","sale");
insert into item values(18,"ティータイム",2000,"img/item/sale/tea_time_main.jpg",20,false,"2017-03-17-12:00","2017-03-17-12:00","sale");



/*SALE_picture*/

insert into pictures values(13,'img/item/sale/cabinet_sub1.jpg','img/item/sale/cabinet_sub2.jpg','img/item/sale/cabinet_sub3.jpg', false);
insert into pictures values(14,'img/item/sale/chandelier_sub1.jpg','img/item/sale/chandelier_sub2.jpg','img/item/sale/chandelier_sub3.jpg', false);
insert into pictures values(15,'img/item/sale/clock_sub1.jpg','img/item/sale/clock_sub2.jpg','img/item/sale/clock_sub3.jpg',false);
insert into pictures values(16,'img/item/sale/dust_box_sub1.jpg','img/item/sale/dust_box_sub2.jpg','img/item/sale/dust_box_sub3.jpg', false);
insert into pictures values(17,'img/item/sale/sofa_sub1.jpg','img/item/sale/sofa_sub2.jpg','img/item/sale/sofa_sub3.jpg', false);
insert into pictures values(18,'img/item/sale/tea_time_sub1.jpg','img/item/sale/tea_time_sub2.jpg','img/item/sale/tea_time_sub3.jpg',false);
