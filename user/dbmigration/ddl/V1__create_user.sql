DROP TABLE IF EXISTS `User`;
CREATE TABLE `User` (
    id INT NOT NULL UNIQUE,
    login_name VARCHAR(50) NOT NULL UNIQUE,
    first_name VARCHAR(50),
    middle_name VARCHAR(50),
    last_name VARCHAR(50),
    PRIMARY KEY(id)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8;