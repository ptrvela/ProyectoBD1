-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.2.12-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para clinica
CREATE DATABASE IF NOT EXISTS `clinica` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `clinica`;

-- Volcando estructura para tabla clinica.cita
CREATE TABLE IF NOT EXISTS `cita` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `motivo` mediumtext DEFAULT NULL,
  `paciente_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cita_paciente1_idx` (`paciente_id`),
  CONSTRAINT `fk_cita_paciente1` FOREIGN KEY (`paciente_id`) REFERENCES `paciente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='	';

-- Volcando datos para la tabla clinica.cita: ~8 rows (aproximadamente)
/*!40000 ALTER TABLE `cita` DISABLE KEYS */;
INSERT INTO `cita` (`id`, `fecha`, `motivo`, `paciente_id`) VALUES
	(1, '2018-04-25', 'bcvbcvbcv', 4),
	(2, '2018-04-22', 'bcbcvbc', 4),
	(3, '2018-04-24', 'vbnvbnvbnb', 4),
	(4, '2018-04-23', 'fgdfgf', 4),
	(5, '2018-04-23', 'vbcbcv', 4),
	(6, '2018-04-23', 'gdfgdfg', 4),
	(8, '2018-05-09', 'lklkjlkjlkjlK', 4),
	(9, '2018-05-09', 'lklkjlkjlkjlK', 4),
	(12, '2018-04-23', 'lklkjlkjlkjlK', 4);
/*!40000 ALTER TABLE `cita` ENABLE KEYS */;

-- Volcando estructura para tabla clinica.diagnostico
CREATE TABLE IF NOT EXISTS `diagnostico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sintomas` longtext DEFAULT NULL,
  `diagnostico` mediumtext DEFAULT NULL,
  `tratamiento` longtext DEFAULT NULL,
  `observaciones` longtext DEFAULT NULL,
  `edad` int(3) DEFAULT NULL,
  `peso` double DEFAULT NULL,
  `altura` double DEFAULT NULL,
  `cita_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_diagnostico_cita1_idx` (`cita_id`),
  CONSTRAINT `fk_diagnostico_cita1` FOREIGN KEY (`cita_id`) REFERENCES `cita` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla clinica.diagnostico: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `diagnostico` DISABLE KEYS */;
INSERT INTO `diagnostico` (`id`, `sintomas`, `diagnostico`, `tratamiento`, `observaciones`, `edad`, `peso`, `altura`, `cita_id`) VALUES
	(1, 'nbmbnm', 'bnmbnmbn', 'bnmbnmb', 'bnmbnmbn', 321, 12, 21312, 4),
	(2, 'm,nm', 'nm,nm,', 'nm,nm,n', 'nm,nm,', 21, 12.12, 12.12, 6);
/*!40000 ALTER TABLE `diagnostico` ENABLE KEYS */;

-- Volcando estructura para tabla clinica.direccion
CREATE TABLE IF NOT EXISTS `direccion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `municipio` mediumtext DEFAULT NULL,
  `departamento` mediumtext DEFAULT NULL,
  `direccion` mediumtext DEFAULT NULL,
  `paciente_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_direccion_paciente1_idx` (`paciente_id`),
  CONSTRAINT `fk_direccion_paciente1` FOREIGN KEY (`paciente_id`) REFERENCES `paciente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla clinica.direccion: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `direccion` DISABLE KEYS */;
INSERT INTO `direccion` (`id`, `municipio`, `departamento`, `direccion`, `paciente_id`) VALUES
	(1, 'ddd', 'zczczxczx', '123123xzvcczxcz , zx. zxc', 4);
/*!40000 ALTER TABLE `direccion` ENABLE KEYS */;

-- Volcando estructura para tabla clinica.paciente
CREATE TABLE IF NOT EXISTS `paciente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `dpi` varchar(13) DEFAULT NULL,
  `telefono` varchar(8) DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `fechanacimiento` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla clinica.paciente: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` (`id`, `nombre`, `dpi`, `telefono`, `sexo`, `fechanacimiento`) VALUES
	(4, 'zxczx', '1231231231231', '12312312', 'M', '1231-04-12');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;

-- Volcando estructura para tabla clinica.proximacita
CREATE TABLE IF NOT EXISTS `proximacita` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `motivo` mediumtext DEFAULT NULL,
  `asistencia` tinyint(4) DEFAULT NULL,
  `paciente_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_proximacita_paciente1_idx` (`paciente_id`),
  CONSTRAINT `fk_proximacita_paciente1` FOREIGN KEY (`paciente_id`) REFERENCES `paciente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla clinica.proximacita: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `proximacita` DISABLE KEYS */;
INSERT INTO `proximacita` (`id`, `fecha`, `motivo`, `asistencia`, `paciente_id`) VALUES
	(1, '1234-04-12', 'zxczxczxczxczx', 0, 4),
	(2, '2018-04-23', 'jkjhkjhkjhkjh', 0, 4);
/*!40000 ALTER TABLE `proximacita` ENABLE KEYS */;

-- Volcando estructura para tabla clinica.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `pass` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla clinica.usuario: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`id`, `nombre`, `usuario`, `tipo`, `pass`) VALUES
	(1, 'welli', 'well', 'Administrador', '99800b85d3383e3a2fb45eb7d0066a4879a9dad0');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

-- Volcando estructura para disparador clinica.asistencia
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `asistencia` AFTER INSERT ON `proximacita` FOR EACH ROW BEGIN
	UPDATE proximacita SET asistencia=1 WHERE cita.fecha=proximacita.fecha AND cita.paciente_id=proximacita.paciente_id;
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Volcando estructura para disparador clinica.cfecha
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `cfecha` BEFORE INSERT ON `cita` FOR EACH ROW BEGIN
	SET NEW.fecha=NOW();
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
