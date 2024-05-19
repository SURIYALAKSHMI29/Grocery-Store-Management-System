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
-- Table structure for table `distributor_category_link`
--

DROP TABLE IF EXISTS `distributor_category_link`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `distributor_category_link` (
  `Dist_Id` int NOT NULL,
  `Cate_id` int NOT NULL,
  `Recent_Purchase_Date` date DEFAULT NULL,
  KEY `cate_id_dist_idx` (`Cate_id`),
  KEY `dist_id_dist_idx` (`Dist_Id`),
  CONSTRAINT `cate_id_dist` FOREIGN KEY (`Cate_id`) REFERENCES `categories_pro` (`cate_id`),
  CONSTRAINT `dist_id_dist` FOREIGN KEY (`Dist_Id`) REFERENCES `distributor` (`Distributor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `distributor_category_link`
--

LOCK TABLES `distributor_category_link` WRITE;
/*!40000 ALTER TABLE `distributor_category_link` DISABLE KEYS */;
INSERT INTO `distributor_category_link` VALUES (12,1,'2024-03-29'),(4,2,'2024-03-23'),(8,3,'2024-04-05'),(9,4,'2024-04-29'),(1,5,'2024-04-14'),(2,6,'2024-02-26'),(3,7,'2024-02-13'),(7,8,'2024-02-13'),(11,9,'2024-03-11'),(10,10,'2024-03-29'),(1,10,'2023-12-29'),(11,9,'2023-12-01'),(7,8,'2023-08-13'),(4,7,'2023-12-13'),(2,6,'2023-11-21'),(5,5,'2023-10-11'),(6,10,'2023-10-16'),(7,3,'2024-04-16'),(9,5,'2024-04-21'),(8,6,'2024-04-22'),(9,7,'2024-04-22');
/*!40000 ALTER TABLE `distributor_category_link` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-19 23:05:02
