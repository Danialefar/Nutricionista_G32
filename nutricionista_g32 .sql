-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-10-2023 a las 01:36:28
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
-- Base de datos: `nutricionista_g32`
--
CREATE DATABASE IF NOT EXISTS `nutricionista_g32` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `nutricionista_g32`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comida`
--

CREATE TABLE `comida` (
  `id_comida` int(11) NOT NULL,
  `nombre_comida` varchar(30) NOT NULL,
  `detalle_comida` varchar(200) NOT NULL,
  `calorias_comida` int(11) NOT NULL,
  `estado_comida` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comida`
--

INSERT INTO `comida` (`id_comida`, `nombre_comida`, `detalle_comida`, `calorias_comida`, `estado_comida`) VALUES
(1, 'INFUSION + FRUTA', 'INFUSION CON EDULCORANTE \n+ 2 RODAJAS DE PAN LACTAL CON MERMELADA O QUESO', 170, 1),
(2, 'YOGURT C/CEREAL', 'YOGURT DESC + 2 CUCHARADAS DE AVENA \n+ 1 DE PASAS DE CEREALES + 1 FRUTA', 80, 1),
(3, 'POLLO C/ENSALADA', '300GRS BIFE DE POLLO + 400 GRS DE ENSALADA MIXTA', 1700, 0),
(4, 'PESCADO C/PURE', '400 GRS PESCADO AL HORNO + 300 GRS DE PURE MIXTO', 580, 1),
(5, 'SANDWICH LIGHT', 'SANDW. PAN NEGRO JAMON Y QUESO', 300, 1),
(6, 'ARROZ C/CARNE', '1/2 PLATO DE ARROZ + PORCION 100GRS CARNE VACUNA', 420, 1),
(7, 'PASTA C/CARNE', '1/2 PLATO DE PASTA (sin relleno) + PORCIÓN 100grs CARNE VACUNA', 500, 1),
(8, 'Carne c/Legumbres', '100grm Carne Vacuna + 1/2 Plato de Legumbres (lenteja, soja, poroto)', 460, 1),
(9, 'Carne c/Papa ó Batata', '100grs Carne Vacuna + 1/2 Plato de Papas/Batatas al Horno', 460, 1),
(10, 'Pollo c/Ensalada', '300grs Pollo a la Plancha + 1/2 Plato de Ensalada Mixta (lechuga/tomate/huevo)', 440, 1),
(11, 'Frutas Varias', 'Fruta (naranja/banana/manzana/pera) 150grm', 150, 1),
(12, 'Ensalada de Frutas', 'Ensalada de Frutas 150grs (sin agregar azúcar) ', 200, 1),
(13, 'Gelatina', 'Gelatina Baja Calorías con o sin Frutas', 200, 1),
(14, 'Agua', '2-3 lts de Agua x Dìa', 0, 1),
(15, 'Huevo Revuelto', '2 Huevos Revueltos cocción en Microndas', 170, 1),
(16, 'Postre Descremado', '200grs Poste Descremado', 130, 1),
(17, 'Picada de Fiambres', '100grs de Jamon Cocido + 100grs de Mortadela + 200grs de Queso ', 290, 1),
(18, 'Flan', 'Flan Ligth 150gr  (1 pote chico)', 200, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `id_dieta` int(11) NOT NULL,
  `nombre_dieta` varchar(20) NOT NULL,
  `id_paciente` int(3) NOT NULL,
  `peso_inicial` double NOT NULL,
  `peso_final` double NOT NULL,
  `fecha_inicial` date NOT NULL,
  `fecha_final` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dieta`
--

INSERT INTO `dieta` (`id_dieta`, `nombre_dieta`, `id_paciente`, `peso_inicial`, `peso_final`, `fecha_inicial`, `fecha_final`) VALUES
(1, 'DIETA KETO', 3, 89, 78, '2023-10-17', '2023-11-21'),
(2, 'DIETA KETO', 4, 98, 80, '2023-09-17', '2023-10-20'),
(4, 'DIETA MEDITERRANEA', 4, 85, 74, '2023-10-15', '2023-10-19'),
(5, 'DIETA DASH', 9, 80, 75, '2023-10-19', '2023-10-19'),
(6, 'DIETA ORNISH', 9, 80, 70, '2023-10-10', '2023-11-18'),
(10, 'DIETA KETO', 4, 98, 75, '2023-10-23', '2023-12-18'),
(11, 'DIETA VEGANA', 5, 105, 85, '2023-10-23', '2023-11-20'),
(12, 'DIETA DASH', 11, 98, 75, '2023-10-24', '2023-12-05'),
(17, 'DIETA D.M.A.', 13, 45, 70, '2023-09-27', '2023-10-27'),
(18, 'DIETA KETO', 13, 90, 75, '2023-10-27', '2023-11-17');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta_comida`
--

CREATE TABLE `dieta_comida` (
  `id_dieta_comida` int(11) NOT NULL,
  `id_comida` int(11) NOT NULL,
  `id_dieta` int(11) NOT NULL,
  `tipo_comida` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dieta_comida`
--

INSERT INTO `dieta_comida` (`id_dieta_comida`, `id_comida`, `id_dieta`, `tipo_comida`) VALUES
(1, 1, 6, 'DESAYUNO'),
(2, 4, 6, 'ALMUERZO'),
(3, 2, 6, 'DESAYUNO'),
(4, 4, 6, 'ALMUERZO'),
(5, 1, 6, 'MERIENDA'),
(6, 5, 6, 'CENA'),
(7, 2, 6, 'COLACION'),
(8, 1, 10, 'DESAYUNO'),
(9, 4, 10, 'ALMUERZO'),
(10, 2, 10, 'MERIENDA'),
(11, 5, 10, 'CENA'),
(12, 5, 10, 'COLACION'),
(13, 1, 11, 'DESAYUNO'),
(14, 5, 11, 'ALMUERZO'),
(15, 2, 11, 'MERIENDA'),
(16, 4, 11, 'CENA'),
(17, 5, 11, 'COLACION'),
(18, 2, 11, 'DESAYUNO'),
(19, 5, 11, 'ALMUERZO'),
(20, 2, 11, 'MERIENDA'),
(21, 4, 11, 'CENA'),
(22, 1, 12, 'DESAYUNO'),
(23, 4, 12, 'ALMUERZO'),
(24, 2, 12, 'MERIENDA'),
(25, 5, 12, 'CENA'),
(26, 2, 12, 'DESAYUNO'),
(27, 5, 12, 'ALMUERZO'),
(28, 1, 12, 'MERIENDA'),
(29, 2, 11, 'DESAYUNO'),
(30, 6, 11, 'ALMUERZO'),
(31, 18, 11, 'MERIENDA'),
(32, 10, 11, 'CENA'),
(33, 11, 11, 'COLACION');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial`
--

CREATE TABLE `historial` (
  `id_historial` int(11) NOT NULL,
  `id_paciente` int(11) NOT NULL,
  `peso_registro` double NOT NULL,
  `fecha_registro` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `historial`
--

INSERT INTO `historial` (`id_historial`, `id_paciente`, `peso_registro`, `fecha_registro`) VALUES
(1, 4, 79.8, '2023-10-01'),
(10, 3, 70, '2023-10-10'),
(15, 3, 68, '2023-10-11'),
(16, 8, 50, '2023-10-12'),
(18, 9, 78, '2023-10-18'),
(20, 4, 75, '2023-10-18'),
(22, 12, 45, '2023-10-26'),
(26, 13, 51, '2023-10-25');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `id_paciente` int(11) NOT NULL,
  `dni_paciente` int(8) NOT NULL,
  `apellido_paciente` varchar(20) NOT NULL,
  `nombre_paciente` varchar(30) NOT NULL,
  `direccion_paciente` varchar(60) NOT NULL,
  `telef_paciente` varchar(11) NOT NULL,
  `estado_paciente` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`id_paciente`, `dni_paciente`, `apellido_paciente`, `nombre_paciente`, `direccion_paciente`, `telef_paciente`, `estado_paciente`) VALUES
(1, 33250000, 'FARIAS CORVALAN', 'JUAN MANUEL', 'JUAN JOSE PASO Nº542 Bº CIUDADELA - CORDOBA', '3517885544', 1),
(2, 14587411, '', 'fernando', 'Los Paraisos 547 San Martin - San Miguel - Tucuman', '3804781256', 1),
(3, 35888999, 'PRIOTTI', 'MARIA BELEN', 'SAN JUAN 458 - KENNEDY - CORDOBA CAPITAL - CORDOBA', '3514555777', 1),
(4, 45222000, 'FERNANDEZ', 'LUCIANO ABEL', 'DALLAS 1254 - CENTRO - FLORENCIO VARELA - BUENOS AIRES', '1149998781', 1),
(5, 29715886, 'GAUNA', 'JUAN MANUEL ALFREDO', 'AMENGUAL 132 - Bº JOSE I. DIAZ - LA FALDA - CORDOBA', '3548322112', 1),
(6, 28555000, 'MIRANDA FLORES', 'ARMANDO JOSÉ', 'MANUEL BELGRANO  7842 - Bº SAN JORGE - SUNCHALEZ - STA. FE', '3415412968', 1),
(7, 43434344, 'MIRAFLORES', 'MARGARITA ROSA', 'JARDIN ALEGRE 2109 - Bº JARDIN FLORIDO - FLORESTA - BS. AS', '1174587911', 1),
(8, 31744688, 'TEDESCO', 'VERONICA VANESA', 'PUBLICA S/N 4 DE FEBRERO', '3518157732', 1),
(9, 34777999, 'DIAZ PEREZ', 'EZEQUIEL GASTON', 'RIO URUGUAY 1254', '3881122481', 1),
(10, 30000000, 'GOMEZ', 'VALENTINA', 'JUAN DE AMENABAR 451 - SANTELMO', '1152458710', 1),
(11, 45365365, 'FORNAZARI', 'VISTORIA YOHANA', 'DALLAS  452 - Bº SANTA CATALINA - CRUZ ALTA - FORMOSA', '3842548899', 1),
(12, 31022022, 'FARIAS Gomez', 'DANIEL ALEJANDRO', 'ARKANSAS 1749 Bº SANTA ISABEL - CBA. CAPITAL - CORDOBA', '3513513519', 1),
(13, 38111333, 'Fratelli', 'Dante Osvaldo', 'Paso de los Andes 399 Bº José Hernandez - Flores - CABA', '0115566778', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comida`
--
ALTER TABLE `comida`
  ADD PRIMARY KEY (`id_comida`);

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`id_dieta`),
  ADD KEY `id_paciente` (`id_paciente`);

--
-- Indices de la tabla `dieta_comida`
--
ALTER TABLE `dieta_comida`
  ADD PRIMARY KEY (`id_dieta_comida`),
  ADD KEY `id_comida` (`id_comida`),
  ADD KEY `id_dieta` (`id_dieta`);

--
-- Indices de la tabla `historial`
--
ALTER TABLE `historial`
  ADD PRIMARY KEY (`id_historial`),
  ADD UNIQUE KEY `id_paciente` (`id_paciente`,`fecha_registro`) USING BTREE;

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id_paciente`),
  ADD UNIQUE KEY `dni_paciente` (`dni_paciente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comida`
--
ALTER TABLE `comida`
  MODIFY `id_comida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `id_dieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `dieta_comida`
--
ALTER TABLE `dieta_comida`
  MODIFY `id_dieta_comida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT de la tabla `historial`
--
ALTER TABLE `historial`
  MODIFY `id_historial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id_paciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id_paciente`);

--
-- Filtros para la tabla `dieta_comida`
--
ALTER TABLE `dieta_comida`
  ADD CONSTRAINT `dieta_comida_ibfk_1` FOREIGN KEY (`id_comida`) REFERENCES `comida` (`id_comida`),
  ADD CONSTRAINT `dieta_comida_ibfk_2` FOREIGN KEY (`id_dieta`) REFERENCES `dieta` (`id_dieta`);

--
-- Filtros para la tabla `historial`
--
ALTER TABLE `historial`
  ADD CONSTRAINT `historial_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id_paciente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
