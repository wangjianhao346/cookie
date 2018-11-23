/*
Navicat MySQL Data Transfer

Source Server         : tx
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : db_cookie

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-11-23 14:58:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_admin
-- ----------------------------
DROP TABLE IF EXISTS `sys_admin`;
CREATE TABLE `sys_admin` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(30) NOT NULL,
  `PASSWORD` varchar(16) NOT NULL,
  `AVATAR` varchar(255) DEFAULT NULL,
  `NOTES` tinytext,
  `IS_DELETE` enum('N','Y') NOT NULL DEFAULT 'N',
  PRIMARY KEY (`ID`),
  KEY `USERNAME` (`USERNAME`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_admin
-- ----------------------------
INSERT INTO `sys_admin` VALUES ('1', '赵某', '123456', null, '我是一个管理员', 'N');

-- ----------------------------
-- Table structure for sys_article
-- ----------------------------
DROP TABLE IF EXISTS `sys_article`;
CREATE TABLE `sys_article` (
  `PID` int(11) NOT NULL AUTO_INCREMENT,
  `ARTICLE_TITLE` varchar(255) NOT NULL COMMENT '文章标题',
  `ARTICLE_CONTENT` longtext COMMENT '内容',
  `MODULE_ID` int(11) NOT NULL COMMENT '模块ID',
  `AUTHOR` varchar(20) NOT NULL COMMENT '作者',
  `CREATE_TIME` datetime NOT NULL COMMENT '发表时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '编辑时间',
  `IS_DELETE` enum('N','Y') NOT NULL DEFAULT 'N' COMMENT '是否删除',
  `VIEWS` int(11) NOT NULL DEFAULT '0',
  `LIKE` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`PID`),
  KEY `模块ID` (`MODULE_ID`),
  KEY `作者` (`AUTHOR`),
  CONSTRAINT `作者` FOREIGN KEY (`AUTHOR`) REFERENCES `sys_admin` (`username`),
  CONSTRAINT `模块ID` FOREIGN KEY (`MODULE_ID`) REFERENCES `sys_modules` (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_article
-- ----------------------------
INSERT INTO `sys_article` VALUES ('1', '测试标题', '测试内容', '1', '赵某', '2018-11-21 16:17:11', null, 'N', '0', '0');
INSERT INTO `sys_article` VALUES ('4', '测试2', '测试内容', '1', '赵某', '2018-11-22 15:41:39', null, 'N', '0', '0');
INSERT INTO `sys_article` VALUES ('5', '测试3', '测试内容', '1', '赵某', '2018-11-22 15:42:05', null, 'N', '0', '0');
INSERT INTO `sys_article` VALUES ('6', '测试4', '测试内容', '1', '赵某', '2018-11-22 15:42:27', null, 'N', '0', '0');

-- ----------------------------
-- Table structure for sys_modules
-- ----------------------------
DROP TABLE IF EXISTS `sys_modules`;
CREATE TABLE `sys_modules` (
  `PID` int(11) NOT NULL AUTO_INCREMENT,
  `MODULE_NAME` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '模块名称',
  `IS_DELETE` enum('N','Y') CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT 'N' COMMENT '是否被删除',
  `ARTICLE_AMOUNT` int(11) NOT NULL DEFAULT '0' COMMENT '该模块下文章总数',
  PRIMARY KEY (`PID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_modules
-- ----------------------------
INSERT INTO `sys_modules` VALUES ('1', '第一部分', 'N', '0');
INSERT INTO `sys_modules` VALUES ('2', '第二部分', 'N', '0');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NAME` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `PASS` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `NICKNAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `IMAGE` varchar(255) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `REGISTERTIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', '赵兮', '123456', '', null, null, null);
INSERT INTO `sys_user` VALUES ('2', '钱兮', '123456', '', null, null, null);
INSERT INTO `sys_user` VALUES ('3', '孙兮', '123456', '', null, null, null);
INSERT INTO `sys_user` VALUES ('4', '李兮', '123456', '', null, null, null);
