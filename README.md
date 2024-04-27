数据库表
```mysql
CREATE TABLE `emp` (
	`id` INT(10) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_0900_ai_ci',
	PRIMARY KEY (`id`) USING BTREE
)
COLLATE='utf8mb4_0900_ai_ci'
ENGINE=InnoDB
AUTO_INCREMENT=2
;
```

```mysql
CREATE TABLE `log` (
	`time` DATETIME NOT NULL,
	`desc` TEXT NOT NULL COLLATE 'utf8mb4_0900_ai_ci',
	PRIMARY KEY (`time`) USING BTREE
)
COLLATE='utf8mb4_0900_ai_ci'
ENGINE=InnoDB
;
```