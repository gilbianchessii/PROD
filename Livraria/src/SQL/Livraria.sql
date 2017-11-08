-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 08-Nov-2017 às 12:19
-- Versão do servidor: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `livraria`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `conta`
--

CREATE TABLE `conta` (
  `Username` varchar(80) NOT NULL,
  `Name` varchar(80) NOT NULL,
  `Password` varchar(15) NOT NULL,
  `Sec_Q` varchar(80) NOT NULL,
  `Answer` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `estudante`
--

CREATE TABLE `estudante` (
  `Student_ID` int(11) NOT NULL,
  `Name` varchar(80) NOT NULL,
  `Father` varchar(80) NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Branch` varchar(80) NOT NULL,
  `Year` int(11) NOT NULL,
  `Semester` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `livro`
--

CREATE TABLE `livro` (
  `Book_ID` int(11) NOT NULL,
  `Name` varchar(80) NOT NULL,
  `Edition` int(11) NOT NULL,
  `Publisher` varchar(100) NOT NULL,
  `Price` double NOT NULL,
  `Pages` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `problema`
--

CREATE TABLE `problema` (
  `Book_ID` int(11) NOT NULL,
  `Name` varchar(80) NOT NULL,
  `Edition` int(11) NOT NULL,
  `Publisher` varchar(80) NOT NULL,
  `Price` double NOT NULL,
  `Pages` int(11) NOT NULL,
  `Student_ID` int(11) NOT NULL,
  `SName` varchar(80) NOT NULL,
  `FName` varchar(80) NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Branch` varchar(80) NOT NULL,
  `Year` int(11) NOT NULL,
  `Semester` int(11) NOT NULL,
  `DateOfIssue` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `retorno`
--

CREATE TABLE `retorno` (
  `Student_ID` int(11) NOT NULL,
  `Name` varchar(80) NOT NULL,
  `FName` varchar(80) NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Branch` varchar(80) NOT NULL,
  `Year` int(11) NOT NULL,
  `Semester` int(11) NOT NULL,
  `Book_ID` int(11) NOT NULL,
  `BName` varchar(80) NOT NULL,
  `Edition` int(11) NOT NULL,
  `Publisher` varchar(80) NOT NULL,
  `Price` double NOT NULL,
  `Pages` int(11) NOT NULL,
  `DOI` varchar(80) NOT NULL,
  `DOR` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `estudante`
--
ALTER TABLE `estudante`
  ADD PRIMARY KEY (`Student_ID`);

--
-- Indexes for table `livro`
--
ALTER TABLE `livro`
  ADD PRIMARY KEY (`Book_ID`);

--
-- Indexes for table `problema`
--
ALTER TABLE `problema`
  ADD PRIMARY KEY (`Book_ID`),
  ADD UNIQUE KEY `Student_ID` (`Student_ID`);

--
-- Indexes for table `retorno`
--
ALTER TABLE `retorno`
  ADD PRIMARY KEY (`Student_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `estudante`
--
ALTER TABLE `estudante`
  MODIFY `Student_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=596;

--
-- AUTO_INCREMENT for table `livro`
--
ALTER TABLE `livro`
  MODIFY `Book_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=285;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
