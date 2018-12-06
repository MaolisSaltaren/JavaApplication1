CREATE DATABASE  IF NOT EXISTS `bd_flores` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bd_flores`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bd_flores
-- ------------------------------------------------------
-- Server version	5.6.42-log

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
-- Table structure for table `tbl_ciudades`
--

DROP TABLE IF EXISTS `tbl_ciudades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_ciudades` (
  `CIUD_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CIUD_NOMBRE` varchar(45) NOT NULL,
  PRIMARY KEY (`CIUD_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_ciudades`
--

LOCK TABLES `tbl_ciudades` WRITE;
/*!40000 ALTER TABLE `tbl_ciudades` DISABLE KEYS */;
INSERT INTO `tbl_ciudades` VALUES (1,'riohacha'),(2,'bogotá'),(3,'bogotá'),(4,'bogota'),(5,'medellin'),(6,'bucaramanga');
/*!40000 ALTER TABLE `tbl_ciudades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_detalle_pedido`
--

DROP TABLE IF EXISTS `tbl_detalle_pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_detalle_pedido` (
  `DEPE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `DEPE_CANT` int(11) NOT NULL,
  `FLOR_ID` int(11) DEFAULT NULL,
  `PEDI_ID` bigint(15) DEFAULT NULL,
  PRIMARY KEY (`DEPE_ID`),
  KEY `FK_TBL_FLORES_TBL_DETALLEPEDI_idx` (`FLOR_ID`),
  KEY `FK_TBLPEDIDOS_TBL_DETALLE_PEDIDO_idx` (`PEDI_ID`),
  CONSTRAINT `FK_TBLPEDIDOS_TBL_DETALLE_PEDIDO` FOREIGN KEY (`PEDI_ID`) REFERENCES `tbl_pedidos` (`PEDI_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_TBL_FLORES_TBL_DETALLEPEDI` FOREIGN KEY (`FLOR_ID`) REFERENCES `tbl_flores` (`FLOR_ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_detalle_pedido`
--

LOCK TABLES `tbl_detalle_pedido` WRITE;
/*!40000 ALTER TABLE `tbl_detalle_pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_detalle_pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_estado_pedi`
--

DROP TABLE IF EXISTS `tbl_estado_pedi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_estado_pedi` (
  `ESPE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ESPE_ESTADO` varchar(45) NOT NULL,
  PRIMARY KEY (`ESPE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_estado_pedi`
--

LOCK TABLES `tbl_estado_pedi` WRITE;
/*!40000 ALTER TABLE `tbl_estado_pedi` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_estado_pedi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_flores`
--

DROP TABLE IF EXISTS `tbl_flores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_flores` (
  `FLOR_ID` int(11) NOT NULL AUTO_INCREMENT,
  `FLOR_DESCRIPCION` varchar(45) NOT NULL,
  PRIMARY KEY (`FLOR_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_flores`
--

LOCK TABLES `tbl_flores` WRITE;
/*!40000 ALTER TABLE `tbl_flores` DISABLE KEYS */;
INSERT INTO `tbl_flores` VALUES (1,'margarita');
/*!40000 ALTER TABLE `tbl_flores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_histo_pedidos`
--

DROP TABLE IF EXISTS `tbl_histo_pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_histo_pedidos` (
  `HIPO_ID` int(11) NOT NULL,
  `ESTADO` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`HIPO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_histo_pedidos`
--

LOCK TABLES `tbl_histo_pedidos` WRITE;
/*!40000 ALTER TABLE `tbl_histo_pedidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_histo_pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_inventarios`
--

DROP TABLE IF EXISTS `tbl_inventarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_inventarios` (
  `INVE_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `INVE_PRECIO` double NOT NULL,
  `INVE_STOK` double NOT NULL,
  `INVE_STOK_MIN` double NOT NULL,
  `INVE_ESTADO` char(20) NOT NULL,
  `FLOR_ID` int(11) NOT NULL,
  PRIMARY KEY (`INVE_ID`),
  KEY `FK_FLORID_TBL_FLORES_idx` (`FLOR_ID`),
  CONSTRAINT `FK_FLORID_TBL_FLORES` FOREIGN KEY (`FLOR_ID`) REFERENCES `tbl_flores` (`FLOR_ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_inventarios`
--

LOCK TABLES `tbl_inventarios` WRITE;
/*!40000 ALTER TABLE `tbl_inventarios` DISABLE KEYS */;
INSERT INTO `tbl_inventarios` VALUES (1,150000,10,5,'activo',1),(2,150000,10,5,'activo',1),(3,150000,10,5,'activo',1),(4,750000,10,1,'activo',1),(5,89000000,10,1,'activo',1),(6,89000000,10,1,'activo',1),(7,300000,50,20,'activo',1),(8,300000,50,20,'activo',1),(9,200000,20,20,'desactivo',1);
/*!40000 ALTER TABLE `tbl_inventarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_pedidos`
--

DROP TABLE IF EXISTS `tbl_pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_pedidos` (
  `PEDI_ID` bigint(15) NOT NULL AUTO_INCREMENT,
  `PEDI_FECHA` date NOT NULL,
  `PEDI_OBSERVACION` varchar(45) NOT NULL,
  `PEDI_DIRECCION` varchar(45) NOT NULL,
  `CIUD_ID` int(11) DEFAULT NULL,
  `PERS_IDENTIFICACION` varchar(45) DEFAULT NULL,
  `ESPE_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`PEDI_ID`),
  KEY `FK_PEDIDOS_TBLESTADOPEDI_idx` (`ESPE_ID`),
  KEY `FK_TBL_PEDIDOS_TBL_PERSONAS_idx` (`PERS_IDENTIFICACION`),
  KEY `FK_TBL_PEDIDOS_TBL_CIUDADES_idx` (`CIUD_ID`),
  CONSTRAINT `FK_PEDIDOS_TBLESTADOPEDI` FOREIGN KEY (`ESPE_ID`) REFERENCES `tbl_estado_pedi` (`ESPE_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_TBL_PEDIDOS_TBL_CIUDADES` FOREIGN KEY (`CIUD_ID`) REFERENCES `tbl_ciudades` (`CIUD_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_TBL_PEDIDOS_TBL_PERSONAS` FOREIGN KEY (`PERS_IDENTIFICACION`) REFERENCES `tbl_personas` (`PERS_IDENTIFICACION`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_pedidos`
--

LOCK TABLES `tbl_pedidos` WRITE;
/*!40000 ALTER TABLE `tbl_pedidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_personas`
--

DROP TABLE IF EXISTS `tbl_personas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_personas` (
  `PERS_IDENTIFICACION` varchar(45) NOT NULL,
  `PERS_TIPO_IDEN` varchar(45) NOT NULL,
  `PERS_TIPOPERS` varchar(45) NOT NULL,
  `PERS_TELEFONO` varchar(45) NOT NULL,
  `PERS_DIRECCION` varchar(45) NOT NULL,
  `PERS_EMAIL` varchar(45) NOT NULL,
  `PERS_SEXO` varchar(45) DEFAULT NULL,
  `PERS_FECHANA` date DEFAULT NULL,
  PRIMARY KEY (`PERS_IDENTIFICACION`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_personas`
--

LOCK TABLES `tbl_personas` WRITE;
/*!40000 ALTER TABLE `tbl_personas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_personas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_roles`
--

DROP TABLE IF EXISTS `tbl_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_roles` (
  `ROL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ROL_NOMBRE` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ROL_ID`),
  UNIQUE KEY `ROL_NOMBRE_UNIQUE` (`ROL_NOMBRE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_roles`
--

LOCK TABLES `tbl_roles` WRITE;
/*!40000 ALTER TABLE `tbl_roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_usuarios`
--

DROP TABLE IF EXISTS `tbl_usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_usuarios` (
  `USU_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USU_USUARIO` varchar(45) DEFAULT NULL,
  `USU_PASS` varchar(45) DEFAULT NULL,
  `PERS_IDENTIFICACION` varchar(45) NOT NULL,
  `ROL_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`USU_ID`),
  UNIQUE KEY `USU_USUARIO_UNIQUE` (`USU_USUARIO`),
  KEY `fk_TBL_USUARIOS_TBL_PERSONAS1_idx` (`PERS_IDENTIFICACION`),
  KEY `FK_TBL_USUARIOS_TBL_ROLES_idx` (`ROL_ID`),
  CONSTRAINT `FK_TBL_USUARIOS_TBL_ROLES` FOREIGN KEY (`ROL_ID`) REFERENCES `tbl_roles` (`ROL_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_TBL_USUARIOS_TBL_PERSONAS1` FOREIGN KEY (`PERS_IDENTIFICACION`) REFERENCES `tbl_personas` (`PERS_IDENTIFICACION`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_usuarios`
--

LOCK TABLES `tbl_usuarios` WRITE;
/*!40000 ALTER TABLE `tbl_usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bd_flores'
--

--
-- Dumping routines for database 'bd_flores'
--
/*!50003 DROP PROCEDURE IF EXISTS `insertarCiudades` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertarCiudades`(nombreciudad varchar(45))
BEGIN

insert into tbl_ciudades (ciud_nombre) values(nombreciudad);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertarIventario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertarIventario`(inve_precio double
,stok double,stok_min double,estado char(20),flor_id int (11))
BEGIN

insert into tbl_inventarios (INVE_PRECIO,INVE_STOK,INVE_STOK_MIN,INVE_ESTADO,FLOR_ID) values(
inve_precio,stok,stok_min,estado,flor_id


);

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-27 10:00:20
