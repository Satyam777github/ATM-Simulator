-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: atm
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `acc_details`
--

DROP TABLE IF EXISTS `acc_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `acc_details` (
  `card_no` bigint NOT NULL,
  `user_id` int DEFAULT NULL,
  `pin` int DEFAULT NULL,
  `balance` int DEFAULT NULL,
  `acc_type` varchar(255) DEFAULT NULL,
  `service_req` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`card_no`),
  KEY `acc_details_ibfk_1` (`user_id`),
  CONSTRAINT `acc_details_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `acc_details`
--

LOCK TABLES `acc_details` WRITE;
/*!40000 ALTER TABLE `acc_details` DISABLE KEYS */;
INSERT INTO `acc_details` VALUES (12345678,1,1234,0,'NA','NA'),(5040935913557805,10,3858,0,'Saving Account',' ATM Card'),(5040935937880389,2,5120,1010,'Saving Account',' ATM Card Mobile Banking'),(5040935943487602,8,7462,0,'Saving Account',' ATM Card'),(5040935967073755,3,2829,14500,'Saving Account',' ATM Card Internet Banking E-Statement'),(5040936057563487,9,4765,0,'Saving Account',' ATM Card'),(5040936066351621,11,9270,0,'Saving Account',' ATM Card');
/*!40000 ALTER TABLE `acc_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logs`
--

DROP TABLE IF EXISTS `logs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `logs` (
  `serial_no` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `transactions` varchar(255) DEFAULT NULL,
  `amount` int NOT NULL,
  PRIMARY KEY (`serial_no`),
  KEY `logs_ibfk_1` (`user_id`),
  CONSTRAINT `logs_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logs`
--

LOCK TABLES `logs` WRITE;
/*!40000 ALTER TABLE `logs` DISABLE KEYS */;
INSERT INTO `logs` VALUES (1,6,'login',0),(2,6,'deposit',2000),(3,6,'pin change',0),(4,6,'withdrawl',200),(5,6,'login',0),(6,6,'login',0),(7,6,'login',0),(8,6,'login',0),(9,6,'login',0),(10,6,'login',0),(11,6,'login',0),(12,6,'login',0),(13,6,'login',0),(14,6,'login',0),(15,6,'login',0),(16,6,'login',0),(17,6,'login',0),(18,6,'login',0),(19,6,'login',0),(20,6,'login',0),(21,6,'login',0),(22,6,'login',0),(23,6,'login',0),(24,6,'login',0),(25,6,'login',0),(26,6,'login',0),(27,6,'login',0),(28,6,'login',0),(29,6,'login',0),(30,6,'login',0),(31,6,'login',0),(32,6,'login',0),(33,6,'login',0),(34,6,'login',0),(35,6,'login',0),(36,6,'login',0),(37,6,'login',0),(38,6,'login',0),(39,6,'login',0),(40,6,'login',0),(41,6,'login',0),(42,6,'login',0),(43,6,'login',0),(44,6,'login',0),(45,6,'login',0),(46,6,'login',0),(47,6,'login',0),(48,6,'login',0),(49,6,'login',0),(50,6,'login',0),(51,6,'login',0),(52,6,'login',0),(53,6,'login',0),(54,6,'login',0),(55,6,'login',0),(56,6,'login',0),(57,6,'withdrawl',500),(58,1,'login',0),(59,1,'login',0),(60,1,'login',0),(61,1,'login',0),(62,1,'login',0),(63,1,'login',0),(64,1,'login',0),(65,1,'login',0),(66,1,'login',0),(67,1,'login',0),(68,1,'login',0),(69,1,'login',0),(70,1,'login',0),(71,1,'login',0),(72,1,'login',0),(73,1,'login',0),(74,1,'login',0),(75,1,'login',0),(76,1,'login',0),(77,1,'login',0),(78,6,'login',0),(79,1,'login',0),(80,1,'login',0),(81,6,'login',0),(82,1,'login',0),(83,1,'login',0),(84,1,'login',0),(85,1,'login',0),(86,1,'login',0),(87,1,'login',0),(88,1,'login',0),(89,6,'login',0),(90,1,'login',0),(91,1,'login',0),(92,1,'login',0),(93,1,'login',0),(94,6,'login',0),(95,6,'deposit',10000),(96,6,'login',0),(97,1,'login',0),(98,3,'login',0),(99,3,'deposit',15000),(100,3,'withdrawl',500),(101,3,'login',0),(102,6,'login',0),(103,1,'login',0),(104,6,'login',0),(105,1,'login',0),(106,6,'login',0),(107,6,'withdrawl',1000),(108,6,'deposit',2500),(109,1,'login',0),(110,7,'new account registered',0),(111,7,'login',0),(112,7,'deposit',2500000),(113,7,'withdrawl',2000),(114,7,'login',0),(115,1,'login',0),(116,1,'login',0),(117,1,'login',0),(118,1,'login',0),(119,1,'login',0),(120,1,'login',0),(121,1,'login',0),(122,1,'login',0),(123,1,'login',0),(124,1,'login',0),(125,1,'login',0),(126,5,'removed account',0),(127,1,'login',0),(128,1,'login',0),(129,8,'new account registered',0),(130,1,'login',0),(131,9,'new account registered',0),(132,10,'new account registered',0),(133,1,'login',0),(134,1,'login',0),(135,11,'new account registered',0),(136,1,'login',0);
/*!40000 ALTER TABLE `logs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `role_id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'admin'),(2,'customer');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `role_id` int DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `father_name` varchar(255) NOT NULL,
  `dob` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `email_address` varchar(255) NOT NULL,
  `marital_status` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `pincode` varchar(255) NOT NULL,
  `state` varchar(255) NOT NULL,
  `religion` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `income` varchar(255) NOT NULL,
  `education_qualification` varchar(255) NOT NULL,
  `occupation` varchar(255) NOT NULL,
  `pan_no` varchar(255) NOT NULL,
  `aadhaar_no` varchar(255) NOT NULL,
  PRIMARY KEY (`user_id`),
  KEY `role_id` (`role_id`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,1,'Administrator','NA','01/01/2000','male','admin@xyz.com','NA','NA','NA','NA','NA','NA','NA','NA','NA','NA','NA','NA'),(2,2,'John Doe','Bob Doe','4/February/1990','male','john.doe@foo.com','married','6649 N Blue Gum St ','New Orleans ','70116 ','LA ',' Christian ',' General ',' <2,50,000 ',' Graduate ',' Salaried ',' 5046218927  ',' 8102929388  '),(3,2,'Josephine  Darakjy ','Donette  Darakjy ','8/March/2000','female','josephine_darakjy@darakjy.org ','unmarried','4 B Blue Ridge Blvd ','Agra','48116 ','UP',' Christian ',' General ',' Null ',' Graduate ',' Student ',' 5135701893  ',' 4195032484  '),(8,2,'Tucker ','Prescott ','2/November/2010','Male','suspendisse.tristique.neque@Maurisut.co.uk ','Unmarried','Ap #927-221 Justo Ave ','Sluis ','J3M 5AJ ','Zeeland ',' Christian ',' General ',' Null ',' Graduate ',' Student ',' 33AZP47Q78  ',' 49887492864 '),(9,2,'Quon',' Lance ','5/March/1991','Female','pharetra@amet.ca ','Married','2075 Cras St. ','Ust-Katav ','7655 GE ','CHE ',' Hindu ',' General ',' <5,00,000 ',' Post-Graduate ',' Salaried ',' 65AZP47R74  ',' 27536672678 '),(10,2,'Rashad ','Rowan ','5/February/1995','Male','viverra.Donec.tempus@Nuncut.edu ','Unmarried','P.O. Box 449, 2960 Ac Ave ','Berlin ','57324 ','Quebec ',' Muslim ',' General ',' Null ',' Graduate ',' Student ',' 33AZP47Q76 ',' 65383077388 '),(11,2,'Hermione ','Castor ','27/July/2002','Female','a.feugiat@posuere.edu ','Unmarried','975-9094 Convallis, St. ','Horsham ','07-248 ','VIC ',' Sikh ',' General ',' <5,00,000 ',' Graduate ',' Business ',' 53AZP57Q78  ',' 73627989236 ');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-11  8:18:07
