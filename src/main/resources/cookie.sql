/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : cookie

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-12-09 15:58:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article_content
-- ----------------------------
DROP TABLE IF EXISTS `article_content`;
CREATE TABLE `article_content` (
  `ARTICLE_ID` int(11) NOT NULL,
  `CONTENT` text,
  `IS_DELETE` enum('Y','N') NOT NULL DEFAULT 'N',
  PRIMARY KEY (`ARTICLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article_content
-- ----------------------------

-- ----------------------------
-- Table structure for article_info
-- ----------------------------
DROP TABLE IF EXISTS `article_info`;
CREATE TABLE `article_info` (
  `ARTICLE_ID` int(11) NOT NULL,
  `MODULE_ID` int(11) NOT NULL,
  `ARTICLE_TITLE` varchar(255) DEFAULT NULL,
  `CREATE_TIME` datetime DEFAULT NULL,
  `AUTHOR` varchar(255) DEFAULT NULL,
  `TAGS` varchar(255) DEFAULT NULL,
  `REPLY_NUM` int(11) NOT NULL DEFAULT '0',
  `LIKE_NUM` int(11) NOT NULL DEFAULT '0',
  `UPDATE_TIME` datetime DEFAULT NULL,
  `IS_DELETE` enum('Y','N') NOT NULL DEFAULT 'N',
  PRIMARY KEY (`ARTICLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article_info
-- ----------------------------

-- ----------------------------
-- Table structure for like
-- ----------------------------
DROP TABLE IF EXISTS `like`;
CREATE TABLE `like` (
  `ARTICLE_ID` int(11) NOT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `CREATE_TIME` datetime DEFAULT NULL,
  `IS_DELETE` enum('Y','N') NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of like
-- ----------------------------

-- ----------------------------
-- Table structure for message_board
-- ----------------------------
DROP TABLE IF EXISTS `message_board`;
CREATE TABLE `message_board` (
  `NOTE_ID` int(11) NOT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `CREATE_TIME` datetime DEFAULT NULL,
  `CONTENT` varchar(255) DEFAULT NULL,
  `IS_READ` enum('Y','N') NOT NULL DEFAULT 'N',
  `IS_DELETE` enum('Y','N') NOT NULL DEFAULT 'N',
  PRIMARY KEY (`NOTE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message_board
-- ----------------------------

-- ----------------------------
-- Table structure for message_content
-- ----------------------------
DROP TABLE IF EXISTS `message_content`;
CREATE TABLE `message_content` (
  `MESSAGE_ID` int(11) NOT NULL,
  `TITLE` varchar(255) DEFAULT NULL,
  `CONTENT` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message_content
-- ----------------------------

-- ----------------------------
-- Table structure for message_notice
-- ----------------------------
DROP TABLE IF EXISTS `message_notice`;
CREATE TABLE `message_notice` (
  `MESSAGE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `START_TIME` datetime DEFAULT NULL,
  `END_TIME` datetime DEFAULT NULL,
  `IS_DELETE` enum('Y','N') NOT NULL DEFAULT 'N',
  PRIMARY KEY (`MESSAGE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message_notice
-- ----------------------------

-- ----------------------------
-- Table structure for message_reply
-- ----------------------------
DROP TABLE IF EXISTS `message_reply`;
CREATE TABLE `message_reply` (
  `NOTE_ID` int(11) NOT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `TO_USER_ID` int(11) DEFAULT NULL,
  `CONTENT` varchar(255) DEFAULT NULL,
  `IS_READ` enum('Y','N') NOT NULL DEFAULT 'N',
  `IS_DELETE` enum('Y','N') NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message_reply
-- ----------------------------

-- ----------------------------
-- Table structure for modules
-- ----------------------------
DROP TABLE IF EXISTS `modules`;
CREATE TABLE `modules` (
  `MODULE_ID` int(11) NOT NULL,
  `MODULE_NAME` varchar(20) DEFAULT NULL,
  `ARTICLE_NUM` int(11) NOT NULL DEFAULT '0',
  `IS_DELETE` enum('Y','N') NOT NULL DEFAULT 'N',
  PRIMARY KEY (`MODULE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of modules
-- ----------------------------

-- ----------------------------
-- Table structure for reply
-- ----------------------------
DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply` (
  `REPLY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ARTICLE_ID` int(11) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `TO_USER_ID` int(11) DEFAULT NULL,
  `REPLY_CONTENT` varchar(255) DEFAULT NULL,
  `CREATE_TIME` datetime DEFAULT NULL,
  `IS_DELETE` enum('Y','N') NOT NULL DEFAULT 'N',
  PRIMARY KEY (`REPLY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reply
-- ----------------------------

-- ----------------------------
-- Table structure for reply_notice
-- ----------------------------
DROP TABLE IF EXISTS `reply_notice`;
CREATE TABLE `reply_notice` (
  `REPLY_ID` int(11) NOT NULL,
  `TO_USER_ID` int(11) DEFAULT NULL,
  `IS_DELETE` enum('Y','N') NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reply_notice
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `PID` int(11) NOT NULL,
  `ROLE` int(11) NOT NULL,
  `ROLE_NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(20) NOT NULL,
  `PASSWORD` varchar(16) NOT NULL,
  `ROLE` int(11) NOT NULL,
  `IS_DELETE` enum('Y','N') NOT NULL DEFAULT 'N',
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `SEX` varchar(2) DEFAULT NULL,
  `AVATAR` varchar(255) DEFAULT NULL,
  `AGE` int(11) DEFAULT NULL,
  `REGISTER_TIME` datetime DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `PHONE` varchar(11) DEFAULT NULL,
  `WE_CHART` varchar(255) DEFAULT NULL,
  `NOTES` varchar(255) DEFAULT NULL,
  `IS_DELETE` enum('Y','N') NOT NULL DEFAULT 'N',
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
