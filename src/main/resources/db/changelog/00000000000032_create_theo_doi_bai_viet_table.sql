
CREATE TABLE `theo_doi_bai_viet` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `content` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `comment` int(11) DEFAULT NULL,
  `like` int(11) DEFAULT NULL,
  `share` int(11) DEFAULT NULL,
  `author_link` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
);