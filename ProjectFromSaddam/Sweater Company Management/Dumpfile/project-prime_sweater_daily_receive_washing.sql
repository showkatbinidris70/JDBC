CREATE DATABASE  IF NOT EXISTS `project-prime_sweater` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `project-prime_sweater`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: project-prime_sweater
-- ------------------------------------------------------
-- Server version	5.7.15-log

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

--
-- Table structure for table `daily_receive_washing`
--

DROP TABLE IF EXISTS `daily_receive_washing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `daily_receive_washing` (
  `sl` int(11) NOT NULL AUTO_INCREMENT,
  `e_id` int(11) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  `style_no` int(11) DEFAULT NULL,
  `machine_no` int(11) DEFAULT NULL,
  `lot_no` int(11) DEFAULT NULL,
  `size` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  PRIMARY KEY (`sl`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `daily_receive_washing`
--

LOCK TABLES `daily_receive_washing` WRITE;
/*!40000 ALTER TABLE `daily_receive_washing` DISABLE KEYS */;
INSERT INTO `daily_receive_washing` VALUES (1,110,5000,250,11,85,'M','2018-12-05',13),(2,110,5025,275,11,85,'L','2018-12-05',13),(3,111,5025,275,11,85,'L','2018-12-05',13),(4,112,6550,350,11,85,'XL','2018-12-05',19),(5,110,6550,350,1,85,'L','2018-12-05',21),(6,111,6550,350,2,85,'M','2018-12-05',21),(7,112,6550,350,3,85,'XL','2018-12-05',21),(8,113,5000,250,1,85,'S','2018-12-05',18),(9,114,5000,250,1,85,'M','2018-12-05',19),(10,115,5000,250,3,85,'L','2018-12-05',13),(11,116,5000,250,4,70,'S','2018-12-05',24),(12,117,5025,275,5,85,'L','2018-12-05',13),(13,118,6550,350,5,85,'XL','2018-12-05',22),(14,115,5000,250,3,70,'M','2018-12-06',14);
/*!40000 ALTER TABLE `daily_receive_washing` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-10 15:34:20
