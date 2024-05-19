CREATE DATABASE  IF NOT EXISTS `grocery_store` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `grocery_store`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: grocery_store
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bill_desc`
--

DROP TABLE IF EXISTS `bill_desc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bill_desc` (
  `bill_id` int NOT NULL,
  `p_id` int NOT NULL,
  `Qty` int DEFAULT '1',
  KEY `bill_id_idx` (`bill_id`),
  KEY `p_id_idx` (`p_id`),
  CONSTRAINT `bill_id` FOREIGN KEY (`bill_id`) REFERENCES `bill` (`bill_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `p_id` FOREIGN KEY (`p_id`) REFERENCES `products` (`pro_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill_desc`
--

LOCK TABLES `bill_desc` WRITE;
/*!40000 ALTER TABLE `bill_desc` DISABLE KEYS */;
INSERT INTO `bill_desc` VALUES (1009,30,2),(1010,2,2),(1010,24,4),(1010,58,1),(1011,2,2),(1012,2,2),(1013,65,4),(1014,1,2),(1015,14,2),(1016,1,3),(1017,24,4),(1017,6,1),(1017,74,1),(1018,21,2),(1018,36,1),(1018,73,1),(1018,37,2),(1019,57,1),(1019,5,2),(1019,63,1),(1019,54,1),(1020,46,23),(1020,13,2),(1020,53,1),(1021,7,22),(1021,17,3),(1022,1,2),(1022,57,3),(1023,27,2),(1024,31,4),(1024,73,1),(1024,71,2),(1025,2,2),(1025,55,3),(1025,26,1),(1026,1,2),(1026,46,8),(1026,13,2);
/*!40000 ALTER TABLE `bill_desc` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-19 23:05:00
