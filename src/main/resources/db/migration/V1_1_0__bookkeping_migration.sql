CREATE TABLE IF NOT EXISTS `User_data` (
    `id_User` INTEGER  PRIMARY KEY AUTO_INCREMENT,
    `Name` VARCHAR NOT NULL,
    `Surname` VARCHAR NOT NULL,
    `Phone` INTEGER NOT NULL,
    `Email` VARCHAR NOT NULL,
    `Login` VARCHAR NOT NULL,
    `Password` VARCHAR NOT NULL,
    `Login_Index` INTEGER  AUTO_INCREMENT
);

CREATE TABLE IF NOT EXISTS `Accounts` (
    `id_Account` INTEGER  AUTO_INCREMENT PRIMARY KEY,
    `id_User` INTEGER NOT NULL,
    `Account_type` ENUM('Credit card', 'Bank account') NOT NULL,
    `Cash` DOUBLE NOT NULL,
    FOREIGN KEY (`id_User`)  REFERENCES `User_data` (`id_User`)
);

CREATE TABLE IF NOT EXISTS `Transaction_categories` (
    `id_Transaction_category` INTEGER AUTO_INCREMENT PRIMARY KEY,
    `Transaction_category` VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS `Transactions` (
    `id_Transaction` INTEGER  AUTO_INCREMENT PRIMARY KEY,
    `id_Account` INTEGER NOT NULL,
    `Transaction_type` ENUM('Income', 'Costs') NOT NULL,
    `id_Transaction_category` INTEGER NOT NULL,
    `Account_participant` INTEGER NOT NULL,
    `Transaction_date_and_time` DATETIME NOT NULL,
    `Transaction_amount` INTEGER NOT NULL,
    FOREIGN KEY (`id_Account`)  REFERENCES `Accounts` (`id_Account`),
    FOREIGN KEY (`id_Transaction_category`)  REFERENCES `Transaction_categories` (`id_Transaction_category`)
);

