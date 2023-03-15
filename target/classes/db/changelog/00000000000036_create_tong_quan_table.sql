CREATE TABLE `tong_quan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `key` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ID_chu_de` int(11) DEFAULT NULL,
  `tieu_cuc` int(11) DEFAULT NULL,
  `tich_cuc` int(11) DEFAULT NULL,
  `trung_lap` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `chu_de_idx` (`ID_chu_de`),
  CONSTRAINT `chu_de` FOREIGN KEY (`ID_chu_de`) REFERENCES `chu_de` (`id_chu_de`) ON DELETE NO ACTION ON UPDATE NO ACTION
)
