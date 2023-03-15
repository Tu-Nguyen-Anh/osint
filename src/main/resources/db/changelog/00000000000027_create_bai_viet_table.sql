CREATE TABLE `bai_viet` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `ID_chu_de` int(11) DEFAULT NULL,
  `content` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `comment` int(11) DEFAULT NULL,
  `like` int(11) DEFAULT NULL,
  `share` int(11) DEFAULT NULL,
  `author_link` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `key_source` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,

  PRIMARY KEY (`id`),
  KEY `ID_chu_de_idx` (`ID_chu_de`),
  KEY `ID_chu_de` (`ID_chu_de`),
  CONSTRAINT `` FOREIGN KEY (`ID_chu_de`) REFERENCES `chu_de` (`id_chu_de`) ON DELETE NO ACTION ON UPDATE NO ACTION
)