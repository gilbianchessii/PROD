-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 06-Nov-2017 às 13:18
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
  `Password` int(11) NOT NULL,
  `Sec_Q` varchar(80) NOT NULL,
  `Answer` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `conta`
--

INSERT INTO `conta` (`Username`, `Name`, `Password`, `Sec_Q`, `Answer`) VALUES
('Rodrigo', 'Rodrigo', 123, 'qual nome da sua mae?', '123'),
('RB22', 'Rodrigo', 1, 'qual nome da sua mae?', '1'),
('1', '1', 1, 'qual nome da sua mae?', '1'),
('1', '1', 1, 'qual nome da sua mae?', '1'),
('123', '123', 123, 'qual nome da sua mae?', '123'),
('R', 'Rodrigo', 1, 'qual nome da sua mae?', 'R');

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

--
-- Extraindo dados da tabela `estudante`
--

INSERT INTO `estudante` (`Student_ID`, `Name`, `Father`, `Course`, `Branch`, `Year`, `Semester`) VALUES
(493, '123', '123', 'Item 1', '123', 1, 1),
(562, 'R', 'R', 'Item 1', '1', 1, 1),
(601, '11', '1', 'Item 1', '1', 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `livro`
--

CREATE TABLE `livro` (
  `Book_ID` int(11) NOT NULL,
  `Name` varchar(80) NOT NULL,
  `Edition` int(11) NOT NULL,
  `Publisher` varchar(100) NOT NULL,
  `Price` int(11) NOT NULL,
  `Pages` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `livro`
--

INSERT INTO `livro` (`Book_ID`, `Name`, `Edition`, `Publisher`, `Price`, `Pages`) VALUES
(845, 'HP', 2, '123', 123, 123),
(898, 'R', 1, 'R', 1, 1),
(7111, '1', 1, '1', 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `problema`
--

CREATE TABLE `problema` (
  `Book_ID` int(11) NOT NULL,
  `Name` varchar(80) NOT NULL,
  `Edition` int(11) NOT NULL,
  `Publisher` varchar(80) NOT NULL,
  `Price` int(11) NOT NULL,
  `Pages` int(11) NOT NULL,
  `Student_ID` int(11) NOT NULL,
  `SName` varchar(80) NOT NULL,
  `FName` varchar(80) NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Branch` varchar(80) NOT NULL,
  `Year` int(11) NOT NULL,
  `Semester` int(11) NOT NULL,
  `DateOfIssue` int(11) NOT NULL
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
  `Price` int(11) NOT NULL,
  `Pages` int(11) NOT NULL,
  `DOI` int(11) NOT NULL,
  `DOR` int(11) NOT NULL
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
  MODIFY `Student_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=602;

--
-- AUTO_INCREMENT for table `livro`
--
ALTER TABLE `livro`
  MODIFY `Book_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7112;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
