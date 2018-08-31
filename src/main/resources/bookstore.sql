CREATE TABLE `book` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '书id',
  `name` char(64) NOT NULL DEFAULT '' COMMENT '书名',
  `url` char(64) NOT NULL DEFAULT '' COMMENT '书籍地址',
  `type` int(5) NOT NULL COMMENT '所属类型',
  `progress` int(11) DEFAULT NULL COMMENT '学习进度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;