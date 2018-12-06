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
  PRIMARY KEY (`CIUD_ID`),
  UNIQUE KEY `CIUD_NOMBRE_UNIQUE` (`CIUD_NOMBRE`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_ciudades`
--

LOCK TABLES `tbl_ciudades` WRITE;
/*!40000 ALTER TABLE `tbl_ciudades` DISABLE KEYS */;
INSERT INTO `tbl_ciudades` VALUES (14,'bogotá'),(18,'cartagena'),(21,'cucuta'),(16,'dibulla manaure'),(23,'juan'),(10,'Riohacha');
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
  `PEDI_ID` bigint(15) DEFAULT NULL,
  `PROD_ID` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`DEPE_ID`),
  KEY `FK_DETALLEPEDIDO_TBLPEDIDO_idx` (`PEDI_ID`),
  KEY `FK_DETALLEPEDIDO_TBLPRODUCTOS_idx` (`PROD_ID`),
  CONSTRAINT `FK_DETALLEPEDIDO_TBLPEDIDO` FOREIGN KEY (`PEDI_ID`) REFERENCES `tbl_pedidos` (`PEDI_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_DETALLEPEDIDO_TBLPRODUCTOS` FOREIGN KEY (`PROD_ID`) REFERENCES `tbl_productos` (`PROD_ID`) ON DELETE CASCADE ON UPDATE CASCADE
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
  `PERS_NOMBRE` varchar(45) DEFAULT NULL,
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
INSERT INTO `tbl_personas` VALUES ('1118837113','Seleccione','juan david ','3043377736','calle 49','juandrdondo@gmail.com','Seleccione','2008-05-02'),('5654','Cedula de ciudadania','654','6546','5465','6+545','Masculino','2008-09-02');
/*!40000 ALTER TABLE `tbl_personas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_productos`
--

DROP TABLE IF EXISTS `tbl_productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_productos` (
  `PROD_ID` varchar(45) NOT NULL,
  `PROD_NOMBRE` varchar(45) NOT NULL,
  `PROD_STOK` double DEFAULT NULL,
  `PROD_PRECIO` double DEFAULT NULL,
  PRIMARY KEY (`PROD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_productos`
--

LOCK TABLES `tbl_productos` WRITE;
/*!40000 ALTER TABLE `tbl_productos` DISABLE KEYS */;
INSERT INTO `tbl_productos` VALUES ('1234','coco',50,10000),('124','margarita',20,2000),('14156','maiz',10000,10000);
/*!40000 ALTER TABLE `tbl_productos` ENABLE KEYS */;
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
/*!50003 DROP PROCEDURE IF EXISTS `ciudadesBusqueda` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ciudadesBusqueda`(nombreciudad varchar(45))
BEGIN

 select * from tbl_ciudades where ciud_nombre like concat('%',nombreciudad,'%');
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ciudadesEliminar` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ciudadesEliminar`(nombreCiudad varchar(45))
BEGIN
 delete from tbl_ciudades where ciud_id =nombreCiudad;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ciudadesModificar` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ciudadesModificar`(nombreCiudad varchar(45),idCiudad int)
BEGIN
 update  tbl_ciudades set ciud_nombre =nombreCiudad where ciud_id = idCiudad;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `cuidadesInsertar` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `cuidadesInsertar`(nombreciudad varchar(45))
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
/*!50003 DROP PROCEDURE IF EXISTS `new_procedure` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `new_procedure`(
_PERS_IDENTIFICACION varchar(45),
_PERS_TIPO_IDEN varchar(45),
_PERS_NOMBRE varchar(45),
_PERS_TELEFONO varchar(45),
_PERS_DIRECCION varchar(45),
_PERS_EMAIL varchar(45),
_PERS_SEXO varchar(45),
_PERS_FECHANA date 

)
BEGIN

insert into tbl_personas (

PERS_IDENTIFICACION ,
PERS_TIPO_IDEN ,
PERS_NOMBRE ,
PERS_TELEFONO ,
PERS_DIRECCION ,
PERS_EMAIL ,
PERS_SEXO ,
PERS_FECHANA  
) 


values (
_PERS_IDENTIFICACION ,
_PERS_TIPO_IDEN ,
_PERS_NOMBRE ,
_PERS_TELEFONO ,
_PERS_DIRECCION ,
_PERS_EMAIL ,
_PERS_SEXO ,
_PERS_FECHANA  

);

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `personasBusqueda` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `personasBusqueda`(valorBuscado varchar(45))
BEGIN
select * from tbl_personas where pers_nombre like concat('%',valorBuscado,'%');

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `personasEliminar` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `personasEliminar`(idPersona varchar(45))
BEGIN
 delete from tbl_personas where pers_identificacion= idPersona;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `personasInsertar` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `personasInsertar`(
_PERS_IDENTIFICACION varchar(45),
_PERS_TIPO_IDEN varchar(45),
_PERS_NOMBRE varchar(45),
_PERS_TELEFONO varchar(45),
_PERS_DIRECCION varchar(45),
_PERS_EMAIL varchar(45),
_PERS_SEXO varchar(45),
_PERS_FECHANA date 

)
BEGIN

insert into tbl_personas (

PERS_IDENTIFICACION ,
PERS_TIPO_IDEN ,
PERS_NOMBRE ,
PERS_TELEFONO ,
PERS_DIRECCION ,
PERS_EMAIL ,
PERS_SEXO ,
PERS_FECHANA  
) 


values (
_PERS_IDENTIFICACION ,
_PERS_TIPO_IDEN ,
_PERS_NOMBRE ,
_PERS_TELEFONO ,
_PERS_DIRECCION ,
_PERS_EMAIL ,
_PERS_SEXO ,
_PERS_FECHANA  

);

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `personasModificar` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `personasModificar`(
_PERS_IDENTIFICACION varchar(45),
_PERS_TIPO_IDEN varchar(45),
_PERS_NOMBRE varchar(45),
_PERS_TELEFONO varchar(45),
_PERS_DIRECCION varchar(45),
_PERS_EMAIL varchar(45),
_PERS_SEXO varchar(45),
_PERS_FECHANA date 
)
BEGIN

update tbl_personas set  
PERS_TIPO_IDEN=_PERS_TIPO_IDEN ,
PERS_NOMBRE =_PERS_NOMBRE,
PERS_TELEFONO =_PERS_TELEFONO,
PERS_DIRECCION=_PERS_DIRECCION ,
PERS_EMAIL=_PERS_EMAIL ,
PERS_SEXO =_PERS_SEXO,
PERS_FECHANA  =_PERS_FECHANA
WHERE PERS_IDENTIFICACION=_PERS_IDENTIFICACION;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `productosBusqueda` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `productosBusqueda`(
nombre varchar(45))
BEGIN
 select * from tbl_productos  where prod_nombre like concat('%',nombre,'%');

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `productosEliminar` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `productosEliminar`(
producto varchar(45))
BEGIN
 delete from tbl_productos where prod_id =producto;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `productosInsertar` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `productosInsertar`(
PROD_ID varchar(45),
PROD_NOMBRE VARCHAR(45),
PROD_STOK DOUBLE,
PROD_PRECIO DOUBLE)
BEGIN

insert into tbl_productos(
PROD_ID,
PROD_NOMBRE,
PROD_STOK,
PROD_PRECIO

) values (
PROD_ID,
PROD_NOMBRE,
PROD_STOK,
PROD_PRECIO

);


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `productosModificar` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `productosModificar`(
ID varchar(45),
PROD_NOMBRE VARCHAR(45),
PROD_STOK DOUBLE,
PROD_PRECIO DOUBLE)
BEGIN

update tbl_productos set 

PROD_NOMBRE=PROD_NOMBRE,
PROD_STOK=PROD_STOK,
PROD_PRECIO=PROD_PRECIO where  PROD_ID  =ID ;



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

-- Dump completed on 2018-11-30 18:42:46
