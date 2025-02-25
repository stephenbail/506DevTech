CREATE TABLE `ArtistsAndWorks`.`Work` (
  `Work_pk` INT NOT NULL auto_increment,
  `Work_title` VARCHAR(50) NULL,
  `Work_medium` ENUM('p', 's', 'm'),
  `Work_Artist_pk` INT NULL,
  PRIMARY KEY (`Work_pk`)
  );
