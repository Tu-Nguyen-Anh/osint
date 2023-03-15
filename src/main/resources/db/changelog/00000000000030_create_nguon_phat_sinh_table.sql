CREATE TABLE `nguon_phat_sinh` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ID_chu_de` int(11) DEFAULT NULL,
  `key` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `doc_count` int(11) DEFAULT NULL,
  `spread` int(11) DEFAULT NULL,
  `like` int(11) DEFAULT NULL,
  `share` int(11) DEFAULT NULL,
  `comment` int(11) DEFAULT NULL,
  `author_link` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `key_word` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ID_chu_de_idx` (`ID_chu_de`),
  CONSTRAINT `ID_chu_de` FOREIGN KEY (`ID_chu_de`) REFERENCES `chu_de` (`id_chu_de`) ON DELETE NO ACTION ON UPDATE NO ACTION
)