CREATE TABLE `tac_gia` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ID_chu_de` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `key` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `like` int(11) DEFAULT NULL,
  `share` int(11) DEFAULT NULL,
  `comment` int(11) DEFAULT NULL,
  `author_link` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tac_gia_idx` (`ID_chu_de`),
  CONSTRAINT `tac_gia` FOREIGN KEY (`ID_chu_de`) REFERENCES `chu_de` (`id_chu_de`) ON DELETE NO ACTION ON UPDATE NO ACTION
)