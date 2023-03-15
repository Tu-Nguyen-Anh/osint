CREATE TABLE `luot_de_cap` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ID_chu_de` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `key` varchar(512) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `doc_count` int(11) DEFAULT NULL,
  `author_link` varchar(512) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `like` int(11) DEFAULT NULL,
  `share` int(11) DEFAULT NULL,
  `comment` int(11) DEFAULT NULL,
  `key_source` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `de_cap_idx` (`ID_chu_de`),
  CONSTRAINT `de_cap` FOREIGN KEY (`ID_chu_de`) REFERENCES `chu_de` (`id_chu_de`) ON DELETE NO ACTION ON UPDATE NO ACTION
)