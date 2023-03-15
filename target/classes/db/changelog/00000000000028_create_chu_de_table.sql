CREATE TABLE `chu_de` (
  `id_chu_de` int(11) NOT NULL AUTO_INCREMENT,
  `ten_chu_de` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `keyword_includes` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `keylink_includes` varchar(1000) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id_chu_de`)
)