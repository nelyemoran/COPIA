-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-01-2023 a las 16:51:41
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `examen3`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE `citas` (
  `codigo` int(11) NOT NULL,
  `nombresPaciente` varchar(30) NOT NULL,
  `apellidosPaciente` varchar(30) NOT NULL,
  `fechCita` date DEFAULT NULL,
  `horaCita` varchar(6) NOT NULL,
  `idClinica` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `citas`
--

INSERT INTO `citas` (`codigo`, `nombresPaciente`, `apellidosPaciente`, `fechCita`, `horaCita`, `idClinica`) VALUES
(1, 'Alexander Fabián', 'Hernández Navarro', '2022-12-16', '11:30', 1),
(2, 'Lizbeth Camila', 'Uribe Florez', '2023-01-25', '8:00', 5),
(3, 'Nelson', 'Moran Moran', '2023-01-25', '13:30', 3),
(4, 'Jesus', 'Moran', '2023-02-08', '10:00', 10),
(5, 'Nicol', 'Morales', '2023-02-12', '15:00', 7),
(6, 'Ana Sofia ', 'Salinas', '2023-03-16', '9:30', 10),
(7, 'Sandra', 'Zapata', '2023-04-03', '14:30', 2),
(8, 'Nelyelim', 'Moran Espinoza', '2023-07-13', '9:30', 1),
(9, 'Alejandro', 'Orrego Garcia', '2023-07-13', '14:00', 8),
(10, 'Adyelim Daleimi', 'Espinoza Ferrer', '2023-08-01', '8:00', 7),
(11, 'Alexis', 'Delgado', '2023-08-03', '10:00', 1),
(12, 'Alex', 'Hernandez', '2023-08-07', '11:00', 5),
(13, 'Alejandro', 'Orrego', '2023-08-08', '12:00', 7),
(14, 'Violeta', 'Saavedra Pulido', '2023-08-08', '8:00', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clinicas`
--

CREATE TABLE `clinicas` (
  `idClinica` int(11) NOT NULL,
  `nombClinica` varchar(30) NOT NULL,
  `encargado` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `clinicas`
--

INSERT INTO `clinicas` (`idClinica`, `nombClinica`, `encargado`) VALUES
(1, 'Recuadro Familiar', 'Valeria Moran'),
(2, 'Cumpleaños Tradicional', 'Valeria Moran'),
(3, 'Paq. Festejo 15s', 'Andres Prieto | Valeria Moran'),
(4, 'Paq. Mis Dulces 16', 'Valeria Moran'),
(5, 'Paq. Bienvenid@ a los 18', 'Andres Prieto'),
(6, 'Album Pregnancy', 'Valeria Moran'),
(7, 'Baby Shower', 'Valeria Moran'),
(8, 'Boda', 'Valeria Moran'),
(9, 'Despedida de Solter@s', 'Andres Prieto | Valeria Moran'),
(10, 'Mi Graduación (PROM)', 'Andres Prieto | Valeria Morán  '),
(11, 'Grado Carrera Universitaria', 'Valeria Moran');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citas`
--
ALTER TABLE `citas`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `idClinica` (`idClinica`);

--
-- Indices de la tabla `clinicas`
--
ALTER TABLE `clinicas`
  ADD PRIMARY KEY (`idClinica`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citas`
--
ALTER TABLE `citas`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `clinicas`
--
ALTER TABLE `clinicas`
  MODIFY `idClinica` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
