# mydb

It is a spring boot application.

Please excute following SQL statements to create your table in MySQL.
```SQL 
DROP TABLE IF EXISTS `post_job`;
CREATE TABLE `post_job` (
  `id` int NOT NULL AUTO_INCREMENT,
  `position` varchar(200) DEFAULT NULL,
  `count` int DEFAULT '0',
  `place` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) 
```
Modify your MySQL connection information in [application.yml](./src/main/resources/application.yml)
