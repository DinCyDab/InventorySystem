-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 11, 2024 at 02:04 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventorymanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `account_ID` int(11) NOT NULL,
  `company_ID` int(11) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `access_level` enum('Staff','Admin','Owner') DEFAULT NULL,
  `status` enum('Active','Inactive') DEFAULT 'Active',
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`account_ID`, `company_ID`, `first_name`, `last_name`, `username`, `password`, `access_level`, `status`, `email`) VALUES
(5, 5, 'Dinos', 'Dabon', '1234', '1234', 'Owner', 'Active', 'spongecola1231@gmail.com'),
(9, 5, 'Cycy', 'Dabon', '1231', '1231', 'Staff', 'Active', 's@gmail.com'),
(10, 5, 'test', 'test', 'test', 'test', 'Admin', 'Inactive', 'test'),
(11, 9, 'Jacques', 'Juinio', 'jakol', '1234', 'Owner', 'Active', '1234@gmail.com'),
(12, 10, 'asjhd', 'ajkshd', 'testing', '1234', 'Owner', 'Active', '1234@gmail.com'),
(13, 10, 'asdkj', 'ajksdh', 'kjashd', '1234', 'Staff', 'Active', 'kajhsd@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE `company` (
  `company_ID` int(11) NOT NULL,
  `company_name` varchar(255) NOT NULL,
  `company_description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `company`
--

INSERT INTO `company` (`company_ID`, `company_name`, `company_description`) VALUES
(5, 'test', 'test'),
(9, 'Ohmygash', 'Hello World'),
(10, 'Hello World', 'Hello');

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `inventory_ID` int(11) NOT NULL,
  `company_ID` int(11) NOT NULL,
  `inventory_name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `status` enum('Active','Inactive') DEFAULT 'Active'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`inventory_ID`, `company_ID`, `inventory_name`, `description`, `status`) VALUES
(1, 5, 'Hardware', 'Computer Parts and Everything', 'Active'),
(2, 5, 'Foods', 'Foods and Beverages', 'Active'),
(3, 9, 'Tree', 'Trees', 'Active'),
(4, 10, 'Foods', 'foods', 'Active'),
(5, 10, 'hardware', '', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `product_ID` int(11) NOT NULL,
  `inventory_ID` int(11) NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `product_description` varchar(255) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `status` enum('Active','Inactive') DEFAULT 'Active'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`product_ID`, `inventory_ID`, `product_name`, `product_description`, `quantity`, `status`) VALUES
(1, 1, 'Ryzen 5 3600', 'Mid Hardware for 2024', 5, 'Active'),
(2, 1, 'Ryzen 9 3900', 'Mid Hardware for 2024	', 10, 'Active'),
(3, 3, 'BST', 'BST', 5, 'Active'),
(4, 4, 'Melon', '', 23, 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

CREATE TABLE `report` (
  `report_ID` int(11) NOT NULL,
  `account_ID` int(11) NOT NULL,
  `product_ID` int(11) NOT NULL,
  `report_date` date DEFAULT curdate(),
  `report_time` time DEFAULT curtime(),
  `consumed` int(11) DEFAULT NULL,
  `status` enum('Pending','Approved','Denied') DEFAULT 'Pending'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `report`
--

INSERT INTO `report` (`report_ID`, `account_ID`, `product_ID`, `report_date`, `report_time`, `consumed`, `status`) VALUES
(1, 5, 1, '2024-10-29', '11:13:51', 23, 'Denied'),
(2, 5, 1, '2024-10-29', '11:54:48', 2, 'Pending'),
(3, 5, 2, '2024-10-29', '11:55:18', 1, 'Approved'),
(4, 9, 1, '2024-11-16', '13:38:17', 20, 'Approved'),
(11, 11, 3, '2024-11-19', '14:02:13', 25, 'Pending'),
(12, 9, 1, '2024-11-21', '15:44:53', 10, 'Pending');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`account_ID`),
  ADD KEY `PK_Account_Company` (`company_ID`);

--
-- Indexes for table `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`company_ID`);

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`inventory_ID`),
  ADD KEY `FK_Inventory_Company` (`company_ID`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`product_ID`),
  ADD KEY `FK_Product_Inventory` (`inventory_ID`);

--
-- Indexes for table `report`
--
ALTER TABLE `report`
  ADD PRIMARY KEY (`report_ID`),
  ADD KEY `FK_Report_Account` (`account_ID`),
  ADD KEY `FK_Report_Product` (`product_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account`
--
ALTER TABLE `account`
  MODIFY `account_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `company`
--
ALTER TABLE `company`
  MODIFY `company_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `inventory`
--
ALTER TABLE `inventory`
  MODIFY `inventory_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `product_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `report`
--
ALTER TABLE `report`
  MODIFY `report_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `account`
--
ALTER TABLE `account`
  ADD CONSTRAINT `PK_Account_Company` FOREIGN KEY (`company_ID`) REFERENCES `company` (`company_ID`);

--
-- Constraints for table `inventory`
--
ALTER TABLE `inventory`
  ADD CONSTRAINT `FK_Inventory_Company` FOREIGN KEY (`company_ID`) REFERENCES `company` (`company_ID`);

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `FK_Product_Inventory` FOREIGN KEY (`inventory_ID`) REFERENCES `inventory` (`inventory_ID`);

--
-- Constraints for table `report`
--
ALTER TABLE `report`
  ADD CONSTRAINT `FK_Report_Account` FOREIGN KEY (`account_ID`) REFERENCES `account` (`account_ID`),
  ADD CONSTRAINT `FK_Report_Product` FOREIGN KEY (`product_ID`) REFERENCES `product` (`product_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
