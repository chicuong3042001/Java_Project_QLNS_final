-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 23, 2022 at 07:14 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlynhansu`
--

-- --------------------------------------------------------

--
-- Table structure for table `chitietktkl`
--

CREATE TABLE `chitietktkl` (
  `MaKTKL` varchar(255) NOT NULL,
  `MaNV` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chitietktkl`
--



-- --------------------------------------------------------

--
-- Table structure for table `chitietluong`
--

CREATE TABLE `chitietluong` (
  `MaLuong` varchar(255) NOT NULL,
  `MaNV` varchar(255) NOT NULL,
  `ThuongPhat` double NOT NULL DEFAULT 0,
  `HeSoLuong` double NOT NULL,
  `NgayLapBang` date NOT NULL,
  `NgaySuaDoi` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chitietluong`
--



-- --------------------------------------------------------

--
-- Table structure for table `chucvu`
--

CREATE TABLE `chucvu` (
  `MaCV` varchar(255) NOT NULL,
  `TenCV` varchar(255) DEFAULT NULL,
  `GhiChu` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `hesoluong`
--

CREATE TABLE `hesoluong` (
  `MaHSL` varchar(255) NOT NULL,
  `HeSoLuong` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `khenthuongkyluat`
--

CREATE TABLE `khenthuongkyluat` (
  `MaKTKL` varchar(255) NOT NULL,
  `SoTien` double DEFAULT NULL,
  `NgayQuyetDinh` date DEFAULT NULL,
  `LoaiQuyetDinh` varchar(255) DEFAULT NULL,
  `NoiDung` varchar(255) DEFAULT NULL,
  `NgaySuaDoi` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `khenthuongkyluat`
--



-- --------------------------------------------------------

--
-- Table structure for table `luong`
--

CREATE TABLE `luong` (
  `MaLuong` varchar(255) NOT NULL,
  `LuongCB` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `luong`
--



-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` varchar(255) NOT NULL,
  `HinhNV` varchar(255) DEFAULT NULL,
  `TenNV` varchar(255) DEFAULT NULL,
  `NgaySinh` varchar(255) DEFAULT NULL,
  `GioiTinh` varchar(255) DEFAULT NULL,
  `DiaChi` varchar(255) DEFAULT NULL,
  `SoCMND` varchar(255) DEFAULT NULL,
  `SoDienThoai` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `MaPB` varchar(255) DEFAULT NULL,
  `MaCV` varchar(255) DEFAULT NULL,
  `MaTDHV` varchar(255) DEFAULT NULL,
  `MaHSL` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nhanvien`
--



-- --------------------------------------------------------

--
-- Table structure for table `phongban`
--

CREATE TABLE `phongban` (
  `MaPB` varchar(255) NOT NULL,
  `TenPB` varchar(255) DEFAULT NULL,
  `SoDienThoai` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `trinhdohv`
--

CREATE TABLE `trinhdohv` (
  `MaTDHV` varchar(255) NOT NULL,
  `TenTDHV` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chitietktkl`
--
ALTER TABLE `chitietktkl`
  ADD PRIMARY KEY (`MaKTKL`,`MaNV`),
  ADD KEY `MaNV` (`MaNV`);

--
-- Indexes for table `chitietluong`
--
ALTER TABLE `chitietluong`
  ADD PRIMARY KEY (`MaLuong`,`MaNV`,`NgayLapBang`),
  ADD KEY `MaNV` (`MaNV`);

--
-- Indexes for table `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`MaCV`);

--
-- Indexes for table `hesoluong`
--
ALTER TABLE `hesoluong`
  ADD PRIMARY KEY (`MaHSL`);

--
-- Indexes for table `khenthuongkyluat`
--
ALTER TABLE `khenthuongkyluat`
  ADD PRIMARY KEY (`MaKTKL`);

--
-- Indexes for table `luong`
--
ALTER TABLE `luong`
  ADD PRIMARY KEY (`MaLuong`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`),
  ADD KEY `MaCV` (`MaCV`),
  ADD KEY `MaPB` (`MaPB`),
  ADD KEY `MaTDHV` (`MaTDHV`),
  ADD KEY `MaHSL` (`MaHSL`);

--
-- Indexes for table `phongban`
--
ALTER TABLE `phongban`
  ADD PRIMARY KEY (`MaPB`);

--
-- Indexes for table `trinhdohv`
--
ALTER TABLE `trinhdohv`
  ADD PRIMARY KEY (`MaTDHV`),
  ADD UNIQUE KEY `TenTDHV` (`TenTDHV`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chitietktkl`
--
ALTER TABLE `chitietktkl`
  ADD CONSTRAINT `chitietktkl_ibfk_1` FOREIGN KEY (`MaKTKL`) REFERENCES `khenthuongkyluat` (`MaKTKL`),
  ADD CONSTRAINT `chitietktkl_ibfk_2` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`);

--
-- Constraints for table `chitietluong`
--
ALTER TABLE `chitietluong`
  ADD CONSTRAINT `chitietluong_ibfk_1` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`),
  ADD CONSTRAINT `chitietluong_ibfk_2` FOREIGN KEY (`MaLuong`) REFERENCES `luong` (`MaLuong`);

--
-- Constraints for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`MaCV`) REFERENCES `chucvu` (`MaCV`),
  ADD CONSTRAINT `nhanvien_ibfk_2` FOREIGN KEY (`MaPB`) REFERENCES `phongban` (`MaPB`),
  ADD CONSTRAINT `nhanvien_ibfk_3` FOREIGN KEY (`MaTDHV`) REFERENCES `trinhdohv` (`MaTDHV`),
  ADD CONSTRAINT `nhanvien_ibfk_4` FOREIGN KEY (`MaHSL`) REFERENCES `hesoluong` (`MaHSL`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
