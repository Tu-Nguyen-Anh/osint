CREATE TABLE `thong_ke_overview` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `ID_chu_de` int(11) DEFAULT NULL,
  `source` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `doc_count` int(11) DEFAULT NULL,
  `like` int(11) DEFAULT NULL,
  `comment` int(11) DEFAULT NULL,
  `share` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `thong_ke_idx` (`ID_chu_de`),
  CONSTRAINT `thong_ke` FOREIGN KEY (`ID_chu_de`) REFERENCES `chu_de` (`id_chu_de`) ON DELETE NO ACTION ON UPDATE NO ACTION
)