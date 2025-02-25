CREATE TABLE `ArtistsAndWorks`.`Artist` (
  `Artist_pk` INT NOT NULL auto_increment,
  `Artist_medium` ENUM('p', 's', 'm') NULL,
  `Artist_bday` DATETIME NULL,
  `Artist_last` VARCHAR(35) NULL,
  `Artist_first` VARCHAR(35) NULL,
  PRIMARY KEY (`Artist_pk`)
);
