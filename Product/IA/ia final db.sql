-- phpMyAdmin SQL Dump
-- version 4.9.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Feb 04, 2021 at 03:47 AM
-- Server version: 5.7.33
-- PHP Version: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `naturcli_IA`
--

-- --------------------------------------------------------

--
-- Table structure for table `diets`
--

CREATE TABLE `diets` (
  `id` int(11) NOT NULL,
  `link` text CHARACTER SET utf8mb4 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `diets`
--

INSERT INTO `diets` (`id`, `link`) VALUES
(1, 'https://natur-clinic.ro/IA/1800.pdf'),
(2, 'https://natur-clinic.ro/IA/2000.pdf'),
(3, 'https://natur-clinic.ro/IA/2250.pdf'),
(4, 'https://natur-clinic.ro/IA/2500.pdf'),
(5, 'https://natur-clinic.ro/IA/2750.pdf'),
(6, 'https://natur-clinic.ro/IA/3000.pdf'),
(7, 'https://natur-clinic.ro/IA/3250.pdf');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(100) NOT NULL,
  `name` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `email` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `pass` varchar(64) CHARACTER SET latin1 DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `weight` int(11) DEFAULT NULL,
  `height` int(11) DEFAULT NULL,
  `waist` int(11) DEFAULT NULL,
  `hips` int(11) DEFAULT NULL,
  `neck` int(11) DEFAULT NULL,
  `activity` double DEFAULT NULL,
  `gender` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `email`, `pass`, `birthday`, `weight`, `height`, `waist`, `hips`, `neck`, `activity`, `gender`) VALUES
(1, 'Damian Mitrofan', '14mitrofda@kesw.org', '2d3891d258d0236c5a1e2d7a246aaee8cd7256139ea13400c96a236f4dda45b1', '2003-05-07', 75, 178, 80, 110, 42, 1.37, 0),
(2, 'Ina Sochirca', 'ina.sochirca@yahoo.com', '2d3891d258d0236c5a1e2d7a246aaee8cd7256139ea13400c96a236f4dda45b1', '2020-10-02', 11, 111, 11, 11, 11, 1.2, 0),
(3, 'Test User', 'testmail@gmail.com', '7d7f5a6747dece98d47270a532cad5b9be78a16814323d8f34c04b8d673246d7', '0020-11-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `diets`
--
ALTER TABLE `diets`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `diets`
--
ALTER TABLE `diets`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
