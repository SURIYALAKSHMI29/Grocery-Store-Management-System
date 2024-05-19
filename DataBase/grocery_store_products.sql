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
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `Category_Id` int DEFAULT NULL,
  `pro_id` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Sell_Price` double NOT NULL,
  `Qty_On_Hand` int DEFAULT '0',
  `Purchase_Price` double NOT NULL,
  PRIMARY KEY (`pro_id`),
  KEY `cate_id_pro_idx` (`Category_Id`),
  CONSTRAINT `cate_id_pro` FOREIGN KEY (`Category_Id`) REFERENCES `categories_pro` (`cate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,1,'Karupu Kavuni Arisi',52,69,49),(1,2,'Seeraga Samba Arisi',50,36,49),(1,3,'Basmati Rice',78,96,75),(1,4,'Sapadu Arisi',40,220,39),(1,5,'Ponni arisi',43,98,40),(1,6,'Idly Arisi',55,109,52),(1,7,'Kuthirai Vaazhi',120,8,118),(1,8,'Pacha Arisi',42,70,39),(1,9,'Kelogs Oats',108,153,106),(1,10,'Kelogs Oats',210,141,208),(1,11,'Kodumai',64,105,62),(1,12,'Barli Arisi',89,0,85),(2,13,'Lays',5,196,4.5),(2,14,'Bingo',10,2,9.5),(2,15,'Jim Jam',20,100,20),(2,16,'Hide & Seek',10,143,10),(2,17,'Good Day ',10,137,10),(2,18,'Good Day',25,156,24.5),(2,19,'Murukku',30,134,28),(2,20,'Oreo',20,210,20),(2,21,'Kit Kat',10,298,9.6),(2,22,'Dairy Milk',5,400,4.8),(2,23,'Dairy Milk',40,260,39.5),(2,24,'5 Star',10,258,9.7),(3,25,'Maaza',39,50,38),(3,26,'Bovonto',66,49,63),(3,27,'7 Up',44,48,42),(3,28,'Coca Cola',39,50,38),(3,29,'Slice',22,50,21),(3,30,'Fanta',79,50,76),(3,31,'Juice',10,116,9.75),(4,32,'Red chili powder',40,120,39),(4,33,'Cardamon powder',20,120,19.6),(4,34,'Turmeric powder',20,140,19.6),(4,35,'Coriander powder',35,120,34),(4,36,'Garam masala',45,139,44.2),(4,37,'Chicken 65 masala',49,138,48),(4,38,'Fry masala',52,140,50),(4,39,'Tomato Sauce',80,80,78.5),(5,40,'Milk',12,30,11),(5,41,'Curd',10,40,9.6),(5,42,'Butter',56,40,54),(5,43,'Milk',29,30,26),(5,44,'Curd',40,39,39),(6,45,'Medimix',26,50,24),(6,46,'Hamam',34,9,33),(6,47,'cinthal',39,23,38),(6,48,'Head & Shoulders',2,70,1.75),(6,49,'Dove',59,39,57.5),(6,50,'Pantene',3,79,2.85),(6,51,'Clean & Clear - Face Wash',60,90,58.25),(6,52,'Himalayas - Face Wash',68,0,67),(7,53,'Broom',120,35,118),(7,54,'Toilet Brush',69,34,67),(6,55,'Tooth Paste',20,52,19.25),(7,56,'Sponge',10,10,9.5),(7,57,'Dish Soap',22,36,21),(7,58,'Washing Powder',89,60,87),(7,59,'Dish Liquid',28,60,27.2),(7,60,'Wipes',80,30,78),(8,61,'Maida',70,58,68),(8,62,'Wheat Flour',90,60,88),(8,63,'Bajji maavu',46,44,44.5),(8,64,'Rice Flour',62,37,61.5),(9,65,'Jam',5,70,4.75),(9,66,'Pasta sauce',44,35,43),(9,67,'Vinegar',52,24,51),(9,68,'TidBits',189,30,185.5),(9,69,'Cup Noodles',210,60,208),(10,70,'Pacha Paruppu',88,80,87),(10,71,'Uzhunthu',140,88,137.25),(10,72,'Kadalai Paruppu',72,110,71),(10,73,'Thuvaram Paruppu',85,28,82.75),(10,74,'Rajma',182,69,180),(10,75,'Kondai Kadalai',61,78,59),(10,76,'Sundal',58,60,56),(10,77,'Ezhzhu',150,20,146),(10,78,'siru paruppu',114,35,113),(2,80,'eclairs',2,500,1.85);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-19 23:05:01
