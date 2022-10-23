-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 23, 2022 at 12:08 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bengkelmms`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(20) NOT NULL,
  `password` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('', ''),
('admin', '1234'),
('mjordan', 'jordan123');

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `idbarang` varchar(10) NOT NULL,
  `namabarang` varchar(20) NOT NULL,
  `qty` int(11) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`idbarang`, `namabarang`, `qty`, `harga`) VALUES
('1011', 'Ban Depan Michellin', 4, 200000),
('1012', 'Ban Belakang Michell', 5, 0),
('1013', 'Rem', 4, 0),
('1014', 'Rantai', 3, 0),
('1109', 'Oli Repsol', 4, 0);

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `namabrg` varchar(40) NOT NULL,
  `qty` int(11) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `informasikaryawan`
--

CREATE TABLE `informasikaryawan` (
  `username` varchar(30) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `nohp` varchar(14) NOT NULL,
  `jabatan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `informasikaryawan`
--

INSERT INTO `informasikaryawan` (`username`, `nama`, `nohp`, `jabatan`) VALUES
('', '', '', 'Montir'),
('admin', 'admin', '000000000000', 'admin'),
('mjordan', 'MUHAMAD JORDAN', '087895424023', 'Montir');

-- --------------------------------------------------------

--
-- Table structure for table `orderbarang`
--

CREATE TABLE `orderbarang` (
  `noorder` int(11) NOT NULL,
  `namacs` varchar(40) NOT NULL,
  `namamontir` varchar(40) NOT NULL,
  `namabarang` varchar(40) NOT NULL,
  `qty` int(10) NOT NULL,
  `total` int(11) NOT NULL,
  `tgl_orderb` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orderbarang`
--

INSERT INTO `orderbarang` (`noorder`, `namacs`, `namamontir`, `namabarang`, `qty`, `total`, `tgl_orderb`) VALUES
(1, 'Jordan', 'MUHAMAD JORDAN', 'Ban Belakang Michell', 3, 0, '2022-05-13'),
(2, 'Jordan', 'MUHAMAD JORDAN', 'Ban Depan Michellin', 2, 400000, '2022-05-13');

-- --------------------------------------------------------

--
-- Table structure for table `orderjasa`
--

CREATE TABLE `orderjasa` (
  `noorder` int(11) NOT NULL,
  `namacs` varchar(40) NOT NULL,
  `namamot` varchar(40) NOT NULL,
  `montir` varchar(40) NOT NULL,
  `jenisjasa` varchar(40) NOT NULL,
  `biaya` int(11) NOT NULL,
  `tgl_orderj` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orderjasa`
--

INSERT INTO `orderjasa` (`noorder`, `namacs`, `namamot`, `montir`, `jenisjasa`, `biaya`, `tgl_orderj`) VALUES
(1, 'Jordan', 'REVO FIT', 'MUHAMAD JORDAN', 'Servis 6 Bulan', 250000, '2022-05-13'),
(2, 'Jordan', 'REVO FIT', '-', 'Servis Bulanan', 100000, '2022-05-13'),
(3, 'Jordan', 'REVO FIT', '-', 'Fast Track (Isi Angin+Stel Rantai)', 10000, '2022-05-13'),
(4, 'JORDAN', 'REVO FIT', '-', 'Cuci Motor', 15000, '2022-05-13'),
(5, 'Nita', 'Honda', 'MUHAMAD JORDAN', 'Servis Bulanan', 100000, '2022-06-23');

-- --------------------------------------------------------

--
-- Table structure for table `statusmontir`
--

CREATE TABLE `statusmontir` (
  `nama` varchar(30) NOT NULL,
  `status` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `statusmontir`
--

INSERT INTO `statusmontir` (`nama`, `status`) VALUES
('', 'Tersedia'),
('MUHAMAD JORDAN', 'Tidak Tersedia');

-- --------------------------------------------------------

--
-- Table structure for table `transaksibarang`
--

CREATE TABLE `transaksibarang` (
  `notransaksi` int(11) NOT NULL,
  `namabarang` varchar(40) NOT NULL,
  `qty` int(11) NOT NULL,
  `jenistrans` varchar(20) NOT NULL,
  `tgl_transaksi` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksibarang`
--

INSERT INTO `transaksibarang` (`notransaksi`, `namabarang`, `qty`, `jenistrans`, `tgl_transaksi`) VALUES
(1, 'Ban Belakang Michell', 5, 'Masuk', '2022-05-13'),
(2, 'Ban Belakang Michell', 3, 'Keluar', '2022-05-13'),
(3, 'Ban Depan Michellin', 2, 'Keluar', '2022-05-13'),
(4, 'Oli Repsol', 1, 'Keluar', '2022-05-13'),
(5, 'Rantai', 1, 'Keluar', '2022-05-13'),
(6, 'Rem', 1, 'Keluar', '2022-05-13'),
(7, 'Oli Repsol', 1, 'Keluar', '2022-05-13'),
(8, 'Oli Repsol', 1, 'Keluar', '2022-06-23');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`idbarang`);

--
-- Indexes for table `informasikaryawan`
--
ALTER TABLE `informasikaryawan`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `orderbarang`
--
ALTER TABLE `orderbarang`
  ADD PRIMARY KEY (`noorder`);

--
-- Indexes for table `orderjasa`
--
ALTER TABLE `orderjasa`
  ADD PRIMARY KEY (`noorder`);

--
-- Indexes for table `statusmontir`
--
ALTER TABLE `statusmontir`
  ADD PRIMARY KEY (`nama`);

--
-- Indexes for table `transaksibarang`
--
ALTER TABLE `transaksibarang`
  ADD PRIMARY KEY (`notransaksi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `orderbarang`
--
ALTER TABLE `orderbarang`
  MODIFY `noorder` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `orderjasa`
--
ALTER TABLE `orderjasa`
  MODIFY `noorder` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `transaksibarang`
--
ALTER TABLE `transaksibarang`
  MODIFY `notransaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
