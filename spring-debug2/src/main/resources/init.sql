CREATE TABLE `test_user`(
    `user_id`             BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'pk',
    `user_name`           VARCHAR(100) NULL DEFAULT NULL COMMENT '用户名称',
    `user_code`           VARCHAR(100) NULL DEFAULT NULL COMMENT '用户编码',
    `remark`              VARCHAR(1024) NULL DEFAULT NULL COMMENT '用户描述',
    `create_time`         DATETIME NULL DEFAULT NULL COMMENT '创建时间',
    `modified_time`       DATETIME NULL DEFAULT NULL COMMENT '更新时间',
    `create_account_id`   BIGINT UNSIGNED NULL DEFAULT NULL COMMENT '创建者id',
    `modified_account_id` BIGINT UNSIGNED NULL DEFAULT NULL COMMENT '修改者id',
    PRIMARY KEY (`user_id`)
) COMMENT='用户表' DEFAULT CHARSET = utf8mb4 ENGINE=InnoDB;

CREATE TABLE `test_account`(
    `account_id`          BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'pk',
    `account_name`        VARCHAR(100) NULL DEFAULT NULL COMMENT '用户名称',
    `account`             VARCHAR(100) NULL DEFAULT NULL COMMENT '用户编码',
    `remark`              VARCHAR(1024) NULL DEFAULT NULL COMMENT '用户描述',
    `create_time`         DATETIME NULL DEFAULT NULL COMMENT '创建时间',
    `modified_time`       DATETIME NULL DEFAULT NULL COMMENT '更新时间',
    `create_account_id`   BIGINT UNSIGNED NULL DEFAULT NULL COMMENT '创建者id',
    `modified_account_id` BIGINT UNSIGNED NULL DEFAULT NULL COMMENT '修改者id',
    PRIMARY KEY (`account_id`)
) COMMENT='账号表' DEFAULT CHARSET = utf8mb4 ENGINE=InnoDB;


INSERT INTO `test_user` (`user_id`, `user_name`, `user_code`, `remark`, `create_time`, `modified_time`, `create_account_id`, `modified_account_id`)
VALUES ('1', '小白', 'xiaobai', 'test1', '2023-01-01 11:50:06', '2023-01-01 11:50:06', '0', '0');
INSERT INTO `test_user` (`user_id`, `user_name`, `user_code`, `remark`, `create_time`, `modified_time`, `create_account_id`, `modified_account_id`)
VALUES ('2', '小黑', 'xiaohei', 'test2', '2023-01-01 11:50:25', '2023-01-01 11:50:25', '0', '0');
INSERT INTO `test_user` (`user_id`, `user_name`, `user_code`, `remark`, `create_time`, `modified_time`, `create_account_id`, `modified_account_id`)
VALUES ('3', '小马', 'xiaoma', 'test3', '2023-01-01 11:50:45', '2023-01-01 11:50:45', '0', '0');

INSERT INTO `mybatis_test`.`test_account` (`account_id`, `account_name`, `account`, `remark`, `create_time`, `modified_time`, `create_account_id`, `modified_account_id`)
VALUES ('1', '新一', 'xinyi', '1', '2023-01-19 20:06:31', '2023-01-19 20:06:31', '1', '1');
INSERT INTO `mybatis_test`.`test_account` (`account_id`, `account_name`, `account`, `remark`, `create_time`, `modified_time`, `create_account_id`, `modified_account_id`)
VALUES ('2', '新二', 'xiner', '2', '2023-01-19 20:06:50', '2023-01-19 20:06:50', '1', '1');
INSERT INTO `mybatis_test`.`test_account` (`account_id`, `account_name`, `account`, `remark`, `create_time`, `modified_time`, `create_account_id`, `modified_account_id`)
VALUES ('3', '新三', 'xinsan', '3', '2023-01-19 20:07:03', '2023-01-19 20:07:03', '1', '1');

