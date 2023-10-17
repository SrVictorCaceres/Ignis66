-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-10-2023 a las 23:17:35
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
CREATE DATABASE IF NOT EXISTS `gestionbomberos` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `gestionbomberos`;

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
  `celular` varchar(12) DEFAULT NULL,
  `sexo` varchar(10) NOT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `tipoBombero` varchar(10) NOT NULL,
  `rango` varchar(20) NOT NULL,
  `idBrigada` int(11) DEFAULT NULL,
  `estado` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bomberos`
--

INSERT INTO `bomberos` (`idBombero`, `dni`, `nombreCompleto`, `fechaNacimiento`, `grupoSanguineo`, `fijo`, `celular`, `sexo`, `correo`, `tipoBombero`, `rango`, `idBrigada`, `estado`) VALUES
(1, 46640083, 'Ignacio Conti', '2000-08-15', 'A+', NULL, '221-3211557', 'Masculino', NULL, 'Zapador', 'Sub Ayudante', NULL, '1'),
(2, 42551730, 'Nicolas Delgado', '1996-02-23', 'B+', NULL, '11-67422410', 'Masculino', NULL, 'Voluntario', 'Ayudante', NULL, '1'),
(3, 28777121, 'Micaela Aguirre', '1980-09-02', 'A-', NULL, '223-5830811', 'Femenino', NULL, 'Voluntario', 'Ayudante Principal', NULL, '1'),
(4, 36029987, 'Andrea Matera', '1986-05-12', 'AB-', NULL, '266-6124447', 'Femenino', NULL, 'Voluntario', 'Sub Comandante', NULL, '1'),
(5, 41233891, 'Jorge Gomez', '2001-12-21', 'O+', NULL, '387-5550102', 'No Binario', NULL, 'Voluntario', 'Oficial Auxiliar', NULL, '1'),
(6, 25845107, 'Adrián Sarmiento', '1976-07-04', 'AB-', NULL, '342-4173366', 'Masculino', NULL, 'Voluntario', 'Comandante', NULL, '1'),
(7, 40015465, 'Yanina Blanco', '1991-03-12', 'A-', NULL, '351-5611057', 'Femenino', NULL, 'Zapador', 'Bombero', NULL, '1'),
(8, 35698307, 'Lorena Mansilla', '1990-01-08', 'AB+', NULL, '299-4104559', 'No Binario', NULL, 'Voluntario', 'Cuartelero', NULL, '1'),
(9, 33665009, 'Rodrigo Quiroga', '1988-08-24', 'B-', NULL, '2966-414395', 'Masculino', NULL, 'Voluntario', 'Ayudante', NULL, '1'),
(10, 42115887, 'Emilia De Souza', '1999-11-13', 'A-', NULL, '264-6655123', 'Femenino', NULL, 'Zapador', 'Bombero', NULL, '1'),
(11, 30284122, 'Carlos Silva', '1983-02-02', 'B+', NULL, '11-47875161', 'Masculino', NULL, 'Voluntario', 'Ayudante Principal', NULL, '1'),
(12, 48308912, 'Leandro Vazquez', '2001-09-30', 'B+', NULL, '11-63776318', 'No Binario', NULL, 'Voluntario', 'Sub Ayudante', NULL, '1'),
(13, 32549862, 'Alejandro Gonzalez', '1986-05-28', 'A-', NULL, '221-5075320', 'Masculino', NULL, 'Voluntario', 'Comandante', NULL, '1'),
(14, 36117246, 'Juan García', '1990-02-05', 'O+', NULL, '11-45672024', 'Masculino', NULL, 'Voluntario', 'Sub Ayudante', NULL, '1'),
(15, 23759860, 'Luis Peluso', '1972-06-19', 'B+', NULL, '2266-464115', 'Masculino', NULL, 'Voluntario', 'Comandante', NULL, '1'),
(16, 31997190, 'Carmen Coria', '1985-03-04', 'B-', NULL, '2274-331719', 'Femenino', NULL, 'Zapador', 'Bombero', NULL, '1'),
(17, 28800543, 'Esteban Aquino', '1982-10-30', 'O+', NULL, '2274-331719', 'Masculino', NULL, 'Voluntario', 'Cuartelero', NULL, '1'),
(18, 36002087, 'Fernando Acosta', '1993-04-30', 'B-', NULL, '2296-4567989', 'Masculino', NULL, 'Voluntario', 'Ayudante', NULL, '1'),
(19, 29606730, 'Guillermina Jara', '1982-05-24', 'O-', NULL, '2314-686810', 'Femenino', NULL, 'Voluntario', 'Sub Comandante', NULL, '1'),
(20, 30833761, 'Matías Palacios', '1983-12-09', 'A+', NULL, '2336-401802', 'Masculino', NULL, 'Zapador', 'Comandante', NULL, '1'),
(21, 17255310, 'Romina Ferreyra', '1990-03-08', 'A-', NULL, '11-66265891', 'Femenino', NULL, 'Voluntario', 'Ayudante Principal', NULL, '1'),
(22, 39349596, 'Rosario Torres', '1988-08-31', 'AB-', NULL, '2393-400750', 'Femenino', NULL, 'Voluntario', 'Sub Comandante', NULL, '1'),
(23, 23039763, 'Marcela Alvarez', '2001-07-26', 'A-', NULL, '223-4461772', 'Femenino', NULL, 'Voluntario', 'Bombero', NULL, '1'),
(24, 18708657, 'Paula Perez', '1977-06-20', 'A-', NULL, '2954-806722', 'Femenino', NULL, 'Voluntario', 'Bombero', NULL, '1'),
(25, 36015706, 'Agustina Villegas', '1975-07-26', 'B-', NULL, '266-5873036', 'Femenino', NULL, 'Voluntario', 'Bombero', NULL, '1'),
(26, 32072436, 'Mónica Flores', '1985-10-02', 'O-', NULL, '2945-794671', 'Femenino', NULL, 'Voluntario', 'Sub Comandante', NULL, '1'),
(27, 23259057, 'Sofia Arias', '1978-03-02', 'A-', NULL, '11-91637568', 'Femenino', NULL, 'Voluntario', 'Ayudante Principal', NULL, '1'),
(28, 24009156, 'María Reyes', '1995-02-14', 'AB-', NULL, '2933-516346', 'Femenino', NULL, 'Voluntario', 'Sub Comandante', NULL, '1'),
(29, 39287521, 'Martina Trotta', '1970-12-24', 'A-', NULL, '11-53431262', 'Femenino', NULL, 'Zapador', 'Bombero', NULL, '1'),
(30, 42951110, 'Cintia Toledo', '1999-01-05', 'B-', NULL, '2394-815321', 'Femenino', NULL, 'Zapador', 'Bombero', NULL, '1'),
(31, 21987612, 'Jorgelina Mendez', '1968-10-21', 'O-', NULL, '237-5532762', 'Femenino', NULL, 'Voluntario', 'Sub Comandante', NULL, '1'),
(32, 43844813, 'Joaquín Duarte', '1987-02-24', 'A+', NULL, '341-7203242', 'Masculino', NULL, 'Zapador', 'Sub Ayudante', NULL, '1'),
(33, 32447292, 'Daniel Bossio', '2003-06-25', 'B+', NULL, '2352-483399', 'Masculino', NULL, 'Voluntario', 'Ayudante', NULL, '1'),
(34, 23594482, 'Walter Monzón', '2003-08-24', 'AB-', NULL, '370-5148774', 'Masculino', NULL, 'Voluntario', 'Comandante', NULL, '1'),
(35, 43447065, 'Emanuel Basualdo', '1998-09-27', 'B-', NULL, '341-7081264', 'Masculino', NULL, 'Voluntario', 'Ayudante', NULL, '1'),
(36, 44807866, 'Ezequiel Leiva', '1988-05-29', 'B+', NULL, '2922-527275', 'Masculino', NULL, 'Voluntario', 'Ayudante Principal', NULL, '1'),
(37, 44934516, 'Pablo Carrizo', '1970-06-09', 'A-', NULL, '11-46856586', 'Masculino', NULL, 'Voluntario', 'Comandante', NULL, '1'),
(38, 31692364, 'Sebastián Collado', '1966-09-12', 'O+', NULL, '11-42737560', 'Masculino', NULL, 'Voluntario', 'Sub Ayudante', NULL, '1'),
(39, 32792747, 'Agustín Nievas', '1994-01-28', 'B+', NULL, '11-91199710', 'Masculino', NULL, 'Voluntario', 'Comandante', NULL, '1'),
(40, 40114017, 'Mariano Reynoso', '1995-07-17', 'O+', NULL, '342-4363642', 'Masculino', NULL, 'Voluntario', 'Cuartelero', NULL, '1'),
(41, 17096273, 'Diego Perez', '1997-04-21', 'B-', NULL, '236-7171358', 'Masculino', NULL, 'Voluntario', 'Ayudante', NULL, '1'),
(42, 25519808, 'Martín Huergo', '1975-08-14', 'A+', NULL, '376-7996161', 'Masculino', NULL, 'Zapador', 'Comandante', NULL, '1'),
(43, 36536311, 'José Luis Pereyra', '1975-01-23', 'B+', NULL, '11-82696774', 'Masculino', NULL, 'Voluntario', 'Ayudante', NULL, '1'),
(44, 24894461, 'Leonardo Garro', '1976-03-25', 'AB-', NULL, '11-48842565', 'Masculino', NULL, 'Voluntario', 'Comandante', NULL, '1'),
(45, 16011105, 'Ramón Alvarez', '1965-05-12', 'B-', NULL, '11-94688191', 'Masculino', NULL, 'Voluntario', 'Ayudante', NULL, '1'),
(46, 28566583, 'Ramón Ortega', '1991-09-18', 'B+', NULL, '291-9976593', 'Masculino', NULL, 'Voluntario', 'Ayudante Principal', NULL, '1'),
(47, 23710242, 'Lionel Ocampos', '1978-12-10', 'A-', NULL, '11-54877130', 'Masculino', NULL, 'Voluntario', 'Comandante', NULL, '1'),
(48, 20872357, 'Mauro Molina', '1982-01-28', 'O+', NULL, '11-78478841', 'Masculino', NULL, 'Voluntario', 'Sub Ayudante', NULL, '1'),
(49, 13046181, 'Antonio Díaz', '1969-05-10', 'O+', NULL, '2346-480627', 'Masculino', NULL, 'Voluntario', 'Cuartelero', NULL, '1'),
(50, 44096862, 'Emiliano Romero', '2003-04-25', 'B-', NULL, '342-4465661', 'Masculino', NULL, 'Voluntario', 'Ayudante', NULL, '1'),
(51, 30273789, 'Gastón Montiel', '1981-10-27', 'A+', NULL, '11-87688741', 'Masculino', NULL, 'Zapador', 'Comandante', NULL, '1'),
(52, 33819147, 'Jazmín Hernandez', '1981-10-07', 'O+', NULL, '3409-582863', 'No Binario', NULL, 'Voluntario', 'Oficial Auxiliar', NULL, '1'),
(53, 27802182, 'Angel Heredia', '1975-01-15', 'B+', NULL, '385-7284790', 'No Binario', NULL, 'Voluntario', 'Sub Ayudante', NULL, '1'),
(54, 34358756, 'Guido Moras', '1994-09-13', 'AB-', '11-23181357', '-', 'Masculino', 'gmoras@gmail.com', 'Zapador', 'SUBOFICIAL MAYOR', NULL, 'Activo'),
(59, 45000358, 'Ariel Gallego', '2000-10-20', 'A-', '-', '-', 'Masculino', 'arigalleg2000@gmail.com', 'Voluntario', 'CABO', NULL, 'Activo'),
(60, 215653102, 'Federico Rodriguez', '1984-10-24', 'B+', '2221111111', '-', 'Masculino', '', 'Voluntario', 'CABO', NULL, 'Activo'),
(61, 36650729, 'Almita Gomez', '1997-11-09', 'A+', '', '2216552792', 'Femenino', 'almagomez1997@gmail.com', 'Voluntario', 'Bombero', NULL, 'Inactivo'),
(62, 12888777, 'Javier Garay', '1958-08-11', 'B-', '2213337779-', '-2213337779', 'Masculino', 'javog.lp@gmail.com', 'Voluntario', 'OFICIAL PRINCIPAL', NULL, 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brigada`
--

CREATE TABLE `brigada` (
  `idBrigada` int(11) NOT NULL,
  `nombreBrigada` varchar(30) NOT NULL,
  `especialidad` varchar(30) NOT NULL,
  `libre` tinyint(4) NOT NULL,
  `estado` varchar(10) NOT NULL,
  `idCuartel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuartel`
--

CREATE TABLE `cuartel` (
  `idCuartel` int(11) NOT NULL,
  `nombreCuartel` varchar(50) NOT NULL,
  `coordenadaX` geometry NOT NULL,
  `coordenadaY` geometry NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `telefono` varchar(11) NOT NULL,
  `correo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movil`
--

CREATE TABLE `movil` (
  `idMovil` int(11) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `modelo` varchar(20) NOT NULL,
  `año` int(4) NOT NULL,
  `estado` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
  ADD PRIMARY KEY (`idBrigada`),
  ADD KEY `idCuartel` (`idCuartel`);

--
-- Indices de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`idCuartel`),
  ADD SPATIAL KEY `coordX` (`coordenadaX`),
  ADD SPATIAL KEY `coordY` (`coordenadaY`);

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
  MODIFY `idBombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=63;

--
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `idBrigada` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `idCuartel` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `movil`
--
ALTER TABLE `movil`
  MODIFY `idMovil` int(11) NOT NULL AUTO_INCREMENT;

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
-- Filtros para la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD CONSTRAINT `brigada_ibfk_1` FOREIGN KEY (`idCuartel`) REFERENCES `cuartel` (`idCuartel`);

--
-- Filtros para la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD CONSTRAINT `siniestro_ibfk_1` FOREIGN KEY (`idBrigada`) REFERENCES `brigada` (`idBrigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
