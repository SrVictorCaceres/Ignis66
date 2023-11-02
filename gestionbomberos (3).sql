-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-10-2023 a las 23:02:07
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gestionbomberos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bomberos`
--

CREATE TABLE `bomberos` (
  `idBombero` int(11) NOT NULL,
  `dni` int(8) NOT NULL,
  `nombreCompleto` varchar(40) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `grupoSanguineo` varchar(5) NOT NULL,
  `fijo` varchar(11) DEFAULT NULL,
  `celular` bigint(12) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `tipoBombero` varchar(10) NOT NULL,
  `rango` varchar(20) NOT NULL,
  `idBrigada` int(11) DEFAULT NULL,
  `estado` varchar(10) NOT NULL,
  `especialidad` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bomberos`
--

INSERT INTO `bomberos` (`idBombero`, `dni`, `nombreCompleto`, `fechaNacimiento`, `grupoSanguineo`, `fijo`, `celular`, `sexo`, `correo`, `tipoBombero`, `rango`, `idBrigada`, `estado`, `especialidad`) VALUES
(1, 46640083, 'Ignacio Conti', '2000-08-15', 'A+', NULL, 2147483647, 'Masculino', 'iconti@gmail.com', 'Zapador', 'BOMBERO', 9999, 'ACTIVO', 'INCENDIO'),
(2, 42551738, 'Nicolas Delgado', '1996-02-23', 'B+', NULL, 1167422410, 'Masculino', NULL, 'Voluntario', 'BOMBERO', 10002, 'ACTIVO', 'RESCATE'),
(3, 28777121, 'Micaela Aguirre', '1980-09-02', 'A-', NULL, 2147483647, 'Femenino', NULL, 'Voluntario', 'BOMBERO', 16, 'ACTIVO', 'MAT. PELIGROSOS'),
(4, 36029983, 'Andrea Matera', '1986-05-12', 'AB-', NULL, 2147483645, 'Femenino', NULL, 'Voluntario', 'BOMBERO', 10, 'ACTIVO', 'INC. FORESTALES'),
(5, 41233891, 'Jorge Gomez', '2001-12-21', 'O+', NULL, 2147483641, 'Masculino', 'pepe.leon@hotmail.com', 'Voluntario', 'SARGENTO', 9, 'ACTIVO', 'MAT. PELIGROSOS'),
(6, 25845107, 'Adrián Sarmiento', '1976-07-04', 'AB-', NULL, 2147483647, 'Masculino', NULL, 'Voluntario', 'COMANDANTE', 12, 'ACTIVO', 'CANINA '),
(7, 40015465, 'Yanina Blanco', '1991-03-13', 'A-', NULL, 2147483647, 'Femenino', 'yaniwhiteee@outlook.com', 'Zapador', 'BOMBERO', 9, 'ACTIVO', 'MAT. PELIGROSOS'),
(8, 35698306, 'Lorena Mansilla', '1990-01-08', 'AB+', NULL, 2147483647, 'Femenino', NULL, 'Voluntario', 'BOMBERO', 9, 'ACTIVO', 'MAT. PELIGROSOS'),
(9, 33665009, 'Rodrigo Quiroga', '1988-08-24', 'B-', NULL, 2147483647, 'Masculino', NULL, 'Voluntario', 'BOMBERO', 11, 'ACTIVO', 'ACUATICA'),
(10, 42115887, 'Emilia De Souza', '1999-11-13', 'A-', NULL, 2147483647, 'Femenino', NULL, 'Zapador', 'BOMBERO', 14, 'ACTIVO', 'BUCEO'),
(11, 30284122, 'Carlos Silva', '1983-02-02', 'B+', NULL, 1178751615, 'Masculino', NULL, 'Voluntario', 'BOMBERO', 9999, 'ACTIVO', 'INCENDIO'),
(12, 48308912, 'Leandro Vazquez', '2001-09-30', 'B+', NULL, 1163776318, 'Masculino', NULL, 'Voluntario', 'BOMBERO', 10, 'ACTIVO', 'INC. FORESTALES'),
(13, 32549862, 'Alejandro Gonzalez', '1986-05-28', 'A-', NULL, 2147483647, 'Masculino', NULL, 'Voluntario', '', 9, 'ACTIVO', 'MAT. PELIGROSOS'),
(14, 36117246, 'Juan García', '1990-02-05', 'O+', NULL, 1145672024, 'Masculino', NULL, 'Voluntario', 'BOMBERO', 12, 'ACTIVO', 'CANINA '),
(15, 23759860, 'Luis Peluso', '1972-06-19', 'B+', NULL, 2147483647, 'Masculino', NULL, 'Voluntario', 'BOMBERO', 16, 'ACTIVO', 'MAT. PELIGROSOS'),
(16, 31997190, 'Carmen Coria', '1985-03-04', 'B-', NULL, 2147483647, 'Femenino', NULL, 'Zapador', 'BOMBERO', 11, 'ACTIVO', 'ACUATICA'),
(17, 28800543, 'Esteban Aquino', '1982-10-30', 'O+', NULL, 2147483647, 'Masculino', NULL, 'Voluntario', 'BOMBERO', 9999, 'ACTIVO', 'MONTAÑA'),
(18, 36002087, 'Fernando Acosta', '1993-04-30', 'B-', NULL, 2147483647, 'Masculino', NULL, 'Voluntario', 'SARGENTO 1°', 14, 'INACTIVO', 'BUCEO'),
(19, 29606730, 'Guillermina Jara', '1982-05-25', 'O-', NULL, 2147483647, 'Femenino', NULL, 'Voluntario', 'CABO PRIMERO', 10, 'ACTIVO', 'INC. FORESTALES'),
(20, 30833761, 'Matías Palacios', '1983-12-09', 'A+', NULL, 2147483647, 'Masculino', 'mpmp1234@gmail.com', 'Zapador', 'SARGENTO', 11, 'ACTIVO', 'ACUATICA'),
(21, 17255310, 'Romina Ferreyra', '1990-03-08', 'A-', NULL, 1166265891, 'Femenino', NULL, 'Voluntario', 'CABO PRIMERO', 9999, 'ACTIVO', 'MONTAÑA'),
(22, 39349596, 'Rosario Torres', '1988-08-31', 'AB-', NULL, 2147483647, 'Femenino', NULL, 'Voluntario', 'SARGENTO', 9999, 'ACTIVO', 'INCENDIO'),
(23, 23039763, 'Marcela Alvarez', '2001-07-26', 'A-', NULL, 2147483647, 'Femenino', NULL, 'Voluntario', 'SARGENTO', 9, 'ACTIVO', 'MAT. PELIGROSOS'),
(24, 18708657, 'Paula Perez', '1977-06-20', 'A-', NULL, 2147483647, 'Femenino', NULL, 'Voluntario', 'SARGENTO', 12, 'ACTIVO', 'CANINA '),
(25, 36015706, 'Agustina Villegas', '1975-07-26', 'B-', NULL, 2147483647, 'Femenino', NULL, 'Voluntario', 'OFICIAL PRINCIPAL', 10, 'ACTIVO', 'INC. FORESTALES'),
(26, 32072436, 'Mónica Flores', '1985-10-02', 'O-', NULL, 2147483647, 'Femenino', NULL, 'Voluntario', 'OFICIAL INSPECTOR', 9999, 'ACTIVO', 'MONTAÑA'),
(27, 23259057, 'Sofia Arias', '1978-03-02', 'A-', NULL, 1191637568, 'Femenino', NULL, 'Voluntario', 'COMANDANTE MAYOR', 10, 'ACTIVO', 'INC. FORESTALES'),
(28, 24009156, 'María Reyes', '1995-02-14', 'AB-', NULL, 2147483647, 'Femenino', NULL, 'Voluntario', 'CABO', 9999, 'ACTIVO', 'INCENDIO'),
(29, 39287521, 'Martina Trotta', '1970-12-24', 'A-', NULL, 1153431262, 'Femenino', NULL, 'Zapador', 'COMANDANTE GENERAL', 9999, 'ACTIVO', 'INCENDIO'),
(30, 42951110, 'Cintia Toledo', '1999-01-05', 'B-', NULL, 2147483647, 'Femenino', NULL, 'Zapador', 'SUBOFICIAL PRINCIPAL', 12, 'ACTIVO', 'CANINA '),
(31, 21987612, 'Jorgelina Mendez', '1968-10-21', 'O-', NULL, 2147483647, 'Femenino', NULL, 'Voluntario', 'COMANDANTE MAYOR', 9999, 'ACTIVO', 'INCENDIO'),
(32, 43844813, 'Joaquín Duarte', '1987-02-24', 'A+', NULL, 2147483647, 'Masculino', NULL, 'Zapador', 'SARGENTO', 10002, 'ACTIVO', 'RESCATE'),
(33, 32447888, 'Daniel Bossio', '2003-06-25', 'B+', NULL, 2147483647, 'Masculino', NULL, 'Voluntario', 'CABO', 9999, 'ACTIVO', 'INCENDIO'),
(34, 23594482, 'Walter Monzón', '2003-08-24', 'AB-', NULL, 2147483647, 'Masculino', NULL, 'Voluntario', 'BOMBERO', 14, 'ACTIVO', 'BUCEO'),
(35, 43447065, 'Emanuel Basualdo', '1998-09-27', 'B-', NULL, 2142131155, 'Masculino', NULL, 'Voluntario', 'BOMBERO', 14, 'ACTIVO', 'BUCEO'),
(36, 44807866, 'Ezequiel Leiva', '1988-05-29', 'B+', NULL, 1155611323, 'Masculino', NULL, 'Voluntario', 'CABO PRIMERO', 9999, 'ACTIVO', 'MAT. PELIGROSOS'),
(37, 44934516, 'Pablo Carrizo', '1970-06-09', 'A-', NULL, 1146856586, 'Masculino', NULL, 'Voluntario', 'SUBCOMANDANTE', 10002, 'ACTIVO', 'RESCATE'),
(38, 31692364, 'Sebastián Collado', '1966-09-12', 'O+', NULL, 1142737560, 'Masculino', NULL, 'Voluntario', 'COMANDANTE GENERAL', 9999, 'ACTIVO', 'INC. FORESTALES'),
(39, 32792747, 'Agustín Nievas', '1994-01-28', 'B+', NULL, 1191199710, 'Masculino', NULL, 'Voluntario', 'CABO', 9999, 'ACTIVO', 'INCENDIO'),
(40, 40114017, 'Mariano Reynoso', '1995-07-17', 'O+', NULL, 2147483642, 'Masculino', NULL, 'Voluntario', 'BOMBERO', 9999, 'ACTIVO', 'INCENDIO'),
(41, 17096273, 'Diego Perez', '1997-04-21', 'B-', NULL, 2111321232, 'Masculino', NULL, 'Voluntario', 'CABO', 8, 'ACTIVO', 'RESCATE'),
(42, 25519808, 'Martín Huergo', '1975-08-14', 'A+', NULL, 2147483647, 'Masculino', NULL, 'Zapador', 'OFICIAL AYUDANTE', 16, 'ACTIVO', 'MAT. PELIGROSOS'),
(43, 36536311, 'José Luis Pereyra', '1975-01-23', 'B+', NULL, 1182696774, 'Masculino', NULL, 'Voluntario', 'SUBOFICIAL MAYOR', 9999, 'ACTIVO', 'INC. FORESTALES'),
(44, 24894461, 'Leonardo Garro', '1976-03-25', 'AB-', NULL, 1148842565, 'Masculino', NULL, 'Voluntario', 'OFICIAL INSPECTOR', 11, 'ACTIVO', 'ACUATICA'),
(45, 16011105, 'Ramón Alvarez', '1965-05-12', 'B-', NULL, 1161700324, 'Masculino', NULL, 'Voluntario', 'COMANDANTE', 12, 'ACTIVO', 'CANINA '),
(46, 28566583, 'Ramón Ortega', '1991-09-18', 'B+', NULL, 2147483647, 'Masculino', NULL, 'Voluntario', 'CABO PRIMERO', 9999, 'ACTIVO', 'MONTAÑA'),
(47, 23710242, 'Lionel Ocampos', '1978-12-10', 'A-', NULL, 1154877130, 'Masculino', NULL, 'Voluntario', 'SARGENTO 1°', 14, 'ACTIVO', 'BUCEO'),
(48, 20872357, 'Mauro Molina', '1982-01-28', 'O+', NULL, 1178478841, 'Masculino', NULL, 'Voluntario', 'SUBOFICIAL PRINCIPAL', 9999, 'ACTIVO', 'BUCEO'),
(49, 13046181, 'Antonio Díaz', '1969-05-10', 'O+', NULL, 2147483647, 'Masculino', NULL, 'Voluntario', 'OFICIAL PRINCIPAL', 9999, 'ACTIVO', 'INCENDIO'),
(50, 44096862, 'Emiliano Romero', '2003-04-25', 'B-', NULL, 2147483647, 'Masculino', NULL, 'Voluntario', 'BOMBERO', 9999, 'ACTIVO', 'RESCATE'),
(51, 30273789, 'Gastón Montiel', '1981-10-27', 'A+', NULL, 1187688741, 'Masculino', NULL, 'Zapador', 'CABO PRIMERO', 16, 'ACTIVO', 'MAT. PELIGROSOS'),
(52, 33819147, 'Jazmín Hernandez', '1981-10-07', 'O+', NULL, 2147483647, 'Masculino', NULL, 'Voluntario', 'SARGENTO', 9999, 'ACTIVO', 'INC. FORESTALES'),
(53, 27802182, 'Angel Heredia', '1975-01-15', 'B+', NULL, 2147483647, 'Masculino', NULL, 'Voluntario', 'SUBOFICIAL MAYOR', 11, 'ACTIVO', 'ACUATICA'),
(54, 34358756, 'Guido Moras', '1994-09-13', 'AB-', '2213037713', 1155594123, 'Masculino', 'gmor@gmail.com', 'Zapador', 'SARGENTO 1°', 8, 'ACTIVO', 'RESCATE'),
(59, 45000358, 'Ariel Gallego', '2000-10-20', 'A-', NULL, 2147483647, 'Masculino', 'arigalleg2000@gmail.com', 'Voluntario', 'CABO', 16, 'ACTIVO', 'MAT. PELIGROSOS'),
(60, 215653102, 'Federico Rodriguez', '1984-10-24', 'B+', NULL, 2147483647, 'Masculino', 'prueba@ulp.org', 'Voluntario', 'CABO PRIMERO', 9999, 'ACTIVO', 'INC. FORESTALES'),
(73, 31265345, 'Mariana Vivas', '1984-10-19', 'AB+', '2234548788', 2147483647, 'Femenino', NULL, 'Voluntario', 'SARGENTO', 8, 'ACTIVO', 'RESCATE'),
(74, 13566800, 'Francisco Mendez', '1960-09-27', 'B-', NULL, 2147483647, 'Masculino', NULL, 'Voluntario', 'OFICIAL PRINCIPAL', 8, 'ACTIVO', 'RESCATE'),
(76, 13566801, 'Francisco Menendez', '1960-09-27', 'B-', NULL, 2147483647, 'Masculino', 'fjm60@hotmail.com', 'Voluntario', 'OFICIAL PRINCIPAL', 10002, 'ACTIVO', 'RESCATE'),
(77, 13566802, 'Francisco Nandez', '1960-09-27', 'B-', '2215570806', 2147483647, 'Masculino', NULL, 'Voluntario', 'OFICIAL PRINCIPAL', 10002, 'ACTIVO', 'RESCATE'),
(79, 13524723, 'Alberto Gonzalez', '1971-11-08', 'A-', '1134560124', 1165630073, '', NULL, 'Voluntario', 'CABO', 9999, 'ACTIVO', 'INCENDIO'),
(80, 34463121, 'Fernanda Cipollone', '1995-07-04', 'B+', NULL, 2147483647, 'Femenino', NULL, 'Voluntario', 'CABO', 9999, 'ACTIVO', 'INCENDIO'),
(81, 32123119, 'Ricardo Zozo', '1983-12-29', 'B+', NULL, 2147483647, 'Masculino', NULL, 'Voluntario', 'BOMBERO', 9999, 'ACTIVO', 'INCENDIO'),
(82, 33990556, 'Cintia Acuña', '1988-08-19', 'A+', NULL, 2216318899, 'Femenino', 'cinlp.87@hotmail.com', 'Voluntario', 'SARGENTO', 8, 'ACTIVO', 'RESCATE'),
(83, 1122221, 'Juan Diaz', '2000-10-01', 'A+', NULL, 1120235214, 'Otro', NULL, 'Voluntario', 'BOMBERO', 9999, 'ACTIVO', 'INCENDIO'),
(84, 12345667, 'JUAN PEREZ', '2023-11-12', 'B+', NULL, 2363252563, 'Masculino', NULL, 'Voluntario', 'SARGENTO 1°', 9999, 'ACTIVO', 'INC. FORESTALES');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brigada`
--

CREATE TABLE `brigada` (
  `idBrigada` int(11) NOT NULL,
  `nombreBrigada` varchar(30) NOT NULL,
  `especialidad` varchar(30) NOT NULL,
  `idBombero1` int(5) NOT NULL,
  `idBombero2` int(5) NOT NULL,
  `idBombero3` int(5) NOT NULL,
  `idBombero4` int(5) NOT NULL,
  `idBombero5` int(5) NOT NULL,
  `libre` varchar(10) NOT NULL,
  `estado` varchar(10) NOT NULL,
  `idCuartel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `brigada`
--

INSERT INTO `brigada` (`idBrigada`, `nombreBrigada`, `especialidad`, `idBombero1`, `idBombero2`, `idBombero3`, `idBombero4`, `idBombero5`, `libre`, `estado`, `idCuartel`) VALUES
(7, 'ALFA', 'INCENDIO', 0, 0, 0, 0, 0, 'LIBRE', 'INACTIVA', 12),
(8, 'BRAVO', 'RESCATE', 54, 82, 74, 73, 41, 'LIBRE', 'ACTIVA', 13),
(9, 'CHARLIE', 'MAT. PELIGROSOS', 5, 7, 8, 13, 23, 'LIBRE', 'ACTIVA', 13),
(10, 'DELTA', 'INC. FORESTALES', 4, 12, 19, 25, 27, 'LIBRE', 'ACTIVA', 13),
(11, 'ECHO', 'ACUATICA', 9, 16, 20, 44, 53, 'LIBRE', 'ACTIVA', 13),
(12, 'FOXTROT', 'CANINA ', 6, 14, 24, 30, 45, 'LIBRE', 'ACTIVA', 13),
(13, 'GOLF', 'MONTAÑA', 0, 0, 0, 0, 0, 'LIBRE', 'INACTIVA', 13),
(14, 'HOTEL', 'BUCEO', 10, 18, 34, 35, 47, 'LIBRE', 'ACTIVA', 13),
(15, 'BRAVO', 'RESCATE', 0, 0, 0, 0, 0, 'LIBRE', 'INACTIVA', 14),
(16, 'CHARLIE', 'MAT. PELIGROSOS', 3, 15, 42, 51, 59, 'LIBRE', 'ACTIVA', 14),
(17, 'DELTA', 'INC. FORESTALES', 0, 0, 0, 0, 0, 'LIBRE', 'INACTIVA', 16),
(18, 'ECHO', 'ACUATICA', 0, 0, 0, 0, 0, 'LIBRE', 'INACTIVA', 17),
(19, 'FOXTROT', 'CANINA ', 0, 0, 0, 0, 0, 'LIBRE', 'INACTIVA', 18),
(20, 'GOLF', 'MONTAÑA', 0, 0, 0, 0, 0, 'LIBRE', 'INACTIVA', 19),
(21, 'HOTEL', 'BUCEO', 0, 0, 0, 0, 0, 'LIBRE', 'INACTIVA', 22),
(22, 'HOTEL', 'INC. FORESTALES', 0, 0, 0, 0, 0, 'LIBRE', 'INACTIVA', 26),
(9999, 'SIN BRIGADA', 'SIN ESPECIALIDAD', 0, 0, 0, 0, 0, 'LIBRE', 'ACTIVO', 0),
(10000, 'ALFA', 'INCENDIO', 0, 0, 0, 0, 0, 'LIBRE', 'INACTIVA', 11),
(10001, 'ALFA', 'INCENDIO', 0, 0, 0, 0, 0, 'LIBRE', 'INACTIVA', 13),
(10002, 'BRAVO', 'RESCATE', 2, 32, 37, 77, 76, 'LIBRE', 'ACTIVA', 14);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuartel`
--

CREATE TABLE `cuartel` (
  `idCuartel` int(11) NOT NULL,
  `nombreCuartel` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `Ciudad` varchar(50) NOT NULL,
  `Provincia` varchar(50) NOT NULL,
  `telefono` varchar(11) NOT NULL,
  `coordenadaX` varchar(50) NOT NULL,
  `coordenadaY` varchar(50) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `estado` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuartel`
--

INSERT INTO `cuartel` (`idCuartel`, `nombreCuartel`, `direccion`, `Ciudad`, `Provincia`, `telefono`, `coordenadaX`, `coordenadaY`, `correo`, `estado`) VALUES
(11, 'División Cuartel I José María Calaza', 'Av. Belgrano 1547', 'San Nicolás ', 'Ciudad de Buenos Aires', '1143705857', '-34.61284964648445', ' -58.38841472883594', 'Socorro@gmail.com', 'ACTIVO'),
(12, 'Destacamento San Telmo', 'Bolivar 1419', 'San Telmo ', 'Ciudad de Buenos Aires', '1149452222', '-34.624384985155444', '-58.372801347012754', 'Socorro@gmail.com', 'ACTIVO'),
(13, 'División Cuartel IV  Recoleta ', 'Laprida 1739', 'Recoleta', 'Ciudad de Buenos Aires', '1148235146', '-34.589927416986356', '-58.40237354516254', 'Socorro@gmail.com', 'ACTIVO'),
(14, 'Destacamento Once', 'Billinghurst 471', 'Once', 'Ciudad de Buenos Aires', '1148632884', '-34.60409701763348', ' -58.41568502002933', 'Socorro@gmail.com', 'ACTIVO'),
(15, 'División Cuartel II  Patricios', 'Av. Caseros 2849', 'Parque Patricios', 'Ciudad de Buenos Aires', '1149432222', '-34.63627269172013', '-58.40301299088509', 'Socorro@gmail.com', 'ACTIVO'),
(16, 'Destacamento Nueva Pompeya', 'Av. Sáenz 1457', 'Nueva Pompeya', 'Ciudad de Buenos Aires', '1149114852', '-34.658305396674166', ' -58.41681788933946', 'Socorro@gmail.com', 'ACTIVO'),
(17, 'División Cuartel III  Barracas', 'Brandsen 1046', 'Barracas', 'Ciudad de Buenos Aires', '1143012222', '-34.63707431099562', '-58.367268233210645', 'Socorro@gmail.com', 'ACTIVO'),
(18, 'Destacamento Boca', 'Alte. Brown y Pedro de Mendoza', ' La Boca', 'Ciudad de Buenos Aires', '1143012121', '-34.635203162478525', '-58.36169489088536', 'Socorro@gmail.com', 'ACTIVO'),
(19, 'División Cuartel VIII Flores', 'Ramón L. Falcón 2255', 'Flores', 'Ciudad de Buenos Aires', '1146325806', '-34.62902846271735', ' -58.46020053166879', 'Socorro@gmail.com', 'ACTIVO'),
(20, 'División Cuartel X  Lugano', 'Cafayate y Ana Díaz', 'Villa Lugano', 'Ciudad de Buenos Aires', '1146054242', '-34.6834630040573', '-58.46947914330707', 'Socorro@gmail.com', 'ACTIVO'),
(21, 'División Cuartel VIII Nueva Chicago', 'Lisandro de la Torre 2830', 'Mataderos', 'Ciudad de Buenos Aires', '1146878743', '-34.66582216604948', '-58.49564184854965', 'Socorro@gmail.com', 'ACTIVO'),
(22, 'División Cuartel IX Versalles', 'Porcel de Peralta 750', 'Versalles', 'Ciudad de Buenos Aires', '1146410326', '-34.62963930717036', ' -58.52381120283265', 'Socorro@gmail.com', 'ACTIVO'),
(23, 'Destacamento  Villa Devoto', 'José Cubas 4142', 'Villa Devoto', 'Ciudad de Buenos Aires', '1145015604', '-34.59806464312379', ' -58.515669773997885', 'Socorro@gmail.com', 'ACTIVO'),
(24, 'Destacamento Villa Urquiza', 'Olazábal 5454', 'Villa Urquiza', 'Ciudad de Buenos Aires', '1145212222', '-34.57895430416091', '-58.48997360283476', 'Socorro@gmail.com', 'ACTIVO'),
(25, 'División Cuartel V Belgrano', 'Vuelta de Obligado 2254', 'Belgrano', 'Ciudad de Buenos Aires', '1147832222', '-34.559954392426505', '-58.45703637556014', 'Socorro@gmail.com', 'ACTIVO'),
(26, 'Destacamento Palermo', 'Guatemala 5966', 'Palermo', 'Ciudad de Buenos Aires', '1147722222', '-34.577439768706384', ' -58.43577310283203', 'Socorro@gmail.com', 'ACTIVO'),
(27, 'División Cuartel VI Villa Crespo', 'Av. Corrientes 5340', 'Villa Crespo', 'Ciudad de Buenos Aires', '1148542222', '-34.59855652707473', '-58.440255487490184', 'Socorro@gmail.com', 'ACTIVO'),
(31, 'División Cuartel IV  Recoleta ', 'Laprida 1739', 'Recoleta', 'Ciudad de Buenos Aires', '1148235146', '-34.589927416986356', '-58.40237354516254', 'Socorro@gmail.com', 'ACTIVO'),
(32, 'Asociacion Bomberos Voluntarios Maria Juana', 'Padre Calleri 301', 'María Juana', ' Santa Fe', '3406471000', ' -31.67618693068803', ' -61.75285112251022', 'bomberosmjuana@hotmail.com', 'ACTIVO'),
(33, 'Bomberos  Voluntarios de Rafaela', 'Jorge Newbery 674', 'Rafaela', 'Santa Fe', '3492443059', '-31.250241037683608', '-61.466135632305814', 'abvrafaela@hotmail.com', 'ACTIVO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movil`
--

CREATE TABLE `movil` (
  `idMovil` int(11) NOT NULL,
  `TipoVehiculo` varchar(20) NOT NULL,
  `Patente` varchar(20) NOT NULL,
  `Añomodelo` varchar(20) NOT NULL,
  `Tripulantes` int(4) NOT NULL,
  `estado` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `movil`
--

INSERT INTO `movil` (`idMovil`, `TipoVehiculo`, `Patente`, `Añomodelo`, `Tripulantes`, `estado`) VALUES
(1, 'Camión Bomba', 'AC213CP', '2017', 6, 'ACTIVO'),
(2, 'Unidad de Rescate', 'AA230RP', '2015', 4, 'ACTIVO'),
(3, 'Camión Bomba', 'AB652PL', '2016', 6, 'ACTIVO'),
(4, 'Unidad de Rescate', 'AF230RP', '2015', 4, 'ACTIVO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

CREATE TABLE `siniestro` (
  `idSiniestro` int(11) NOT NULL,
  `tipo` varchar(30) NOT NULL,
  `fechaSinietro` date NOT NULL,
  `coordenadaX` geometry NOT NULL,
  `coordenadaY` geometry NOT NULL,
  `detalles` text NOT NULL,
  `fechaResolucion` date NOT NULL,
  `puntuacion` int(11) NOT NULL,
  `idBrigada` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bomberos`
--
ALTER TABLE `bomberos`
  ADD PRIMARY KEY (`idBombero`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD KEY `idBrigada` (`idBrigada`);

--
-- Indices de la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD PRIMARY KEY (`idBrigada`);

--
-- Indices de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`idCuartel`);

--
-- Indices de la tabla `movil`
--
ALTER TABLE `movil`
  ADD PRIMARY KEY (`idMovil`);

--
-- Indices de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD PRIMARY KEY (`idSiniestro`),
  ADD KEY `idBrigada` (`idBrigada`),
  ADD SPATIAL KEY `coordX` (`coordenadaX`),
  ADD SPATIAL KEY `coordY` (`coordenadaY`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bomberos`
--
ALTER TABLE `bomberos`
  MODIFY `idBombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=85;

--
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `idBrigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10003;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `idCuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT de la tabla `movil`
--
ALTER TABLE `movil`
  MODIFY `idMovil` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `idSiniestro` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bomberos`
--
ALTER TABLE `bomberos`
  ADD CONSTRAINT `bomberos_ibfk_1` FOREIGN KEY (`idBrigada`) REFERENCES `brigada` (`idBrigada`);

--
-- Filtros para la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD CONSTRAINT `siniestro_ibfk_1` FOREIGN KEY (`idBrigada`) REFERENCES `brigada` (`idBrigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
