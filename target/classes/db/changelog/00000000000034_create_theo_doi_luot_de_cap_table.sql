CREATE TABLE `theo_doi_luot_de_cap` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `key` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `doc_count` int(11) DEFAULT NULL,
  `author_link` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
)