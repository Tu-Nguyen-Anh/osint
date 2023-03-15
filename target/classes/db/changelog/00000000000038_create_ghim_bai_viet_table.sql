CREATE TABLE `ghim_bai_viet` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ID_user` bigint(20) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `link` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `comment` int(11) DEFAULT NULL,
  `like` int(11) DEFAULT NULL,
  `share` int(11) DEFAULT NULL,
  `create_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ID_user_idx` (`ID_user`),
  KEY `ID_user` (`ID_user`),
  CONSTRAINT `fk_user` FOREIGN KEY (`ID_user`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
)