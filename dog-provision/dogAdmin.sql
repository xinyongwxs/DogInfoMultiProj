CREATE DATABASE  IF NOT EXISTS `dogAdmin` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `dogAdmin`;

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

DROP TABLE IF EXISTS `dog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dog` (
  `id` INT COLLATE utf8_unicode_ci NOT NULL AUTO_INCREMENT,
  `epdate` datetime DEFAULT NULL,
  `chipid` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `earid` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `type` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `kennelid` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `companycode` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `remarks` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

DROP TABLE IF EXISTS `breedingdog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `breedingdog` (
  `id` INT COLLATE utf8_unicode_ci NOT NULL,
  `matingdate` datetime DEFAULT NULL,
  `puppybirthday` datetime DEFAULT NULL,
  `feeder` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `readyforsell` BOOLEAN DEFAULT NULL,
  `price` FLOAT DEFAULT NULL,
  `puppyaccount` int(11) DEFAULT NULL,
  `category` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  foreign key (`id`)
  references dog (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `kennel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kennel` (
  `id` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `kennelid` int(11) DEFAULT NULL,
  `regionid` int(11) DEFAULT NULL,
  `address` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `type` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `kennel` WRITE;
/*!40000 ALTER TABLE `kennel` DISABLE KEYS */;
/*!40000 ALTER TABLE `kennel` ENABLE KEYS */;
UNLOCK TABLES;

DROP TABLE IF EXISTS `owner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `owner` (
  `id` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gender` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `owner` WRITE;
/*!40000 ALTER TABLE `owner` DISABLE KEYS */;
/*!40000 ALTER TABLE `owner` ENABLE KEYS */;
UNLOCK TABLES;

DROP TABLE IF EXISTS `petdog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `petdog` (
  `id` INT COLLATE utf8_unicode_ci NOT NULL,
  `traininglevel` int(11) DEFAULT NULL,
  `trainer` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `breeder` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `apperance` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `readyforsell` BOOLEAN DEFAULT NULL,
  `price` float DEFAULT NULL,
  `category` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  foreign key (`id`)
  references dog (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `petdog` WRITE;
/*!40000 ALTER TABLE `petdog` DISABLE KEYS */;
/*!40000 ALTER TABLE `petdog` ENABLE KEYS */;
UNLOCK TABLES;


DROP TABLE IF EXISTS `trainingdog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trainingdog` (
  `id` INT COLLATE utf8_unicode_ci NOT NULL,
  `ownerphone` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gender` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `courses` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `startdate` datetime DEFAULT NULL,
  `enddate` datetime DEFAULT NULL,
  `ownerid` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  foreign key (`id`)
  references dog (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `trainingdog` WRITE;
/*!40000 ALTER TABLE `trainingdog` DISABLE KEYS */;
/*!40000 ALTER TABLE `trainingdog` ENABLE KEYS */;
UNLOCK TABLES;


DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `position` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gender` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `workingdog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `workingdog` (
  `id` INT COLLATE utf8_unicode_ci NOT NULL,
  `traininglevel` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `trainer` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `readyforworking` BOOLEAN DEFAULT NULL,
  `price` float DEFAULT NULL,
  `category` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  foreign key (`id`)
  references dog (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
